package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, m507k = 4, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.appendingSink(file);
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return Okio__OkioKt.blackhole();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        return Okio__OkioKt.buffer(sink);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        return Okio__OkioKt.buffer(source);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        return Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z) throws FileNotFoundException {
        return Okio__JvmOkioKt.sink(file, z);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        return Okio__JvmOkioKt.sink(outputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        return Okio__JvmOkioKt.sink(socket);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Sink sink(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return Okio__JvmOkioKt.sink(path, openOptionArr);
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        return Okio__JvmOkioKt.source(file);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        return Okio__JvmOkioKt.source(inputStream);
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        return Okio__JvmOkioKt.source(socket);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Source source(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return Okio__JvmOkioKt.source(path, openOptionArr);
    }
}
