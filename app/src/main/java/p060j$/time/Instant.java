package p060j$.time;

import com.applovin.mediation.MaxErrorCode;
import java.io.Serializable;
import p060j$.time.format.DateTimeFormatter;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.Instant */
/* loaded from: classes2.dex */
public final class Instant implements InterfaceC10296k, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f20578c = new Instant(0, 0);

    /* renamed from: a */
    private final long f20579a;

    /* renamed from: b */
    private final int f20580b;

    static {
        m1179k(-31557014167219200L, 0L);
        m1179k(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.f20579a = j;
        this.f20580b = i;
    }

    /* renamed from: g */
    private static Instant m1183g(long j, int i) {
        if ((i | j) == 0) {
            return f20578c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C10241b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    /* renamed from: j */
    public static Instant m1180j(long j) {
        return m1183g(AbstractC10240a.m1160g(j, 1000L), ((int) AbstractC10240a.m1162e(j, 1000L)) * 1000000);
    }

    /* renamed from: k */
    public static Instant m1179k(long j, long j2) {
        return m1183g(AbstractC10240a.m1163d(j, AbstractC10240a.m1160g(j2, 1000000000L)), (int) AbstractC10240a.m1162e(j2, 1000000000L));
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return AbstractC10295j.m1076c(this, interfaceC10297l);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m1169g(this, zoneOffset);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.INSTANT_SECONDS || interfaceC10297l == EnumC10286a.NANO_OF_SECOND || interfaceC10297l == EnumC10286a.MICRO_OF_SECOND || interfaceC10297l == EnumC10286a.MILLI_OF_SECOND : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        int i;
        if (interfaceC10297l instanceof EnumC10286a) {
            int i2 = AbstractC10251d.f20597a[((EnumC10286a) interfaceC10297l).ordinal()];
            int i3 = this.f20580b;
            if (i2 != 1) {
                if (i2 == 2) {
                    i = i3 / 1000;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        return this.f20579a;
                    }
                    throw new C10301p("Unsupported field: " + interfaceC10297l);
                } else {
                    i = i3 / 1000000;
                }
                return i;
            }
            return i3;
        }
        return interfaceC10297l.mo1060d(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1071h()) {
            return EnumC10287b.NANOS;
        }
        if (interfaceC10299n == AbstractC10295j.m1075d() || interfaceC10299n == AbstractC10295j.m1069j() || interfaceC10299n == AbstractC10295j.m1070i() || interfaceC10299n == AbstractC10295j.m1072g() || interfaceC10299n == AbstractC10295j.m1074e() || interfaceC10299n == AbstractC10295j.m1073f()) {
            return null;
        }
        return interfaceC10299n.mo1059a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        if (enumC10286a instanceof EnumC10286a) {
            int i = AbstractC10251d.f20597a[enumC10286a.ordinal()];
            int i2 = this.f20580b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            EnumC10286a.INSTANT_SECONDS.m1087e(this.f20579a);
                        }
                        throw new C10301p("Unsupported field: " + enumC10286a);
                    }
                    return i2 / 1000000;
                }
                return i2 / 1000;
            }
            return i2;
        }
        return AbstractC10295j.m1076c(this, enumC10286a).m1058a(mo1066c(enumC10286a), enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f20579a == instant.f20579a && this.f20580b == instant.f20580b;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f20579a, instant.f20579a);
        return compare != 0 ? compare : this.f20580b - instant.f20580b;
    }

    /* renamed from: h */
    public final long m1182h() {
        return this.f20579a;
    }

    public final int hashCode() {
        long j = this.f20579a;
        return (this.f20580b * 51) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: i */
    public final int m1181i() {
        return this.f20580b;
    }

    public long toEpochMilli() {
        long m1161f;
        int i;
        long j = this.f20579a;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = this.f20580b;
        if (i2 >= 0 || i3 <= 0) {
            m1161f = AbstractC10240a.m1161f(j);
            i = i3 / 1000000;
        } else {
            m1161f = AbstractC10240a.m1161f(j + 1);
            i = (i3 / 1000000) + MaxErrorCode.NETWORK_ERROR;
        }
        return AbstractC10240a.m1163d(m1161f, i);
    }

    public final String toString() {
        return DateTimeFormatter.f20606f.m1143a(this);
    }
}
