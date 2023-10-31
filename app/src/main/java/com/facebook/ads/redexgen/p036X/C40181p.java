package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1p */
/* loaded from: assets/audience_network.dex */
public final class C40181p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;
    @Nullable
    public RewardData A02;
    @Nullable
    public EnumC5098Jz A03;
    @Nullable
    public String A04;
    @Nullable
    public String A05;
    public boolean A06;
    public final EnumC5117KK A07;
    public final EnumC5119KM A08;
    public final String A09;
    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C40181p(String str, EnumC5119KM enumC5119KM, AdPlacementType adPlacementType, EnumC5117KK enumC5117KK, int i) {
        this(str, enumC5119KM, adPlacementType, enumC5117KK, i, EnumSet.of(CacheFlag.NONE));
    }

    public C40181p(String str, EnumC5119KM enumC5119KM, AdPlacementType adPlacementType, EnumC5117KK enumC5117KK, int i, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = enumC5117KK;
        this.A0B = i;
        this.A0A = enumSet;
        this.A08 = enumC5119KM;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC5117KK enumC5117KK = this.A07;
        if (enumC5117KK == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC5117KK == EnumC5117KK.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C5140Kh A01(C5953Xy c5953Xy, C5124KR c5124kr, @Nullable AdExperienceType adExperienceType) {
        C5221M4 c5221m4;
        String str;
        String str2 = this.A09;
        EnumC5117KK enumC5117KK = this.A07;
        if (enumC5117KK != null) {
            c5221m4 = new C5221M4(enumC5117KK.A03(), this.A07.A02());
        } else {
            c5221m4 = null;
        }
        EnumC5119KM enumC5119KM = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            str = AdSettings.getTestAdType().getAdTypeString();
        } else {
            str = null;
        }
        C5140Kh c5140Kh = new C5140Kh(c5953Xy, str2, c5221m4, enumC5119KM, str, this.A0B, AdSettings.isTestMode(c5953Xy), AdSettings.isMixedAudience(), c5124kr, C5227MA.A01(C5064JR.A0H(c5953Xy)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c5140Kh;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC5098Jz enumC5098Jz) {
        this.A03 = enumC5098Jz;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
