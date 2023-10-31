package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, m508d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "okio"}, m507k = 5, m506mv = {1, 4, 0}, m503xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class Okio__OkioKt {
    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink buffer) {
        C10843j.m430f(buffer, "$this$buffer");
        return new RealBufferedSink(buffer);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source buffer) {
        C10843j.m430f(buffer, "$this$buffer");
        return new RealBufferedSource(buffer);
    }
}
