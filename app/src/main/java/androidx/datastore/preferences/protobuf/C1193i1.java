package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1263v;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.i1 */
/* loaded from: classes.dex */
public final class C1193i1 {

    /* renamed from: a */
    public static final Class<?> f2989a;

    /* renamed from: b */
    public static final AbstractC1226o1<?, ?> f2990b;

    /* renamed from: c */
    public static final AbstractC1226o1<?, ?> f2991c;

    /* renamed from: d */
    public static final C1232q1 f2992d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f2989a = cls;
        f2990b = m11061z(false);
        f2991c = m11061z(true);
        f2992d = new C1232q1();
    }

    /* renamed from: A */
    public static <T, FT extends C1263v.InterfaceC1264a<FT>> void m11107A(AbstractC1239s<FT> abstractC1239s, T t, T t2) {
        C1203k1<FT, Object> c1203k1;
        C1263v<FT> mo10795c = abstractC1239s.mo10795c(t2);
        if (!mo10795c.m10766i()) {
            C1263v<FT> mo10794d = abstractC1239s.mo10794d(t);
            mo10794d.getClass();
            int i = 0;
            while (true) {
                c1203k1 = mo10795c.f3096a;
                if (i >= c1203k1.m11012d()) {
                    break;
                }
                mo10794d.m10762m(c1203k1.m11013c(i));
                i++;
            }
            for (Map.Entry<FT, Object> entry : c1203k1.m11011e()) {
                mo10794d.m10762m(entry);
            }
        }
    }

    /* renamed from: B */
    public static boolean m11106B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: C */
    public static <UT, UB> UB m11105C(int i, int i2, UB ub, AbstractC1226o1<UT, UB> abstractC1226o1) {
        if (ub == null) {
            ub = (UB) abstractC1226o1.mo10849m();
        }
        abstractC1226o1.mo10856e(ub, i, i2);
        return ub;
    }

    /* renamed from: D */
    public static void m11104D(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3++;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10900z(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10925A(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: E */
    public static void m11103E(int i, List list, C1221n c1221n) throws IOException {
        if (list != null && !list.isEmpty()) {
            c1221n.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c1221n.f3057a.mo10923C(i, (AbstractC1183i) list.get(i2));
            }
        }
    }

    /* renamed from: F */
    public static void m11102F(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 8;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10918H(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC1214m.getClass();
                abstractC1214m.mo10919G(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    /* renamed from: G */
    public static void m11101G(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC1214m.m10946k(((Integer) list.get(i4)).intValue());
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10916J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10917I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m11100H(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 4;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10920F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10921E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m11099I(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 8;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10918H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10919G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m11098J(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 4;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10920F(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                abstractC1214m.getClass();
                abstractC1214m.mo10921E(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    /* renamed from: K */
    public static void m11097K(int i, List list, C1221n c1221n, InterfaceC1182h1 interfaceC1182h1) throws IOException {
        if (list != null && !list.isEmpty()) {
            c1221n.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c1221n.m10888h(i, interfaceC1182h1, list.get(i2));
            }
        }
    }

    /* renamed from: L */
    public static void m11096L(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC1214m.m10946k(((Integer) list.get(i4)).intValue());
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10916J(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10917I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: M */
    public static void m11095M(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC1214m.m10933x(((Long) list.get(i4)).longValue());
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10905U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10906T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: N */
    public static void m11094N(int i, List list, C1221n c1221n, InterfaceC1182h1 interfaceC1182h1) throws IOException {
        if (list != null && !list.isEmpty()) {
            c1221n.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c1221n.m10885k(i, interfaceC1182h1, list.get(i2));
            }
        }
    }

    /* renamed from: O */
    public static void m11093O(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 4;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10920F(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10921E(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: P */
    public static void m11092P(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = AbstractC1214m.f3045b;
                    i3 += 8;
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10918H(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10919G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m11091Q(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += AbstractC1214m.m10935v((intValue >> 31) ^ (intValue << 1));
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    abstractC1214m.mo10907S((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                abstractC1214m.mo10908R(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m11090R(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += AbstractC1214m.m10933x((longValue >> 63) ^ (longValue << 1));
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    abstractC1214m.mo10905U((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                abstractC1214m.mo10906T(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m11089S(int i, List list, C1221n c1221n) throws IOException {
        if (list != null && !list.isEmpty()) {
            c1221n.getClass();
            boolean z = list instanceof InterfaceC1181h0;
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                InterfaceC1181h0 interfaceC1181h0 = (InterfaceC1181h0) list;
                while (i2 < list.size()) {
                    Object mo10839g = interfaceC1181h0.mo10839g(i2);
                    if (mo10839g instanceof String) {
                        abstractC1214m.mo10911O(i, (String) mo10839g);
                    } else {
                        abstractC1214m.mo10923C(i, (AbstractC1183i) mo10839g);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10911O(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m11088T(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC1214m.m10935v(((Integer) list.get(i4)).intValue());
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10907S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10908R(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: U */
    public static void m11087U(int i, List list, C1221n c1221n, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            int i2 = 0;
            if (z) {
                abstractC1214m.mo10909Q(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC1214m.m10933x(((Long) list.get(i4)).longValue());
                }
                abstractC1214m.mo10907S(i3);
                while (i2 < list.size()) {
                    abstractC1214m.mo10905U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                abstractC1214m.mo10906T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m11086a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC1214m.m10955b(i) * size;
    }

    /* renamed from: b */
    public static int m11085b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m11084c(int i, List<AbstractC1183i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m10937t = AbstractC1214m.m10937t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            m10937t += AbstractC1214m.m10935v(size2) + size2;
        }
        return m10937t;
    }

    /* renamed from: d */
    public static int m11083d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11082e(list);
    }

    /* renamed from: e */
    public static int m11082e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1154a0) {
            C1154a0 c1154a0 = (C1154a0) list;
            i = 0;
            while (i2 < size) {
                c1154a0.m11148i(i2);
                i += AbstractC1214m.m10946k(c1154a0.f2942b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1214m.m10946k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m11081f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC1214m.m10951f(i) * size;
    }

    /* renamed from: g */
    public static int m11080g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m11079h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC1214m.m10950g(i) * size;
    }

    /* renamed from: i */
    public static int m11078i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m11077j(int i, List<InterfaceC1240s0> list, InterfaceC1182h1 interfaceC1182h1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += AbstractC1214m.m10948i(i, list.get(i3), interfaceC1182h1);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m11076k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11075l(list);
    }

    /* renamed from: l */
    public static int m11075l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1154a0) {
            C1154a0 c1154a0 = (C1154a0) list;
            i = 0;
            while (i2 < size) {
                c1154a0.m11148i(i2);
                i += AbstractC1214m.m10946k(c1154a0.f2942b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1214m.m10946k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m11074m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * list.size()) + m11073n(list);
    }

    /* renamed from: n */
    public static int m11073n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1195j0) {
            C1195j0 c1195j0 = (C1195j0) list;
            i = 0;
            while (i2 < size) {
                c1195j0.m11058i(i2);
                i += AbstractC1214m.m10933x(c1195j0.f2993b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1214m.m10933x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m11072o(int i, InterfaceC1182h1 interfaceC1182h1, Object obj) {
        if (obj instanceof C1175f0) {
            return AbstractC1214m.m10944m((C1175f0) obj) + AbstractC1214m.m10937t(i);
        }
        int m10937t = AbstractC1214m.m10937t(i);
        int m11150h = ((AbstractC1152a) ((InterfaceC1240s0) obj)).m11150h(interfaceC1182h1);
        return AbstractC1214m.m10935v(m11150h) + m11150h + m10937t;
    }

    /* renamed from: p */
    public static int m11071p(int i, List<?> list, InterfaceC1182h1 interfaceC1182h1) {
        int m10935v;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m10937t = AbstractC1214m.m10937t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C1175f0) {
                m10935v = AbstractC1214m.m10944m((C1175f0) obj);
            } else {
                int m11150h = ((AbstractC1152a) ((InterfaceC1240s0) obj)).m11150h(interfaceC1182h1);
                m10935v = m11150h + AbstractC1214m.m10935v(m11150h);
            }
            m10937t += m10935v;
        }
        return m10937t;
    }

    /* renamed from: q */
    public static int m11070q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11069r(list);
    }

    /* renamed from: r */
    public static int m11069r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1154a0) {
            C1154a0 c1154a0 = (C1154a0) list;
            i = 0;
            while (i2 < size) {
                c1154a0.m11148i(i2);
                int i3 = c1154a0.f2942b[i2];
                i += AbstractC1214m.m10935v((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i += AbstractC1214m.m10935v((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m11068s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11067t(list);
    }

    /* renamed from: t */
    public static int m11067t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1195j0) {
            C1195j0 c1195j0 = (C1195j0) list;
            i = 0;
            while (i2 < size) {
                c1195j0.m11058i(i2);
                long j = c1195j0.f2993b[i2];
                i += AbstractC1214m.m10933x((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i += AbstractC1214m.m10933x((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m11066u(int i, List<?> list) {
        int m10938s;
        int m10938s2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m10937t = AbstractC1214m.m10937t(i) * size;
        if (list instanceof InterfaceC1181h0) {
            InterfaceC1181h0 interfaceC1181h0 = (InterfaceC1181h0) list;
            while (i2 < size) {
                Object mo10839g = interfaceC1181h0.mo10839g(i2);
                if (mo10839g instanceof AbstractC1183i) {
                    int size2 = ((AbstractC1183i) mo10839g).size();
                    m10938s2 = AbstractC1214m.m10935v(size2) + size2;
                } else {
                    m10938s2 = AbstractC1214m.m10938s((String) mo10839g);
                }
                m10937t += m10938s2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC1183i) {
                    int size3 = ((AbstractC1183i) obj).size();
                    m10938s = AbstractC1214m.m10935v(size3) + size3;
                } else {
                    m10938s = AbstractC1214m.m10938s((String) obj);
                }
                m10937t += m10938s;
                i2++;
            }
        }
        return m10937t;
    }

    /* renamed from: v */
    public static int m11065v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11064w(list);
    }

    /* renamed from: w */
    public static int m11064w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1154a0) {
            C1154a0 c1154a0 = (C1154a0) list;
            i = 0;
            while (i2 < size) {
                c1154a0.m11148i(i2);
                i += AbstractC1214m.m10935v(c1154a0.f2942b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1214m.m10935v(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m11063x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1214m.m10937t(i) * size) + m11062y(list);
    }

    /* renamed from: y */
    public static int m11062y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1195j0) {
            C1195j0 c1195j0 = (C1195j0) list;
            i = 0;
            while (i2 < size) {
                c1195j0.m11058i(i2);
                i += AbstractC1214m.m10933x(c1195j0.f2993b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC1214m.m10933x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static AbstractC1226o1<?, ?> m11061z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC1226o1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
