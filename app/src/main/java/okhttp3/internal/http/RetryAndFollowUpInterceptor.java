package okhttp3.internal.http;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m508d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", FirebaseAnalytics.Param.METHOD, "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m508d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        C10843j.m430f(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, "Location", null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (C10843j.m435a(resolve.scheme(), response.request().url().scheme()) || this.client.followSslRedirects()) {
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(str)) {
                int code = response.code();
                HttpMethod httpMethod = HttpMethod.INSTANCE;
                boolean z = httpMethod.redirectsWithBody(str) || code == 308 || code == 307;
                if (httpMethod.redirectsToGet(str) && code != 308 && code != 307) {
                    str = "GET";
                } else if (z) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
                if (!z) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        return null;
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code == 421) {
                    RequestBody body = response.request().body();
                    if ((body == null || !body.isOneShot()) && exchange != null && exchange.isCoalescedConnection$okhttp()) {
                        exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                        return response.request();
                    }
                    return null;
                } else if (code == 503) {
                    Response priorResponse = response.priorResponse();
                    if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                        return response.request();
                    }
                    return null;
                } else if (code == 407) {
                    C10843j.m433c(route);
                    if (route.proxy().type() == Proxy.Type.HTTP) {
                        return this.client.proxyAuthenticator().authenticate(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (code == 408) {
                    if (this.client.retryOnConnectionFailure()) {
                        RequestBody body2 = response.request().body();
                        if (body2 == null || !body2.isOneShot()) {
                            Response priorResponse2 = response.priorResponse();
                            if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                                return response.request();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (code) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.client.authenticator().authenticate(route, response);
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (this.client.retryOnConnectionFailure()) {
            return !(z && requestIsOneShot(iOException, request)) && isRecoverable(iOException, z) && realCall.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (header$default != null) {
            Pattern compile = Pattern.compile("\\d+");
            C10843j.m431e(compile, "compile(pattern)");
            if (compile.matcher(header$default).matches()) {
                Integer valueOf = Integer.valueOf(header$default);
                C10843j.m431e(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        r5 = r0;
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r8 = followUpRequest(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r0.isDuplex$okhttp() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = r8.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r0.isOneShot() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = r5.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r6 > 20) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        r0 = r0.newBuilder().priorResponse(r5.newBuilder().body(null).build()).build();
     */
    @Override // okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C10843j.m430f(r11, r0)
            okhttp3.internal.http.RealInterceptorChain r11 = (okhttp3.internal.http.RealInterceptorChain) r11
            okhttp3.Request r0 = r11.getRequest$okhttp()
            okhttp3.internal.connection.RealCall r1 = r11.getCall$okhttp()
            kotlin.collections.o r2 = kotlin.collections.C10759o.f21363a
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        L15:
            r7 = 1
            r8 = r7
        L17:
            r1.enterNetworkInterceptorExchange(r0, r8)
            boolean r8 = r1.isCanceled()     // Catch: java.lang.Throwable -> Ld4
            if (r8 != 0) goto Lcc
            okhttp3.Response r0 = r11.proceed(r0)     // Catch: java.io.IOException -> L92 okhttp3.internal.connection.RouteException -> La8 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L3e
            okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Response$Builder r5 = r5.newBuilder()     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Response$Builder r5 = r5.body(r4)     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Response r5 = r5.build()     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Response$Builder r0 = r0.priorResponse(r5)     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> Ld4
        L3e:
            r5 = r0
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange$okhttp()     // Catch: java.lang.Throwable -> Ld4
            okhttp3.Request r8 = r10.followUpRequest(r5, r0)     // Catch: java.lang.Throwable -> Ld4
            if (r8 != 0) goto L58
            if (r0 == 0) goto L54
            boolean r11 = r0.isDuplex$okhttp()     // Catch: java.lang.Throwable -> Ld4
            if (r11 == 0) goto L54
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> Ld4
        L54:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r5
        L58:
            okhttp3.RequestBody r0 = r8.body()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L68
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L68
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r5
        L68:
            okhttp3.ResponseBody r0 = r5.body()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L71
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> Ld4
        L71:
            int r6 = r6 + r7
            r0 = 20
            if (r6 > r0) goto L7b
            r1.exitNetworkInterceptorExchange$okhttp(r7)
            r0 = r8
            goto L15
        L7b:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r0.<init>()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            r0.append(r6)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        L92:
            r8 = move-exception
            boolean r9 = r8 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Ld4
            if (r9 != 0) goto L99
            r9 = r7
            goto L9a
        L99:
            r9 = r3
        L9a:
            boolean r9 = r10.recover(r8, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto La3
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld4
            goto Lb9
        La3:
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r8, r2)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        La8:
            r8 = move-exception
            java.io.IOException r9 = r8.getLastConnectException()     // Catch: java.lang.Throwable -> Ld4
            boolean r9 = r10.recover(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto Lc3
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> Ld4
            java.io.IOException r8 = r8.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld4
        Lb9:
            java.util.ArrayList r2 = kotlin.collections.C10757m.m473p(r8, r2)     // Catch: java.lang.Throwable -> Ld4
            r1.exitNetworkInterceptorExchange$okhttp(r7)
            r8 = r3
            goto L17
        Lc3:
            java.io.IOException r11 = r8.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Throwable r11 = okhttp3.internal.Util.withSuppressed(r11, r2)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        Lcc:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld4
            throw r11     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r11 = move-exception
            r1.exitNetworkInterceptorExchange$okhttp(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
