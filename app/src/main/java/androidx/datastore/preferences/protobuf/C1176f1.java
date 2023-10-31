package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f1 */
/* loaded from: classes.dex */
public final class C1176f1 implements InterfaceC1231q0 {

    /* renamed from: a */
    public final InterfaceC1240s0 f2974a;

    /* renamed from: b */
    public final String f2975b;

    /* renamed from: c */
    public final Object[] f2976c;

    /* renamed from: d */
    public final int f2977d;

    public C1176f1(AbstractC1273z abstractC1273z, String str, Object[] objArr) {
        char charAt;
        this.f2974a = abstractC1273z;
        this.f2975b = str;
        this.f2976c = objArr;
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
        this.f2977d = charAt2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1231q0
    /* renamed from: a */
    public final boolean mo10863a() {
        return (this.f2977d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1231q0
    /* renamed from: b */
    public final InterfaceC1240s0 mo10862b() {
        return this.f2974a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1231q0
    /* renamed from: c */
    public final int mo10861c() {
        return (this.f2977d & 1) == 1 ? 1 : 2;
    }

    /* renamed from: d */
    public final Object[] m11123d() {
        return this.f2976c;
    }

    /* renamed from: e */
    public final String m11122e() {
        return this.f2975b;
    }
}
