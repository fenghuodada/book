package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.XU */
/* loaded from: assets/audience_network.dex */
public class C5923XU implements InterfaceC44729R {
    public final /* synthetic */ String[] A00;

    public C5923XU(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44729R
    public final boolean A2N(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
