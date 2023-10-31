package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.OD */
/* loaded from: assets/audience_network.dex */
public final class C5353OD extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C5353OD(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A03 = new ImageView(c5953Xy);
        this.A02 = new ImageView(c5953Xy);
        A00();
    }

    public C5353OD(C5953Xy c5953Xy, AttributeSet attributeSet) {
        super(c5953Xy, attributeSet);
        this.A03 = new ImageView(c5953Xy, attributeSet);
        this.A02 = new ImageView(c5953Xy, attributeSet);
        A00();
    }

    public C5353OD(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        this.A03 = new ImageView(c5953Xy, attributeSet, i);
        this.A02 = new ImageView(c5953Xy, attributeSet, i);
        A00();
    }

    @TargetApi(21)
    public C5353OD(C5953Xy c5953Xy, AttributeSet attributeSet, int i, int i2) {
        super(c5953Xy, attributeSet, i, i2);
        this.A03 = new ImageView(c5953Xy, attributeSet, i, i2);
        this.A02 = new ImageView(c5953Xy, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC5213Lw.A04(this.A03, EnumC5213Lw.A0A);
        setId(C5245MS.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int blurBorderViewWidth, int blurBorderViewHeight, int expectedImageHeight, int i) {
        int i2;
        int i3 = this.A01;
        if (i3 <= 0 || (i2 = this.A00) <= 0) {
            super.onLayout(z, blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i);
            return;
        }
        int i4 = expectedImageHeight - blurBorderViewWidth;
        int i5 = i - blurBorderViewHeight;
        float min = Math.min(i4 / i3, i5 / i2);
        int i6 = (int) (this.A01 * min);
        int i7 = (int) (this.A00 * min);
        this.A02.layout(blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i);
        int i8 = (i4 / 2) + blurBorderViewWidth;
        int i9 = (i5 / 2) + blurBorderViewHeight;
        int centerY = i6 / 2;
        int i10 = i8 - centerY;
        int centerY2 = i7 / 2;
        int centerY3 = i7 / 2;
        this.A03.layout(i10, i9 - centerY2, (i6 / 2) + i8, i9 + centerY3);
        this.A02.setVisibility(0);
    }

    public void setImage(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        if (bitmap2 != null) {
            C5245MS.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            C5245MS.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
