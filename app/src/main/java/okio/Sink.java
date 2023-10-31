package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&¨\u0006\r"}, m508d2 = {"Lokio/Sink;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokio/Buffer;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "Lkotlin/p;", "write", "flush", "Lokio/Timeout;", "timeout", "close", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Sink extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    @NotNull
    Timeout timeout();

    void write(@NotNull Buffer buffer, long j) throws IOException;
}
