package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m508d2 = {"Ljava/io/IOException;", "it", "Lkotlin/p;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, m507k = 3, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC10844k implements InterfaceC10820l<IOException, C10868p> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public /* bridge */ /* synthetic */ C10868p invoke(IOException iOException) {
        invoke2(iOException);
        return C10868p.f21418a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IOException it) {
        C10843j.m430f(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        Thread currentThread = Thread.currentThread();
        C10843j.m431e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(diskLruCache);
        throw new AssertionError(sb.toString());
    }
}
