package p060j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import p060j$.time.AbstractC10282l;
import p060j$.time.C10241b;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10249g;
import p060j$.time.temporal.AbstractC10294i;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;

/* renamed from: j$.time.format.DateTimeFormatter */
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: f */
    public static final DateTimeFormatter f20606f;

    /* renamed from: a */
    private final C10259f f20607a;

    /* renamed from: b */
    private final Locale f20608b;

    /* renamed from: c */
    private final C10273t f20609c;

    /* renamed from: d */
    private final InterfaceC10249g f20610d;

    /* renamed from: e */
    private final AbstractC10282l f20611e;

    static {
        C10269p c10269p = new C10269p();
        EnumC10286a enumC10286a = EnumC10286a.YEAR;
        EnumC10275v enumC10275v = EnumC10275v.EXCEEDS_PAD;
        c10269p.m1122j(enumC10286a, 4, 10, enumC10275v);
        c10269p.m1127e('-');
        EnumC10286a enumC10286a2 = EnumC10286a.MONTH_OF_YEAR;
        c10269p.m1120l(enumC10286a2, 2);
        c10269p.m1127e('-');
        EnumC10286a enumC10286a3 = EnumC10286a.DAY_OF_MONTH;
        c10269p.m1120l(enumC10286a3, 2);
        EnumC10274u enumC10274u = EnumC10274u.STRICT;
        C10250h c10250h = C10250h.f20596a;
        DateTimeFormatter m1113s = c10269p.m1113s(enumC10274u, c10250h);
        ISO_LOCAL_DATE = m1113s;
        C10269p c10269p2 = new C10269p();
        c10269p2.m1116p();
        c10269p2.m1131a(m1113s);
        c10269p2.m1124h();
        c10269p2.m1113s(enumC10274u, c10250h);
        C10269p c10269p3 = new C10269p();
        c10269p3.m1116p();
        c10269p3.m1131a(m1113s);
        c10269p3.m1117o();
        c10269p3.m1124h();
        c10269p3.m1113s(enumC10274u, c10250h);
        C10269p c10269p4 = new C10269p();
        EnumC10286a enumC10286a4 = EnumC10286a.HOUR_OF_DAY;
        c10269p4.m1120l(enumC10286a4, 2);
        c10269p4.m1127e(':');
        EnumC10286a enumC10286a5 = EnumC10286a.MINUTE_OF_HOUR;
        c10269p4.m1120l(enumC10286a5, 2);
        c10269p4.m1117o();
        c10269p4.m1127e(':');
        EnumC10286a enumC10286a6 = EnumC10286a.SECOND_OF_MINUTE;
        c10269p4.m1120l(enumC10286a6, 2);
        c10269p4.m1117o();
        c10269p4.m1130b(EnumC10286a.NANO_OF_SECOND);
        DateTimeFormatter m1113s2 = c10269p4.m1113s(enumC10274u, null);
        C10269p c10269p5 = new C10269p();
        c10269p5.m1116p();
        c10269p5.m1131a(m1113s2);
        c10269p5.m1124h();
        c10269p5.m1113s(enumC10274u, null);
        C10269p c10269p6 = new C10269p();
        c10269p6.m1116p();
        c10269p6.m1131a(m1113s2);
        c10269p6.m1117o();
        c10269p6.m1124h();
        c10269p6.m1113s(enumC10274u, null);
        C10269p c10269p7 = new C10269p();
        c10269p7.m1116p();
        c10269p7.m1131a(m1113s);
        c10269p7.m1127e('T');
        c10269p7.m1131a(m1113s2);
        DateTimeFormatter m1113s3 = c10269p7.m1113s(enumC10274u, c10250h);
        C10269p c10269p8 = new C10269p();
        c10269p8.m1116p();
        c10269p8.m1131a(m1113s3);
        c10269p8.m1124h();
        DateTimeFormatter m1113s4 = c10269p8.m1113s(enumC10274u, c10250h);
        C10269p c10269p9 = new C10269p();
        c10269p9.m1131a(m1113s4);
        c10269p9.m1117o();
        c10269p9.m1127e('[');
        c10269p9.m1115q();
        c10269p9.m1119m();
        c10269p9.m1127e(']');
        c10269p9.m1113s(enumC10274u, c10250h);
        C10269p c10269p10 = new C10269p();
        c10269p10.m1131a(m1113s3);
        c10269p10.m1117o();
        c10269p10.m1124h();
        c10269p10.m1117o();
        c10269p10.m1127e('[');
        c10269p10.m1115q();
        c10269p10.m1119m();
        c10269p10.m1127e(']');
        c10269p10.m1113s(enumC10274u, c10250h);
        C10269p c10269p11 = new C10269p();
        c10269p11.m1116p();
        c10269p11.m1122j(enumC10286a, 4, 10, enumC10275v);
        c10269p11.m1127e('-');
        c10269p11.m1120l(EnumC10286a.DAY_OF_YEAR, 3);
        c10269p11.m1117o();
        c10269p11.m1124h();
        c10269p11.m1113s(enumC10274u, c10250h);
        C10269p c10269p12 = new C10269p();
        c10269p12.m1116p();
        c10269p12.m1122j(AbstractC10294i.f20687c, 4, 10, enumC10275v);
        c10269p12.m1126f("-W");
        c10269p12.m1120l(AbstractC10294i.f20686b, 2);
        c10269p12.m1127e('-');
        EnumC10286a enumC10286a7 = EnumC10286a.DAY_OF_WEEK;
        c10269p12.m1120l(enumC10286a7, 1);
        c10269p12.m1117o();
        c10269p12.m1124h();
        c10269p12.m1113s(enumC10274u, c10250h);
        C10269p c10269p13 = new C10269p();
        c10269p13.m1116p();
        c10269p13.m1129c();
        f20606f = c10269p13.m1113s(enumC10274u, null);
        C10269p c10269p14 = new C10269p();
        c10269p14.m1116p();
        c10269p14.m1120l(enumC10286a, 4);
        c10269p14.m1120l(enumC10286a2, 2);
        c10269p14.m1120l(enumC10286a3, 2);
        c10269p14.m1117o();
        c10269p14.m1125g("+HHMMss", "Z");
        c10269p14.m1113s(enumC10274u, c10250h);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C10269p c10269p15 = new C10269p();
        c10269p15.m1116p();
        c10269p15.m1114r();
        c10269p15.m1117o();
        c10269p15.m1123i(enumC10286a7, hashMap);
        c10269p15.m1126f(", ");
        c10269p15.m1118n();
        c10269p15.m1122j(enumC10286a3, 1, 2, EnumC10275v.NOT_NEGATIVE);
        c10269p15.m1127e(' ');
        c10269p15.m1123i(enumC10286a2, hashMap2);
        c10269p15.m1127e(' ');
        c10269p15.m1120l(enumC10286a, 4);
        c10269p15.m1127e(' ');
        c10269p15.m1120l(enumC10286a4, 2);
        c10269p15.m1127e(':');
        c10269p15.m1120l(enumC10286a5, 2);
        c10269p15.m1117o();
        c10269p15.m1127e(':');
        c10269p15.m1120l(enumC10286a6, 2);
        c10269p15.m1118n();
        c10269p15.m1127e(' ');
        c10269p15.m1125g("+HHMM", "GMT");
        c10269p15.m1113s(EnumC10274u.SMART, c10250h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C10259f c10259f, Locale locale, EnumC10274u enumC10274u, C10250h c10250h) {
        C10273t c10273t = C10273t.f20655a;
        this.f20607a = c10259f;
        this.f20608b = locale;
        this.f20609c = c10273t;
        if (enumC10274u == null) {
            throw new NullPointerException("resolverStyle");
        }
        this.f20610d = c10250h;
        this.f20611e = null;
    }

    /* renamed from: a */
    public final String m1143a(InterfaceC10296k interfaceC10296k) {
        StringBuilder sb = new StringBuilder(32);
        if (interfaceC10296k != null) {
            try {
                this.f20607a.mo1132a(new C10271r(interfaceC10296k, this), sb);
                return sb.toString();
            } catch (IOException e) {
                throw new C10241b(e.getMessage(), e);
            }
        }
        throw new NullPointerException("temporal");
    }

    /* renamed from: b */
    public final InterfaceC10249g m1142b() {
        return this.f20610d;
    }

    /* renamed from: c */
    public final C10273t m1141c() {
        return this.f20609c;
    }

    /* renamed from: d */
    public final Locale m1140d() {
        return this.f20608b;
    }

    /* renamed from: e */
    public final AbstractC10282l m1139e() {
        return this.f20611e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C10259f m1138f() {
        return this.f20607a.m1136b();
    }

    public final String toString() {
        String c10259f = this.f20607a.toString();
        return c10259f.startsWith("[") ? c10259f : c10259f.substring(1, c10259f.length() - 1);
    }
}
