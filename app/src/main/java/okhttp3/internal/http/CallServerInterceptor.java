package okhttp3.internal.http;

import androidx.appcompat.widget.C0406q1;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m508d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response.Builder builder;
        Response.Builder newBuilder;
        ResponseBody openResponseBody;
        long j;
        boolean z;
        C10843j.m430f(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        C10843j.m433c(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody body = request$okhttp.body();
        long currentTimeMillis = System.currentTimeMillis();
        exchange$okhttp.writeRequestHeaders(request$okhttp);
        boolean z2 = true;
        Long l = null;
        if (HttpMethod.permitsRequestBody(request$okhttp.method()) && body != null) {
            if (C10925n.m398e("100-continue", request$okhttp.header("Expect"))) {
                exchange$okhttp.flushRequest();
                builder = exchange$okhttp.readResponseHeaders(true);
                exchange$okhttp.responseHeadersStart();
                z = false;
            } else {
                z = true;
                builder = null;
            }
            if (builder == null) {
                if (body.isDuplex()) {
                    exchange$okhttp.flushRequest();
                    body.writeTo(Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, true)));
                } else {
                    BufferedSink buffer = Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, false));
                    body.writeTo(buffer);
                    buffer.close();
                }
            } else {
                exchange$okhttp.noRequestBody();
                if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange$okhttp.noNewExchangesOnConnection();
                }
            }
            z2 = z;
        } else {
            exchange$okhttp.noRequestBody();
            builder = null;
        }
        if (body == null || !body.isDuplex()) {
            exchange$okhttp.finishRequest();
        }
        if (builder == null) {
            builder = exchange$okhttp.readResponseHeaders(false);
            C10843j.m433c(builder);
            if (z2) {
                exchange$okhttp.responseHeadersStart();
                z2 = false;
            }
        }
        Response build = builder.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            Response.Builder readResponseHeaders = exchange$okhttp.readResponseHeaders(false);
            C10843j.m433c(readResponseHeaders);
            if (z2) {
                exchange$okhttp.responseHeadersStart();
            }
            build = readResponseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange$okhttp.responseHeadersEnd(build);
        if (this.forWebSocket && code == 101) {
            newBuilder = build.newBuilder();
            openResponseBody = Util.EMPTY_RESPONSE;
        } else {
            newBuilder = build.newBuilder();
            openResponseBody = exchange$okhttp.openResponseBody(build);
        }
        Response build2 = newBuilder.body(openResponseBody).build();
        if (C10925n.m398e("close", build2.request().header("Connection")) || C10925n.m398e("close", Response.header$default(build2, "Connection", null, 2, null))) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (code == 204 || code == 205) {
            ResponseBody body2 = build2.body();
            if (body2 != null) {
                j = body2.contentLength();
            } else {
                j = -1;
            }
            if (j > 0) {
                StringBuilder m12536b = C0406q1.m12536b("HTTP ", code, " had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                m12536b.append(l);
                throw new ProtocolException(m12536b.toString());
            }
        }
        return build2;
    }
}
