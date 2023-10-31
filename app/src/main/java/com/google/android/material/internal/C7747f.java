package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.C7621c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes3.dex */
public class C7747f extends LinearLayoutCompat {
    @Nullable

    /* renamed from: p */
    public Drawable f15091p;

    /* renamed from: q */
    public final Rect f15092q;

    /* renamed from: r */
    public final Rect f15093r;

    /* renamed from: s */
    public int f15094s;

    /* renamed from: t */
    public final boolean f15095t;

    /* renamed from: u */
    public boolean f15096u;

    public C7747f(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7747f(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f15092q = new Rect();
        this.f15093r = new Rect();
        this.f15094s = 119;
        this.f15095t = true;
        this.f15096u = false;
        TypedArray m4508d = C7758l.m4508d(context, attributeSet, C7621c.f14588h, 0, 0, new int[0]);
        this.f15094s = m4508d.getInt(1, this.f15094s);
        Drawable drawable = m4508d.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f15095t = m4508d.getBoolean(2, true);
        m4508d.recycle();
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15091p;
        if (drawable != null) {
            if (this.f15096u) {
                this.f15096u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f15095t;
                Rect rect = this.f15092q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f15094s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f15093r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f15091p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15091p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f15091p.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f15091p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f15094s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15091p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f15096u = z | this.f15096u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15096u = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f15091p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f15091p);
            }
            this.f15091p = drawable;
            this.f15096u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f15094s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f15094s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f15094s = i;
            if (i == 119 && this.f15091p != null) {
                this.f15091p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15091p;
    }
}
