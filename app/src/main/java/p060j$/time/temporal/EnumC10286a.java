package p060j$.time.temporal;

/* renamed from: j$.time.temporal.a */
/* loaded from: classes2.dex */
public enum EnumC10286a implements InterfaceC10297l {
    NANO_OF_SECOND("NanoOfSecond", C10302q.m1050i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C10302q.m1050i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C10302q.m1050i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C10302q.m1050i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C10302q.m1050i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C10302q.m1050i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C10302q.m1050i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C10302q.m1050i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C10302q.m1050i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C10302q.m1050i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C10302q.m1050i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C10302q.m1050i(1, 12)),
    HOUR_OF_DAY("HourOfDay", C10302q.m1050i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C10302q.m1050i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C10302q.m1050i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C10302q.m1050i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C10302q.m1050i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C10302q.m1050i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C10302q.m1049j(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C10302q.m1049j(365, 366)),
    EPOCH_DAY("EpochDay", C10302q.m1050i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C10302q.m1049j(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C10302q.m1050i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C10302q.m1050i(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", C10302q.m1050i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C10302q.m1049j(999999999, 1000000000)),
    YEAR("Year", C10302q.m1050i(-999999999, 999999999), 0),
    ERA("Era", C10302q.m1050i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C10302q.m1050i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C10302q.m1050i(-64800, 64800));
    

    /* renamed from: a */
    private final String f20677a;

    /* renamed from: b */
    private final C10302q f20678b;

    static {
        EnumC10287b enumC10287b = EnumC10287b.NANOS;
    }

    EnumC10286a(String str, C10302q c10302q) {
        this.f20677a = str;
        this.f20678b = c10302q;
    }

    EnumC10286a(String str, C10302q c10302q, int i) {
        this.f20677a = str;
        this.f20678b = c10302q;
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    /* renamed from: a */
    public final boolean mo1063a(InterfaceC10296k interfaceC10296k) {
        return interfaceC10296k.mo1067b(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    /* renamed from: b */
    public final C10302q mo1062b(InterfaceC10296k interfaceC10296k) {
        return interfaceC10296k.mo1068a(this);
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    /* renamed from: c */
    public final C10302q mo1061c() {
        return this.f20678b;
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    /* renamed from: d */
    public final long mo1060d(InterfaceC10296k interfaceC10296k) {
        return interfaceC10296k.mo1066c(this);
    }

    /* renamed from: e */
    public final int m1087e(long j) {
        return this.f20678b.m1058a(j, this);
    }

    /* renamed from: f */
    public final void m1086f(long j) {
        this.f20678b.m1057b(j, this);
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p060j$.time.temporal.InterfaceC10297l
    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20677a;
    }
}
