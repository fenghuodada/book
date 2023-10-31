package p060j$.time;

import p060j$.time.chrono.C10250h;
import p060j$.time.temporal.AbstractC10295j;
import p060j$.time.temporal.C10301p;
import p060j$.time.temporal.C10302q;
import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;
import p060j$.time.temporal.InterfaceC10296k;
import p060j$.time.temporal.InterfaceC10297l;
import p060j$.time.temporal.InterfaceC10299n;

/* renamed from: j$.time.j */
/* loaded from: classes2.dex */
public enum EnumC10280j implements InterfaceC10296k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a */
    private static final EnumC10280j[] f20669a = values();

    /* renamed from: g */
    public static EnumC10280j m1096g(int i) {
        if (i < 1 || i > 12) {
            throw new C10241b("Invalid value for MonthOfYear: " + i);
        }
        return f20669a[i - 1];
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: a */
    public final C10302q mo1068a(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l == EnumC10286a.MONTH_OF_YEAR ? interfaceC10297l.mo1061c() : AbstractC10295j.m1076c(this, interfaceC10297l);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: b */
    public final boolean mo1067b(InterfaceC10297l interfaceC10297l) {
        return interfaceC10297l instanceof EnumC10286a ? interfaceC10297l == EnumC10286a.MONTH_OF_YEAR : interfaceC10297l != null && interfaceC10297l.mo1063a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: c */
    public final long mo1066c(InterfaceC10297l interfaceC10297l) {
        if (interfaceC10297l == EnumC10286a.MONTH_OF_YEAR) {
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
        return interfaceC10299n == AbstractC10295j.m1075d() ? C10250h.f20596a : interfaceC10299n == AbstractC10295j.m1071h() ? EnumC10287b.MONTHS : AbstractC10295j.m1077b(this, interfaceC10299n);
    }

    @Override // p060j$.time.temporal.InterfaceC10296k
    /* renamed from: e */
    public final int mo1064e(EnumC10286a enumC10286a) {
        return enumC10286a == EnumC10286a.MONTH_OF_YEAR ? ordinal() + 1 : AbstractC10295j.m1078a(this, enumC10286a);
    }

    /* renamed from: f */
    public final int m1097f(boolean z) {
        switch (AbstractC10279i.f20668a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    /* renamed from: h */
    public final EnumC10280j m1095h() {
        int i = ((int) 1) + 12;
        return f20669a[(i + ordinal()) % 12];
    }
}
