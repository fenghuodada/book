package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0s */
/* loaded from: assets/audience_network.dex */
public final class C39590s {
    public static InterfaceC39540n A00;

    @Nullable
    public final InterfaceC39540n A00(C5953Xy c5953Xy, AdPlacementType adPlacementType) {
        InterfaceC39540n interfaceC39540n = A00;
        if (interfaceC39540n != null) {
            return interfaceC39540n;
        }
        int i = C39580r.A00[adPlacementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return new C4839Fi();
                    }
                    return new C4847Fq(c5953Xy);
                }
                return new C6298da(c5953Xy);
            }
            return new C6300dc();
        }
        return new C6301dd();
    }
}
