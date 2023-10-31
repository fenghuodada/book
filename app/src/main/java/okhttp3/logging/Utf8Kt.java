package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m508d2 = {"isProbablyUtf8", "", "Lokio/Buffer;", "okhttp-logging-interceptor"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@NotNull Buffer isProbablyUtf8) {
        C10843j.m430f(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            Buffer buffer = new Buffer();
            long size = isProbablyUtf8.size();
            isProbablyUtf8.copyTo(buffer, 0L, size > 64 ? 64L : size);
            for (int i = 0; i < 16; i++) {
                if (buffer.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
