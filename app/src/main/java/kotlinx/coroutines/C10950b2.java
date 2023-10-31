package kotlinx.coroutines;

import kotlin.C10806j;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C11026b0;
import kotlinx.coroutines.internal.C11040i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,311:1\n1#2:312\n107#3,13:313\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:313,13\n*E\n"})
/* renamed from: kotlinx.coroutines.b2 */
/* loaded from: classes3.dex */
public final class C10950b2<T> extends C11026b0<T> {
    @NotNull

    /* renamed from: e */
    public final ThreadLocal<C10806j<InterfaceC10775f, Object>> f21501e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10950b2(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10775f r4) {
        /*
            r2 = this;
            kotlinx.coroutines.c2 r0 = kotlinx.coroutines.C10955c2.f21505a
            kotlin.coroutines.f$b r1 = r4.mo195a(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.f r0 = r4.mo190f(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f21501e = r0
            kotlin.coroutines.f r3 = r3.getContext()
            kotlin.coroutines.e$a r0 = kotlin.coroutines.InterfaceC10773e.C10774a.f21375a
            kotlin.coroutines.f$b r3 = r3.mo195a(r0)
            boolean r3 = r3 instanceof kotlinx.coroutines.AbstractC10946b0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.C11040i0.m260b(r4, r3)
            kotlinx.coroutines.internal.C11040i0.m261a(r4, r3)
            r2.m348f0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10950b2.<init>(kotlin.coroutines.d, kotlin.coroutines.f):void");
    }

    @Override // kotlinx.coroutines.internal.C11026b0, kotlinx.coroutines.AbstractC10936a
    /* renamed from: c0 */
    public final void mo225c0(@Nullable Object obj) {
        if (this.threadLocalIsSet) {
            C10806j<InterfaceC10775f, Object> c10806j = this.f21501e.get();
            if (c10806j != null) {
                C11040i0.m261a(c10806j.f21397a, c10806j.f21398b);
            }
            this.f21501e.remove();
        }
        Object m108a = C11154x.m108a(obj);
        InterfaceC10772d<T> interfaceC10772d = this.f21618d;
        InterfaceC10775f context = interfaceC10772d.getContext();
        C10950b2<?> c10950b2 = null;
        Object m260b = C11040i0.m260b(context, null);
        if (m260b != C11040i0.f21630a) {
            c10950b2 = C11160z.m101b(interfaceC10772d, context, m260b);
        }
        try {
            this.f21618d.resumeWith(m108a);
            C10868p c10868p = C10868p.f21418a;
        } finally {
            if (c10950b2 == null || c10950b2.m349e0()) {
                C11040i0.m261a(context, m260b);
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m349e0() {
        boolean z = this.threadLocalIsSet && this.f21501e.get() == null;
        this.f21501e.remove();
        return !z;
    }

    /* renamed from: f0 */
    public final void m348f0(@NotNull InterfaceC10775f interfaceC10775f, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.f21501e.set(new C10806j<>(interfaceC10775f, obj));
    }
}
