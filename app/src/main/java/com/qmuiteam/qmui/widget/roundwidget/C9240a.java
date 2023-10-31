package com.qmuiteam.qmui.widget.roundwidget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.qmuiteam.qmui.widget.roundwidget.a */
/* loaded from: classes3.dex */
public final class C9240a extends GradientDrawable {

    /* renamed from: d */
    public static final /* synthetic */ int f17943d = 0;

    /* renamed from: a */
    public boolean f17944a = true;

    /* renamed from: b */
    public int f17945b = 0;

    /* renamed from: c */
    public ColorStateList f17946c;

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f17946c;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f17944a) {
            setCornerRadius(Math.min(rect.width(), rect.height()) / 2);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f17946c;
        if (colorStateList != null) {
            setStroke(this.f17945b, colorStateList.getColorForState(iArr, 0));
            return true;
        }
        return onStateChange;
    }
}
