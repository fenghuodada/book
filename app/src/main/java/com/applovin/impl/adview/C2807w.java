package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.AbstractC2774i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.w */
/* loaded from: classes.dex */
public final class C2807w extends AbstractC2774i {

    /* renamed from: c */
    private static final Paint f6700c = new Paint(1);

    /* renamed from: d */
    private static final Paint f6701d = new Paint(1);

    /* renamed from: e */
    private static final Paint f6702e = new Paint(1);

    public C2807w(Context context) {
        super(context);
        f6700c.setColor(-1);
        f6701d.setColor(-16777216);
        Paint paint = f6702e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f6624a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f6624a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f6624a * 3.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    public AbstractC2774i.EnumC2775a getStyle() {
        return AbstractC2774i.EnumC2775a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6700c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f6701d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6702e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
