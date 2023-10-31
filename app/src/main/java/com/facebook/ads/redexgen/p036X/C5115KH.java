package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.KH */
/* loaded from: assets/audience_network.dex */
public final class C5115KH {
    public final AdErrorType A00;
    public final String A01;

    public C5115KH(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C5115KH(AdErrorType adErrorType, @Nullable String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C5115KH A00(AdErrorType adErrorType) {
        return new C5115KH(adErrorType, (String) null);
    }

    public static C5115KH A01(AdErrorType adErrorType, @Nullable String str) {
        return new C5115KH(adErrorType, str);
    }

    public static C5115KH A02(C5116KI c5116ki) {
        return new C5115KH(c5116ki.A00(), c5116ki.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
