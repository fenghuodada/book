package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.bw */
/* loaded from: assets/audience_network.dex */
public class C6199bw extends AbstractC41844Y {
    public static String[] A02 = {"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    public boolean A00 = false;
    public final /* synthetic */ AbstractC6198bv A01;

    public C6199bw(AbstractC6198bv abstractC6198bv) {
        this.A01 = abstractC6198bv;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public final void A0L(C4804F9 c4804f9, int i) {
        super.A0L(c4804f9, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41844Y
    public final void A0M(C4804F9 c4804f9, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A02[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}
