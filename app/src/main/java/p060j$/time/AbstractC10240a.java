package p060j$.time;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10443n;

/* renamed from: j$.time.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC10240a {
    /* renamed from: a */
    public static void m1166a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m1165b(InterfaceC10394L0 interfaceC10394L0, InterfaceC10394L0 interfaceC10394L02, Object obj) {
        return interfaceC10394L0.test(obj) && interfaceC10394L02.test(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m1164c(InterfaceC10443n interfaceC10443n, InterfaceC10443n interfaceC10443n2, double d) {
        interfaceC10443n.accept(d);
        interfaceC10443n2.accept(d);
    }

    /* renamed from: d */
    public static /* synthetic */ long m1163d(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: e */
    public static /* synthetic */ long m1162e(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: f */
    public static /* synthetic */ long m1161f(long j) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(-1001L) + Long.numberOfLeadingZeros(1000L) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * 1000;
        }
        if (numberOfLeadingZeros >= 64) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (true | (i >= 0)) {
                long j2 = j * 1000;
                if (i == 0 || j2 / j == 1000) {
                    return j2;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public static /* synthetic */ long m1160g(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }
}
