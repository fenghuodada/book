package okio;

import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, m508d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "-InflaterSourceExtensions")
/* renamed from: okio.-InflaterSourceExtensions  reason: invalid class name */
/* loaded from: classes3.dex */
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source inflate, @NotNull Inflater inflater) {
        C10843j.m430f(inflate, "$this$inflate");
        C10843j.m430f(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source inflate, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        C10843j.m430f(inflate, "$this$inflate");
        C10843j.m430f(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }
}
