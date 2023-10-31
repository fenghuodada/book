package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Ljava/io/IOException;", "it", "Lkotlin/p;", "invoke", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1", "<anonymous>"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends AbstractC10844k implements InterfaceC10820l<IOException, C10868p> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public /* bridge */ /* synthetic */ C10868p invoke(IOException iOException) {
        invoke2(iOException);
        return C10868p.f21418a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IOException it) {
        C10843j.m430f(it, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C10868p c10868p = C10868p.f21418a;
        }
    }
}
