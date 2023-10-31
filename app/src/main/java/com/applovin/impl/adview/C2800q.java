package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.AbstractC2774i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.q */
/* loaded from: classes.dex */
public final class C2800q extends AbstractC2774i {

    /* renamed from: c */
    private static final Paint f6681c = new Paint(1);

    /* renamed from: d */
    private static final Paint f6682d = new Paint(1);

    public C2800q(Context context) {
        super(context);
        f6681c.setARGB(80, 0, 0, 0);
        Paint paint = f6682d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    /* renamed from: a */
    public void mo8886a(int i) {
        setViewScale(i / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f6624a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.f6624a * 2.0f;
    }

    @Override // com.applovin.impl.adview.AbstractC2774i
    public AbstractC2774i.EnumC2775a getStyle() {
        return AbstractC2774i.EnumC2775a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6681c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6682d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
