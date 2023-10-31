package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.24 */
/* loaded from: assets/audience_network.dex */
public final class C403324 {
    public static String[] A0D = {"pQFQWrff5apwgeDCfICDjWO2FINXUEGY", "Zrlf7mbphLj9aknW7PcFFQ", "n3KJlhWP5Ju2JP4ez23sn5JFnk3TGtqs", "LKe9A2", "QZ6oU5eByjCJaazPOJhmSAWWHc", "bIzEhjdis4s2Gtu6NLj44xIWpvJeHb48", "cSwbeF06gtlZkK5ZI0p5Ev", "223A19fPLhE6SS6l"};
    public int A00 = -1;
    public long A01 = -1;
    @Nullable
    public AdExperienceType A02;
    @Nullable
    public RewardData A03;
    @Nullable
    public RewardedVideoAdListener A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    @Nullable
    public String A07;
    public boolean A08;
    @Nullable
    public InterfaceC3877Ad A09;
    public WeakReference<InterfaceC3877Ad> A0A;
    public final C5953Xy A0B;
    public final String A0C;

    public C403324(C5953Xy c5953Xy, String str, @Nullable InterfaceC3877Ad interfaceC3877Ad) {
        this.A0B = c5953Xy;
        this.A0C = str;
        this.A09 = interfaceC3877Ad;
        this.A0A = new WeakReference<>(interfaceC3877Ad);
    }

    @Nullable
    public final InterfaceC3877Ad A00() {
        InterfaceC3877Ad interfaceC3877Ad = this.A09;
        return interfaceC3877Ad != null ? interfaceC3877Ad : this.A0A.get();
    }

    public final void A01(@Nullable InterfaceC3877Ad interfaceC3877Ad) {
        if (interfaceC3877Ad == null) {
            C5953Xy c5953Xy = this.A0B;
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0D[4] = "e0pPDU8i87wGcMU5DIxBijYJQd";
            if (!C5064JR.A0n(c5953Xy)) {
                return;
            }
        }
        this.A09 = interfaceC3877Ad;
    }
}
