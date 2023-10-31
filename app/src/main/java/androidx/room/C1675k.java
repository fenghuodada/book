package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p004db.InterfaceC1706d;
import androidx.sqlite.p004db.framework.C1713d;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.k */
/* loaded from: classes.dex */
public final class C1675k implements InterfaceC1706d, Closeable {
    @VisibleForTesting

    /* renamed from: i */
    public static final TreeMap<Integer, C1675k> f4077i = new TreeMap<>();

    /* renamed from: a */
    public volatile String f4078a;
    @VisibleForTesting

    /* renamed from: b */
    public final long[] f4079b;
    @VisibleForTesting

    /* renamed from: c */
    public final double[] f4080c;
    @VisibleForTesting

    /* renamed from: d */
    public final String[] f4081d;
    @VisibleForTesting

    /* renamed from: e */
    public final byte[][] f4082e;

    /* renamed from: f */
    public final int[] f4083f;
    @VisibleForTesting

    /* renamed from: g */
    public final int f4084g;
    @VisibleForTesting

    /* renamed from: h */
    public int f4085h;

    public C1675k(int i) {
        this.f4084g = i;
        int i2 = i + 1;
        this.f4083f = new int[i2];
        this.f4079b = new long[i2];
        this.f4080c = new double[i2];
        this.f4081d = new String[i2];
        this.f4082e = new byte[i2];
    }

    /* renamed from: d */
    public static C1675k m10068d(int i, String str) {
        TreeMap<Integer, C1675k> treeMap = f4077i;
        synchronized (treeMap) {
            Map.Entry<Integer, C1675k> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1675k value = ceilingEntry.getValue();
                value.f4078a = str;
                value.f4085h = i;
                return value;
            }
            C1675k c1675k = new C1675k(i);
            c1675k.f4078a = str;
            c1675k.f4085h = i;
            return c1675k;
        }
    }

    @Override // androidx.sqlite.p004db.InterfaceC1706d
    /* renamed from: a */
    public final void mo10034a(C1713d c1713d) {
        for (int i = 1; i <= this.f4085h; i++) {
            int i2 = this.f4083f[i];
            if (i2 == 1) {
                c1713d.m10018e(i);
            } else if (i2 == 2) {
                c1713d.m10019d(i, this.f4079b[i]);
            } else if (i2 == 3) {
                c1713d.m10020c(this.f4080c[i], i);
            } else if (i2 == 4) {
                c1713d.m10017f(i, this.f4081d[i]);
            } else if (i2 == 5) {
                c1713d.m10021a(i, this.f4082e[i]);
            }
        }
    }

    @Override // androidx.sqlite.p004db.InterfaceC1706d
    /* renamed from: c */
    public final String mo10033c() {
        return this.f4078a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: e */
    public final void m10067e(int i, long j) {
        this.f4083f[i] = 2;
        this.f4079b[i] = j;
    }

    /* renamed from: f */
    public final void m10066f(int i) {
        this.f4083f[i] = 1;
    }

    /* renamed from: g */
    public final void m10065g(int i, String str) {
        this.f4083f[i] = 4;
        this.f4081d[i] = str;
    }

    public final void release() {
        TreeMap<Integer, C1675k> treeMap = f4077i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4084g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
