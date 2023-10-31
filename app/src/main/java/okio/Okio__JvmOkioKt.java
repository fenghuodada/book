package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10929r;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0016\u0010\r\u001a\u00020\u000b*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u000f\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0010\u001a%\u0010\r\u001a\u00020\u000b*\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\f\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0018\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0010\u001a%\u0010\u0016\u001a\u00020\u0017*\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0019\"\u001c\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0005\u001a\u00020\u0006*\u00060\u0007j\u0002`\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u001a"}, m508d2 = {"logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "getLogger$Okio__JvmOkioKt", "()Ljava/util/logging/Logger;", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "appendingSink", "Lokio/Sink;", "Ljava/io/File;", "sink", "append", "Ljava/io/OutputStream;", "Ljava/net/Socket;", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, m507k = 5, m506mv = {1, 4, 0}, m503xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    @NotNull
    public static final Sink appendingSink(@NotNull File appendingSink) throws FileNotFoundException {
        C10843j.m430f(appendingSink, "$this$appendingSink");
        return Okio.sink(new FileOutputStream(appendingSink, true));
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError isAndroidGetsocknameError) {
        C10843j.m430f(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() != null) {
            String message = isAndroidGetsocknameError.getMessage();
            return message != null ? C10929r.m379m(message, "getsockname failed") : false;
        }
        return false;
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        return sink$default(file, false, 1, null);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File sink, boolean z) throws FileNotFoundException {
        C10843j.m430f(sink, "$this$sink");
        return Okio.sink(new FileOutputStream(sink, z));
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream sink) {
        C10843j.m430f(sink, "$this$sink");
        return new OutputStreamSink(sink, new Timeout());
    }

    @NotNull
    public static final Sink sink(@NotNull Socket sink) throws IOException {
        C10843j.m430f(sink, "$this$sink");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(sink);
        OutputStream outputStream = sink.getOutputStream();
        C10843j.m431e(outputStream, "getOutputStream()");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Sink sink(@NotNull Path sink, @NotNull OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        C10843j.m430f(sink, "$this$sink");
        C10843j.m430f(options, "options");
        newOutputStream = Files.newOutputStream(sink, (OpenOption[]) Arrays.copyOf(options, options.length));
        C10843j.m431e(newOutputStream, "Files.newOutputStream(this, *options)");
        return Okio.sink(newOutputStream);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return Okio.sink(file, z);
    }

    @NotNull
    public static final Source source(@NotNull File source) throws FileNotFoundException {
        C10843j.m430f(source, "$this$source");
        return Okio.source(new FileInputStream(source));
    }

    @NotNull
    public static final Source source(@NotNull InputStream source) {
        C10843j.m430f(source, "$this$source");
        return new InputStreamSource(source, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket source) throws IOException {
        C10843j.m430f(source, "$this$source");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(source);
        InputStream inputStream = source.getInputStream();
        C10843j.m431e(inputStream, "getInputStream()");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Source source(@NotNull Path source, @NotNull OpenOption... options) throws IOException {
        InputStream newInputStream;
        C10843j.m430f(source, "$this$source");
        C10843j.m430f(options, "options");
        newInputStream = Files.newInputStream(source, (OpenOption[]) Arrays.copyOf(options, options.length));
        C10843j.m431e(newInputStream, "Files.newInputStream(this, *options)");
        return Okio.source(newInputStream);
    }
}
