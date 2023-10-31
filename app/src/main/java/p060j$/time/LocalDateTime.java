package p060j$.time;

import java.io.Serializable;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10244b;
import p060j$.time.chrono.InterfaceC10245c;
import p060j$.time.format.DateTimeFormatter;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.LocalDateTime */
/* loaded from: classes2.dex */
public final class LocalDateTime implements InterfaceC10296k, InterfaceC10245c, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f20581c;

    /* renamed from: d */
    public static final LocalDateTime f20582d;

    /* renamed from: a */
    private final C10253f f20583a;

    /* renamed from: b */
    private final C10278h f20584b;

    static {
        C10253f c10253f = C10253f.f20601d;
        C10278h c10278h = C10278h.f20661e;
        if (c10253f == null) {
            throw new NullPointerException("date");
        }
        if (c10278h == null) {
            throw new NullPointerException("time");
        }
        f20581c = new LocalDateTime(c10253f, c10278h);
        C10253f c10253f2 = C10253f.f20602e;
        C10278h c10278h2 = C10278h.f20662f;
        if (c10253f2 == null) {
            throw new NullPointerException("date");
        }
        if (c10278h2 == null) {
            throw new NullPointerException("time");
        }
        f20582d = new LocalDateTime(c10253f2, c10278h2);
    }

    private LocalDateTime(C10253f c10253f, C10278h c10278h) {
        this.f20583a = c10253f;
        this.f20584b = c10278h;
    }

    /* renamed from: i */
    public static LocalDateTime m1175i(long j, int i, ZoneOffset zoneOffset) {
        long m1168g;
        if (zoneOffset != null) {
            long j2 = i;
            EnumC10286a.NANO_OF_SECOND.m1086f(j2);
            return new LocalDateTime(C10253f.m1147o(AbstractC10240a.m1160g(j + zoneOffset.m1168g(), 86400L)), C10278h.m1100j((((int) AbstractC10240a.m1162e(m1168g, 86400L)) * 1000000000) + j2));
        }
        throw new NullPointerException("offset");
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l instanceof EnumC10286a) {
            if (((EnumC10286a) interfaceC10297l).isTimeBased()) {
                C10278h c10278h = this.f20584b;
                c10278h.getClass();
                return AbstractC10295j.m1076c(c10278h, interfaceC10297l);
            }
            return this.f20583a.mo1068a(interfaceC10297l);
        }
        return interfaceC10297l.mo1062b(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        if (!(interfaceC10297l instanceof EnumC10286a)) {
            return interfaceC10297l != null && interfaceC10297l.mo1063a(this);
        }
        EnumC10286a enumC10286a = (EnumC10286a) interfaceC10297l;
        return enumC10286a.isDateBased() || enumC10286a.isTimeBased();
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? ((EnumC10286a) interfaceC10297l).isTimeBased() ? this.f20584b.mo1066c(interfaceC10297l) : this.f20583a.mo1066c(interfaceC10297l) : interfaceC10297l.mo1060d(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1074e()) {
            return this.f20583a;
        }
        if (interfaceC10299n == AbstractC10295j.m1069j() || interfaceC10299n == AbstractC10295j.m1070i() || interfaceC10299n == AbstractC10295j.m1072g()) {
            return null;
        }
        if (interfaceC10299n == AbstractC10295j.m1073f()) {
            return this.f20584b;
        }
        if (interfaceC10299n != AbstractC10295j.m1075d()) {
            return interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.NANOS : interfaceC10299n.mo1059a(this);
        }
        ((C10253f) m1172l()).getClass();
        return C10250h.f20596a;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        return enumC10286a instanceof EnumC10286a ? enumC10286a.isTimeBased() ? this.f20584b.mo1064e(enumC10286a) : this.f20583a.mo1064e(enumC10286a) : AbstractC10295j.m1078a(this, enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f20583a.equals(localDateTime.f20583a) && this.f20584b.equals(localDateTime.f20584b);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(InterfaceC10245c interfaceC10245c) {
        boolean z = interfaceC10245c instanceof LocalDateTime;
        C10278h c10278h = this.f20584b;
        C10253f c10253f = this.f20583a;
        if (z) {
            LocalDateTime localDateTime = (LocalDateTime) interfaceC10245c;
            int m1155g = c10253f.m1155g(localDateTime.f20583a);
            return m1155g == 0 ? c10278h.compareTo(localDateTime.f20584b) : m1155g;
        }
        LocalDateTime localDateTime2 = (LocalDateTime) interfaceC10245c;
        int compareTo = c10253f.compareTo(localDateTime2.f20583a);
        if (compareTo == 0) {
            int compareTo2 = c10278h.compareTo(localDateTime2.f20584b);
            if (compareTo2 == 0) {
                ((C10253f) m1172l()).getClass();
                C10250h c10250h = C10250h.f20596a;
                ((C10253f) localDateTime2.m1172l()).getClass();
                c10250h.getClass();
                c10250h.getClass();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return dateTimeFormatter.m1143a(this);
        }
        throw new NullPointerException("formatter");
    }

    /* renamed from: g */
    public final int m1177g() {
        return this.f20584b.m1101i();
    }

    /* renamed from: h */
    public final int m1176h() {
        return this.f20583a.m1150l();
    }

    public final int hashCode() {
        return this.f20583a.hashCode() ^ this.f20584b.hashCode();
    }

    /* renamed from: j */
    public final long m1174j(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return ((((C10253f) m1172l()).m1145q() * 86400) + m1171m().m1098l()) - zoneOffset.m1168g();
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: k */
    public final C10253f m1173k() {
        return this.f20583a;
    }

    /* renamed from: l */
    public final InterfaceC10244b m1172l() {
        return this.f20583a;
    }

    /* renamed from: m */
    public final C10278h m1171m() {
        return this.f20584b;
    }

    public final String toString() {
        return this.f20583a.toString() + 'T' + this.f20584b.toString();
    }
}
