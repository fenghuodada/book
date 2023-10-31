package com.android.tool.util.weight.xselector.shadow;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.android.tool.util.weight.xselector.shadow.a */
/* loaded from: classes.dex */
public final class C2643a extends Drawable {

    /* renamed from: a */
    public final Paint f6210a;

    /* renamed from: h */
    public final int[] f6217h;

    /* renamed from: i */
    public RectF f6218i;

    /* renamed from: j */
    public final int f6219j = 4369;

    /* renamed from: d */
    public final int f6213d = 1;

    /* renamed from: e */
    public int f6214e = 0;

    /* renamed from: c */
    public int f6212c = Color.parseColor("#4d000000");

    /* renamed from: b */
    public int f6211b = 18;

    /* renamed from: f */
    public int f6215f = 0;

    /* renamed from: g */
    public int f6216g = 0;

    public C2643a() {
        this.f6217h = r2;
        int[] iArr = {0};
        Paint paint = new Paint();
        this.f6210a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(this.f6211b, this.f6215f, this.f6216g, this.f6212c);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Paint paint = new Paint();
        int[] iArr = this.f6217h;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                RectF rectF = this.f6218i;
                float f = rectF.left;
                float height = rectF.height() / 2.0f;
                RectF rectF2 = this.f6218i;
                paint.setShader(new LinearGradient(f, height, rectF2.right, rectF2.height() / 2.0f, this.f6217h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        paint.setAntiAlias(true);
        int i = this.f6213d;
        Paint paint2 = this.f6210a;
        if (i != 1) {
            canvas.drawCircle(this.f6218i.centerX(), this.f6218i.centerY(), Math.min(this.f6218i.width(), this.f6218i.height()) / 2.0f, paint2);
            canvas.drawCircle(this.f6218i.centerX(), this.f6218i.centerY(), Math.min(this.f6218i.width(), this.f6218i.height()) / 2.0f, paint);
            return;
        }
        RectF rectF3 = this.f6218i;
        int i2 = this.f6214e;
        canvas.drawRoundRect(rectF3, i2, i2, paint2);
        RectF rectF4 = this.f6218i;
        int i3 = this.f6214e;
        canvas.drawRoundRect(rectF4, i3, i3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i = this.f6219j;
        this.f6218i = new RectF(rect.left + ((i & 1) == 1 ? this.f6211b - this.f6215f : -this.f6214e), rect.top + ((i & 16) == 16 ? this.f6211b - this.f6216g : -this.f6214e), rect.right - ((i & 256) == 256 ? this.f6211b + this.f6215f : -this.f6214e), rect.bottom - ((i & 4096) == 4096 ? this.f6211b + this.f6216g : -this.f6214e));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, m13044to = 255) int i) {
        this.f6210a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f6210a.setColorFilter(colorFilter);
    }
}
