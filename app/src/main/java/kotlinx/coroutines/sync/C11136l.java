package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.AbstractC11028c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* renamed from: kotlinx.coroutines.sync.l */
/* loaded from: classes3.dex */
public final class C11136l extends AbstractC11028c0<C11136l> {
    @NotNull

    /* renamed from: e */
    public final AtomicReferenceArray f21794e;

    public C11136l(long j, @Nullable C11136l c11136l, int i) {
        super(j, c11136l, i);
        this.f21794e = new AtomicReferenceArray(C11135k.f21793f);
    }

    @Override // kotlinx.coroutines.internal.AbstractC11028c0
    /* renamed from: f */
    public final int mo129f() {
        return C11135k.f21793f;
    }

    @Override // kotlinx.coroutines.internal.AbstractC11028c0
    /* renamed from: g */
    public final void mo128g(int i, @NotNull InterfaceC10775f interfaceC10775f) {
        this.f21794e.set(i, C11135k.f21792e);
        m275h();
    }

    @NotNull
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f21621c + ", hashCode=" + hashCode() + ']';
    }
}
