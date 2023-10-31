package okhttp3.logging;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001FB\u0011\b\u0002\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\rH\u0002R\u0016\u0010?\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, m508d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Lokhttp3/Call;", "call", "Lkotlin/p;", "callStart", "Lokhttp3/HttpUrl;", ImagesContract.URL, "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "message", "logWithTime", "startNs", "J", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Factory", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m508d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        @JvmOverloads
        public Factory() {
            this(null, 1, null);
        }

        @JvmOverloads
        public Factory(@NotNull HttpLoggingInterceptor.Logger logger) {
            C10843j.m430f(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i, C10839f c10839f) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }

        @Override // okhttp3.EventListener.Factory
        @NotNull
        public EventListener create(@NotNull Call call) {
            C10843j.m430f(call, "call");
            return new LoggingEventListener(this.logger, null);
        }
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, C10839f c10839f) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        HttpLoggingInterceptor.Logger logger = this.logger;
        logger.log("[" + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        C10843j.m430f(call, "call");
        C10843j.m430f(cachedResponse, "cachedResponse");
        logWithTime("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        C10843j.m430f(call, "call");
        C10843j.m430f(response, "response");
        logWithTime("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        C10843j.m430f(call, "call");
        C10843j.m430f(ioe, "ioe");
        logWithTime("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        C10843j.m430f(call, "call");
        C10843j.m430f(inetSocketAddress, "inetSocketAddress");
        C10843j.m430f(proxy, "proxy");
        logWithTime("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        C10843j.m430f(call, "call");
        C10843j.m430f(inetSocketAddress, "inetSocketAddress");
        C10843j.m430f(proxy, "proxy");
        C10843j.m430f(ioe, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        C10843j.m430f(call, "call");
        C10843j.m430f(inetSocketAddress, "inetSocketAddress");
        C10843j.m430f(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        C10843j.m430f(call, "call");
        C10843j.m430f(connection, "connection");
        logWithTime("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        C10843j.m430f(call, "call");
        C10843j.m430f(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        C10843j.m430f(call, "call");
        C10843j.m430f(domainName, "domainName");
        C10843j.m430f(inetAddressList, "inetAddressList");
        logWithTime("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        C10843j.m430f(call, "call");
        C10843j.m430f(domainName, "domainName");
        logWithTime("dnsStart: ".concat(domainName));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        C10843j.m430f(call, "call");
        C10843j.m430f(url, "url");
        C10843j.m430f(proxies, "proxies");
        logWithTime("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        C10843j.m430f(call, "call");
        C10843j.m430f(url, "url");
        logWithTime("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long j) {
        C10843j.m430f(call, "call");
        logWithTime("requestBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        C10843j.m430f(call, "call");
        C10843j.m430f(ioe, "ioe");
        logWithTime("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        C10843j.m430f(call, "call");
        C10843j.m430f(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long j) {
        C10843j.m430f(call, "call");
        logWithTime("responseBodyEnd: byteCount=" + j);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        C10843j.m430f(call, "call");
        C10843j.m430f(ioe, "ioe");
        logWithTime("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        C10843j.m430f(call, "call");
        C10843j.m430f(response, "response");
        logWithTime("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        C10843j.m430f(call, "call");
        C10843j.m430f(response, "response");
        logWithTime("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        C10843j.m430f(call, "call");
        logWithTime("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        C10843j.m430f(call, "call");
        logWithTime("secureConnectStart");
    }
}
