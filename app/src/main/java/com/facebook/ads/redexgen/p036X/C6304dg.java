package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dg */
/* loaded from: assets/audience_network.dex */
public class C6304dg implements InterfaceC5401Oz {
    public final /* synthetic */ C6301dd A00;

    public C6304dg(C6301dd c6301dd) {
        this.A00 = c6301dd;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void A8i() {
        C6283dL c6283dL;
        C4780El c4780El;
        c6283dL = this.A00.A02;
        String A00 = c6283dL.A0R().A00();
        if (!TextUtils.isEmpty(A00)) {
            C5190LZ c5190lz = new C5190LZ();
            c4780El = this.A00.A03;
            C5190LZ.A0E(c5190lz, c4780El, C5191La.A00(A00), this.A00.A65());
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void AAf(C4508A1 c4508a1) {
        new Handler(Looper.getMainLooper()).postDelayed(new C6305dh(this, c4508a1), 1L);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void AAt() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void ACX(View view, MotionEvent motionEvent) {
    }
}
