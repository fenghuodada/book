package com.facebook.ads.redexgen.p036X;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.IV */
/* loaded from: assets/audience_network.dex */
public final class C5008IV implements InterfaceC5492QT {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    @Nullable
    public ValueAnimator A00;
    public EnumC5491QS A01 = EnumC5491QS.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, 25, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public C5008IV(View view, int i, int i2, int i3) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i2;
        this.A03 = i3;
    }

    private void A06(int i, int i2) {
        this.A01 = i == this.A04 ? EnumC5491QS.A04 : EnumC5491QS.A06;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i, i2);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C5498QZ(this, i, i2));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i2, boolean z) {
        if (z) {
            A06(i, i2);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i2);
        this.A01 = i2 == this.A03 ? EnumC5491QS.A03 : EnumC5491QS.A05;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5492QT
    public final void A3M(boolean z, boolean z2) {
        A07(z2 ? this.A03 : this.A04, z2 ? this.A04 : this.A03, z);
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
