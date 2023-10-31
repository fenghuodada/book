package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.cardview.widget.c */
/* loaded from: classes.dex */
public final class C0467c extends Drawable {

    /* renamed from: a */
    public float f1476a;

    /* renamed from: c */
    public final RectF f1478c;

    /* renamed from: d */
    public final Rect f1479d;

    /* renamed from: e */
    public float f1480e;

    /* renamed from: h */
    public ColorStateList f1483h;

    /* renamed from: i */
    public PorterDuffColorFilter f1484i;

    /* renamed from: j */
    public ColorStateList f1485j;

    /* renamed from: f */
    public boolean f1481f = false;

    /* renamed from: g */
    public boolean f1482g = true;

    /* renamed from: k */
    public PorterDuff.Mode f1486k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f1477b = new Paint(5);

    public C0467c(float f, ColorStateList colorStateList) {
        this.f1476a = f;
        m12433b(colorStateList);
        this.f1478c = new RectF();
        this.f1479d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m12434a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m12433b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1483h = colorStateList;
        this.f1477b.setColor(colorStateList.getColorForState(getState(), this.f1483h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void m12432c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f1478c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f1479d;
        rect2.set(rect);
        if (this.f1481f) {
            float f = this.f1480e;
            float f2 = this.f1476a;
            boolean z = this.f1482g;
            float f3 = 1.5f * f;
            if (z) {
                f3 = (float) (((1.0d - C0468d.f1487a) * f2) + f3);
            } else {
                int i = C0468d.f1488b;
            }
            if (z) {
                f = (float) (((1.0d - C0468d.f1487a) * f2) + f);
            }
            rect2.inset((int) Math.ceil(f), (int) Math.ceil(f3));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1477b;
        if (this.f1484i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1484i);
            z = true;
        }
        RectF rectF = this.f1478c;
        float f = this.f1476a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f1479d, this.f1476a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1485j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1483h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m12432c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1483h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1477b;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1485j;
        if (colorStateList2 == null || (mode = this.f1486k) == null) {
            return z;
        }
        this.f1484i = m12434a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1477b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1477b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1485j = colorStateList;
        this.f1484i = m12434a(colorStateList, this.f1486k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1486k = mode;
        this.f1484i = m12434a(this.f1485j, mode);
        invalidateSelf();
    }
}
