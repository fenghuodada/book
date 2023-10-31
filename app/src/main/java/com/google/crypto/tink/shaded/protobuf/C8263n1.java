package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n1 */
/* loaded from: classes3.dex */
public final class C8263n1 extends AbstractC8257l1<C8260m1, C8260m1> {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: a */
    public final void mo3636a(int i, int i2, Object obj) {
        ((C8260m1) obj).m3648b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: b */
    public final void mo3635b(C8260m1 c8260m1, int i, long j) {
        c8260m1.m3648b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: c */
    public final void mo3634c(int i, Object obj, Object obj2) {
        ((C8260m1) obj).m3648b((i << 3) | 3, (C8260m1) obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: d */
    public final void mo3633d(C8260m1 c8260m1, int i, AbstractC8228i abstractC8228i) {
        c8260m1.m3648b((i << 3) | 2, abstractC8228i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: e */
    public final void mo3632e(C8260m1 c8260m1, int i, long j) {
        c8260m1.m3648b((i << 3) | 0, Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: f */
    public final C8260m1 mo3631f(Object obj) {
        AbstractC8308y abstractC8308y = (AbstractC8308y) obj;
        C8260m1 c8260m1 = abstractC8308y.unknownFields;
        if (c8260m1 == C8260m1.f16049f) {
            C8260m1 c8260m12 = new C8260m1();
            abstractC8308y.unknownFields = c8260m12;
            return c8260m12;
        }
        return c8260m1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: g */
    public final C8260m1 mo3630g(Object obj) {
        return ((AbstractC8308y) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: h */
    public final int mo3629h(C8260m1 c8260m1) {
        return c8260m1.m3649a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: i */
    public final int mo3628i(C8260m1 c8260m1) {
        C8260m1 c8260m12 = c8260m1;
        int i = c8260m12.f16053d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < c8260m12.f16050a; i3++) {
                i2 += AbstractC8253l.m3716c(3, (AbstractC8228i) c8260m12.f16052c[i3]) + AbstractC8253l.m3698u(2, c8260m12.f16051b[i3] >>> 3) + (AbstractC8253l.m3699t(1) * 2);
            }
            c8260m12.f16053d = i2;
            return i2;
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: j */
    public final void mo3627j(Object obj) {
        ((AbstractC8308y) obj).unknownFields.f16054e = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: k */
    public final C8260m1 mo3626k(Object obj, Object obj2) {
        C8260m1 c8260m1 = (C8260m1) obj;
        C8260m1 c8260m12 = (C8260m1) obj2;
        if (!c8260m12.equals(C8260m1.f16049f)) {
            int i = c8260m1.f16050a + c8260m12.f16050a;
            int[] copyOf = Arrays.copyOf(c8260m1.f16051b, i);
            System.arraycopy(c8260m12.f16051b, 0, copyOf, c8260m1.f16050a, c8260m12.f16050a);
            Object[] copyOf2 = Arrays.copyOf(c8260m1.f16052c, i);
            System.arraycopy(c8260m12.f16052c, 0, copyOf2, c8260m1.f16050a, c8260m12.f16050a);
            return new C8260m1(i, copyOf, copyOf2, true);
        }
        return c8260m1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: m */
    public final C8260m1 mo3625m() {
        return new C8260m1();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: n */
    public final void mo3624n(Object obj, C8260m1 c8260m1) {
        ((AbstractC8308y) obj).unknownFields = c8260m1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: o */
    public final void mo3623o(Object obj, C8260m1 c8260m1) {
        ((AbstractC8308y) obj).unknownFields = c8260m1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: p */
    public final void mo3622p() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: q */
    public final C8260m1 mo3621q(Object obj) {
        C8260m1 c8260m1 = (C8260m1) obj;
        c8260m1.f16054e = false;
        return c8260m1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: r */
    public final void mo3620r(Object obj, C8258m c8258m) throws IOException {
        C8260m1 c8260m1 = (C8260m1) obj;
        c8260m1.getClass();
        c8258m.getClass();
        for (int i = 0; i < c8260m1.f16050a; i++) {
            c8258m.m3656l(c8260m1.f16051b[i] >>> 3, c8260m1.f16052c[i]);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8257l1
    /* renamed from: s */
    public final void mo3619s(Object obj, C8258m c8258m) throws IOException {
        ((C8260m1) obj).m3647c(c8258m);
    }
}
