package okio;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m508d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "-DeflaterSinkExtensions")
/* renamed from: okio.-DeflaterSinkExtensions  reason: invalid class name */
/* loaded from: classes3.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink deflate, @NotNull Deflater deflater) {
        C10843j.m430f(deflate, "$this$deflate");
        C10843j.m430f(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink deflate, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        C10843j.m430f(deflate, "$this$deflate");
        C10843j.m430f(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }
}
