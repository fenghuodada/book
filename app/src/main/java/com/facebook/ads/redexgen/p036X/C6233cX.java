package com.facebook.ads.redexgen.p036X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.cX */
/* loaded from: assets/audience_network.dex */
public class C6233cX implements InterfaceC40472I {
    public final SharedPreferences.Editor A00;

    public C6233cX(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40472I
    public final void A3N() {
        this.A00.apply();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40472I
    public final InterfaceC40472I ADR(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40472I
    public final InterfaceC40472I ADS(String str, @Nullable String str2) {
        this.A00.putString(str, str2);
        return this;
    }
}
