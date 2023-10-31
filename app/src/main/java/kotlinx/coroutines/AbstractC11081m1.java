package kotlinx.coroutines;

import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.m1 */
/* loaded from: classes3.dex */
public abstract class AbstractC11081m1 extends AbstractC11148v implements InterfaceC11096q0, InterfaceC10954c1 {

    /* renamed from: d */
    public C11084n1 f21686d;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0024, code lost:
        continue;
     */
    @Override // kotlinx.coroutines.InterfaceC11096q0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo116b() {
        /*
            r7 = this;
            kotlinx.coroutines.n1 r0 = r7.m217m()
        L4:
            java.lang.Object r1 = r0.m207M()
            boolean r2 = r1 instanceof kotlinx.coroutines.AbstractC11081m1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            if (r1 == r7) goto L12
            goto L75
        L12:
            kotlinx.coroutines.s0 r2 = kotlinx.coroutines.C11091o1.f21707g
        L14:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.C11084n1.f21687a
            boolean r6 = r5.compareAndSet(r0, r1, r2)
            if (r6 == 0) goto L1e
            r3 = r4
            goto L24
        L1e:
            java.lang.Object r5 = r5.get(r0)
            if (r5 == r1) goto L14
        L24:
            if (r3 == 0) goto L4
            goto L75
        L27:
            boolean r0 = r1 instanceof kotlinx.coroutines.InterfaceC10954c1
            if (r0 == 0) goto L75
            kotlinx.coroutines.c1 r1 = (kotlinx.coroutines.InterfaceC10954c1) r1
            kotlinx.coroutines.r1 r0 = r1.mo164e()
            if (r0 == 0) goto L75
        L33:
            java.lang.Object r0 = r7.m246h()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.C11068z
            if (r1 == 0) goto L40
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.C11068z) r0
            kotlinx.coroutines.internal.r r0 = r0.f21678a
            goto L75
        L40:
            if (r0 != r7) goto L45
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.C11057r) r0
            goto L75
        L45:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C10843j.m432d(r0, r1)
            r1 = r0
            kotlinx.coroutines.internal.r r1 = (kotlinx.coroutines.internal.C11057r) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.C11057r.f21662c
            java.lang.Object r5 = r2.get(r1)
            kotlinx.coroutines.internal.z r5 = (kotlinx.coroutines.internal.C11068z) r5
            if (r5 != 0) goto L5f
            kotlinx.coroutines.internal.z r5 = new kotlinx.coroutines.internal.z
            r5.<init>(r1)
            r2.lazySet(r1, r5)
        L5f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.C11057r.f21660a
            boolean r6 = r2.compareAndSet(r7, r0, r5)
            if (r6 == 0) goto L69
            r0 = r4
            goto L70
        L69:
            java.lang.Object r2 = r2.get(r7)
            if (r2 == r0) goto L5f
            r0 = r3
        L70:
            if (r0 == 0) goto L33
            r1.m248f()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC11081m1.mo116b():void");
    }

    @Override // kotlinx.coroutines.InterfaceC10954c1
    /* renamed from: c */
    public final boolean mo165c() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC10954c1
    @Nullable
    /* renamed from: e */
    public final C11100r1 mo164e() {
        return null;
    }

    @NotNull
    /* renamed from: m */
    public final C11084n1 m217m() {
        C11084n1 c11084n1 = this.f21686d;
        if (c11084n1 != null) {
            return c11084n1;
        }
        C10843j.m424l("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.C11057r
    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '@' + C11016h0.m298a(this) + "[job@" + C11016h0.m298a(m217m()) + ']';
    }
}
