package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.ZA */
/* loaded from: assets/audience_network.dex */
public class C6027ZA implements InterfaceC43306v {
    public final /* synthetic */ C6012Yv A00;

    public C6027ZA(C6012Yv c6012Yv) {
        this.A00 = c6012Yv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        String[] strArr;
        String[] strArr2;
        strArr = this.A00.A06;
        if (strArr != null) {
            C6012Yv c6012Yv = this.A00;
            strArr2 = c6012Yv.A06;
            return c6012Yv.A04(strArr2.length);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
