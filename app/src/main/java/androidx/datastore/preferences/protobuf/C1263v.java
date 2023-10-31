package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1157b0;
import androidx.datastore.preferences.protobuf.C1170e0;
import androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a;
import androidx.datastore.preferences.protobuf.InterfaceC1240s0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.v */
/* loaded from: classes.dex */
public final class C1263v<T extends InterfaceC1264a<T>> {

    /* renamed from: d */
    public static final C1263v f3095d = new C1263v(0);

    /* renamed from: a */
    public final C1203k1<T, Object> f3096a;

    /* renamed from: b */
    public boolean f3097b;

    /* renamed from: c */
    public boolean f3098c;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1264a<T extends InterfaceC1264a<T>> extends Comparable<T> {
        /* renamed from: B */
        void mo10698B();

        /* renamed from: C */
        void mo10697C();

        /* renamed from: D */
        EnumC1266v1 mo10696D();

        /* renamed from: E */
        void mo10695E();

        /* renamed from: H */
        AbstractC1273z.AbstractC1274a mo10694H(InterfaceC1240s0.InterfaceC1241a interfaceC1241a, InterfaceC1240s0 interfaceC1240s0);

        void getNumber();
    }

    public C1263v() {
        int i = C1203k1.f3017g;
        this.f3096a = new C1196j1(16);
    }

    /* renamed from: b */
    public static Object m10773b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: c */
    public static int m10772c(EnumC1258u1 enumC1258u1, int i, Object obj) {
        int m10937t = AbstractC1214m.m10937t(i);
        if (enumC1258u1 == EnumC1258u1.f3090d) {
            m10937t *= 2;
        }
        return m10771d(enumC1258u1, obj) + m10937t;
    }

    /* renamed from: d */
    public static int m10771d(EnumC1258u1 enumC1258u1, Object obj) {
        switch (enumC1258u1.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC1214m.f3045b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC1214m.f3045b;
                return 4;
            case 2:
                return AbstractC1214m.m10933x(((Long) obj).longValue());
            case 3:
                return AbstractC1214m.m10933x(((Long) obj).longValue());
            case 4:
                return AbstractC1214m.m10946k(((Integer) obj).intValue());
            case 5:
            case 15:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC1214m.f3045b;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = AbstractC1214m.f3045b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger4 = AbstractC1214m.f3045b;
                return 1;
            case 8:
                if (obj instanceof AbstractC1183i) {
                    Logger logger5 = AbstractC1214m.f3045b;
                    int size = ((AbstractC1183i) obj).size();
                    return AbstractC1214m.m10935v(size) + size;
                }
                return AbstractC1214m.m10938s((String) obj);
            case 9:
                Logger logger6 = AbstractC1214m.f3045b;
                return ((InterfaceC1240s0) obj).mo10715c();
            case 10:
                if (obj instanceof C1170e0) {
                    return AbstractC1214m.m10944m((C1170e0) obj);
                }
                Logger logger7 = AbstractC1214m.f3045b;
                int mo10715c = ((InterfaceC1240s0) obj).mo10715c();
                return AbstractC1214m.m10935v(mo10715c) + mo10715c;
            case 11:
                if (obj instanceof AbstractC1183i) {
                    Logger logger8 = AbstractC1214m.f3045b;
                    int size2 = ((AbstractC1183i) obj).size();
                    return AbstractC1214m.m10935v(size2) + size2;
                }
                Logger logger9 = AbstractC1214m.f3045b;
                int length = ((byte[]) obj).length;
                return AbstractC1214m.m10935v(length) + length;
            case 12:
                return AbstractC1214m.m10935v(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C1157b0.InterfaceC1158a) {
                    return AbstractC1214m.m10946k(((C1157b0.InterfaceC1158a) obj).getNumber());
                }
                return AbstractC1214m.m10946k(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return AbstractC1214m.m10935v((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC1214m.m10933x((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: e */
    public static int m10770e(InterfaceC1264a<?> interfaceC1264a, Object obj) {
        interfaceC1264a.mo10697C();
        interfaceC1264a.getNumber();
        interfaceC1264a.mo10698B();
        return m10772c(null, 0, obj);
    }

    /* renamed from: g */
    public static int m10768g(Map.Entry entry) {
        InterfaceC1264a interfaceC1264a = (InterfaceC1264a) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC1264a.mo10696D() == EnumC1266v1.MESSAGE) {
            interfaceC1264a.mo10698B();
            interfaceC1264a.mo10695E();
            boolean z = value instanceof C1170e0;
            ((InterfaceC1264a) entry.getKey()).getNumber();
            if (z) {
                return AbstractC1214m.m10944m((C1170e0) value) + AbstractC1214m.m10937t(3) + AbstractC1214m.m10936u(2, 0) + (AbstractC1214m.m10937t(1) * 2);
            }
            int m10936u = AbstractC1214m.m10936u(2, 0) + (AbstractC1214m.m10937t(1) * 2);
            int m10937t = AbstractC1214m.m10937t(3);
            int mo10715c = ((InterfaceC1240s0) value).mo10715c();
            return AbstractC1214m.m10935v(mo10715c) + mo10715c + m10937t + m10936u;
        }
        return m10770e(interfaceC1264a, value);
    }

    /* renamed from: k */
    public static <T extends InterfaceC1264a<T>> boolean m10764k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo10696D() == EnumC1266v1.MESSAGE) {
            key.mo10698B();
            Object value = entry.getValue();
            if (!(value instanceof InterfaceC1240s0)) {
                if (value instanceof C1170e0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((InterfaceC1240s0) value).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1158a) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if ((r2 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.C1170e0) == false) goto L22;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10760o(androidx.datastore.preferences.protobuf.EnumC1258u1 r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.C1157b0.f2944a
            r2.getClass()
            androidx.datastore.preferences.protobuf.v1 r1 = r1.f3093a
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
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.InterfaceC1240s0
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.C1170e0
            if (r1 == 0) goto L3e
            goto L2a
        L19:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1158a
            if (r1 == 0) goto L3e
            goto L2a
        L22:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1263v.m10760o(androidx.datastore.preferences.protobuf.u1, java.lang.Object):void");
    }

    /* renamed from: p */
    public static void m10759p(AbstractC1214m abstractC1214m, EnumC1258u1 enumC1258u1, int i, Object obj) throws IOException {
        int intValue;
        if (enumC1258u1 == EnumC1258u1.f3090d) {
            abstractC1214m.mo10909Q(i, 3);
            ((InterfaceC1240s0) obj).mo10713f(abstractC1214m);
            abstractC1214m.mo10909Q(i, 4);
            return;
        }
        abstractC1214m.mo10909Q(i, enumC1258u1.f3094b);
        switch (enumC1258u1.ordinal()) {
            case 0:
                abstractC1214m.mo10918H(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                abstractC1214m.mo10920F(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                abstractC1214m.mo10905U(((Long) obj).longValue());
                return;
            case 3:
                abstractC1214m.mo10905U(((Long) obj).longValue());
                return;
            case 4:
                abstractC1214m.mo10916J(((Integer) obj).intValue());
                return;
            case 5:
                abstractC1214m.mo10918H(((Long) obj).longValue());
                return;
            case 6:
                abstractC1214m.mo10920F(((Integer) obj).intValue());
                return;
            case 7:
                abstractC1214m.mo10900z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof AbstractC1183i)) {
                    abstractC1214m.mo10910P((String) obj);
                    return;
                }
                break;
            case 9:
                ((InterfaceC1240s0) obj).mo10713f(abstractC1214m);
                return;
            case 10:
                abstractC1214m.mo10914L((InterfaceC1240s0) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC1183i)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC1214m.mo10924B(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                abstractC1214m.mo10907S(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof C1157b0.InterfaceC1158a) {
                    intValue = ((C1157b0.InterfaceC1158a) obj).getNumber();
                } else {
                    intValue = ((Integer) obj).intValue();
                }
                abstractC1214m.mo10916J(intValue);
                return;
            case 14:
                abstractC1214m.mo10920F(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1214m.mo10918H(((Long) obj).longValue());
                return;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                abstractC1214m.mo10907S((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC1214m.mo10905U((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        abstractC1214m.mo10922D((AbstractC1183i) obj);
    }

    /* renamed from: a */
    public final C1263v<T> clone() {
        C1203k1<T, Object> c1203k1;
        C1263v<T> c1263v = new C1263v<>();
        int i = 0;
        while (true) {
            c1203k1 = this.f3096a;
            if (i >= c1203k1.m11012d()) {
                break;
            }
            Map.Entry<T, Object> m11013c = c1203k1.m11013c(i);
            c1263v.m10761n(m11013c.getKey(), m11013c.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : c1203k1.m11011e()) {
            c1263v.m10761n(entry.getKey(), entry.getValue());
        }
        c1263v.f3098c = this.f3098c;
        return c1263v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1263v) {
            return this.f3096a.equals(((C1263v) obj).f3096a);
        }
        return false;
    }

    /* renamed from: f */
    public final Object m10769f(T t) {
        Object obj = this.f3096a.get(t);
        if (obj instanceof C1170e0) {
            return ((C1170e0) obj).m11125a(null);
        }
        return obj;
    }

    /* renamed from: h */
    public final int m10767h() {
        C1203k1<T, Object> c1203k1;
        int i = 0;
        int i2 = 0;
        while (true) {
            c1203k1 = this.f3096a;
            if (i >= c1203k1.m11012d()) {
                break;
            }
            Map.Entry<T, Object> m11013c = c1203k1.m11013c(i);
            i2 += m10770e(m11013c.getKey(), m11013c.getValue());
            i++;
        }
        for (Map.Entry<T, Object> entry : c1203k1.m11011e()) {
            i2 += m10770e(entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final int hashCode() {
        return this.f3096a.hashCode();
    }

    /* renamed from: i */
    public final boolean m10766i() {
        return this.f3096a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m10765j() {
        int i = 0;
        while (true) {
            C1203k1<T, Object> c1203k1 = this.f3096a;
            if (i >= c1203k1.m11012d()) {
                for (Map.Entry<T, Object> entry : c1203k1.m11011e()) {
                    if (!m10764k(entry)) {
                        return false;
                    }
                }
                return true;
            } else if (!m10764k(c1203k1.m11013c(i))) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: l */
    public final Iterator<Map.Entry<T, Object>> m10763l() {
        boolean z = this.f3098c;
        C1203k1<T, Object> c1203k1 = this.f3096a;
        return z ? new C1170e0.C1172b(c1203k1.entrySet().iterator()) : c1203k1.entrySet().iterator();
    }

    /* renamed from: m */
    public final void m10762m(Map.Entry<T, Object> entry) {
        Object m10773b;
        Object m10769f;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1170e0) {
            value = ((C1170e0) value).m11125a(null);
        }
        key.mo10698B();
        if (key.mo10696D() == EnumC1266v1.MESSAGE && (m10769f = m10769f(key)) != null) {
            m10773b = key.mo10694H(((InterfaceC1240s0) m10769f).mo10700d(), (InterfaceC1240s0) value).m10706h();
        } else {
            m10773b = m10773b(value);
        }
        this.f3096a.put(key, m10773b);
    }

    /* renamed from: n */
    public final void m10761n(T t, Object obj) {
        t.mo10698B();
        t.mo10697C();
        m10760o(null, obj);
        if (obj instanceof C1170e0) {
            this.f3098c = true;
        }
        this.f3096a.put(t, obj);
    }

    public C1263v(int i) {
        int i2 = C1203k1.f3017g;
        C1196j1 c1196j1 = new C1196j1(0);
        this.f3096a = c1196j1;
        if (!this.f3097b) {
            c1196j1.mo11009g();
            this.f3097b = true;
        }
        if (this.f3097b) {
            return;
        }
        c1196j1.mo11009g();
        this.f3097b = true;
    }
}
