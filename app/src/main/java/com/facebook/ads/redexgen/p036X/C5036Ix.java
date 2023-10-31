package com.facebook.ads.redexgen.p036X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ix */
/* loaded from: assets/audience_network.dex */
public final class C5036Ix extends RelativeLayout implements InterfaceC5470Q7 {
    public static byte[] A08;
    public static final int A09;
    public int A00;
    public ObjectAnimator A01;
    public ProgressBar A02;
    public AbstractC44839c A03;
    public AbstractC44839c A04;
    public AbstractC44839c A05;
    public AbstractC44839c A06;
    @Nullable
    public C5483QK A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-71, -69, -72, -80, -69, -82, -68, -68};
    }

    static {
        A03();
        A09 = (int) (C5208Lr.A00 * 6.0f);
    }

    public C5036Ix(C5953Xy c5953Xy) {
        this(c5953Xy, A09, -12549889, 0);
    }

    public C5036Ix(C5953Xy c5953Xy, int i, int i2, int i3) {
        super(c5953Xy);
        this.A00 = -1;
        this.A06 = new AbstractC5160L3() { // from class: com.facebook.ads.redexgen.X.64
            public static String[] A01 = {"5cZwmFwOCvoIimHKJKs7c8Wrfuwl5", "kR6Rx7ETQGlVhfpD5OxJcFg21Ovz094i", "oaAjYFLN3m9AYmyloxlSIBJp6ETHW3KF", "dCQrNLE74jmKWuOaqJJ4Sbhiwuuv5ad", "onBgfHhqxGhqxLvpU2wfKqg3mDsyExyq", "SCROov7hAW1gh5oss5LLtyUv0yBfa", "SAPoZVZ00ZwZwmL71sxtzrpJli3hIy2X", "TEn6j3AzMnGgqeyMrOghHZKrMbMLSMuC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439484 c439484) {
                C5483QK c5483qk;
                c5483qk = C5036Ix.this.A07;
                if (c5483qk != null) {
                    C5036Ix c5036Ix = C5036Ix.this;
                    String[] strArr = A01;
                    if (strArr[2].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A01[1] = "B8raFzKF2tgWcMrESvgtBPeFcOBIsHL1";
                    c5036Ix.A07(true);
                }
            }
        };
        this.A04 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.4p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439585 c439585) {
                C5036Ix.this.A02();
            }
        };
        this.A05 = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.4h
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5215Ly c5215Ly) {
                C5483QK c5483qk;
                c5483qk = C5036Ix.this.A07;
                if (c5483qk != null) {
                    C5036Ix.this.A07(true);
                }
            }
        };
        this.A03 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.4V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439788 c439788) {
                C5483QK c5483qk;
                c5483qk = C5036Ix.this.A07;
                if (c5483qk != null) {
                    C5036Ix.this.A05();
                }
            }
        };
        this.A02 = new ProgressBar(c5953Xy, null, 16842872);
        A06(i2, i3);
        this.A02.setMax(10000);
        addView(this.A02, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i2), new ColorDrawable(i2), new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int i2 = this.A00;
        if (i2 >= i || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            this.A01 = ObjectAnimator.ofInt(this.A02, A01(0, 8, 53), i2, i);
            ObjectAnimator objectAnimator = this.A01;
            int progress = Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(progress);
            this.A01.setInterpolator(new LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i);
        }
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void A8o(C5483QK c5483qk) {
        this.A07 = c5483qk;
        c5483qk.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void AFG(C5483QK c5483qk) {
        c5483qk.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}
