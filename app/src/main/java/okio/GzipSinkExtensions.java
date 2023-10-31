package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m508d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "-GzipSinkExtensions")
/* renamed from: okio.-GzipSinkExtensions  reason: invalid class name */
/* loaded from: classes3.dex */
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink gzip) {
        C10843j.m430f(gzip, "$this$gzip");
        return new GzipSink(gzip);
    }
}
