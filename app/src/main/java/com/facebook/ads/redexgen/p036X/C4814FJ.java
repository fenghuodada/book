package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.FJ */
/* loaded from: assets/audience_network.dex */
public final class C4814FJ extends AbstractC6252cq {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    @Nullable
    public C6243ch A00;
    public final C403324 A01;

    public C4814FJ(C403324 c403324) {
        super(c403324.A0B, A00(c403324));
        this.A01 = c403324;
    }

    public static InterfaceC403223 A00(C403324 c403324) {
        return new C6238cc(c403324);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6252cq
    public final void A05() {
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            c6243ch.A0I();
        }
        super.A00.AEV(EnumC40231u.A04);
    }

    @Nullable
    public final C6243ch A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C6243ch(this.A01, this, this.A02);
        this.A00.A0M(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(InterfaceC3877Ad interfaceC3877Ad, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A5K()) {
            return;
        }
        this.A01.A01(interfaceC3877Ad);
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            c6243ch.A0M(str, adExperienceType, z);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        C403324 c403324 = this.A01;
        c403324.A05 = str;
        c403324.A02 = adExperienceType;
        c403324.A08 = z;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            c6243ch.A0K(rewardData);
        }
    }

    public final boolean A0B() {
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            return c6243ch.A0N();
        }
        return this.A01.A01 > 0 && C5236MJ.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            return c6243ch.A0O();
        }
        return super.A00.A5d() == EnumC40231u.A06;
    }

    public final boolean A0D(InterfaceC3877Ad interfaceC3877Ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C42515d) rewardedVideoShowAdConfig).A00();
        long A01 = ((C42515d) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5L()) {
            return false;
        }
        this.A01.A01(interfaceC3877Ad);
        C6243ch c6243ch = this.A00;
        if (c6243ch != null) {
            return c6243ch.A0P(A00, A01);
        }
        this.A00 = new C6243ch(this.A01, this, this.A02);
        this.A00.A0P(A00, A01);
        return false;
    }
}
