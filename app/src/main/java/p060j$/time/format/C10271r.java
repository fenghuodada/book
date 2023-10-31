package p060j$.time.format;

import java.util.Locale;
import p060j$.time.AbstractC10282l;
import p060j$.time.C10241b;
import p060j$.time.C10253f;
import p060j$.time.C10285o;
import p060j$.time.Instant;
import p060j$.time.ZoneOffset;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10249g;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;
import p060j$.time.zone.C10305c;
import p060j$.util.AbstractC10331a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.r */
/* loaded from: classes2.dex */
public final class C10271r {

    /* renamed from: a */
    private InterfaceC10296k f20651a;

    /* renamed from: b */
    private DateTimeFormatter f20652b;

    /* renamed from: c */
    private int f20653c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10271r(InterfaceC10296k interfaceC10296k, DateTimeFormatter dateTimeFormatter) {
        EnumC10286a[] values;
        Instant m1179k;
        InterfaceC10249g m1142b = dateTimeFormatter.m1142b();
        AbstractC10282l m1139e = dateTimeFormatter.m1139e();
        if (m1142b != null || m1139e != null) {
            InterfaceC10249g interfaceC10249g = (InterfaceC10249g) interfaceC10296k.mo1065d(AbstractC10295j.m1075d());
            AbstractC10282l abstractC10282l = (AbstractC10282l) interfaceC10296k.mo1065d(AbstractC10295j.m1069j());
            C10253f c10253f = null;
            m1142b = AbstractC10331a.m1003u(m1142b, interfaceC10249g) ? null : m1142b;
            m1139e = AbstractC10331a.m1003u(m1139e, abstractC10282l) ? null : m1139e;
            if (m1142b != null || m1139e != null) {
                InterfaceC10249g interfaceC10249g2 = m1142b != null ? m1142b : interfaceC10249g;
                if (m1139e != null) {
                    EnumC10286a enumC10286a = EnumC10286a.INSTANT_SECONDS;
                    if (interfaceC10296k.mo1067b(enumC10286a)) {
                        interfaceC10249g2 = interfaceC10249g2 == null ? C10250h.f20596a : interfaceC10249g2;
                        Instant instant = Instant.f20578c;
                        if (interfaceC10296k instanceof Instant) {
                            m1179k = (Instant) interfaceC10296k;
                        } else {
                            try {
                                m1179k = Instant.m1179k(interfaceC10296k.mo1066c(enumC10286a), interfaceC10296k.mo1064e(EnumC10286a.NANO_OF_SECOND));
                            } catch (C10241b e) {
                                throw new C10241b("Unable to obtain Instant from TemporalAccessor: " + interfaceC10296k + " of type " + interfaceC10296k.getClass().getName(), e);
                            }
                        }
                        ((C10250h) interfaceC10249g2).getClass();
                        interfaceC10296k = C10285o.m1092g(m1179k, m1139e);
                    } else {
                        ZoneOffset zoneOffset = (ZoneOffset) m1139e;
                        C10305c m1043c = C10305c.m1043c(zoneOffset);
                        if ((m1043c.m1044b() ? m1043c.m1045a(Instant.f20578c) : m1139e) instanceof ZoneOffset) {
                            EnumC10286a enumC10286a2 = EnumC10286a.OFFSET_SECONDS;
                            if (interfaceC10296k.mo1067b(enumC10286a2) && interfaceC10296k.mo1064e(enumC10286a2) != C10305c.m1043c(zoneOffset).m1045a(Instant.f20578c).m1168g()) {
                                throw new C10241b("Unable to apply override zone '" + m1139e + "' because the temporal object being formatted has a different offset but does not represent an instant: " + interfaceC10296k);
                            }
                        }
                    }
                }
                abstractC10282l = m1139e != null ? m1139e : abstractC10282l;
                if (m1142b != null) {
                    if (interfaceC10296k.mo1067b(EnumC10286a.EPOCH_DAY)) {
                        ((C10250h) interfaceC10249g2).getClass();
                        c10253f = C10253f.m1154h(interfaceC10296k);
                    } else if (m1142b != C10250h.f20596a || interfaceC10249g != null) {
                        for (EnumC10286a enumC10286a3 : EnumC10286a.values()) {
                            if (enumC10286a3.isDateBased() && interfaceC10296k.mo1067b(enumC10286a3)) {
                                throw new C10241b("Unable to apply override chronology '" + m1142b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC10296k);
                            }
                        }
                    }
                }
                interfaceC10296k = new C10270q(c10253f, interfaceC10296k, interfaceC10249g2, abstractC10282l);
            }
        }
        this.f20651a = interfaceC10296k;
        this.f20652b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1112a() {
        this.f20653c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C10273t m1111b() {
        return this.f20652b.m1141c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale m1110c() {
        return this.f20652b.m1140d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final InterfaceC10296k m1109d() {
        return this.f20651a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long m1108e(InterfaceC10297l interfaceC10297l) {
        try {
            return Long.valueOf(this.f20651a.mo1066c(interfaceC10297l));
        } catch (C10241b e) {
            if (this.f20653c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object m1107f(InterfaceC10299n interfaceC10299n) {
        Object mo1065d = this.f20651a.mo1065d(interfaceC10299n);
        if (mo1065d == null && this.f20653c == 0) {
            throw new C10241b("Unable to extract value: " + this.f20651a.getClass());
        }
        return mo1065d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m1106g() {
        this.f20653c++;
    }

    public final String toString() {
        return this.f20651a.toString();
    }
}
