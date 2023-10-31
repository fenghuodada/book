package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8299u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g1 */
/* loaded from: classes3.dex */
public final class C8222g1 {

    /* renamed from: a */
    public static final Class<?> f15988a;

    /* renamed from: b */
    public static final AbstractC8257l1<?, ?> f15989b;

    /* renamed from: c */
    public static final AbstractC8257l1<?, ?> f15990c;

    /* renamed from: d */
    public static final C8263n1 f15991d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f15988a = cls;
        f15989b = m3874A(false);
        f15990c = m3874A(true);
        f15991d = new C8263n1();
    }

    /* renamed from: A */
    public static AbstractC8257l1<?, ?> m3874A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC8257l1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public static <T, FT extends C8299u.InterfaceC8300a<FT>> void m3873B(AbstractC8286r<FT> abstractC8286r, T t, T t2) {
        C8237i1<FT, Object> c8237i1;
        C8299u<FT> mo3553c = abstractC8286r.mo3553c(t2);
        if (!mo3553c.m3534i()) {
            C8299u<FT> mo3552d = abstractC8286r.mo3552d(t);
            mo3552d.getClass();
            int i = 0;
            while (true) {
                c8237i1 = mo3553c.f16095a;
                if (i >= c8237i1.m3803d()) {
                    break;
                }
                mo3552d.m3530m(c8237i1.m3804c(i));
                i++;
            }
            for (Map.Entry<FT, Object> entry : c8237i1.m3802e()) {
                mo3552d.m3530m(entry);
            }
        }
    }

    /* renamed from: C */
    public static boolean m3872C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: D */
    public static <UT, UB> UB m3871D(int i, int i2, UB ub, AbstractC8257l1<UT, UB> abstractC8257l1) {
        if (ub == null) {
            ub = (UB) abstractC8257l1.mo3625m();
        }
        abstractC8257l1.mo3632e(ub, i, i2);
        return ub;
    }

    /* renamed from: E */
    public static void m3870E(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3++;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3672y(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3671z(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: F */
    public static void m3869F(int i, List list, C8258m c8258m) throws IOException {
        if (list != null && !list.isEmpty()) {
            c8258m.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c8258m.f16048a.mo3694A(i, (AbstractC8228i) list.get(i2));
            }
        }
    }

    /* renamed from: G */
    public static void m3868G(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 8;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3690E(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC8253l.getClass();
                abstractC8253l.mo3691D(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m3867H(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC8253l.m3708k(((Integer) list.get(i4)).intValue());
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3688G(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3689F(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m3866I(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 4;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3692C(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3693B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m3865J(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 8;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3690E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3691D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m3864K(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 4;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3692C(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                abstractC8253l.getClass();
                abstractC8253l.mo3693B(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m3863L(int i, List list, C8258m c8258m, InterfaceC8219f1 interfaceC8219f1) throws IOException {
        if (list != null && !list.isEmpty()) {
            c8258m.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c8258m.m3660h(i, interfaceC8219f1, list.get(i2));
            }
        }
    }

    /* renamed from: M */
    public static void m3862M(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC8253l.m3708k(((Integer) list.get(i4)).intValue());
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3688G(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3689F(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m3861N(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC8253l.m3695x(((Long) list.get(i4)).longValue());
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3679P(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3680O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m3860O(int i, List list, C8258m c8258m, InterfaceC8219f1 interfaceC8219f1) throws IOException {
        if (list != null && !list.isEmpty()) {
            c8258m.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c8258m.m3657k(i, interfaceC8219f1, list.get(i2));
            }
        }
    }

    /* renamed from: P */
    public static void m3859P(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 4;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3692C(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3693B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m3858Q(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = AbstractC8253l.f16040b;
                    i3 += 8;
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3690E(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3691D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m3857R(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += AbstractC8253l.m3697v((intValue >> 31) ^ (intValue << 1));
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    abstractC8253l.mo3681N((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                abstractC8253l.mo3682M(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m3856S(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += AbstractC8253l.m3695x((longValue >> 63) ^ (longValue << 1));
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    abstractC8253l.mo3679P((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                abstractC8253l.mo3680O(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m3855T(int i, List list, C8258m c8258m) throws IOException {
        if (list != null && !list.isEmpty()) {
            c8258m.getClass();
            boolean z = list instanceof InterfaceC8221g0;
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                InterfaceC8221g0 interfaceC8221g0 = (InterfaceC8221g0) list;
                while (i2 < list.size()) {
                    Object mo3616g = interfaceC8221g0.mo3616g(i2);
                    if (mo3616g instanceof String) {
                        abstractC8253l.mo3684K(i, (String) mo3616g);
                    } else {
                        abstractC8253l.mo3694A(i, (AbstractC8228i) mo3616g);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3684K(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m3854U(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC8253l.m3697v(((Integer) list.get(i4)).intValue());
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3681N(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3682M(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: V */
    public static void m3853V(int i, List list, C8258m c8258m, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            int i2 = 0;
            if (z) {
                abstractC8253l.mo3683L(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC8253l.m3695x(((Long) list.get(i4)).longValue());
                }
                abstractC8253l.mo3681N(i3);
                while (i2 < list.size()) {
                    abstractC8253l.mo3679P(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC8253l.mo3680O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m3852a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC8253l.m3717b(i) * size;
    }

    /* renamed from: b */
    public static int m3851b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m3850c(int i, List<AbstractC8228i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m3699t = AbstractC8253l.m3699t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            m3699t += AbstractC8253l.m3697v(size2) + size2;
        }
        return m3699t;
    }

    /* renamed from: d */
    public static int m3849d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3848e(list);
    }

    /* renamed from: e */
    public static int m3848e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8316z) {
            C8316z c8316z = (C8316z) list;
            i = 0;
            while (i2 < size) {
                c8316z.m3452i(i2);
                i += AbstractC8253l.m3708k(c8316z.f16141b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC8253l.m3708k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m3847f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC8253l.m3713f(i) * size;
    }

    /* renamed from: g */
    public static int m3846g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m3845h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC8253l.m3712g(i) * size;
    }

    /* renamed from: i */
    public static int m3844i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m3843j(int i, List<InterfaceC8287r0> list, InterfaceC8219f1 interfaceC8219f1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC8253l.m3710i(i, list.get(i3), interfaceC8219f1);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m3842k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3841l(list);
    }

    /* renamed from: l */
    public static int m3841l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8316z) {
            C8316z c8316z = (C8316z) list;
            i = 0;
            while (i2 < size) {
                c8316z.m3452i(i2);
                i += AbstractC8253l.m3708k(c8316z.f16141b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC8253l.m3708k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m3840m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * list.size()) + m3839n(list);
    }

    /* renamed from: n */
    public static int m3839n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8236i0) {
            C8236i0 c8236i0 = (C8236i0) list;
            i = 0;
            while (i2 < size) {
                c8236i0.m3807i(i2);
                i += AbstractC8253l.m3695x(c8236i0.f16004b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC8253l.m3695x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m3838o(int i, InterfaceC8219f1 interfaceC8219f1, Object obj) {
        if (obj instanceof C8215e0) {
            return AbstractC8253l.m3706m((C8215e0) obj) + AbstractC8253l.m3699t(i);
        }
        int m3699t = AbstractC8253l.m3699t(i);
        AbstractC8194a abstractC8194a = (AbstractC8194a) ((InterfaceC8287r0) obj);
        int mo3476e = abstractC8194a.mo3476e();
        if (mo3476e == -1) {
            mo3476e = interfaceC8219f1.mo3490e(abstractC8194a);
            abstractC8194a.mo3473j(mo3476e);
        }
        return AbstractC8253l.m3697v(mo3476e) + mo3476e + m3699t;
    }

    /* renamed from: p */
    public static int m3837p(int i, List<?> list, InterfaceC8219f1 interfaceC8219f1) {
        int m3697v;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m3699t = AbstractC8253l.m3699t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C8215e0) {
                m3697v = AbstractC8253l.m3706m((C8215e0) obj);
            } else {
                AbstractC8194a abstractC8194a = (AbstractC8194a) ((InterfaceC8287r0) obj);
                int mo3476e = abstractC8194a.mo3476e();
                if (mo3476e == -1) {
                    mo3476e = interfaceC8219f1.mo3490e(abstractC8194a);
                    abstractC8194a.mo3473j(mo3476e);
                }
                m3697v = AbstractC8253l.m3697v(mo3476e) + mo3476e;
            }
            m3699t += m3697v;
        }
        return m3699t;
    }

    /* renamed from: q */
    public static int m3836q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3835r(list);
    }

    /* renamed from: r */
    public static int m3835r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8316z) {
            C8316z c8316z = (C8316z) list;
            i = 0;
            while (i2 < size) {
                c8316z.m3452i(i2);
                int i3 = c8316z.f16141b[i2];
                i += AbstractC8253l.m3697v((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += AbstractC8253l.m3697v((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m3834s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3833t(list);
    }

    /* renamed from: t */
    public static int m3833t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8236i0) {
            C8236i0 c8236i0 = (C8236i0) list;
            i = 0;
            while (i2 < size) {
                c8236i0.m3807i(i2);
                long j = c8236i0.f16004b[i2];
                i += AbstractC8253l.m3695x((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += AbstractC8253l.m3695x((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m3832u(int i, List<?> list) {
        int m3700s;
        int m3700s2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m3699t = AbstractC8253l.m3699t(i) * size;
        if (list instanceof InterfaceC8221g0) {
            InterfaceC8221g0 interfaceC8221g0 = (InterfaceC8221g0) list;
            while (i2 < size) {
                Object mo3616g = interfaceC8221g0.mo3616g(i2);
                if (mo3616g instanceof AbstractC8228i) {
                    int size2 = ((AbstractC8228i) mo3616g).size();
                    m3700s2 = AbstractC8253l.m3697v(size2) + size2;
                } else {
                    m3700s2 = AbstractC8253l.m3700s((String) mo3616g);
                }
                m3699t += m3700s2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC8228i) {
                    int size3 = ((AbstractC8228i) obj).size();
                    m3700s = AbstractC8253l.m3697v(size3) + size3;
                } else {
                    m3700s = AbstractC8253l.m3700s((String) obj);
                }
                m3699t += m3700s;
                i2++;
            }
        }
        return m3699t;
    }

    /* renamed from: v */
    public static int m3831v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3830w(list);
    }

    /* renamed from: w */
    public static int m3830w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8316z) {
            C8316z c8316z = (C8316z) list;
            i = 0;
            while (i2 < size) {
                c8316z.m3452i(i2);
                i += AbstractC8253l.m3697v(c8316z.f16141b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC8253l.m3697v(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m3829x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC8253l.m3699t(i) * size) + m3828y(list);
    }

    /* renamed from: y */
    public static int m3828y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8236i0) {
            C8236i0 c8236i0 = (C8236i0) list;
            i = 0;
            while (i2 < size) {
                c8236i0.m3807i(i2);
                i += AbstractC8253l.m3695x(c8236i0.f16004b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC8253l.m3695x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static <UT, UB> UB m3827z(int i, List<Integer> list, C8196a0.InterfaceC8198b interfaceC8198b, UB ub, AbstractC8257l1<UT, UB> abstractC8257l1) {
        if (interfaceC8198b == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (interfaceC8198b.m3931a()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) m3871D(i, intValue, ub, abstractC8257l1);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!interfaceC8198b.m3931a()) {
                    ub = (UB) m3871D(i, intValue2, ub, abstractC8257l1);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
