package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.C10753i;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016¨\u00061"}, m508d2 = {"Lokhttp3/internal/platform/Platform;", "", "", "getPrefix", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "Lkotlin/p;", "configureTlsExtensions", "afterHandshake", "getSelectedProtocol", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "message", "level", "", "t", "log", "", "isCleartextTrafficPermitted", "closer", "getStackTraceForCloseable", "stackTrace", "logCloseableLeak", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "newSslSocketFactory", "toString", "<init>", "()V", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class Platform {
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    @Metadata(m509d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006\""}, m508d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "findPlatform", "findAndroidPlatform", "findJvmPlatform", "get", "platform", "Lkotlin/p;", "resetForTests", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "", "concatLengthPrefixed", "", "isConscryptPreferred", "()Z", "isOpenJSSEPreferred", "isBouncyCastlePreferred", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform buildIfSupported = Android10Platform.Companion.buildIfSupported();
            if (buildIfSupported != null) {
                return buildIfSupported;
            }
            Platform buildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
            C10843j.m433c(buildIfSupported2);
            return buildIfSupported2;
        }

        private final Platform findJvmPlatform() {
            OpenJSSEPlatform buildIfSupported;
            BouncyCastlePlatform buildIfSupported2;
            ConscryptPlatform buildIfSupported3;
            if (!isConscryptPreferred() || (buildIfSupported3 = ConscryptPlatform.Companion.buildIfSupported()) == null) {
                if (!isBouncyCastlePreferred() || (buildIfSupported2 = BouncyCastlePlatform.Companion.buildIfSupported()) == null) {
                    if (!isOpenJSSEPreferred() || (buildIfSupported = OpenJSSEPlatform.Companion.buildIfSupported()) == null) {
                        Jdk9Platform buildIfSupported4 = Jdk9Platform.Companion.buildIfSupported();
                        if (buildIfSupported4 != null) {
                            return buildIfSupported4;
                        }
                        Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
                        return buildIfSupported5 != null ? buildIfSupported5 : new Platform();
                    }
                    return buildIfSupported;
                }
                return buildIfSupported2;
            }
            return buildIfSupported3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            Provider provider = Security.getProviders()[0];
            C10843j.m431e(provider, "Security.getProviders()[0]");
            return C10843j.m435a("BC", provider.getName());
        }

        private final boolean isConscryptPreferred() {
            Provider provider = Security.getProviders()[0];
            C10843j.m431e(provider, "Security.getProviders()[0]");
            return C10843j.m435a("Conscrypt", provider.getName());
        }

        private final boolean isOpenJSSEPreferred() {
            Provider provider = Security.getProviders()[0];
            C10843j.m431e(provider, "Security.getProviders()[0]");
            return C10843j.m435a("OpenJSSE", provider.getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        @NotNull
        public final List<String> alpnProtocolNames(@NotNull List<? extends Protocol> protocols) {
            C10843j.m430f(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10753i.m482g(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] concatLengthPrefixed(@NotNull List<? extends Protocol> protocols) {
            C10843j.m430f(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        @JvmStatic
        @NotNull
        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return C10843j.m435a("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void resetForTests(@NotNull Platform platform) {
            C10843j.m430f(platform, "platform");
            Platform.platform = platform;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    @JvmStatic
    @NotNull
    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i, th);
    }

    public void afterHandshake(@NotNull SSLSocket sslSocket) {
        C10843j.m430f(sslSocket, "sslSocket");
    }

    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager trustManager) {
        C10843j.m430f(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager trustManager) {
        C10843j.m430f(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        C10843j.m431e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        C10843j.m430f(sslSocket, "sslSocket");
        C10843j.m430f(protocols, "protocols");
    }

    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        C10843j.m430f(socket, "socket");
        C10843j.m430f(address, "address");
        socket.connect(address, i);
    }

    @NotNull
    public final String getPrefix() {
        return "OkHttp";
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sslSocket) {
        C10843j.m430f(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object getStackTraceForCloseable(@NotNull String closer) {
        C10843j.m430f(closer, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(@NotNull String hostname) {
        C10843j.m430f(hostname, "hostname");
        return true;
    }

    public void log(@NotNull String message, int i, @Nullable Throwable th) {
        C10843j.m430f(message, "message");
        logger.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void logCloseableLeak(@NotNull String message, @Nullable Object obj) {
        C10843j.m430f(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(message, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C10843j.m431e(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager trustManager) {
        C10843j.m430f(trustManager, "trustManager");
        try {
            SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            C10843j.m431e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @NotNull
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C10843j.m433c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (!z) {
            String arrays = Arrays.toString(trustManagers);
            C10843j.m431e(arrays, "java.util.Arrays.toString(this)");
            throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName();
    }

    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sslSocketFactory) {
        C10843j.m430f(sslSocketFactory, "sslSocketFactory");
        try {
            Object readFieldOrNull = Util.readFieldOrNull(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (readFieldOrNull != null) {
                return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!C10843j.m435a(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }
}
