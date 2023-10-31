package p060j$.time;

import java.io.Serializable;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10244b;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.f */
/* loaded from: classes2.dex */
public final class C10253f implements InterfaceC10296k, InterfaceC10244b, Serializable {

    /* renamed from: d */
    public static final C10253f f20601d = m1148n(-999999999, 1, 1);

    /* renamed from: e */
    public static final C10253f f20602e = m1148n(999999999, 12, 31);

    /* renamed from: a */
    private final int f20603a;

    /* renamed from: b */
    private final short f20604b;

    /* renamed from: c */
    private final short f20605c;

    private C10253f(int i, int i2, int i3) {
        this.f20603a = i;
        this.f20604b = (short) i2;
        this.f20605c = (short) i3;
    }

    /* renamed from: h */
    public static C10253f m1154h(InterfaceC10296k interfaceC10296k) {
        if (interfaceC10296k != null) {
            C10253f c10253f = (C10253f) interfaceC10296k.mo1065d(AbstractC10295j.m1074e());
            if (c10253f != null) {
                return c10253f;
            }
            throw new C10241b("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC10296k + " of type " + interfaceC10296k.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: i */
    private int m1153i(InterfaceC10297l interfaceC10297l) {
        int i;
        int m1151k;
        int i2 = AbstractC10252e.f20599a[((EnumC10286a) interfaceC10297l).ordinal()];
        int i3 = this.f20603a;
        short s = this.f20605c;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return m1151k();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return m1152j().ordinal() + 1;
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                m1151k = (m1151k() - 1) % 7;
                return m1151k + 1;
            case 8:
                throw new C10301p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                m1151k = (m1151k() - 1) / 7;
                return m1151k + 1;
            case 10:
                return this.f20604b;
            case 11:
                throw new C10301p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new C10301p("Unsupported field: " + interfaceC10297l);
        }
    }

    /* renamed from: n */
    public static C10253f m1148n(int i, int i2, int i3) {
        long j = i;
        EnumC10286a.YEAR.m1086f(j);
        EnumC10286a.MONTH_OF_YEAR.m1086f(i2);
        EnumC10286a.DAY_OF_MONTH.m1086f(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                C10250h.f20596a.getClass();
                if (C10250h.m1157a(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C10241b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C10241b("Invalid date '" + EnumC10280j.m1096g(i2).name() + " " + i3 + "'");
            }
        }
        return new C10253f(i, i2, i3);
    }

    /* renamed from: o */
    public static C10253f m1147o(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new C10253f(EnumC10286a.YEAR.m1087e(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        int i;
        if (interfaceC10297l instanceof EnumC10286a) {
            EnumC10286a enumC10286a = (EnumC10286a) interfaceC10297l;
            if (!enumC10286a.isDateBased()) {
                throw new C10301p("Unsupported field: " + interfaceC10297l);
            }
            int i2 = AbstractC10252e.f20599a[enumC10286a.ordinal()];
            short s = this.f20604b;
            if (i2 == 1) {
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : m1149m() ? 29 : 28;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    return C10302q.m1050i(1L, (EnumC10280j.m1096g(s) != EnumC10280j.FEBRUARY || m1149m()) ? 5L : 4L);
                } else if (i2 != 4) {
                    return interfaceC10297l.mo1061c();
                } else {
                    return C10302q.m1050i(1L, this.f20603a <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                i = m1149m() ? 366 : 365;
            }
            return C10302q.m1050i(1L, i);
        }
        return interfaceC10297l.mo1062b(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l.isDateBased() : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.EPOCH_DAY ? m1145q() : interfaceC10297l == EnumC10286a.PROLEPTIC_MONTH ? ((this.f20603a * 12) + this.f20604b) - 1 : m1153i(interfaceC10297l) : interfaceC10297l.mo1060d(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1074e()) {
            return this;
        }
        if (interfaceC10299n == AbstractC10295j.m1069j() || interfaceC10299n == AbstractC10295j.m1070i() || interfaceC10299n == AbstractC10295j.m1072g() || interfaceC10299n == AbstractC10295j.m1073f()) {
            return null;
        }
        return interfaceC10299n == AbstractC10295j.m1075d() ? C10250h.f20596a : interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.DAYS : interfaceC10299n.mo1059a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        return enumC10286a instanceof EnumC10286a ? m1153i(enumC10286a) : AbstractC10295j.m1078a(this, enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10253f) && m1155g((C10253f) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(InterfaceC10244b interfaceC10244b) {
        if (interfaceC10244b instanceof C10253f) {
            return m1155g((C10253f) interfaceC10244b);
        }
        int compare = Long.compare(m1145q(), ((C10253f) interfaceC10244b).m1145q());
        if (compare == 0) {
            C10250h.f20596a.getClass();
            return 0;
        }
        return compare;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m1155g(C10253f c10253f) {
        int i = this.f20603a - c10253f.f20603a;
        if (i == 0) {
            int i2 = this.f20604b - c10253f.f20604b;
            return i2 == 0 ? this.f20605c - c10253f.f20605c : i2;
        }
        return i;
    }

    public final int hashCode() {
        int i = this.f20603a;
        return (((i << 11) + (this.f20604b << 6)) + this.f20605c) ^ (i & (-2048));
    }

    /* renamed from: j */
    public final EnumC10242c m1152j() {
        return EnumC10242c.m1159f(((int) AbstractC10240a.m1162e(m1145q() + 3, 7L)) + 1);
    }

    /* renamed from: k */
    public final int m1151k() {
        return (EnumC10280j.m1096g(this.f20604b).m1097f(m1149m()) + this.f20605c) - 1;
    }

    /* renamed from: l */
    public final int m1150l() {
        return this.f20603a;
    }

    /* renamed from: m */
    public final boolean m1149m() {
        C10250h.f20596a.getClass();
        return C10250h.m1157a(this.f20603a);
    }

    /* renamed from: p */
    public final C10253f m1146p(long j) {
        int i;
        if (j == 0) {
            return this;
        }
        int m1087e = EnumC10286a.YEAR.m1087e(this.f20603a + j);
        short s = this.f20604b;
        int i2 = this.f20605c;
        if (s != 2) {
            if (s == 4 || s == 6 || s == 9 || s == 11) {
                i = 30;
            }
            return new C10253f(m1087e, s, i2);
        }
        C10250h.f20596a.getClass();
        i = C10250h.m1157a((long) m1087e) ? 29 : 28;
        i2 = Math.min(i2, i);
        return new C10253f(m1087e, s, i2);
    }

    /* renamed from: q */
    public final long m1145q() {
        long j;
        long j2 = this.f20603a;
        long j3 = this.f20604b;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.f20605c - 1);
        if (j3 > 2) {
            j5--;
            if (!m1149m()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: r */
    public final C10253f m1144r() {
        if (m1151k() == 180) {
            return this;
        }
        EnumC10286a enumC10286a = EnumC10286a.YEAR;
        int i = this.f20603a;
        long j = i;
        enumC10286a.m1086f(j);
        EnumC10286a.DAY_OF_YEAR.m1086f(180);
        C10250h.f20596a.getClass();
        boolean m1157a = C10250h.m1157a(j);
        EnumC10280j m1096g = EnumC10280j.m1096g(6);
        int m1097f = m1096g.m1097f(m1157a);
        int i2 = AbstractC10279i.f20668a[m1096g.ordinal()];
        if (180 > (m1097f + (i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : m1157a ? 29 : 28)) - 1) {
            m1096g = m1096g.m1095h();
        }
        return new C10253f(i, m1096g.ordinal() + 1, (180 - m1096g.m1097f(m1157a)) + 1);
    }

    public final String toString() {
        int i;
        int i2 = this.f20603a;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        short s = this.f20604b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.f20605c;
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }
}
