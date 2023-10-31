package p060j$.time.format;

import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10249g;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.InterfaceC10297l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.n */
/* loaded from: classes2.dex */
public final class C10267n implements InterfaceC10260g {

    /* renamed from: a */
    private final InterfaceC10297l f20635a;

    /* renamed from: b */
    private final EnumC10276w f20636b;

    /* renamed from: c */
    private final C10255b f20637c;

    /* renamed from: d */
    private volatile C10263j f20638d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10267n(EnumC10286a enumC10286a, EnumC10276w enumC10276w, C10255b c10255b) {
        this.f20635a = enumC10286a;
        this.f20636b = enumC10276w;
        this.f20637c = c10255b;
    }

    @Override // p060j$.time.format.InterfaceC10260g
    /* renamed from: a */
    public final boolean mo1132a(C10271r c10271r, StringBuilder sb) {
        String m1105a;
        C10250h c10250h;
        Long m1108e = c10271r.m1108e(this.f20635a);
        if (m1108e == null) {
            return false;
        }
        InterfaceC10249g interfaceC10249g = (InterfaceC10249g) c10271r.m1109d().mo1065d(AbstractC10295j.m1075d());
        if (interfaceC10249g == null || interfaceC10249g == (c10250h = C10250h.f20596a)) {
            C10255b c10255b = this.f20637c;
            long longValue = m1108e.longValue();
            EnumC10276w enumC10276w = this.f20636b;
            c10271r.m1110c();
            m1105a = c10255b.f20614a.m1105a(longValue, enumC10276w);
        } else {
            C10255b c10255b2 = this.f20637c;
            InterfaceC10297l interfaceC10297l = this.f20635a;
            long longValue2 = m1108e.longValue();
            EnumC10276w enumC10276w2 = this.f20636b;
            c10271r.m1110c();
            c10255b2.getClass();
            m1105a = (interfaceC10249g == c10250h || !(interfaceC10297l instanceof EnumC10286a)) ? c10255b2.f20614a.m1105a(longValue2, enumC10276w2) : null;
        }
        if (m1105a != null) {
            sb.append(m1105a);
            return true;
        }
        if (this.f20638d == null) {
            this.f20638d = new C10263j(this.f20635a, 1, 19, EnumC10275v.NORMAL);
        }
        return this.f20638d.mo1132a(c10271r, sb);
    }

    public final String toString() {
        EnumC10276w enumC10276w = EnumC10276w.FULL;
        InterfaceC10297l interfaceC10297l = this.f20635a;
        EnumC10276w enumC10276w2 = this.f20636b;
        if (enumC10276w2 == enumC10276w) {
            return "Text(" + interfaceC10297l + ")";
        }
        return "Text(" + interfaceC10297l + "," + enumC10276w2 + ")";
    }
}
