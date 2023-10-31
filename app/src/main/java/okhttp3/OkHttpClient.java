package okhttp3;

import com.applovin.impl.sdk.p033e.C3132a0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10755k;
import kotlin.collections.C10757m;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.p064ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.time.Duration;

@Metadata(m509d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008d\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0089\u0001\u001a\u00020\f¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010(\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020!H\u0007¢\u0006\u0004\b)\u0010#J\u000f\u0010,\u001a\u00020!H\u0007¢\u0006\u0004\b+\u0010#J\u000f\u00100\u001a\u00020-H\u0007¢\u0006\u0004\b.\u0010/J\u0011\u00104\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00108\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u0011\u0010<\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0004\b:\u0010;J\u000f\u0010@\u001a\u00020=H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020%H\u0007¢\u0006\u0004\bA\u0010'J\u000f\u0010F\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010J\u001a\u00020GH\u0007¢\u0006\u0004\bH\u0010IJ\u0015\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u0016H\u0007¢\u0006\u0004\bL\u0010\u0019J\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020N0\u0016H\u0007¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010T\u001a\u00020QH\u0007¢\u0006\u0004\bR\u0010SJ\u000f\u0010X\u001a\u00020UH\u0007¢\u0006\u0004\bV\u0010WJ\u000f\u0010\\\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J\u000f\u0010^\u001a\u00020YH\u0007¢\u0006\u0004\b]\u0010[J\u000f\u0010`\u001a\u00020YH\u0007¢\u0006\u0004\b_\u0010[J\u000f\u0010b\u001a\u00020YH\u0007¢\u0006\u0004\ba\u0010[J\u000f\u0010d\u001a\u00020YH\u0007¢\u0006\u0004\bc\u0010[J\b\u0010f\u001a\u00020eH\u0002R\u0017\u0010\u0011\u001a\u00020\u000e8G¢\u0006\f\n\u0004\b\u0011\u0010g\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\b\u0015\u0010\u0014R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\b\u001a\u0010i\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\u001d8G¢\u0006\f\n\u0004\b \u0010j\u001a\u0004\b \u0010\u001fR\u0017\u0010$\u001a\u00020!8G¢\u0006\f\n\u0004\b$\u0010k\u001a\u0004\b$\u0010#R\u0017\u0010(\u001a\u00020%8G¢\u0006\f\n\u0004\b(\u0010l\u001a\u0004\b(\u0010'R\u0017\u0010*\u001a\u00020!8G¢\u0006\f\n\u0004\b*\u0010k\u001a\u0004\b*\u0010#R\u0017\u0010,\u001a\u00020!8G¢\u0006\f\n\u0004\b,\u0010k\u001a\u0004\b,\u0010#R\u0017\u00100\u001a\u00020-8G¢\u0006\f\n\u0004\b0\u0010m\u001a\u0004\b0\u0010/R\u0019\u00104\u001a\u0004\u0018\u0001018G¢\u0006\f\n\u0004\b4\u0010n\u001a\u0004\b4\u00103R\u0017\u00108\u001a\u0002058G¢\u0006\f\n\u0004\b8\u0010o\u001a\u0004\b8\u00107R\u0019\u0010<\u001a\u0004\u0018\u0001098G¢\u0006\f\n\u0004\b<\u0010p\u001a\u0004\b<\u0010;R\u0017\u0010@\u001a\u00020=8G¢\u0006\f\n\u0004\b@\u0010q\u001a\u0004\b@\u0010?R\u0017\u0010B\u001a\u00020%8G¢\u0006\f\n\u0004\bB\u0010l\u001a\u0004\bB\u0010'R\u0017\u0010F\u001a\u00020C8G¢\u0006\f\n\u0004\bF\u0010r\u001a\u0004\bF\u0010ER\u0016\u0010s\u001a\u0004\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0019\u0010v\u001a\u0004\u0018\u00010u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bv\u0010xR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00168G¢\u0006\f\n\u0004\bM\u0010i\u001a\u0004\bM\u0010\u0019R\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020N0\u00168G¢\u0006\f\n\u0004\bP\u0010i\u001a\u0004\bP\u0010\u0019R\u0017\u0010T\u001a\u00020Q8G¢\u0006\f\n\u0004\bT\u0010y\u001a\u0004\bT\u0010SR\u0017\u0010X\u001a\u00020U8G¢\u0006\f\n\u0004\bX\u0010z\u001a\u0004\bX\u0010WR\u0019\u0010|\u001a\u0004\u0018\u00010{8G¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\u0017\u0010\\\u001a\u00020Y8G¢\u0006\f\n\u0004\b\\\u0010\u007f\u001a\u0004\b\\\u0010[R\u0017\u0010^\u001a\u00020Y8G¢\u0006\f\n\u0004\b^\u0010\u007f\u001a\u0004\b^\u0010[R\u0017\u0010`\u001a\u00020Y8G¢\u0006\f\n\u0004\b`\u0010\u007f\u001a\u0004\b`\u0010[R\u0017\u0010b\u001a\u00020Y8G¢\u0006\f\n\u0004\bb\u0010\u007f\u001a\u0004\bb\u0010[R\u0017\u0010d\u001a\u00020Y8G¢\u0006\f\n\u0004\bd\u0010\u007f\u001a\u0004\bd\u0010[R\u001d\u0010\u0081\u0001\u001a\u00030\u0080\u00018G¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0081\u0001\u0010\u0083\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0011\u0010J\u001a\u00020G8G¢\u0006\u0006\u001a\u0004\bJ\u0010I¨\u0006\u008f\u0001"}, m508d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "Lokhttp3/WebSocketListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocket;", "newWebSocket", "Lokhttp3/OkHttpClient$Builder;", "newBuilder", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lkotlin/p;", "verifyClientState", "Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/EventListener$Factory;", "Z", "Lokhttp3/Authenticator;", "Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "Lokhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Companion", "Builder", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    @NotNull
    private final Authenticator authenticator;
    @Nullable
    private final Cache cache;
    private final int callTimeoutMillis;
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    @NotNull
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    @NotNull
    private final ConnectionPool connectionPool;
    @NotNull
    private final List<ConnectionSpec> connectionSpecs;
    @NotNull
    private final CookieJar cookieJar;
    @NotNull
    private final Dispatcher dispatcher;
    @NotNull
    private final Dns dns;
    @NotNull
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    @NotNull
    private final HostnameVerifier hostnameVerifier;
    @NotNull
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    @NotNull
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    @NotNull
    private final List<Protocol> protocols;
    @Nullable
    private final Proxy proxy;
    @NotNull
    private final Authenticator proxyAuthenticator;
    @NotNull
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    @NotNull
    private final RouteDatabase routeDatabase;
    @NotNull
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    @Nullable
    private final X509TrustManager x509TrustManager;
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    @NotNull
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    @Metadata(m509d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001B\u0014\b\u0010\u0012\u0007\u0010Ë\u0001\u001a\u00020J¢\u0006\u0006\bÉ\u0001\u0010Ì\u0001J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\n\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\u0015\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0007J\u0016\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0014\u00105\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020403J\u0014\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020603J\u000e\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:J\u0016\u0010@\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010C\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010D\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010E\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020<J\u0006\u0010K\u001a\u00020JR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bY\u0010XR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010_\u001a\u0004\bi\u0010a\"\u0004\bj\u0010cR\"\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010_\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b)\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b+\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b,\u0010d\u001a\u0005\b\u0086\u0001\u0010f\"\u0005\b\u0087\u0001\u0010hR'\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u008d\u0001\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R+\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R+\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b5\u0010V\u001a\u0005\b\u0099\u0001\u0010X\"\u0006\b\u009a\u0001\u0010\u009b\u0001R+\u00107\u001a\b\u0012\u0004\u0012\u000206038\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b7\u0010V\u001a\u0005\b\u009c\u0001\u0010X\"\u0006\b\u009d\u0001\u0010\u009b\u0001R'\u00109\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b;\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010@\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R(\u0010C\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bC\u0010°\u0001\u001a\u0006\bµ\u0001\u0010²\u0001\"\u0006\b¶\u0001\u0010´\u0001R(\u0010D\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bD\u0010°\u0001\u001a\u0006\b·\u0001\u0010²\u0001\"\u0006\b¸\u0001\u0010´\u0001R(\u0010E\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bE\u0010°\u0001\u001a\u0006\b¹\u0001\u0010²\u0001\"\u0006\bº\u0001\u0010´\u0001R(\u0010G\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bG\u0010°\u0001\u001a\u0006\b»\u0001\u0010²\u0001\"\u0006\b¼\u0001\u0010´\u0001R'\u0010I\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bI\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R,\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Í\u0001"}, m508d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "interceptors", "interceptor", "addInterceptor", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/l;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "authenticator", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "proxySelector", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "j$/time/Duration", "duration", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "Lokhttp3/OkHttpClient;", "build", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "()Ljava/util/List;", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {
        @NotNull
        private Authenticator authenticator;
        @Nullable
        private Cache cache;
        private int callTimeout;
        @Nullable
        private CertificateChainCleaner certificateChainCleaner;
        @NotNull
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        @NotNull
        private ConnectionPool connectionPool;
        @NotNull
        private List<ConnectionSpec> connectionSpecs;
        @NotNull
        private CookieJar cookieJar;
        @NotNull
        private Dispatcher dispatcher;
        @NotNull
        private Dns dns;
        @NotNull
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        @NotNull
        private HostnameVerifier hostnameVerifier;
        @NotNull
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        @NotNull
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        @NotNull
        private List<? extends Protocol> protocols;
        @Nullable
        private Proxy proxy;
        @NotNull
        private Authenticator proxyAuthenticator;
        @Nullable
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        @Nullable
        private RouteDatabase routeDatabase;
        @NotNull
        private SocketFactory socketFactory;
        @Nullable
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        @Nullable
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C10843j.m431e(socketFactory, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull OkHttpClient okHttpClient) {
            this();
            C10843j.m430f(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            C10755k.m481h(okHttpClient.interceptors(), this.interceptors);
            C10755k.m481h(okHttpClient.networkInterceptors(), this.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        @JvmName(name = "-addInterceptor")
        @NotNull
        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m13203addInterceptor(@NotNull final InterfaceC10820l<? super Interceptor.Chain, Response> block) {
            C10843j.m430f(block, "block");
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    C10843j.m430f(chain, "chain");
                    return (Response) InterfaceC10820l.this.invoke(chain);
                }
            });
        }

        @JvmName(name = "-addNetworkInterceptor")
        @NotNull
        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m13204addNetworkInterceptor(@NotNull final InterfaceC10820l<? super Interceptor.Chain, Response> block) {
            C10843j.m430f(block, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Interceptor.Chain chain) {
                    C10843j.m430f(chain, "chain");
                    return (Response) InterfaceC10820l.this.invoke(chain);
                }
            });
        }

        @NotNull
        public final Builder addInterceptor(@NotNull Interceptor interceptor) {
            C10843j.m430f(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor) {
            C10843j.m430f(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final Builder authenticator(@NotNull Authenticator authenticator) {
            C10843j.m430f(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        @NotNull
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @NotNull
        public final Builder cache(@Nullable Cache cache) {
            this.cache = cache;
            return this;
        }

        @NotNull
        public final Builder callTimeout(long j, @NotNull TimeUnit unit) {
            C10843j.m430f(unit, "unit");
            this.callTimeout = Util.checkDuration("timeout", j, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder callTimeout(@NotNull Duration duration) {
            C10843j.m430f(duration, "duration");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner) {
            C10843j.m430f(certificatePinner, "certificatePinner");
            if (!C10843j.m435a(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @NotNull
        public final Builder connectTimeout(long j, @NotNull TimeUnit unit) {
            C10843j.m430f(unit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", j, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder connectTimeout(@NotNull Duration duration) {
            C10843j.m430f(duration, "duration");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder connectionPool(@NotNull ConnectionPool connectionPool) {
            C10843j.m430f(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @NotNull
        public final Builder connectionSpecs(@NotNull List<ConnectionSpec> connectionSpecs) {
            C10843j.m430f(connectionSpecs, "connectionSpecs");
            if (!C10843j.m435a(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        @NotNull
        public final Builder cookieJar(@NotNull CookieJar cookieJar) {
            C10843j.m430f(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull Dispatcher dispatcher) {
            C10843j.m430f(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder dns(@NotNull Dns dns) {
            C10843j.m430f(dns, "dns");
            if (!C10843j.m435a(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener) {
            C10843j.m430f(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory eventListenerFactory) {
            C10843j.m430f(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        @NotNull
        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        @NotNull
        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        @NotNull
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @Nullable
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @Nullable
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @NotNull
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @NotNull
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @NotNull
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @NotNull
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @NotNull
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @NotNull
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @NotNull
        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @NotNull
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @NotNull
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @NotNull
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @NotNull
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @Nullable
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @NotNull
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @Nullable
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @Nullable
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @NotNull
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @Nullable
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @Nullable
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @NotNull
        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier) {
            C10843j.m430f(hostnameVerifier, "hostnameVerifier");
            if (!C10843j.m435a(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @NotNull
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @NotNull
        public final Builder minWebSocketMessageToCompress(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.minWebSocketMessageToCompress = j;
                return this;
            }
            throw new IllegalArgumentException(C3132a0.m7696a("minWebSocketMessageToCompress must be positive: ", j).toString());
        }

        @NotNull
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @NotNull
        public final Builder pingInterval(long j, @NotNull TimeUnit unit) {
            C10843j.m430f(unit, "unit");
            this.pingInterval = Util.checkDuration("interval", j, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder pingInterval(@NotNull Duration duration) {
            C10843j.m430f(duration, "duration");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder protocols(@NotNull List<? extends Protocol> protocols) {
            C10843j.m430f(protocols, "protocols");
            ArrayList m470s = C10757m.m470s(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z = false;
            if (!(m470s.contains(protocol) || m470s.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + m470s).toString());
            }
            if (!m470s.contains(protocol) || m470s.size() <= 1) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + m470s).toString());
            } else if (!(!m470s.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + m470s).toString());
            } else if (!m470s.contains(null)) {
                m470s.remove(Protocol.SPDY_3);
                if (!C10843j.m435a(m470s, this.protocols)) {
                    this.routeDatabase = null;
                }
                List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(m470s);
                C10843j.m431e(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                this.protocols = unmodifiableList;
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }

        @NotNull
        public final Builder proxy(@Nullable Proxy proxy) {
            if (!C10843j.m435a(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @NotNull
        public final Builder proxyAuthenticator(@NotNull Authenticator proxyAuthenticator) {
            C10843j.m430f(proxyAuthenticator, "proxyAuthenticator");
            if (!C10843j.m435a(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @NotNull
        public final Builder proxySelector(@NotNull ProxySelector proxySelector) {
            C10843j.m430f(proxySelector, "proxySelector");
            if (!C10843j.m435a(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @NotNull
        public final Builder readTimeout(long j, @NotNull TimeUnit unit) {
            C10843j.m430f(unit, "unit");
            this.readTimeout = Util.checkDuration("timeout", j, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder readTimeout(@NotNull Duration duration) {
            C10843j.m430f(duration, "duration");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            C10843j.m430f(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(@Nullable Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner) {
            C10843j.m430f(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(@NotNull ConnectionPool connectionPool) {
            C10843j.m430f(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List<ConnectionSpec> list) {
            C10843j.m430f(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar) {
            C10843j.m430f(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher) {
            C10843j.m430f(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(@NotNull Dns dns) {
            C10843j.m430f(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(@NotNull EventListener.Factory factory) {
            C10843j.m430f(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier) {
            C10843j.m430f(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(@NotNull List<? extends Protocol> list) {
            C10843j.m430f(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            C10843j.m430f(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory) {
            C10843j.m430f(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @NotNull
        public final Builder socketFactory(@NotNull SocketFactory socketFactory) {
            C10843j.m430f(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!C10843j.m435a(socketFactory, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sslSocketFactory) {
            C10843j.m430f(sslSocketFactory, "sslSocketFactory");
            if (!C10843j.m435a(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sslSocketFactory);
            if (trustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = trustManager;
            Platform platform = companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            C10843j.m433c(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            C10843j.m430f(sslSocketFactory, "sslSocketFactory");
            C10843j.m430f(trustManager, "trustManager");
            if ((!C10843j.m435a(sslSocketFactory, this.sslSocketFactoryOrNull)) || (!C10843j.m435a(trustManager, this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @NotNull
        public final Builder writeTimeout(long j, @NotNull TimeUnit unit) {
            C10843j.m430f(unit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", j, unit);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder writeTimeout(@NotNull Duration duration) {
            C10843j.m430f(duration, "duration");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m508d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @NotNull
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @NotNull
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
        if (r0 != null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OkHttpClient(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient.Builder r4) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    private final void verifyClientState() {
        List<Interceptor> list;
        List<Interceptor> list2;
        boolean z;
        if (this.interceptors == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        if (this.networkInterceptors == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (ConnectionSpec connectionSpec : list3) {
                if (connectionSpec.isTls()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            if (this.sslSocketFactoryOrNull == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.certificateChainCleaner == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.x509TrustManager == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.sslSocketFactoryOrNull == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.certificateChainCleaner == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.x509TrustManager == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C10843j.m435a(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    @JvmName(name = "-deprecated_authenticator")
    @NotNull
    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m13177deprecated_authenticator() {
        return this.authenticator;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    @JvmName(name = "-deprecated_cache")
    @Nullable
    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m13178deprecated_cache() {
        return this.cache;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_callTimeoutMillis")
    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m13179deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @JvmName(name = "-deprecated_certificatePinner")
    @NotNull
    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m13180deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_connectTimeoutMillis")
    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m13181deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    @JvmName(name = "-deprecated_connectionPool")
    @NotNull
    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m13182deprecated_connectionPool() {
        return this.connectionPool;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    @NotNull
    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m13183deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    @JvmName(name = "-deprecated_cookieJar")
    @NotNull
    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m13184deprecated_cookieJar() {
        return this.cookieJar;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    @JvmName(name = "-deprecated_dispatcher")
    @NotNull
    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m13185deprecated_dispatcher() {
        return this.dispatcher;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    @NotNull
    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m13186deprecated_dns() {
        return this.dns;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @JvmName(name = "-deprecated_eventListenerFactory")
    @NotNull
    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m13187deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    @JvmName(name = "-deprecated_followRedirects")
    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m13188deprecated_followRedirects() {
        return this.followRedirects;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    @JvmName(name = "-deprecated_followSslRedirects")
    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m13189deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @JvmName(name = "-deprecated_hostnameVerifier")
    @NotNull
    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m13190deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    @JvmName(name = "-deprecated_interceptors")
    @NotNull
    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m13191deprecated_interceptors() {
        return this.interceptors;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    @JvmName(name = "-deprecated_networkInterceptors")
    @NotNull
    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m13192deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    @JvmName(name = "-deprecated_pingIntervalMillis")
    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m13193deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    @NotNull
    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m13194deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @Nullable
    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m13195deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    @NotNull
    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m13196deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    @NotNull
    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m13197deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_readTimeoutMillis")
    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m13198deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    @JvmName(name = "-deprecated_retryOnConnectionFailure")
    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m13199deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    @NotNull
    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m13200deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @JvmName(name = "-deprecated_sslSocketFactory")
    @NotNull
    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m13201deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_writeTimeoutMillis")
    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m13202deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @JvmName(name = "authenticator")
    @NotNull
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @JvmName(name = "cache")
    @Nullable
    public final Cache cache() {
        return this.cache;
    }

    @JvmName(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @JvmName(name = "certificateChainCleaner")
    @Nullable
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @JvmName(name = "certificatePinner")
    @NotNull
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @JvmName(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @JvmName(name = "connectionPool")
    @NotNull
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @JvmName(name = "cookieJar")
    @NotNull
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @JvmName(name = "dispatcher")
    @NotNull
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @JvmName(name = "dns")
    @NotNull
    public final Dns dns() {
        return this.dns;
    }

    @JvmName(name = "eventListenerFactory")
    @NotNull
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @JvmName(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @JvmName(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @JvmName(name = "hostnameVerifier")
    @NotNull
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @JvmName(name = "interceptors")
    @NotNull
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @JvmName(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @JvmName(name = "networkInterceptors")
    @NotNull
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    @NotNull
    public Call newCall(@NotNull Request request) {
        C10843j.m430f(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    @NotNull
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener listener) {
        C10843j.m430f(request, "request");
        C10843j.m430f(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @JvmName(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @JvmName(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.proxy;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @JvmName(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @JvmName(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @JvmName(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @JvmName(name = "x509TrustManager")
    @Nullable
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }
}
