package p060j$.time.temporal;

import p060j$.time.C10253f;
import p060j$.time.EnumC10242c;
import p060j$.time.chrono.AbstractC10243a;
import p060j$.time.chrono.C10250h;
import p060j$.time.chrono.InterfaceC10249g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.temporal.g */
/* loaded from: classes2.dex */
abstract class EnumC10292g implements InterfaceC10297l {
    public static final EnumC10292g DAY_OF_QUARTER;
    public static final EnumC10292g QUARTER_OF_YEAR;
    public static final EnumC10292g WEEK_BASED_YEAR;
    public static final EnumC10292g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    private static final int[] f20681a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC10292g[] f20682b;

    static {
        EnumC10292g enumC10292g = new EnumC10292g() { // from class: j$.time.temporal.c
            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: a */
            public final boolean mo1063a(InterfaceC10296k interfaceC10296k) {
                return interfaceC10296k.mo1067b(EnumC10286a.DAY_OF_YEAR) && interfaceC10296k.mo1067b(EnumC10286a.MONTH_OF_YEAR) && interfaceC10296k.mo1067b(EnumC10286a.YEAR) && EnumC10292g.m1085e(interfaceC10296k);
            }

            @Override // p060j$.time.temporal.EnumC10292g, p060j$.time.temporal.InterfaceC10297l
            /* renamed from: b */
            public final C10302q mo1062b(InterfaceC10296k interfaceC10296k) {
                if (mo1063a(interfaceC10296k)) {
                    long mo1066c = interfaceC10296k.mo1066c(EnumC10292g.QUARTER_OF_YEAR);
                    if (mo1066c != 1) {
                        return mo1066c == 2 ? C10302q.m1050i(1L, 91L) : (mo1066c == 3 || mo1066c == 4) ? C10302q.m1050i(1L, 92L) : mo1061c();
                    }
                    long mo1066c2 = interfaceC10296k.mo1066c(EnumC10286a.YEAR);
                    C10250h.f20596a.getClass();
                    return C10250h.m1157a(mo1066c2) ? C10302q.m1050i(1L, 91L) : C10302q.m1050i(1L, 90L);
                }
                throw new C10301p("Unsupported field: DayOfQuarter");
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: c */
            public final C10302q mo1061c() {
                return C10302q.m1049j(90L, 92L);
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: d */
            public final long mo1060d(InterfaceC10296k interfaceC10296k) {
                int[] iArr;
                if (mo1063a(interfaceC10296k)) {
                    int mo1064e = interfaceC10296k.mo1064e(EnumC10286a.DAY_OF_YEAR);
                    int mo1064e2 = interfaceC10296k.mo1064e(EnumC10286a.MONTH_OF_YEAR);
                    long mo1066c = interfaceC10296k.mo1066c(EnumC10286a.YEAR);
                    iArr = EnumC10292g.f20681a;
                    int i = (mo1064e2 - 1) / 3;
                    C10250h.f20596a.getClass();
                    return mo1064e - iArr[i + (C10250h.m1157a(mo1066c) ? 4 : 0)];
                }
                throw new C10301p("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC10292g;
        EnumC10292g enumC10292g2 = new EnumC10292g() { // from class: j$.time.temporal.d
            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: a */
            public final boolean mo1063a(InterfaceC10296k interfaceC10296k) {
                return interfaceC10296k.mo1067b(EnumC10286a.MONTH_OF_YEAR) && EnumC10292g.m1085e(interfaceC10296k);
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: c */
            public final C10302q mo1061c() {
                return C10302q.m1050i(1L, 4L);
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: d */
            public final long mo1060d(InterfaceC10296k interfaceC10296k) {
                if (mo1063a(interfaceC10296k)) {
                    return (interfaceC10296k.mo1066c(EnumC10286a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C10301p("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC10292g2;
        EnumC10292g enumC10292g3 = new EnumC10292g() { // from class: j$.time.temporal.e
            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: a */
            public final boolean mo1063a(InterfaceC10296k interfaceC10296k) {
                return interfaceC10296k.mo1067b(EnumC10286a.EPOCH_DAY) && EnumC10292g.m1085e(interfaceC10296k);
            }

            @Override // p060j$.time.temporal.EnumC10292g, p060j$.time.temporal.InterfaceC10297l
            /* renamed from: b */
            public final C10302q mo1062b(InterfaceC10296k interfaceC10296k) {
                C10302q m1079k;
                if (mo1063a(interfaceC10296k)) {
                    m1079k = EnumC10292g.m1079k(C10253f.m1154h(interfaceC10296k));
                    return m1079k;
                }
                throw new C10301p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: c */
            public final C10302q mo1061c() {
                return C10302q.m1049j(52L, 53L);
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: d */
            public final long mo1060d(InterfaceC10296k interfaceC10296k) {
                if (mo1063a(interfaceC10296k)) {
                    return EnumC10292g.m1082h(C10253f.m1154h(interfaceC10296k));
                }
                throw new C10301p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC10292g3;
        EnumC10292g enumC10292g4 = new EnumC10292g() { // from class: j$.time.temporal.f
            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: a */
            public final boolean mo1063a(InterfaceC10296k interfaceC10296k) {
                return interfaceC10296k.mo1067b(EnumC10286a.EPOCH_DAY) && EnumC10292g.m1085e(interfaceC10296k);
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: c */
            public final C10302q mo1061c() {
                return EnumC10286a.YEAR.mo1061c();
            }

            @Override // p060j$.time.temporal.InterfaceC10297l
            /* renamed from: d */
            public final long mo1060d(InterfaceC10296k interfaceC10296k) {
                int m1080j;
                if (mo1063a(interfaceC10296k)) {
                    m1080j = EnumC10292g.m1080j(C10253f.m1154h(interfaceC10296k));
                    return m1080j;
                }
                throw new C10301p("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC10292g4;
        f20682b = new EnumC10292g[]{enumC10292g, enumC10292g2, enumC10292g3, enumC10292g4};
        f20681a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EnumC10292g(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m1085e(InterfaceC10296k interfaceC10296k) {
        if (interfaceC10296k != null) {
            Object obj = (InterfaceC10249g) interfaceC10296k.mo1065d(AbstractC10295j.f20689b);
            if (obj == null) {
                obj = C10250h.f20596a;
            }
            return ((AbstractC10243a) obj).equals(C10250h.f20596a);
        }
        throw new NullPointerException("temporal");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.m1149m())) == false) goto L17;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m1082h(p060j$.time.C10253f r5) {
        /*
            j$.time.c r0 = r5.m1152j()
            int r0 = r0.ordinal()
            int r1 = r5.m1151k()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L32
            j$.time.f r5 = r5.m1144r()
            r0 = -1
            j$.time.f r5 = r5.m1146p(r0)
            j$.time.temporal.q r5 = m1079k(r5)
            long r0 = r5.m1055d()
            int r5 = (int) r0
            goto L4e
        L32:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L4c
            if (r0 == r3) goto L48
            r3 = -2
            if (r0 != r3) goto L46
            boolean r5 = r5.m1149m()
            if (r5 == 0) goto L46
            goto L48
        L46:
            r5 = 0
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r2 = r1
        L4d:
            r5 = r2
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.time.temporal.EnumC10292g.m1082h(j$.time.f):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m1080j(C10253f c10253f) {
        int m1150l = c10253f.m1150l();
        int m1151k = c10253f.m1151k();
        if (m1151k <= 3) {
            return m1151k - c10253f.m1152j().ordinal() < -2 ? m1150l - 1 : m1150l;
        } else if (m1151k >= 363) {
            return ((m1151k - 363) - (c10253f.m1149m() ? 1 : 0)) - c10253f.m1152j().ordinal() >= 0 ? m1150l + 1 : m1150l;
        } else {
            return m1150l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C10302q m1079k(C10253f c10253f) {
        C10253f m1148n = C10253f.m1148n(m1080j(c10253f), 1, 1);
        return C10302q.m1050i(1L, (m1148n.m1152j() == EnumC10242c.THURSDAY || (m1148n.m1152j() == EnumC10242c.WEDNESDAY && m1148n.m1149m())) ? 53 : 52);
    }

    public static EnumC10292g valueOf(String str) {
        return (EnumC10292g) Enum.valueOf(EnumC10292g.class, str);
    }

    public static EnumC10292g[] values() {
        return (EnumC10292g[]) f20682b.clone();
    }

    /* renamed from: b */
    public C10302q mo1062b(InterfaceC10296k interfaceC10296k) {
        return mo1061c();
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    public final boolean isDateBased() {
        return true;
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    public final boolean isTimeBased() {
        return false;
    }
}
