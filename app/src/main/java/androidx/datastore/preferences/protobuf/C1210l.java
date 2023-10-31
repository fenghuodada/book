package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
public final class C1210l implements InterfaceC1179g1 {

    /* renamed from: a */
    public final AbstractC1197k f3034a;

    /* renamed from: b */
    public int f3035b;

    /* renamed from: c */
    public int f3036c;

    /* renamed from: d */
    public int f3037d = 0;

    public C1210l(AbstractC1197k abstractC1197k) {
        Charset charset = C1157b0.f2944a;
        if (abstractC1197k != null) {
            this.f3034a = abstractC1197k;
            abstractC1197k.f2998d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: A */
    public final void mo11005A(List<Float> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1269x;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 2) {
                int mo11020v = abstractC1197k.mo11020v();
                m10985U(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Float.valueOf(abstractC1197k.mo11030l()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            } else if (i != 5) {
                throw C1163c0.m11138b();
            } else {
                do {
                    list.add(Float.valueOf(abstractC1197k.mo11030l()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            }
        }
        C1269x c1269x = (C1269x) list;
        int i2 = this.f3035b & 7;
        if (i2 == 2) {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10985U(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1269x.m10721b(abstractC1197k.mo11030l());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        } else if (i2 != 5) {
            throw C1163c0.m11138b();
        } else {
            do {
                c1269x.m10721b(abstractC1197k.mo11030l());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: B */
    public final int mo11004B() throws IOException {
        m10986T(0);
        return this.f3034a.mo11029m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: C */
    public final boolean mo11003C() throws IOException {
        int i;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (abstractC1197k.mo11039c() || (i = this.f3035b) == this.f3036c) {
            return false;
        }
        return abstractC1197k.mo11018x(i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: D */
    public final int mo11002D() throws IOException {
        m10986T(5);
        return this.f3034a.mo11027o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: E */
    public final void mo11001E(List<AbstractC1183i> list) throws IOException {
        int mo11021u;
        if ((this.f3035b & 7) != 2) {
            throw C1163c0.m11138b();
        }
        do {
            list.add(mo10958z());
            AbstractC1197k abstractC1197k = this.f3034a;
            if (abstractC1197k.mo11039c()) {
                return;
            }
            mo11021u = abstractC1197k.mo11021u();
        } while (mo11021u == this.f3035b);
        this.f3037d = mo11021u;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: F */
    public final void mo11000F(List<Double> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1224o;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC1197k.mo11034h()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                int mo11020v = abstractC1197k.mo11020v();
                m10984V(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Double.valueOf(abstractC1197k.mo11034h()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            }
        }
        C1224o c1224o = (C1224o) list;
        int i2 = this.f3035b & 7;
        if (i2 == 1) {
            do {
                c1224o.m10877b(abstractC1197k.mo11034h());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        } else if (i2 != 2) {
            throw C1163c0.m11138b();
        } else {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10984V(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1224o.m10877b(abstractC1197k.mo11034h());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: G */
    public final long mo10999G() throws IOException {
        m10986T(0);
        return this.f3034a.mo11028n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: H */
    public final String mo10998H() throws IOException {
        m10986T(2);
        return this.f3034a.mo11022t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: I */
    public final void mo10997I(List<Long> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1195j0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11031k()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                int mo11020v = abstractC1197k.mo11020v();
                m10984V(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11031k()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            }
        }
        C1195j0 c1195j0 = (C1195j0) list;
        int i2 = this.f3035b & 7;
        if (i2 == 1) {
            do {
                c1195j0.m11059b(abstractC1197k.mo11031k());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        } else if (i2 != 2) {
            throw C1163c0.m11138b();
        } else {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10984V(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1195j0.m11059b(abstractC1197k.mo11031k());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: J */
    public final <T> T mo10996J(InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        m10986T(2);
        return (T) m10989Q(interfaceC1182h1, c1233r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void mo10995K(java.util.Map<K, V> r10, androidx.datastore.preferences.protobuf.C1211l0.C1212a<K, V> r11, androidx.datastore.preferences.protobuf.C1233r r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.m10986T(r0)
            androidx.datastore.preferences.protobuf.k r1 = r9.f3034a
            int r2 = r1.mo11020v()
            int r2 = r1.mo11037e(r2)
            K r3 = r11.f3042b
            V r4 = r11.f3044d
            r5 = r4
        L13:
            int r6 = r9.mo10961w()     // Catch: java.lang.Throwable -> L5e
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L57
            boolean r7 = r1.mo11039c()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L23
            goto L57
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L42
            if (r6 == r0) goto L37
            boolean r6 = r9.mo11003C()     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            if (r6 == 0) goto L31
            goto L13
        L31:
            androidx.datastore.preferences.protobuf.c0 r6 = new androidx.datastore.preferences.protobuf.c0     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            r6.<init>(r8)     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            throw r6     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
        L37:
            androidx.datastore.preferences.protobuf.u1 r6 = r11.f3043c     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            java.lang.Class r7 = r4.getClass()     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            java.lang.Object r5 = r9.m10991O(r6, r7, r12)     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            goto L13
        L42:
            androidx.datastore.preferences.protobuf.u1 r6 = r11.f3041a     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            r7 = 0
            java.lang.Object r3 = r9.m10991O(r6, r7, r7)     // Catch: androidx.datastore.preferences.protobuf.C1163c0.C1164a -> L4a java.lang.Throwable -> L5e
            goto L13
        L4a:
            boolean r6 = r9.mo11003C()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L51
            goto L13
        L51:
            androidx.datastore.preferences.protobuf.c0 r10 = new androidx.datastore.preferences.protobuf.c0     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L57:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r1.mo11038d(r2)
            return
        L5e:
            r10 = move-exception
            r1.mo11038d(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1210l.mo10995K(java.util.Map, androidx.datastore.preferences.protobuf.l0$a, androidx.datastore.preferences.protobuf.r):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: L */
    public final <T> void mo10994L(List<T> list, InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        int mo11021u;
        int i = this.f3035b;
        if ((i & 7) == 3) {
            do {
                list.add(m10990P(interfaceC1182h1, c1233r));
                AbstractC1197k abstractC1197k = this.f3034a;
                if (!abstractC1197k.mo11039c() && this.f3037d == 0) {
                    mo11021u = abstractC1197k.mo11021u();
                } else {
                    return;
                }
            } while (mo11021u == i);
            this.f3037d = mo11021u;
            return;
        }
        int i2 = C1163c0.f2947a;
        throw new C1163c0.C1164a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: M */
    public final <T> void mo10993M(List<T> list, InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        int mo11021u;
        int i = this.f3035b;
        if ((i & 7) == 2) {
            do {
                list.add(m10989Q(interfaceC1182h1, c1233r));
                AbstractC1197k abstractC1197k = this.f3034a;
                if (!abstractC1197k.mo11039c() && this.f3037d == 0) {
                    mo11021u = abstractC1197k.mo11021u();
                } else {
                    return;
                }
            } while (mo11021u == i);
            this.f3037d = mo11021u;
            return;
        }
        int i2 = C1163c0.f2947a;
        throw new C1163c0.C1164a();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: N */
    public final <T> T mo10992N(InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        m10986T(3);
        return (T) m10990P(interfaceC1182h1, c1233r);
    }

    /* renamed from: O */
    public final Object m10991O(EnumC1258u1 enumC1258u1, Class<?> cls, C1233r c1233r) throws IOException {
        switch (enumC1258u1.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(mo10999G());
            case 3:
                return Long.valueOf(mo10981c());
            case 4:
                return Integer.valueOf(mo11004B());
            case 5:
                return Long.valueOf(mo10980d());
            case 6:
                return Integer.valueOf(mo10976h());
            case 7:
                return Boolean.valueOf(mo10975i());
            case 8:
                return mo10998H();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m10986T(2);
                return m10989Q(C1168d1.f2962c.m11132a(cls), c1233r);
            case 11:
                return mo10958z();
            case 12:
                return Integer.valueOf(mo10972l());
            case 13:
                return Integer.valueOf(mo10967q());
            case 14:
                return Integer.valueOf(mo11002D());
            case 15:
                return Long.valueOf(mo10974j());
            case 16:
                return Integer.valueOf(mo10965s());
            case 17:
                return Long.valueOf(mo10964t());
        }
    }

    /* renamed from: P */
    public final <T> T m10990P(InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        int i = this.f3036c;
        this.f3036c = ((this.f3035b >>> 3) << 3) | 4;
        try {
            T mo10726f = interfaceC1182h1.mo10726f();
            interfaceC1182h1.mo10724h(mo10726f, this, c1233r);
            interfaceC1182h1.mo10730b(mo10726f);
            if (this.f3035b == this.f3036c) {
                return mo10726f;
            }
            throw C1163c0.m11135e();
        } finally {
            this.f3036c = i;
        }
    }

    /* renamed from: Q */
    public final <T> T m10989Q(InterfaceC1182h1<T> interfaceC1182h1, C1233r c1233r) throws IOException {
        AbstractC1197k abstractC1197k = this.f3034a;
        int mo11020v = abstractC1197k.mo11020v();
        if (abstractC1197k.f2995a < abstractC1197k.f2996b) {
            int mo11037e = abstractC1197k.mo11037e(mo11020v);
            T mo10726f = interfaceC1182h1.mo10726f();
            abstractC1197k.f2995a++;
            interfaceC1182h1.mo10724h(mo10726f, this, c1233r);
            interfaceC1182h1.mo10730b(mo10726f);
            abstractC1197k.mo11041a(0);
            abstractC1197k.f2995a--;
            abstractC1197k.mo11038d(mo11037e);
            return mo10726f;
        }
        throw new C1163c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: R */
    public final void m10988R(List<String> list, boolean z) throws IOException {
        int mo11021u;
        int mo11021u2;
        if ((this.f3035b & 7) != 2) {
            throw C1163c0.m11138b();
        }
        boolean z2 = list instanceof InterfaceC1181h0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z2 || z) {
            do {
                list.add(z ? mo10998H() : mo10962v());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u = abstractC1197k.mo11021u();
            } while (mo11021u == this.f3035b);
            this.f3037d = mo11021u;
            return;
        }
        InterfaceC1181h0 interfaceC1181h0 = (InterfaceC1181h0) list;
        do {
            interfaceC1181h0.mo10838q(mo10958z());
            if (abstractC1197k.mo11039c()) {
                return;
            }
            mo11021u2 = abstractC1197k.mo11021u();
        } while (mo11021u2 == this.f3035b);
        this.f3037d = mo11021u2;
    }

    /* renamed from: S */
    public final void m10987S(int i) throws IOException {
        if (this.f3034a.mo11040b() != i) {
            throw C1163c0.m11134f();
        }
    }

    /* renamed from: T */
    public final void m10986T(int i) throws IOException {
        if ((this.f3035b & 7) != i) {
            throw C1163c0.m11138b();
        }
    }

    /* renamed from: U */
    public final void m10985U(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C1163c0.m11135e();
        }
    }

    /* renamed from: V */
    public final void m10984V(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C1163c0.m11135e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: a */
    public final int mo10983a() {
        return this.f3035b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: b */
    public final void mo10982b(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1154a0 c1154a0 = (C1154a0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1154a0.m11149b(abstractC1197k.mo11025q());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1154a0.m11149b(abstractC1197k.mo11025q());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11025q()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11025q()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: c */
    public final long mo10981c() throws IOException {
        m10986T(0);
        return this.f3034a.mo11019w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: d */
    public final long mo10980d() throws IOException {
        m10986T(1);
        return this.f3034a.mo11031k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: e */
    public final void mo10979e(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 2) {
                int mo11020v = abstractC1197k.mo11020v();
                m10985U(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11027o()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            } else if (i != 5) {
                throw C1163c0.m11138b();
            } else {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11027o()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            }
        }
        C1154a0 c1154a0 = (C1154a0) list;
        int i2 = this.f3035b & 7;
        if (i2 == 2) {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10985U(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1154a0.m11149b(abstractC1197k.mo11027o());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        } else if (i2 != 5) {
            throw C1163c0.m11138b();
        } else {
            do {
                c1154a0.m11149b(abstractC1197k.mo11027o());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: f */
    public final void mo10978f(List<Long> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1195j0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1195j0 c1195j0 = (C1195j0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1195j0.m11059b(abstractC1197k.mo11024r());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1195j0.m11059b(abstractC1197k.mo11024r());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11024r()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11024r()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: g */
    public final void mo10977g(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1154a0 c1154a0 = (C1154a0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1154a0.m11149b(abstractC1197k.mo11020v());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1154a0.m11149b(abstractC1197k.mo11020v());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11020v()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11020v()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: h */
    public final int mo10976h() throws IOException {
        m10986T(5);
        return this.f3034a.mo11032j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: i */
    public final boolean mo10975i() throws IOException {
        m10986T(0);
        return this.f3034a.mo11036f();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: j */
    public final long mo10974j() throws IOException {
        m10986T(1);
        return this.f3034a.mo11026p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: k */
    public final void mo10973k(List<Long> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1195j0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1195j0 c1195j0 = (C1195j0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1195j0.m11059b(abstractC1197k.mo11019w());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1195j0.m11059b(abstractC1197k.mo11019w());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11019w()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11019w()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: l */
    public final int mo10972l() throws IOException {
        m10986T(0);
        return this.f3034a.mo11020v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: m */
    public final void mo10971m(List<Long> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1195j0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1195j0 c1195j0 = (C1195j0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1195j0.m11059b(abstractC1197k.mo11028n());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1195j0.m11059b(abstractC1197k.mo11028n());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11028n()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11028n()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: n */
    public final void mo10970n(List<Long> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1195j0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11026p()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                int mo11020v = abstractC1197k.mo11020v();
                m10984V(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Long.valueOf(abstractC1197k.mo11026p()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            }
        }
        C1195j0 c1195j0 = (C1195j0) list;
        int i2 = this.f3035b & 7;
        if (i2 == 1) {
            do {
                c1195j0.m11059b(abstractC1197k.mo11026p());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        } else if (i2 != 2) {
            throw C1163c0.m11138b();
        } else {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10984V(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1195j0.m11059b(abstractC1197k.mo11026p());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: o */
    public final void mo10969o(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1154a0 c1154a0 = (C1154a0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1154a0.m11149b(abstractC1197k.mo11029m());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1154a0.m11149b(abstractC1197k.mo11029m());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11029m()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11029m()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: p */
    public final void mo10968p(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1154a0 c1154a0 = (C1154a0) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1154a0.m11149b(abstractC1197k.mo11033i());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1154a0.m11149b(abstractC1197k.mo11033i());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11033i()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11033i()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: q */
    public final int mo10967q() throws IOException {
        m10986T(0);
        return this.f3034a.mo11033i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: r */
    public final void mo10966r(List<Integer> list) throws IOException {
        int mo11021u;
        int mo11021u2;
        boolean z = list instanceof C1154a0;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (!z) {
            int i = this.f3035b & 7;
            if (i == 2) {
                int mo11020v = abstractC1197k.mo11020v();
                m10985U(mo11020v);
                int mo11040b = abstractC1197k.mo11040b() + mo11020v;
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11032j()));
                } while (abstractC1197k.mo11040b() < mo11040b);
                return;
            } else if (i != 5) {
                throw C1163c0.m11138b();
            } else {
                do {
                    list.add(Integer.valueOf(abstractC1197k.mo11032j()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            }
        }
        C1154a0 c1154a0 = (C1154a0) list;
        int i2 = this.f3035b & 7;
        if (i2 == 2) {
            int mo11020v2 = abstractC1197k.mo11020v();
            m10985U(mo11020v2);
            int mo11040b2 = abstractC1197k.mo11040b() + mo11020v2;
            do {
                c1154a0.m11149b(abstractC1197k.mo11032j());
            } while (abstractC1197k.mo11040b() < mo11040b2);
        } else if (i2 != 5) {
            throw C1163c0.m11138b();
        } else {
            do {
                c1154a0.m11149b(abstractC1197k.mo11032j());
                if (abstractC1197k.mo11039c()) {
                    return;
                }
                mo11021u2 = abstractC1197k.mo11021u();
            } while (mo11021u2 == this.f3035b);
            this.f3037d = mo11021u2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    public final double readDouble() throws IOException {
        m10986T(1);
        return this.f3034a.mo11034h();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    public final float readFloat() throws IOException {
        m10986T(5);
        return this.f3034a.mo11030l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: s */
    public final int mo10965s() throws IOException {
        m10986T(0);
        return this.f3034a.mo11025q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: t */
    public final long mo10964t() throws IOException {
        m10986T(0);
        return this.f3034a.mo11024r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: u */
    public final void mo10963u(List<Boolean> list) throws IOException {
        int mo11021u;
        int mo11040b;
        int mo11021u2;
        boolean z = list instanceof C1174f;
        AbstractC1197k abstractC1197k = this.f3034a;
        if (z) {
            C1174f c1174f = (C1174f) list;
            int i = this.f3035b & 7;
            if (i == 0) {
                do {
                    c1174f.m11127b(abstractC1197k.mo11036f());
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u2 = abstractC1197k.mo11021u();
                } while (mo11021u2 == this.f3035b);
                this.f3037d = mo11021u2;
                return;
            } else if (i != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    c1174f.m11127b(abstractC1197k.mo11036f());
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        } else {
            int i2 = this.f3035b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC1197k.mo11036f()));
                    if (abstractC1197k.mo11039c()) {
                        return;
                    }
                    mo11021u = abstractC1197k.mo11021u();
                } while (mo11021u == this.f3035b);
                this.f3037d = mo11021u;
                return;
            } else if (i2 != 2) {
                throw C1163c0.m11138b();
            } else {
                mo11040b = abstractC1197k.mo11040b() + abstractC1197k.mo11020v();
                do {
                    list.add(Boolean.valueOf(abstractC1197k.mo11036f()));
                } while (abstractC1197k.mo11040b() < mo11040b);
            }
        }
        m10987S(mo11040b);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: v */
    public final String mo10962v() throws IOException {
        m10986T(2);
        return this.f3034a.mo11023s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: w */
    public final int mo10961w() throws IOException {
        int i = this.f3037d;
        if (i != 0) {
            this.f3035b = i;
            this.f3037d = 0;
        } else {
            this.f3035b = this.f3034a.mo11021u();
        }
        int i2 = this.f3035b;
        if (i2 == 0 || i2 == this.f3036c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: x */
    public final void mo10960x(List<String> list) throws IOException {
        m10988R(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: y */
    public final void mo10959y(List<String> list) throws IOException {
        m10988R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1179g1
    /* renamed from: z */
    public final AbstractC1183i mo10958z() throws IOException {
        m10986T(2);
        return this.f3034a.mo11035g();
    }
}
