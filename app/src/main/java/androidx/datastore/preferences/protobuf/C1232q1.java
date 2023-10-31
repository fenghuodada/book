package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.q1 */
/* loaded from: classes.dex */
public final class C1232q1 extends AbstractC1226o1<C1229p1, C1229p1> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: a */
    public final void mo10860a(int i, int i2, Object obj) {
        ((C1229p1) obj).m10865b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: b */
    public final void mo10859b(C1229p1 c1229p1, int i, long j) {
        c1229p1.m10865b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: c */
    public final void mo10858c(int i, Object obj, Object obj2) {
        ((C1229p1) obj).m10865b((i << 3) | 3, (C1229p1) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: d */
    public final void mo10857d(C1229p1 c1229p1, int i, AbstractC1183i abstractC1183i) {
        c1229p1.m10865b((i << 3) | 2, abstractC1183i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: e */
    public final void mo10856e(C1229p1 c1229p1, int i, long j) {
        c1229p1.m10865b((i << 3) | 0, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: f */
    public final C1229p1 mo10855f(Object obj) {
        AbstractC1273z abstractC1273z = (AbstractC1273z) obj;
        C1229p1 c1229p1 = abstractC1273z.unknownFields;
        if (c1229p1 == C1229p1.f3062f) {
            C1229p1 c1229p12 = new C1229p1();
            abstractC1273z.unknownFields = c1229p12;
            return c1229p12;
        }
        return c1229p1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: g */
    public final C1229p1 mo10854g(Object obj) {
        return ((AbstractC1273z) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: h */
    public final int mo10853h(C1229p1 c1229p1) {
        return c1229p1.m10866a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: i */
    public final int mo10852i(C1229p1 c1229p1) {
        C1229p1 c1229p12 = c1229p1;
        int i = c1229p12.f3066d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < c1229p12.f3063a; i3++) {
                i2 += AbstractC1214m.m10954c(3, (AbstractC1183i) c1229p12.f3065c[i3]) + AbstractC1214m.m10936u(2, c1229p12.f3064b[i3] >>> 3) + (AbstractC1214m.m10937t(1) * 2);
            }
            c1229p12.f3066d = i2;
            return i2;
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: j */
    public final void mo10851j(Object obj) {
        ((AbstractC1273z) obj).unknownFields.f3067e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: k */
    public final C1229p1 mo10850k(Object obj, Object obj2) {
        C1229p1 c1229p1 = (C1229p1) obj;
        C1229p1 c1229p12 = (C1229p1) obj2;
        if (!c1229p12.equals(C1229p1.f3062f)) {
            int i = c1229p1.f3063a + c1229p12.f3063a;
            int[] copyOf = Arrays.copyOf(c1229p1.f3064b, i);
            System.arraycopy(c1229p12.f3064b, 0, copyOf, c1229p1.f3063a, c1229p12.f3063a);
            Object[] copyOf2 = Arrays.copyOf(c1229p1.f3065c, i);
            System.arraycopy(c1229p12.f3065c, 0, copyOf2, c1229p1.f3063a, c1229p12.f3063a);
            return new C1229p1(i, copyOf, copyOf2, true);
        }
        return c1229p1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: m */
    public final C1229p1 mo10849m() {
        return new C1229p1();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: n */
    public final void mo10848n(Object obj, C1229p1 c1229p1) {
        ((AbstractC1273z) obj).unknownFields = c1229p1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: o */
    public final void mo10847o(Object obj, C1229p1 c1229p1) {
        ((AbstractC1273z) obj).unknownFields = c1229p1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: p */
    public final void mo10846p() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: q */
    public final C1229p1 mo10845q(Object obj) {
        C1229p1 c1229p1 = (C1229p1) obj;
        c1229p1.f3067e = false;
        return c1229p1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: r */
    public final void mo10844r(Object obj, C1221n c1221n) throws IOException {
        C1229p1 c1229p1 = (C1229p1) obj;
        c1229p1.getClass();
        c1221n.getClass();
        for (int i = 0; i < c1229p1.f3063a; i++) {
            c1221n.m10884l(c1229p1.f3064b[i] >>> 3, c1229p1.f3065c[i]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1226o1
    /* renamed from: s */
    public final void mo10843s(Object obj, C1221n c1221n) throws IOException {
        ((C1229p1) obj).m10864c(c1221n);
    }
}
