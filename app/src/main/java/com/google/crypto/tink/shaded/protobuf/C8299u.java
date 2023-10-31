package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8209d0;
import com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* loaded from: classes3.dex */
public final class C8299u<T extends InterfaceC8300a<T>> {

    /* renamed from: d */
    public static final C8299u f16094d = new C8299u(0);

    /* renamed from: a */
    public final C8237i1<T, Object> f16095a;

    /* renamed from: b */
    public boolean f16096b;

    /* renamed from: c */
    public boolean f16097c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8300a<T extends InterfaceC8300a<T>> extends Comparable<T> {
        /* renamed from: B */
        void mo3459B();

        /* renamed from: C */
        void mo3458C();

        /* renamed from: D */
        EnumC8296s1 mo3457D();

        /* renamed from: E */
        void mo3456E();

        /* renamed from: e */
        AbstractC8308y.AbstractC8309a mo3455e(InterfaceC8287r0.InterfaceC8288a interfaceC8288a, InterfaceC8287r0 interfaceC8287r0);

        void getNumber();
    }

    public C8299u() {
        int i = C8237i1.f16006g;
        this.f16095a = new C8227h1(16);
    }

    /* renamed from: b */
    public static Object m3541b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: c */
    public static int m3540c(EnumC8289r1 enumC8289r1, int i, Object obj) {
        int m3699t = AbstractC8253l.m3699t(i);
        if (enumC8289r1 == EnumC8289r1.f16078b) {
            m3699t *= 2;
        }
        return m3539d(enumC8289r1, obj) + m3699t;
    }

    /* renamed from: d */
    public static int m3539d(EnumC8289r1 enumC8289r1, Object obj) {
        switch (enumC8289r1.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC8253l.f16040b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC8253l.f16040b;
                return 4;
            case 2:
                return AbstractC8253l.m3695x(((Long) obj).longValue());
            case 3:
                return AbstractC8253l.m3695x(((Long) obj).longValue());
            case 4:
                return AbstractC8253l.m3708k(((Integer) obj).intValue());
            case 5:
            case 15:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC8253l.f16040b;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = AbstractC8253l.f16040b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger4 = AbstractC8253l.f16040b;
                return 1;
            case 8:
                if (obj instanceof AbstractC8228i) {
                    Logger logger5 = AbstractC8253l.f16040b;
                    int size = ((AbstractC8228i) obj).size();
                    return AbstractC8253l.m3697v(size) + size;
                }
                return AbstractC8253l.m3700s((String) obj);
            case 9:
                Logger logger6 = AbstractC8253l.f16040b;
                return ((InterfaceC8287r0) obj).mo3478c();
            case 10:
                if (obj instanceof C8209d0) {
                    return AbstractC8253l.m3706m((C8209d0) obj);
                }
                Logger logger7 = AbstractC8253l.f16040b;
                int mo3478c = ((InterfaceC8287r0) obj).mo3478c();
                return AbstractC8253l.m3697v(mo3478c) + mo3478c;
            case 11:
                if (obj instanceof AbstractC8228i) {
                    Logger logger8 = AbstractC8253l.f16040b;
                    int size2 = ((AbstractC8228i) obj).size();
                    return AbstractC8253l.m3697v(size2) + size2;
                }
                Logger logger9 = AbstractC8253l.f16040b;
                int length = ((byte[]) obj).length;
                return AbstractC8253l.m3697v(length) + length;
            case 12:
                return AbstractC8253l.m3697v(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C8196a0.InterfaceC8197a) {
                    return AbstractC8253l.m3708k(((C8196a0.InterfaceC8197a) obj).getNumber());
                }
                return AbstractC8253l.m3708k(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return AbstractC8253l.m3697v((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC8253l.m3695x((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: e */
    public static int m3538e(InterfaceC8300a<?> interfaceC8300a, Object obj) {
        interfaceC8300a.mo3458C();
        interfaceC8300a.getNumber();
        interfaceC8300a.mo3459B();
        return m3540c(null, 0, obj);
    }

    /* renamed from: g */
    public static int m3536g(Map.Entry entry) {
        InterfaceC8300a interfaceC8300a = (InterfaceC8300a) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC8300a.mo3457D() == EnumC8296s1.MESSAGE) {
            interfaceC8300a.mo3459B();
            interfaceC8300a.mo3456E();
            boolean z = value instanceof C8209d0;
            ((InterfaceC8300a) entry.getKey()).getNumber();
            if (z) {
                return AbstractC8253l.m3706m((C8209d0) value) + AbstractC8253l.m3699t(3) + AbstractC8253l.m3698u(2, 0) + (AbstractC8253l.m3699t(1) * 2);
            }
            int m3698u = AbstractC8253l.m3698u(2, 0) + (AbstractC8253l.m3699t(1) * 2);
            int m3699t = AbstractC8253l.m3699t(3);
            int mo3478c = ((InterfaceC8287r0) value).mo3478c();
            return AbstractC8253l.m3697v(mo3478c) + mo3478c + m3699t + m3698u;
        }
        return m3538e(interfaceC8300a, value);
    }

    /* renamed from: k */
    public static <T extends InterfaceC8300a<T>> boolean m3532k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo3457D() == EnumC8296s1.MESSAGE) {
            key.mo3459B();
            Object value = entry.getValue();
            if (!(value instanceof InterfaceC8287r0)) {
                if (value instanceof C8209d0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((InterfaceC8287r0) value).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r2 instanceof com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if ((r2 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r2 instanceof com.google.crypto.tink.shaded.protobuf.C8209d0) == false) goto L22;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3528o(com.google.crypto.tink.shaded.protobuf.EnumC8289r1 r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r2.getClass()
            com.google.crypto.tink.shaded.protobuf.s1 r1 = r1.f16080a
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L22;
                case 7: goto L19;
                case 8: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3e
        L10:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.C8209d0
            if (r1 == 0) goto L3e
            goto L2a
        L19:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a
            if (r1 == 0) goto L3e
            goto L2a
        L22:
            boolean r1 = r2 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
        L2a:
            r1 = 1
            r0 = r1
            goto L3e
        L2d:
            boolean r0 = r2 instanceof java.lang.String
            goto L3e
        L30:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r0 = r2 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r0 = r2 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r0 = r2 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r0 = r2 instanceof java.lang.Integer
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8299u.m3528o(com.google.crypto.tink.shaded.protobuf.r1, java.lang.Object):void");
    }

    /* renamed from: a */
    public final C8299u<T> clone() {
        C8237i1<T, Object> c8237i1;
        C8299u<T> c8299u = new C8299u<>();
        int i = 0;
        while (true) {
            c8237i1 = this.f16095a;
            if (i >= c8237i1.m3803d()) {
                break;
            }
            Map.Entry<T, Object> m3804c = c8237i1.m3804c(i);
            c8299u.m3529n(m3804c.getKey(), m3804c.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : c8237i1.m3802e()) {
            c8299u.m3529n(entry.getKey(), entry.getValue());
        }
        c8299u.f16097c = this.f16097c;
        return c8299u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8299u) {
            return this.f16095a.equals(((C8299u) obj).f16095a);
        }
        return false;
    }

    /* renamed from: f */
    public final Object m3537f(T t) {
        Object obj = this.f16095a.get(t);
        if (obj instanceof C8209d0) {
            return ((C8209d0) obj).m3878a(null);
        }
        return obj;
    }

    /* renamed from: h */
    public final int m3535h() {
        C8237i1<T, Object> c8237i1;
        int i = 0;
        int i2 = 0;
        while (true) {
            c8237i1 = this.f16095a;
            if (i >= c8237i1.m3803d()) {
                break;
            }
            Map.Entry<T, Object> m3804c = c8237i1.m3804c(i);
            i2 += m3538e(m3804c.getKey(), m3804c.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : c8237i1.m3802e()) {
            i2 += m3538e(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final int hashCode() {
        return this.f16095a.hashCode();
    }

    /* renamed from: i */
    public final boolean m3534i() {
        return this.f16095a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m3533j() {
        int i = 0;
        while (true) {
            C8237i1<T, Object> c8237i1 = this.f16095a;
            if (i >= c8237i1.m3803d()) {
                for (Map.Entry<T, Object> entry : c8237i1.m3802e()) {
                    if (!m3532k(entry)) {
                        return false;
                    }
                }
                return true;
            } else if (!m3532k(c8237i1.m3804c(i))) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: l */
    public final Iterator<Map.Entry<T, Object>> m3531l() {
        boolean z = this.f16097c;
        C8237i1<T, Object> c8237i1 = this.f16095a;
        return z ? new C8209d0.C8211b(c8237i1.entrySet().iterator()) : c8237i1.entrySet().iterator();
    }

    /* renamed from: m */
    public final void m3530m(Map.Entry<T, Object> entry) {
        Object m3541b;
        Object m3537f;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C8209d0) {
            value = ((C8209d0) value).m3878a(null);
        }
        key.mo3459B();
        if (key.mo3457D() == EnumC8296s1.MESSAGE && (m3537f = m3537f(key)) != null) {
            m3541b = key.mo3455e(((InterfaceC8287r0) m3537f).mo3475f(), (InterfaceC8287r0) value).m3463i();
        } else {
            m3541b = m3541b(value);
        }
        this.f16095a.put(key, m3541b);
    }

    /* renamed from: n */
    public final void m3529n(T t, Object obj) {
        t.mo3459B();
        t.mo3458C();
        m3528o(null, obj);
        if (obj instanceof C8209d0) {
            this.f16097c = true;
        }
        this.f16095a.put(t, obj);
    }

    public C8299u(int i) {
        int i2 = C8237i1.f16006g;
        C8227h1 c8227h1 = new C8227h1(0);
        this.f16095a = c8227h1;
        if (!this.f16096b) {
            c8227h1.mo3800g();
            this.f16096b = true;
        }
        if (this.f16096b) {
            return;
        }
        c8227h1.mo3800g();
        this.f16096b = true;
    }
}
