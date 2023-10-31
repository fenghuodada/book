package okhttp3.logging;

import androidx.constraintlayout.core.C0510h;
import androidx.core.content.C0663f;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10755k;
import kotlin.collections.C10761q;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.p061io.C10805a;
import kotlin.text.C10925n;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\"#B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m508d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Headers;", "headers", "", "i", "Lkotlin/p;", "logHeader", "", "bodyHasUnknownEncoding", "", "name", "redactHeader", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "headersToRedact", "Ljava/util/Set;", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Level", "Logger", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    @NotNull
    private volatile Level level;
    private final Logger logger;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m508d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, m508d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "message", "Lkotlin/p;", "log", "Companion", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface Logger {
        public static final Companion Companion = new Companion(null);
        @JvmField
        @NotNull
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, m508d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            @Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m508d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "message", "Lkotlin/p;", "log", "<init>", "()V", "okhttp-logging-interceptor"}, m507k = 1, m506mv = {1, 4, 0})
            /* loaded from: classes3.dex */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@NotNull String message) {
                    C10843j.m430f(message, "message");
                    Platform.log$default(Platform.Companion.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(C10839f c10839f) {
                this();
            }
        }

        void log(@NotNull String str);
    }

    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull Logger logger) {
        C10843j.m430f(logger, "logger");
        this.logger = logger;
        this.headersToRedact = C10761q.f21365a;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, C10839f c10839f) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || C10925n.m398e(str, "identity") || C10925n.m398e(str, "gzip")) ? false : true;
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        Logger logger = this.logger;
        logger.log(headers.name(i) + ": " + value);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to var", replaceWith = @ReplaceWith(expression = "level", imports = {}))
    @JvmName(name = "-deprecated_level")
    @NotNull
    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m13227deprecated_level() {
        return this.level;
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        String sb;
        char c;
        String str4;
        Logger logger;
        String str5;
        Charset UTF_8;
        Logger logger2;
        StringBuilder sb2;
        String method;
        Logger logger3;
        String str6;
        Charset UTF_82;
        StringBuilder sb3;
        C10843j.m430f(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        if (level == Level.BODY) {
            z = true;
        } else {
            z = false;
        }
        if (!z && level != Level.HEADERS) {
            z2 = false;
        } else {
            z2 = true;
        }
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb4 = new StringBuilder("--> ");
        sb4.append(request.method());
        sb4.append(' ');
        sb4.append(request.url());
        if (connection == null) {
            str = "";
        } else {
            str = " " + connection.protocol();
        }
        sb4.append(str);
        String sb5 = sb4.toString();
        if (!z2 && body != 0) {
            StringBuilder m12339b = C0510h.m12339b(sb5, " (");
            m12339b.append(body.contentLength());
            m12339b.append("-byte body)");
            sb5 = m12339b.toString();
        }
        this.logger.log(sb5);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + contentType);
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (z && body != null) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    logger2 = this.logger;
                    sb2 = new StringBuilder("--> END ");
                    sb2.append(request.method());
                    method = " (encoded body omitted)";
                } else if (body.isDuplex()) {
                    logger2 = this.logger;
                    sb2 = new StringBuilder("--> END ");
                    sb2.append(request.method());
                    method = " (duplex request body omitted)";
                } else if (body.isOneShot()) {
                    logger2 = this.logger;
                    sb2 = new StringBuilder("--> END ");
                    sb2.append(request.method());
                    method = " (one-shot body omitted)";
                } else {
                    Buffer buffer = new Buffer();
                    body.writeTo(buffer);
                    MediaType contentType2 = body.contentType();
                    if (contentType2 == null || (UTF_82 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                        UTF_82 = StandardCharsets.UTF_8;
                        C10843j.m431e(UTF_82, "UTF_8");
                    }
                    this.logger.log("");
                    if (Utf8Kt.isProbablyUtf8(buffer)) {
                        this.logger.log(buffer.readString(UTF_82));
                        logger3 = this.logger;
                        sb3 = new StringBuilder("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (");
                        sb3.append(body.contentLength());
                        sb3.append("-byte body)");
                    } else {
                        logger3 = this.logger;
                        sb3 = new StringBuilder("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (binary ");
                        sb3.append(body.contentLength());
                        sb3.append("-byte body omitted)");
                    }
                    str6 = sb3.toString();
                    logger3.log(str6);
                }
            } else {
                logger2 = this.logger;
                sb2 = new StringBuilder("--> END ");
                method = request.method();
            }
            sb2.append(method);
            String sb6 = sb2.toString();
            logger3 = logger2;
            str6 = sb6;
            logger3.log(str6);
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            C10843j.m433c(body2);
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger4 = this.logger;
            StringBuilder sb7 = new StringBuilder("<-- ");
            sb7.append(proceed.code());
            if (proceed.message().length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c = ' ';
                str3 = "-byte body omitted)";
                sb = "";
            } else {
                String message = proceed.message();
                StringBuilder sb8 = new StringBuilder();
                str3 = "-byte body omitted)";
                sb8.append(String.valueOf(' '));
                sb8.append(message);
                sb = sb8.toString();
                c = ' ';
            }
            sb7.append(sb);
            sb7.append(c);
            sb7.append(proceed.request().url());
            sb7.append(" (");
            sb7.append(millis);
            sb7.append("ms");
            if (z2) {
                str4 = "";
            } else {
                str4 = C0663f.m12005a(", ", str2, " body");
            }
            sb7.append(str4);
            sb7.append(')');
            logger4.log(sb7.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (z && HttpHeaders.promisesBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        logger = this.logger;
                        str5 = "<-- END HTTP (encoded body omitted)";
                    } else {
                        BufferedSource source = body2.source();
                        source.request(Long.MAX_VALUE);
                        Buffer buffer2 = source.getBuffer();
                        Long l = null;
                        if (C10925n.m398e("gzip", headers2.get("Content-Encoding"))) {
                            Long valueOf = Long.valueOf(buffer2.size());
                            GzipSource gzipSource = new GzipSource(buffer2.clone());
                            try {
                                buffer2 = new Buffer();
                                buffer2.writeAll(gzipSource);
                                C10805a.m443a(gzipSource, null);
                                l = valueOf;
                            } finally {
                            }
                        }
                        MediaType contentType3 = body2.contentType();
                        if (contentType3 == null || (UTF_8 = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            C10843j.m431e(UTF_8, "UTF_8");
                        }
                        if (!Utf8Kt.isProbablyUtf8(buffer2)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + buffer2.size() + str3);
                            return proceed;
                        }
                        if (contentLength != 0) {
                            this.logger.log("");
                            this.logger.log(buffer2.clone().readString(UTF_8));
                        }
                        logger = this.logger;
                        if (l != null) {
                            str5 = "<-- END HTTP (" + buffer2.size() + "-byte, " + l + "-gzipped-byte body)";
                        } else {
                            str5 = "<-- END HTTP (" + buffer2.size() + "-byte body)";
                        }
                    }
                } else {
                    logger = this.logger;
                    str5 = "<-- END HTTP";
                }
                logger.log(str5);
            }
            return proceed;
        } catch (Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    @JvmName(name = "level")
    public final void level(@NotNull Level level) {
        C10843j.m430f(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        C10843j.m430f(name, "name");
        TreeSet treeSet = new TreeSet(C10925n.m397f());
        C10755k.m481h(this.headersToRedact, treeSet);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        C10843j.m430f(level, "level");
        this.level = level;
        return this;
    }
}
