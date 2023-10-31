package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.OZ */
/* loaded from: assets/audience_network.dex */
public final class C5375OZ extends ImageView {
    public float A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;

    public C5375OZ(C5953Xy c5953Xy, int i, int i2) {
        super(c5953Xy);
        this.A03 = C5254Mb.A01(EnumC5253Ma.RATINGS);
        this.A00 = 1.0f;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(2);
        paint.setColorFilter(new PorterDuffColorFilter(this.A01, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.A03, (Rect) null, new Rect(0, 0, getWidth(), getHeight()), paint);
        paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(this.A03, new Rect(0, 0, (int) (this.A00 * this.A03.getWidth()), this.A03.getHeight()), new Rect(0, 0, (int) (this.A00 * getWidth()), getHeight()), paint);
    }

    public void setFillRatio(float f) {
        this.A00 = f;
        postInvalidate();
    }
}
