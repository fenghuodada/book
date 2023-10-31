package p060j$.time;

import java.io.Serializable;
import p060j$.time.chrono.C10250h;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10298m;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;
import p060j$.time.zone.C10305c;

/* renamed from: j$.time.OffsetDateTime */
/* loaded from: classes2.dex */
public final class OffsetDateTime implements InterfaceC10296k, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a */
    private final LocalDateTime f20585a;

    /* renamed from: b */
    private final ZoneOffset f20586b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f20581c;
        ZoneOffset zoneOffset = ZoneOffset.f20590f;
        localDateTime.getClass();
        m1170f(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f20582d;
        ZoneOffset zoneOffset2 = ZoneOffset.f20589e;
        localDateTime2.getClass();
        m1170f(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f20585a = localDateTime;
        if (zoneOffset == null) {
            throw new NullPointerException("offset");
        }
        this.f20586b = zoneOffset;
    }

    /* renamed from: f */
    public static OffsetDateTime m1170f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: g */
    public static OffsetDateTime m1169g(Instant instant, AbstractC10282l abstractC10282l) {
        if (instant != null) {
            if (abstractC10282l != null) {
                ZoneOffset m1045a = C10305c.m1043c((ZoneOffset) abstractC10282l).m1045a(instant);
                return new OffsetDateTime(LocalDateTime.m1175i(instant.m1182h(), instant.m1181i(), m1045a), m1045a);
            }
            throw new NullPointerException("zone");
        }
        throw new NullPointerException("instant");
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? (interfaceC10297l == EnumC10286a.INSTANT_SECONDS || interfaceC10297l == EnumC10286a.OFFSET_SECONDS) ? interfaceC10297l.mo1061c() : this.f20585a.mo1068a(interfaceC10297l) : interfaceC10297l.mo1062b(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return (interfaceC10297l instanceof EnumC10286a) || (interfaceC10297l != null && interfaceC10297l.mo1063a(this));
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l instanceof EnumC10286a) {
            int i = AbstractC10281k.f20671a[((EnumC10286a) interfaceC10297l).ordinal()];
            ZoneOffset zoneOffset = this.f20586b;
            LocalDateTime localDateTime = this.f20585a;
            return i != 1 ? i != 2 ? localDateTime.mo1066c(interfaceC10297l) : zoneOffset.m1168g() : localDateTime.m1174j(zoneOffset);
        }
        return interfaceC10297l.mo1060d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int m1102h;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f20586b;
        ZoneOffset zoneOffset2 = this.f20586b;
        if (zoneOffset2.equals(zoneOffset)) {
            m1102h = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f20585a;
            long m1174j = localDateTime.m1174j(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.f20586b;
            LocalDateTime localDateTime2 = offsetDateTime2.f20585a;
            int compare = Long.compare(m1174j, localDateTime2.m1174j(zoneOffset3));
            m1102h = compare == 0 ? localDateTime.m1171m().m1102h() - localDateTime2.m1171m().m1102h() : compare;
        }
        return m1102h == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : m1102h;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1072g() || interfaceC10299n == AbstractC10295j.m1070i()) {
            return this.f20586b;
        }
        if (interfaceC10299n == AbstractC10295j.m1069j()) {
            return null;
        }
        C10298m m1074e = AbstractC10295j.m1074e();
        LocalDateTime localDateTime = this.f20585a;
        return interfaceC10299n == m1074e ? localDateTime.m1173k() : interfaceC10299n == AbstractC10295j.m1073f() ? localDateTime.m1171m() : interfaceC10299n == AbstractC10295j.m1075d() ? C10250h.f20596a : interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.NANOS : interfaceC10299n.mo1059a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        if (enumC10286a instanceof EnumC10286a) {
            int i = AbstractC10281k.f20671a[enumC10286a.ordinal()];
            if (i != 1) {
                return i != 2 ? this.f20585a.mo1064e(enumC10286a) : this.f20586b.m1168g();
            }
            throw new C10301p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC10295j.m1078a(this, enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f20585a.equals(offsetDateTime.f20585a) && this.f20586b.equals(offsetDateTime.f20586b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20585a.hashCode() ^ this.f20586b.hashCode();
    }

    public LocalDateTime toLocalDateTime() {
        return this.f20585a;
    }

    public final String toString() {
        return this.f20585a.toString() + this.f20586b.toString();
    }
}
