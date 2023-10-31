package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Ld */
/* loaded from: assets/audience_network.dex */
public final class C5194Ld {
    public static AdError A00(C5115KH c5115kh) {
        if (c5115kh.A03().isPublicError()) {
            return new AdError(c5115kh.A03().getErrorCode(), c5115kh.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
