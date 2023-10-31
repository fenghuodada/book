package p060j$.time.chrono;

import p060j$.time.C10285o;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.EnumC10286a;

/* renamed from: j$.time.chrono.d */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC10246d {
    /* renamed from: a */
    public static int m1158a(InterfaceC10248f interfaceC10248f, EnumC10286a enumC10286a) {
        if (enumC10286a instanceof EnumC10286a) {
            int i = AbstractC10247e.f20595a[enumC10286a.ordinal()];
            if (i != 1) {
                C10285o c10285o = (C10285o) interfaceC10248f;
                return i != 2 ? c10285o.m1089j().mo1064e(enumC10286a) : c10285o.m1093f().m1168g();
            }
            throw new C10301p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC10295j.m1078a(interfaceC10248f, enumC10286a);
    }
}
