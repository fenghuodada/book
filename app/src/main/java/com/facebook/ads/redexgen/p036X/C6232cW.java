package com.facebook.ads.redexgen.p036X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.cW */
/* loaded from: assets/audience_network.dex */
public final class C6232cW implements InterfaceC40482J {
    public final SharedPreferences A00;

    public C6232cW(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40482J
    public final InterfaceC40472I A57() {
        return new C6233cX(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40482J
    public final long A6u(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40482J
    @Nullable
    public final String A7c(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
