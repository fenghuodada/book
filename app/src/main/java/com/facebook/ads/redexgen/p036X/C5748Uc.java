package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Uc */
/* loaded from: assets/audience_network.dex */
public class C5748Uc extends AbstractRunnableC5165L8 {
    public static String[] A01 = {"Ghau2wrk1frvp21ETj6mp24XqInrZhWz", "17fIRlTyn5cqQeNpKhzMID", "pR32sk291HY6M3I9Rqv7DOtrmJFLMHGG", "lklFRXjqHO02dLIfiJk5MunT6DW2lX4u", "pu6rG6tzkOYAls8kWhwJFGkhlkg8qDKn", "lnKlSHHeiiV2wTMqAgm3Jfjv4MIuVQTY", "NrilDOC5Woxhobx5Zl8i48KFnKR1bBLL", "sE8NFlpROkCeKIAQdfQPoEsulpgCWNDW"};
    public final /* synthetic */ C5746Ua A00;

    public C5748Uc(C5746Ua c5746Ua) {
        this.A00 = c5746Ua;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        long j;
        long j2;
        C5746Ua.A00(this.A00);
        j = this.A00.A01;
        if (j > 0) {
            try {
                j2 = this.A00.A01;
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
        String[] strArr = A01;
        if (strArr[5].charAt(14) == strArr[6].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "LjJXLz5e9h3DI08dt7Kr5SwInwXqLWiO";
        strArr2[6] = "Pc0bl4Jkvuydlkjlb12SvYG2JTb7UQAm";
    }
}
