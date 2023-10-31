package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: kotlinx.coroutines.flow.internal.i */
/* loaded from: classes3.dex */
public final class C11004i extends AbstractC10844k implements InterfaceC10824p<Integer, InterfaceC10775f.InterfaceC10778b, Integer> {

    /* renamed from: a */
    public final /* synthetic */ C11000g<?> f21586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11004i(C11000g<?> c11000g) {
        super(2);
        this.f21586a = c11000g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r1 == null) goto L5;
     */
    @Override // kotlin.jvm.functions.InterfaceC10824p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer invoke(java.lang.Integer r4, kotlin.coroutines.InterfaceC10775f.InterfaceC10778b r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            kotlin.coroutines.f$b r5 = (kotlin.coroutines.InterfaceC10775f.InterfaceC10778b) r5
            kotlin.coroutines.f$c r0 = r5.getKey()
            kotlinx.coroutines.flow.internal.g<?> r1 = r3.f21586a
            kotlin.coroutines.f r1 = r1.f21579b
            kotlin.coroutines.f$b r1 = r1.mo195a(r0)
            int r2 = kotlinx.coroutines.InterfaceC11017h1.f21606c0
            kotlinx.coroutines.h1$b r2 = kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a
            if (r0 == r2) goto L26
            if (r5 == r1) goto L1f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L1f:
            int r4 = r4 + 1
        L21:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3a
        L26:
            kotlinx.coroutines.h1 r1 = (kotlinx.coroutines.InterfaceC11017h1) r1
            kotlinx.coroutines.h1 r5 = (kotlinx.coroutines.InterfaceC11017h1) r5
        L2a:
            if (r5 != 0) goto L2e
            r5 = 0
            goto L35
        L2e:
            if (r5 != r1) goto L31
            goto L35
        L31:
            boolean r0 = r5 instanceof kotlinx.coroutines.internal.C11026b0
            if (r0 != 0) goto L60
        L35:
            if (r5 != r1) goto L3b
            if (r1 != 0) goto L1f
            goto L21
        L3a:
            return r4
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = ", expected child of "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L60:
            kotlinx.coroutines.h1 r5 = r5.getParent()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C11004i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
