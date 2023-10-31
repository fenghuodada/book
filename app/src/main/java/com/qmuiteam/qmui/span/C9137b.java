package com.qmuiteam.qmui.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: com.qmuiteam.qmui.span.b */
/* loaded from: classes3.dex */
public final class C9137b extends C9136a {

    /* renamed from: f */
    public final int f17569f;

    /* renamed from: g */
    public final int f17570g;

    /* renamed from: h */
    public final int f17571h;

    public C9137b(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f17569f = 0;
        this.f17570g = 0;
        this.f17571h = 0;
        this.f17569f = i;
        this.f17570g = i2;
        this.f17571h = 0;
    }

    @Override // com.qmuiteam.qmui.span.C9136a, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, this.f17571h);
        super.draw(canvas, charSequence, i, i2, f + this.f17569f, i3, i4, i5, paint);
        canvas.restore();
    }

    @Override // com.qmuiteam.qmui.span.C9136a, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.f17570g;
        int i4 = this.f17569f;
        if (i4 == 0 && i3 == 0) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        return getDrawable().getIntrinsicWidth() + i4 + i3;
    }
}
