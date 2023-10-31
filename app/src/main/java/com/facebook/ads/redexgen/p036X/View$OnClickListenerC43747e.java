package com.facebook.ads.redexgen.p036X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.7e */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC43747e extends AbstractC5304NQ implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final AbstractC5285N6 A00;
    public final AbstractC5216Lz A01;
    public final AbstractC5200Lj A02;
    public final AbstractC5161L4 A03;
    public final C5490QR A04;

    public View$OnClickListenerC43747e(C5953Xy c5953Xy) {
        this(c5953Xy, null);
    }

    public View$OnClickListenerC43747e(C5953Xy c5953Xy, AttributeSet attributeSet) {
        this(c5953Xy, attributeSet, 0);
    }

    public View$OnClickListenerC43747e(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        this.A03 = new AbstractC5161L4() { // from class: com.facebook.ads.redexgen.X.7l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5173LG c5173lg) {
                View$OnClickListenerC43747e.this.setVisibility(0);
            }
        };
        this.A01 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.7k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439585 c439585) {
                C5490QR c5490qr;
                c5490qr = View$OnClickListenerC43747e.this.A04;
                c5490qr.setChecked(true);
            }
        };
        this.A02 = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.7g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5215Ly c5215Ly) {
                C5490QR c5490qr;
                c5490qr = View$OnClickListenerC43747e.this.A04;
                c5490qr.setChecked(false);
            }
        };
        this.A00 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.7f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439788 c439788) {
                C5490QR c5490qr;
                c5490qr = View$OnClickListenerC43747e.this.A04;
                c5490qr.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C5490QR(c5953Xy);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5304NQ
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5304NQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            C5483QK videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC5518Qt.A07 || videoView.getState() == EnumC5518Qt.A05 || videoView.getState() == EnumC5518Qt.A06) {
                videoView.A0b(EnumC5469Q6.A04, 11);
            } else if (videoView.getState() == EnumC5518Qt.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            C5158L0.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
