package p060j$.time;

import java.io.Serializable;
import p060j$.time.chrono.AbstractC10246d;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10248f;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;
import p060j$.time.zone.C10305c;

/* renamed from: j$.time.o */
/* loaded from: classes2.dex */
public final class C10285o implements InterfaceC10296k, InterfaceC10248f, Serializable {

    /* renamed from: a */
    private final LocalDateTime f20673a;

    /* renamed from: b */
    private final ZoneOffset f20674b;

    /* renamed from: c */
    private final AbstractC10282l f20675c;

    private C10285o(LocalDateTime localDateTime, ZoneOffset zoneOffset, AbstractC10282l abstractC10282l) {
        this.f20673a = localDateTime;
        this.f20674b = zoneOffset;
        this.f20675c = abstractC10282l;
    }

    /* renamed from: g */
    public static C10285o m1092g(Instant instant, AbstractC10282l abstractC10282l) {
        if (instant != null) {
            long m1182h = instant.m1182h();
            int m1181i = instant.m1181i();
            ZoneOffset m1045a = C10305c.m1043c((ZoneOffset) abstractC10282l).m1045a(Instant.m1179k(m1182h, m1181i));
            return new C10285o(LocalDateTime.m1175i(m1182h, m1181i, m1045a), m1045a, abstractC10282l);
        }
        throw new NullPointerException("instant");
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? (interfaceC10297l == EnumC10286a.INSTANT_SECONDS || interfaceC10297l == EnumC10286a.OFFSET_SECONDS) ? interfaceC10297l.mo1061c() : this.f20673a.mo1068a(interfaceC10297l) : interfaceC10297l.mo1062b(this);
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
            int i = AbstractC10284n.f20672a[((EnumC10286a) interfaceC10297l).ordinal()];
            return i != 1 ? i != 2 ? this.f20673a.mo1066c(interfaceC10297l) : this.f20674b.m1168g() : m1091h();
        }
        return interfaceC10297l.mo1060d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10285o c10285o = (C10285o) ((InterfaceC10248f) obj);
        int compare = Long.compare(m1091h(), c10285o.m1091h());
        if (compare == 0) {
            int m1102h = m1088k().m1102h() - c10285o.m1088k().m1102h();
            if (m1102h == 0) {
                int compareTo = this.f20673a.compareTo(c10285o.f20673a);
                if (compareTo == 0) {
                    int compareTo2 = this.f20675c.mo1094f().compareTo(c10285o.f20675c.mo1094f());
                    if (compareTo2 == 0) {
                        m1090i().getClass();
                        C10250h c10250h = C10250h.f20596a;
                        c10285o.m1090i().getClass();
                        c10250h.getClass();
                        c10250h.getClass();
                        return 0;
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return m1102h;
        }
        return compare;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        if (interfaceC10299n == AbstractC10295j.m1074e()) {
            return m1090i();
        }
        if (interfaceC10299n == AbstractC10295j.m1070i() || interfaceC10299n == AbstractC10295j.m1069j()) {
            return this.f20675c;
        }
        if (interfaceC10299n == AbstractC10295j.m1072g()) {
            return this.f20674b;
        }
        if (interfaceC10299n == AbstractC10295j.m1073f()) {
            return m1088k();
        }
        if (interfaceC10299n != AbstractC10295j.m1075d()) {
            return interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.NANOS : interfaceC10299n.mo1059a(this);
        }
        m1090i().getClass();
        return C10250h.f20596a;
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        if (enumC10286a instanceof EnumC10286a) {
            int i = AbstractC10284n.f20672a[enumC10286a.ordinal()];
            if (i != 1) {
                return i != 2 ? this.f20673a.mo1064e(enumC10286a) : this.f20674b.m1168g();
            }
            throw new C10301p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC10246d.m1158a(this, enumC10286a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10285o) {
            C10285o c10285o = (C10285o) obj;
            return this.f20673a.equals(c10285o.f20673a) && this.f20674b.equals(c10285o.f20674b) && this.f20675c.equals(c10285o.f20675c);
        }
        return false;
    }

    /* renamed from: f */
    public final ZoneOffset m1093f() {
        return this.f20674b;
    }

    /* renamed from: h */
    public final long m1091h() {
        return ((m1090i().m1145q() * 86400) + m1088k().m1098l()) - m1093f().m1168g();
    }

    public final int hashCode() {
        return (this.f20673a.hashCode() ^ this.f20674b.hashCode()) ^ Integer.rotateLeft(this.f20675c.hashCode(), 3);
    }

    /* renamed from: i */
    public final C10253f m1090i() {
        return this.f20673a.m1173k();
    }

    /* renamed from: j */
    public final LocalDateTime m1089j() {
        return this.f20673a;
    }

    /* renamed from: k */
    public final C10278h m1088k() {
        return this.f20673a.m1171m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20673a.toString());
        ZoneOffset zoneOffset = this.f20674b;
        sb.append(zoneOffset.toString());
        String sb2 = sb.toString();
        AbstractC10282l abstractC10282l = this.f20675c;
        if (zoneOffset != abstractC10282l) {
            return sb2 + '[' + abstractC10282l.toString() + ']';
        }
        return sb2;
    }
}
