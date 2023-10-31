package kotlinx.coroutines.channels;

import androidx.datastore.core.C1107q;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.AbstractC11028c0;
import kotlinx.coroutines.internal.C11034f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.f */
/* loaded from: classes3.dex */
public final class C10966f<E> extends AbstractC11028c0<C10966f<E>> {
    @Nullable

    /* renamed from: e */
    public final C10956a<E> f21543e;
    @NotNull

    /* renamed from: f */
    public final AtomicReferenceArray f21544f;

    public C10966f(long j, @Nullable C10966f<E> c10966f, @Nullable C10956a<E> c10956a, int i) {
        super(j, c10966f, i);
        this.f21543e = c10956a;
        this.f21544f = new AtomicReferenceArray(C10962d.f21523b * 2);
    }

    @Override // kotlinx.coroutines.internal.AbstractC11028c0
    /* renamed from: f */
    public final int mo129f() {
        return C10962d.f21523b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m313n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        kotlin.jvm.internal.C10843j.m433c(r4);
        r7 = r4.f21516b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        kotlinx.coroutines.internal.C11066x.m230a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // kotlinx.coroutines.internal.AbstractC11028c0
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo128g(int r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10775f r8) {
        /*
            r6 = this;
            int r0 = kotlinx.coroutines.channels.C10962d.f21523b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f21544f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.m316k(r7)
            boolean r3 = r2 instanceof kotlinx.coroutines.InterfaceC10974d2
            kotlinx.coroutines.channels.a<E> r4 = r6.f21543e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.C10970j
            if (r3 == 0) goto L22
            goto L6b
        L22:
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21531j
            if (r2 == r3) goto L5b
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21532k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21528g
            if (r2 == r3) goto L12
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21527f
            if (r2 != r3) goto L34
            goto L12
        L34:
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21530i
            if (r2 == r7) goto L5a
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21525d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            kotlinx.coroutines.internal.f0 r7 = kotlinx.coroutines.channels.C10962d.f21533l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m313n(r7, r5)
            if (r1 == 0) goto L6a
            kotlin.jvm.internal.C10843j.m433c(r4)
            kotlin.jvm.functions.l<E, kotlin.p> r7 = r4.f21516b
            if (r7 == 0) goto L6a
            kotlinx.coroutines.internal.C11066x.m230a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21531j
            goto L72
        L70:
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.channels.C10962d.f21532k
        L72:
            boolean r2 = r6.m317j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m313n(r7, r5)
            r2 = r1 ^ 1
            r6.m315l(r7, r2)
            if (r1 == 0) goto L8c
            kotlin.jvm.internal.C10843j.m433c(r4)
            kotlin.jvm.functions.l<E, kotlin.p> r7 = r4.f21516b
            if (r7 == 0) goto L8c
            kotlinx.coroutines.internal.C11066x.m230a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C10966f.mo128g(int, kotlin.coroutines.f):void");
    }

    /* renamed from: j */
    public final boolean m317j(int i, @Nullable Object obj, @Nullable Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f21544f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: k */
    public final Object m316k(int i) {
        return this.f21544f.get((i * 2) + 1);
    }

    /* renamed from: l */
    public final void m315l(int i, boolean z) {
        if (z) {
            C10956a<E> c10956a = this.f21543e;
            C10843j.m433c(c10956a);
            c10956a.m345B((this.f21621c * C10962d.f21523b) + i);
        }
        m275h();
    }

    /* renamed from: m */
    public final E m314m(int i) {
        E e = (E) this.f21544f.get(i * 2);
        m313n(i, null);
        return e;
    }

    /* renamed from: n */
    public final void m313n(int i, C1107q.AbstractC1108a abstractC1108a) {
        this.f21544f.lazySet(i * 2, abstractC1108a);
    }

    /* renamed from: o */
    public final void m312o(int i, @Nullable C11034f0 c11034f0) {
        this.f21544f.set((i * 2) + 1, c11034f0);
    }
}
