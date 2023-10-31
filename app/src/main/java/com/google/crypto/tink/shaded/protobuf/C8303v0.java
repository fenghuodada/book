package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8209d0;
import com.google.crypto.tink.shaded.protobuf.C8299u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v0 */
/* loaded from: classes3.dex */
public final class C8303v0<T> implements InterfaceC8219f1<T> {

    /* renamed from: a */
    public final InterfaceC8287r0 f16122a;

    /* renamed from: b */
    public final AbstractC8257l1<?, ?> f16123b;

    /* renamed from: c */
    public final boolean f16124c;

    /* renamed from: d */
    public final AbstractC8286r<?> f16125d;

    public C8303v0(AbstractC8257l1<?, ?> abstractC8257l1, AbstractC8286r<?> abstractC8286r, InterfaceC8287r0 interfaceC8287r0) {
        this.f16123b = abstractC8257l1;
        this.f16124c = abstractC8286r.mo3551e(interfaceC8287r0);
        this.f16125d = abstractC8286r;
        this.f16122a = interfaceC8287r0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: a */
    public final void mo3494a(T t, T t2) {
        Class<?> cls = C8222g1.f15988a;
        AbstractC8257l1<?, ?> abstractC8257l1 = this.f16123b;
        abstractC8257l1.mo3623o(t, abstractC8257l1.mo3626k(abstractC8257l1.mo3630g(t), abstractC8257l1.mo3630g(t2)));
        if (this.f16124c) {
            C8222g1.m3873B(this.f16125d, t, t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: b */
    public final void mo3493b(T t) {
        this.f16123b.mo3627j(t);
        this.f16125d.mo3550f(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: c */
    public final boolean mo3492c(T t) {
        return this.f16125d.mo3553c(t).m3533j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: d */
    public final boolean mo3491d(T t, T t2) {
        AbstractC8257l1<?, ?> abstractC8257l1 = this.f16123b;
        if (abstractC8257l1.mo3630g(t).equals(abstractC8257l1.mo3630g(t2))) {
            if (this.f16124c) {
                AbstractC8286r<?> abstractC8286r = this.f16125d;
                return abstractC8286r.mo3553c(t).equals(abstractC8286r.mo3553c(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: e */
    public final int mo3490e(T t) {
        C8237i1<?, Object> c8237i1;
        AbstractC8257l1<?, ?> abstractC8257l1 = this.f16123b;
        int i = 0;
        int mo3628i = abstractC8257l1.mo3628i(abstractC8257l1.mo3630g(t)) + 0;
        if (this.f16124c) {
            C8299u<?> mo3553c = this.f16125d.mo3553c(t);
            int i2 = 0;
            while (true) {
                c8237i1 = mo3553c.f16095a;
                if (i >= c8237i1.m3803d()) {
                    break;
                }
                i2 += C8299u.m3536g(c8237i1.m3804c(i));
                i++;
            }
            for (Map.Entry<?, Object> entry : c8237i1.m3802e()) {
                i2 += C8299u.m3536g(entry);
            }
            return mo3628i + i2;
        }
        return mo3628i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: f */
    public final T mo3489f() {
        return (T) this.f16122a.mo3474h().m3462j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: g */
    public final int mo3488g(T t) {
        int hashCode = this.f16123b.mo3630g(t).hashCode();
        return this.f16124c ? (hashCode * 53) + this.f16125d.mo3553c(t).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: h */
    public final void mo3487h(Object obj, C8258m c8258m) throws IOException {
        Object value;
        Iterator<Map.Entry<?, Object>> m3531l = this.f16125d.mo3553c(obj).m3531l();
        while (m3531l.hasNext()) {
            Map.Entry<?, Object> next = m3531l.next();
            C8299u.InterfaceC8300a interfaceC8300a = (C8299u.InterfaceC8300a) next.getKey();
            if (interfaceC8300a.mo3457D() == EnumC8296s1.MESSAGE) {
                interfaceC8300a.mo3459B();
                interfaceC8300a.mo3456E();
                boolean z = next instanceof C8209d0.C8210a;
                interfaceC8300a.getNumber();
                if (z) {
                    value = ((C8209d0.C8210a) next).f15973a.getValue().m3877b();
                } else {
                    value = next.getValue();
                }
                c8258m.m3656l(0, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC8257l1<?, ?> abstractC8257l1 = this.f16123b;
        abstractC8257l1.mo3620r(abstractC8257l1.mo3630g(obj), c8258m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        r10.m3648b((r1 << 3) | 2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r1 = r3;
        r11 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad A[EDGE_INSN: B:61:0x00ad->B:43:0x00ad ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3486i(T r18, byte[] r19, int r20, int r21, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8303v0.mo3486i(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: j */
    public final void mo3485j(T t, InterfaceC8216e1 interfaceC8216e1, C8277q c8277q) throws IOException {
        AbstractC8257l1 abstractC8257l1 = this.f16123b;
        C8260m1 mo3631f = abstractC8257l1.mo3631f(t);
        AbstractC8286r abstractC8286r = this.f16125d;
        C8299u<ET> mo3552d = abstractC8286r.mo3552d(t);
        do {
            try {
                if (interfaceC8216e1.mo3721w() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                abstractC8257l1.mo3624n(t, mo3631f);
            }
        } while (m3484k(interfaceC8216e1, c8277q, abstractC8286r, mo3552d, abstractC8257l1, mo3631f));
    }

    /* renamed from: k */
    public final <UT, UB, ET extends C8299u.InterfaceC8300a<ET>> boolean m3484k(InterfaceC8216e1 interfaceC8216e1, C8277q c8277q, AbstractC8286r<ET> abstractC8286r, C8299u<ET> c8299u, AbstractC8257l1<UT, UB> abstractC8257l1, UB ub) throws IOException {
        int mo3743a = interfaceC8216e1.mo3743a();
        InterfaceC8287r0 interfaceC8287r0 = this.f16122a;
        if (mo3743a != 11) {
            if ((mo3743a & 7) == 2) {
                AbstractC8308y.C8313e mo3554b = abstractC8286r.mo3554b(c8277q, interfaceC8287r0, mo3743a >>> 3);
                if (mo3554b != null) {
                    abstractC8286r.mo3548h(mo3554b);
                    return true;
                }
                return abstractC8257l1.m3668l(ub, interfaceC8216e1);
            }
            return interfaceC8216e1.mo3762C();
        }
        AbstractC8308y.C8313e c8313e = null;
        int i = 0;
        AbstractC8228i abstractC8228i = null;
        while (interfaceC8216e1.mo3721w() != Integer.MAX_VALUE) {
            int mo3743a2 = interfaceC8216e1.mo3743a();
            if (mo3743a2 == 16) {
                i = interfaceC8216e1.mo3732l();
                c8313e = abstractC8286r.mo3554b(c8277q, interfaceC8287r0, i);
            } else if (mo3743a2 == 26) {
                if (c8313e != null) {
                    abstractC8286r.mo3548h(c8313e);
                } else {
                    abstractC8228i = interfaceC8216e1.mo3718z();
                }
            } else if (!interfaceC8216e1.mo3762C()) {
                break;
            }
        }
        if (interfaceC8216e1.mo3743a() == 12) {
            if (abstractC8228i != null) {
                if (c8313e != null) {
                    abstractC8286r.mo3547i(c8313e);
                } else {
                    abstractC8257l1.mo3633d(ub, i, abstractC8228i);
                }
            }
            return true;
        }
        throw new C8202b0("Protocol message end-group tag did not match expected tag.");
    }
}
