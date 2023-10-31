package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.redexgen.X.MO */
/* loaded from: assets/audience_network.dex */
public final class C5241MO {
    public static EnumC5469Q6 A00(VideoStartReason videoStartReason) {
        int i = C5240MN.A00[videoStartReason.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC5469Q6.A03;
                }
                return EnumC5469Q6.A04;
            }
            return EnumC5469Q6.A03;
        }
        return EnumC5469Q6.A02;
    }
}
