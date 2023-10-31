package com.qmuiteam.qmui.span;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.qmuiteam.qmui.skin.InterfaceC9102d;
import com.qmuiteam.qmui.util.C9142c;
import com.qmuiteam.qmui.util.C9145f;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.span.a */
/* loaded from: classes3.dex */
public class C9136a extends ImageSpan implements InterfaceC9102d {

    /* renamed from: a */
    public final float f17564a;

    /* renamed from: b */
    public boolean f17565b;

    /* renamed from: c */
    public int f17566c;

    /* renamed from: d */
    public final Drawable f17567d;

    /* renamed from: e */
    public int f17568e;

    public C9136a(Drawable drawable) {
        super(drawable.mutate(), -100);
        this.f17564a = -1.0f;
        this.f17565b = false;
        this.f17567d = getDrawable();
        this.f17564a = 0.0f;
    }

    @Override // com.qmuiteam.qmui.skin.InterfaceC9102d
    /* renamed from: a */
    public final void mo2650a(@NotNull Resources.Theme theme) {
        int i = this.f17568e;
        if (i != 0) {
            int m2639b = C9145f.m2639b(i, theme);
            int i2 = C9142c.f17578a;
            LightingColorFilter lightingColorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), m2639b);
            Drawable drawable = this.f17567d;
            if (drawable != null) {
                drawable.setColorFilter(lightingColorFilter);
            }
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (((ImageSpan) this).mVerticalAlignment != -100) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            return;
        }
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.top;
        int i7 = i4 + i6;
        int i8 = fontMetricsInt.bottom - i6;
        Drawable drawable = this.f17567d;
        canvas.translate(f, ((i8 - (drawable.getBounds().bottom - drawable.getBounds().top)) / 2) + i7);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f17566c = this.f17565b ? getDrawable().getBounds().right : super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        float f = this.f17564a;
        if (f > 0.0f) {
            this.f17566c = (int) (paint.measureText("子") * f);
        }
        return this.f17566c;
    }
}
