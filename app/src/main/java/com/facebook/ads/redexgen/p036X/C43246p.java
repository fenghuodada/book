package com.facebook.ads.redexgen.p036X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6p */
/* loaded from: assets/audience_network.dex */
public final class C43246p extends AbstractC5304NQ {
    public final Paint A00;
    public final C5953Xy A01;
    @Nullable
    public final C5088Jp A02;
    public final AbstractC5285N6 A03;
    public final AbstractC5216Lz A04;
    public final AbstractC5200Lj A05;
    public final C5490QR A06;

    public C43246p(C5953Xy c5953Xy, boolean z, @Nullable C5088Jp c5088Jp) {
        super(c5953Xy);
        this.A04 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.7b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439585 c439585) {
                C5490QR c5490qr;
                c5490qr = C43246p.this.A06;
                c5490qr.setChecked(true);
            }
        };
        this.A05 = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.7a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5215Ly c5215Ly) {
                C5490QR c5490qr;
                c5490qr = C43246p.this.A06;
                c5490qr.setChecked(false);
            }
        };
        this.A03 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439788 c439788) {
                C5490QR c5490qr;
                c5490qr = C43246p.this.A06;
                c5490qr.setChecked(true);
            }
        };
        this.A02 = c5088Jp;
        this.A01 = c5953Xy;
        this.A06 = new C5490QR(c5953Xy, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        C5245MS.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
        C5245MS.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5304NQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new View$OnClickListenerC5487QO(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5304NQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = centerX / 2;
        canvas.drawCircle(getPaddingLeft() + i, getPaddingTop() + (centerX / 2), i, this.A00);
        super.onDraw(canvas);
    }
}
