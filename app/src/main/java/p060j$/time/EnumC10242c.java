package p060j$.time;

import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.c */
/* loaded from: classes2.dex */
public enum EnumC10242c implements InterfaceC10296k {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a */
    private static final EnumC10242c[] f20593a = values();

    /* renamed from: f */
    public static EnumC10242c m1159f(int i) {
        if (i < 1 || i > 7) {
            throw new C10241b("Invalid value for DayOfWeek: " + i);
        }
        return f20593a[i - 1];
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l == EnumC10286a.DAY_OF_WEEK ? interfaceC10297l.mo1061c() : AbstractC10295j.m1076c(this, interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.DAY_OF_WEEK : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l == EnumC10286a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        if (interfaceC10297l instanceof EnumC10286a) {
            throw new C10301p("Unsupported field: " + interfaceC10297l);
        }
        return interfaceC10297l.mo1060d(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: d */
    public final Object mo1065d(InterfaceC10299n interfaceC10299n) {
        return interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.DAYS : AbstractC10295j.m1077b(this, interfaceC10299n);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        return enumC10286a == EnumC10286a.DAY_OF_WEEK ? ordinal() + 1 : AbstractC10295j.m1078a(this, enumC10286a);
    }
}
