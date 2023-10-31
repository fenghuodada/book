package p060j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p060j$.time.AbstractC10282l;
import p060j$.time.ZoneOffset;
import p060j$.time.chrono.C10250h;
import p060j$.time.temporal.AbstractC10294i;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.format.p */
/* loaded from: classes2.dex */
public final class C10269p {

    /* renamed from: f */
    private static final C10254a f20640f = new InterfaceC10299n() { // from class: j$.time.format.a
        @Override // p060j$.time.temporal.InterfaceC10299n
        /* renamed from: a */
        public final Object mo1059a(InterfaceC10296k interfaceC10296k) {
            int i = C10269p.f20641g;
            AbstractC10282l abstractC10282l = (AbstractC10282l) interfaceC10296k.mo1065d(AbstractC10295j.m1069j());
            if (abstractC10282l == null || (abstractC10282l instanceof ZoneOffset)) {
                return null;
            }
            return abstractC10282l;
        }
    };

    /* renamed from: g */
    public static final /* synthetic */ int f20641g = 0;

    /* renamed from: a */
    private C10269p f20642a;

    /* renamed from: b */
    private final C10269p f20643b;

    /* renamed from: c */
    private final ArrayList f20644c;

    /* renamed from: d */
    private final boolean f20645d;

    /* renamed from: e */
    private int f20646e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', EnumC10286a.ERA);
        hashMap.put('y', EnumC10286a.YEAR_OF_ERA);
        hashMap.put('u', EnumC10286a.YEAR);
        InterfaceC10297l interfaceC10297l = AbstractC10294i.f20685a;
        hashMap.put('Q', interfaceC10297l);
        hashMap.put('q', interfaceC10297l);
        EnumC10286a enumC10286a = EnumC10286a.MONTH_OF_YEAR;
        hashMap.put('M', enumC10286a);
        hashMap.put('L', enumC10286a);
        hashMap.put('D', EnumC10286a.DAY_OF_YEAR);
        hashMap.put('d', EnumC10286a.DAY_OF_MONTH);
        hashMap.put('F', EnumC10286a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC10286a enumC10286a2 = EnumC10286a.DAY_OF_WEEK;
        hashMap.put('E', enumC10286a2);
        hashMap.put('c', enumC10286a2);
        hashMap.put('e', enumC10286a2);
        hashMap.put('a', EnumC10286a.AMPM_OF_DAY);
        hashMap.put('H', EnumC10286a.HOUR_OF_DAY);
        hashMap.put('k', EnumC10286a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC10286a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC10286a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC10286a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC10286a.SECOND_OF_MINUTE);
        EnumC10286a enumC10286a3 = EnumC10286a.NANO_OF_SECOND;
        hashMap.put('S', enumC10286a3);
        hashMap.put('A', EnumC10286a.MILLI_OF_DAY);
        hashMap.put('n', enumC10286a3);
        hashMap.put('N', EnumC10286a.NANO_OF_DAY);
    }

    public C10269p() {
        this.f20642a = this;
        this.f20644c = new ArrayList();
        this.f20646e = -1;
        this.f20643b = null;
        this.f20645d = false;
    }

    private C10269p(C10269p c10269p) {
        this.f20642a = this;
        this.f20644c = new ArrayList();
        this.f20646e = -1;
        this.f20643b = c10269p;
        this.f20645d = true;
    }

    /* renamed from: d */
    private int m1128d(InterfaceC10260g interfaceC10260g) {
        if (interfaceC10260g != null) {
            C10269p c10269p = this.f20642a;
            c10269p.getClass();
            c10269p.f20644c.add(interfaceC10260g);
            C10269p c10269p2 = this.f20642a;
            c10269p2.f20646e = -1;
            return c10269p2.f20644c.size() - 1;
        }
        throw new NullPointerException("pp");
    }

    /* renamed from: k */
    private void m1121k(C10263j c10263j) {
        C10263j m1134c;
        EnumC10275v enumC10275v;
        C10269p c10269p = this.f20642a;
        int i = c10269p.f20646e;
        if (i < 0) {
            c10269p.f20646e = m1128d(c10263j);
            return;
        }
        C10263j c10263j2 = (C10263j) c10269p.f20644c.get(i);
        int i2 = c10263j.f20625b;
        int i3 = c10263j.f20626c;
        if (i2 == i3) {
            enumC10275v = c10263j.f20627d;
            if (enumC10275v == EnumC10275v.NOT_NEGATIVE) {
                m1134c = c10263j2.m1133d(i3);
                m1128d(c10263j.m1134c());
                this.f20642a.f20646e = i;
                this.f20642a.f20644c.set(i, m1134c);
            }
        }
        m1134c = c10263j2.m1134c();
        this.f20642a.f20646e = m1128d(c10263j);
        this.f20642a.f20644c.set(i, m1134c);
    }

    /* renamed from: a */
    public final void m1131a(DateTimeFormatter dateTimeFormatter) {
        m1128d(dateTimeFormatter.m1138f());
    }

    /* renamed from: b */
    public final void m1130b(EnumC10286a enumC10286a) {
        m1128d(new C10261h(enumC10286a));
    }

    /* renamed from: c */
    public final void m1129c() {
        m1128d(new C10262i());
    }

    /* renamed from: e */
    public final void m1127e(char c) {
        m1128d(new C10258e(c));
    }

    /* renamed from: f */
    public final void m1126f(String str) {
        if (str.length() > 0) {
            m1128d(str.length() == 1 ? new C10258e(str.charAt(0)) : new C10266m(str));
        }
    }

    /* renamed from: g */
    public final void m1125g(String str, String str2) {
        m1128d(new C10264k(str, str2));
    }

    /* renamed from: h */
    public final void m1124h() {
        m1128d(C10264k.f20630d);
    }

    /* renamed from: i */
    public final void m1123i(EnumC10286a enumC10286a, HashMap hashMap) {
        if (enumC10286a == null) {
            throw new NullPointerException("field");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        EnumC10276w enumC10276w = EnumC10276w.FULL;
        m1128d(new C10267n(enumC10286a, enumC10276w, new C10255b(new C10272s(Collections.singletonMap(enumC10276w, linkedHashMap)))));
    }

    /* renamed from: j */
    public final C10269p m1122j(InterfaceC10297l interfaceC10297l, int i, int i2, EnumC10275v enumC10275v) {
        if (i == i2 && enumC10275v == EnumC10275v.NOT_NEGATIVE) {
            m1120l(interfaceC10297l, i2);
            return this;
        } else if (interfaceC10297l != null) {
            if (enumC10275v != null) {
                if (i < 1 || i > 19) {
                    throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
                } else if (i2 < 1 || i2 > 19) {
                    throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
                } else if (i2 >= i) {
                    m1121k(new C10263j(interfaceC10297l, i, i2, enumC10275v));
                    return this;
                } else {
                    throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
                }
            }
            throw new NullPointerException("signStyle");
        } else {
            throw new NullPointerException("field");
        }
    }

    /* renamed from: l */
    public final void m1120l(InterfaceC10297l interfaceC10297l, int i) {
        if (interfaceC10297l == null) {
            throw new NullPointerException("field");
        }
        if (i >= 1 && i <= 19) {
            m1121k(new C10263j(interfaceC10297l, i, i, EnumC10275v.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
    }

    /* renamed from: m */
    public final void m1119m() {
        m1128d(new C10268o(f20640f));
    }

    /* renamed from: n */
    public final void m1118n() {
        C10269p c10269p = this.f20642a;
        if (c10269p.f20643b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (c10269p.f20644c.size() <= 0) {
            this.f20642a = this.f20642a.f20643b;
            return;
        }
        C10269p c10269p2 = this.f20642a;
        C10259f c10259f = new C10259f(c10269p2.f20644c, c10269p2.f20645d);
        this.f20642a = this.f20642a.f20643b;
        m1128d(c10259f);
    }

    /* renamed from: o */
    public final void m1117o() {
        C10269p c10269p = this.f20642a;
        c10269p.f20646e = -1;
        this.f20642a = new C10269p(c10269p);
    }

    /* renamed from: p */
    public final void m1116p() {
        m1128d(EnumC10265l.INSENSITIVE);
    }

    /* renamed from: q */
    public final void m1115q() {
        m1128d(EnumC10265l.SENSITIVE);
    }

    /* renamed from: r */
    public final void m1114r() {
        m1128d(EnumC10265l.LENIENT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final DateTimeFormatter m1113s(EnumC10274u enumC10274u, C10250h c10250h) {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            while (this.f20642a.f20643b != null) {
                m1118n();
            }
            C10259f c10259f = new C10259f(this.f20644c, false);
            C10273t c10273t = C10273t.f20655a;
            return new DateTimeFormatter(c10259f, locale, enumC10274u, c10250h);
        }
        throw new NullPointerException("locale");
    }
}
