package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.AbstractC2774i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.r */
/* loaded from: classes.dex */
public final class C2801r extends AbstractC2774i {

    /* renamed from: c */
    private static final Paint f6683c = new Paint(1);

    /* renamed from: d */
    private static final Paint f6684d = new Paint(1);

    /* renamed from: e */
    private final float[] f6685e;

    /* renamed from: f */
    private Path f6686f;

    public C2801r(Context context) {
        super(context);
        this.f6685e = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f6683c.setARGB(80, 0, 0, 0);
        Paint paint = f6684d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m8887a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f6685e;
            if (i >= fArr.length) {
                Path path = new Path();
                this.f6686f = path;
                float[] fArr2 = this.f6685e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f6686f;
                float[] fArr3 = this.f6685e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f6686f;
                float[] fArr4 = this.f6685e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f6686f;
                float[] fArr5 = this.f6685e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f6686f;
                float[] fArr6 = this.f6685e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f6686f;
                float[] fArr7 = this.f6685e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i] = fArr[i] * 0.3f * this.f6624a;
            i++;
        }
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    /* renamed from: a */
    public void mo8886a(int i) {
        setViewScale(i / 30.0f);
        m8887a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f6624a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    public AbstractC2774i.EnumC2775a getStyle() {
        return AbstractC2774i.EnumC2775a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6683c);
        Paint paint = f6684d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f6686f, paint);
    }
}
