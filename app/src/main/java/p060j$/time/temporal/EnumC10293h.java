package p060j$.time.temporal;

import p060j$.time.Duration;

/* renamed from: j$.time.temporal.h */
/* loaded from: classes2.dex */
enum EnumC10293h implements InterfaceC10300o {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a */
    private final String f20684a;

    static {
        Duration duration = Duration.f20575c;
    }

    EnumC10293h(String str) {
        this.f20684a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20684a;
    }
}
