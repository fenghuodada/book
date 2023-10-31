package p060j$.time.temporal;

import p060j$.time.Duration;

/* renamed from: j$.time.temporal.b */
/* loaded from: classes2.dex */
public enum EnumC10287b implements InterfaceC10300o {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a */
    private final String f20680a;

    static {
        Duration.m1186b(1L);
        Duration.m1186b(1000L);
        Duration.m1186b(1000000L);
        Duration.m1185c();
    }

    EnumC10287b(String str) {
        this.f20680a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20680a;
    }
}
