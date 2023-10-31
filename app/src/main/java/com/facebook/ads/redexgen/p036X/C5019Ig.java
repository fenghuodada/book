package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ig */
/* loaded from: assets/audience_network.dex */
public final class C5019Ig implements InterfaceC5492QT {
    public int A00;
    @Nullable
    public ValueAnimator A01;
    public EnumC5491QS A02 = EnumC5491QS.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public C5019Ig(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private ValueAnimator A00(int i, int i2, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C5495QW(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC5491QS.A06;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C5494QV(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        C5245MS.A0H(this.A05);
        this.A02 = EnumC5491QS.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        C5245MS.A0L(this.A05);
        if (z) {
            this.A02 = EnumC5491QS.A04;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C5493QU(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC5491QS.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void A3M(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final EnumC5491QS A7X() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
