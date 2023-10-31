package p060j$.time;

import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.h */
/* loaded from: classes2.dex */
public final class C10278h implements InterfaceC10296k, Comparable, Serializable {

    /* renamed from: e */
    public static final C10278h f20661e;

    /* renamed from: f */
    public static final C10278h f20662f;

    /* renamed from: g */
    private static final C10278h[] f20663g = new C10278h[24];

    /* renamed from: a */
    private final byte f20664a;

    /* renamed from: b */
    private final byte f20665b;

    /* renamed from: c */
    private final byte f20666c;

    /* renamed from: d */
    private final int f20667d;

    static {
        int i = 0;
        while (true) {
            C10278h[] c10278hArr = f20663g;
            if (i >= c10278hArr.length) {
                C10278h c10278h = c10278hArr[0];
                C10278h c10278h2 = c10278hArr[12];
                f20661e = c10278h;
                f20662f = new C10278h(23, 59, 59, 999999999);
                return;
            }
            c10278hArr[i] = new C10278h(i, 0, 0, 0);
            i++;
        }
    }

    private C10278h(int i, int i2, int i3, int i4) {
        this.f20664a = (byte) i;
        this.f20665b = (byte) i2;
        this.f20666c = (byte) i3;
        this.f20667d = i4;
    }

    /* renamed from: g */
    private int m1103g(InterfaceC10297l interfaceC10297l) {
        int i = AbstractC10277g.f20659a[((EnumC10286a) interfaceC10297l).ordinal()];
        byte b = this.f20665b;
        int i2 = this.f20667d;
        byte b2 = this.f20664a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new C10301p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new C10301p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (m1099k() / 1000000);
            case 7:
                return this.f20666c;
            case 8:
                return m1098l();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new C10301p("Unsupported field: " + interfaceC10297l);
        }
    }

    /* renamed from: j */
    public static C10278h m1100j(long j) {
        EnumC10286a.NANO_OF_DAY.m1086f(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        int i4 = (int) (j3 - (i3 * 1000000000));
        return ((i2 | i3) | i4) == 0 ? f20663g[i] : new C10278h(i, i2, i3, i4);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return AbstractC10295j.m1076c(this, interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l.isTimeBased() : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.NANO_OF_DAY ? m1099k() : interfaceC10297l == EnumC10286a.MICRO_OF_DAY ? m1099k() / 1000 : m1103g(interfaceC10297l) : interfaceC10297l.mo1060d(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1075d() || interfaceC10299n == AbstractC10295j.m1069j() || interfaceC10299n == AbstractC10295j.m1070i() || interfaceC10299n == AbstractC10295j.m1072g()) {
            return null;
        }
        if (interfaceC10299n == AbstractC10295j.m1073f()) {
            return this;
        }
        if (interfaceC10299n == AbstractC10295j.m1074e()) {
            return null;
        }
        return interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.NANOS : interfaceC10299n.mo1059a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        return enumC10286a instanceof EnumC10286a ? m1103g(enumC10286a) : AbstractC10295j.m1078a(this, enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10278h) {
            C10278h c10278h = (C10278h) obj;
            return this.f20664a == c10278h.f20664a && this.f20665b == c10278h.f20665b && this.f20666c == c10278h.f20666c && this.f20667d == c10278h.f20667d;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(C10278h c10278h) {
        int compare = Integer.compare(this.f20664a, c10278h.f20664a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f20665b, c10278h.f20665b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f20666c, c10278h.f20666c);
                return compare3 == 0 ? Integer.compare(this.f20667d, c10278h.f20667d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    /* renamed from: h */
    public final int m1102h() {
        return this.f20667d;
    }

    public final int hashCode() {
        long m1099k = m1099k();
        return (int) (m1099k ^ (m1099k >>> 32));
    }

    /* renamed from: i */
    public final int m1101i() {
        return this.f20666c;
    }

    /* renamed from: k */
    public final long m1099k() {
        return (this.f20666c * 1000000000) + (this.f20665b * 60000000000L) + (this.f20664a * 3600000000000L) + this.f20667d;
    }

    /* renamed from: l */
    public final int m1098l() {
        return (this.f20665b * 60) + (this.f20664a * 3600) + this.f20666c;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f20664a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.f20665b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.f20666c;
        int i2 = this.f20667d;
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 >= 10 ? ":" : ":0");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }
}
