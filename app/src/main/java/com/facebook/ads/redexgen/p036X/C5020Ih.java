package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ih */
/* loaded from: assets/audience_network.dex */
public final class C5020Ih implements InterfaceC5492QT {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC5491QS A02 = EnumC5491QS.A05;

    public C5020Ih(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        C5245MS.A0S(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC5491QS.A06;
            C5245MS.A0S(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C5027Io(this), this.A03);
            return;
        }
        C5245MS.A0S(this.A07, this.A05);
        this.A02 = EnumC5491QS.A05;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC5491QS.A04;
            C5245MS.A0S(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C5028Ip(this), this.A03);
            return;
        }
        C5245MS.A0S(this.A07, this.A04);
        this.A02 = EnumC5491QS.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void A3M(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final EnumC5491QS A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void cancel() {
        EnumC5491QS enumC5491QS;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC5491QS.A04) {
            enumC5491QS = EnumC5491QS.A05;
        } else {
            enumC5491QS = EnumC5491QS.A03;
        }
        this.A02 = enumC5491QS;
    }
}
