package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.IT */
/* loaded from: assets/audience_network.dex */
public final class C5006IT implements InterfaceC5492QT {
    public static String[] A06 = {"Zp1jBMTXyTngXAjRlLP1q6RZbaUI", "nHljDkT3i8Wirocu51jroGsoJHOhv1cR", "sP6X6aS", "KZL6M4", "KoOjzqZIxieUbLbPf8D", "B1jmqrSafv9jI6Lw73IRSYcL6IlnF6YH", "FLN3m70EKIfdw8", "ppmNyXlbfQKy53gkSU0tUatt7Y3PBdXb"};
    @Nullable
    public ValueAnimator A00;
    public EnumC5491QS A01 = EnumC5491QS.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C5006IT(View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
    }

    private ValueAnimator A00(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C5501Qc(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (A06[1].charAt(28) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "75AaLozsvbqC7RPKNa9MBDOQqsQ1eQ5U";
            strArr[5] = "oWQ9IgFva7oIaP1s8z2NxAvwjcynmKEe";
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = EnumC5491QS.A06;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C5500Qb(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        C5245MS.A0H(this.A05);
        this.A01 = EnumC5491QS.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        C5245MS.A0L(this.A05);
        if (z) {
            this.A01 = EnumC5491QS.A04;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C5499Qa(this));
            this.A00.start();
            return;
        }
        View view = this.A05;
        if (A06[1].charAt(28) != 'v') {
            throw new RuntimeException();
        }
        A06[4] = "CRQ3If4kF9c";
        view.setTranslationY(this.A03);
        this.A01 = EnumC5491QS.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void A3M(boolean z, boolean z2) {
        if (z2) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final EnumC5491QS A7X() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
