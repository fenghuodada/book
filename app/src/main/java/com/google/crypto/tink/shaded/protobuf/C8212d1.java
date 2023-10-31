package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d1 */
/* loaded from: classes3.dex */
public final class C8212d1 implements InterfaceC8270p0 {

    /* renamed from: a */
    public final InterfaceC8287r0 f15975a;

    /* renamed from: b */
    public final String f15976b;

    /* renamed from: c */
    public final Object[] f15977c;

    /* renamed from: d */
    public final int f15978d;

    public C8212d1(AbstractC8308y abstractC8308y, String str, Object[] objArr) {
        char charAt;
        this.f15975a = abstractC8308y;
        this.f15976b = str;
        this.f15977c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i = charAt2 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i |= (charAt & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
            charAt2 = i | (charAt << i3);
        }
        this.f15978d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8270p0
    /* renamed from: a */
    public final boolean mo3614a() {
        return (this.f15978d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8270p0
    /* renamed from: b */
    public final InterfaceC8287r0 mo3613b() {
        return this.f15975a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8270p0
    /* renamed from: c */
    public final int mo3612c() {
        return (this.f15978d & 1) == 1 ? 1 : 2;
    }

    /* renamed from: d */
    public final Object[] m3918d() {
        return this.f15977c;
    }

    /* renamed from: e */
    public final String m3917e() {
        return this.f15976b;
    }
}
