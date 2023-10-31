package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.util.C0804h;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7774c;
import com.google.android.material.shape.C7792a;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes3.dex */
public final class C7671b {
    @NonNull

    /* renamed from: a */
    public final Rect f14829a;

    /* renamed from: b */
    public final ColorStateList f14830b;

    /* renamed from: c */
    public final ColorStateList f14831c;

    /* renamed from: d */
    public final ColorStateList f14832d;

    /* renamed from: e */
    public final int f14833e;

    /* renamed from: f */
    public final C7801j f14834f;

    public C7671b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C7801j c7801j, @NonNull Rect rect) {
        C0804h.m11792b(rect.left);
        C0804h.m11792b(rect.top);
        C0804h.m11792b(rect.right);
        C0804h.m11792b(rect.bottom);
        this.f14829a = rect;
        this.f14830b = colorStateList2;
        this.f14831c = colorStateList;
        this.f14832d = colorStateList3;
        this.f14833e = i;
        this.f14834f = c7801j;
    }

    @NonNull
    /* renamed from: a */
    public static C7671b m4609a(@NonNull Context context, @StyleRes int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C0804h.m11793a(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7621c.f14593m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList m4495a = C7774c.m4495a(context, obtainStyledAttributes, 4);
        ColorStateList m4495a2 = C7774c.m4495a(context, obtainStyledAttributes, 9);
        ColorStateList m4495a3 = C7774c.m4495a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C7801j c7801j = new C7801j(C7801j.m4458a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C7792a(0)));
        obtainStyledAttributes.recycle();
        return new C7671b(m4495a, m4495a2, m4495a3, dimensionPixelSize, c7801j, rect);
    }

    /* renamed from: b */
    public final void m4608b(@NonNull TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        C7801j c7801j = this.f14834f;
        materialShapeDrawable.setShapeAppearanceModel(c7801j);
        materialShapeDrawable2.setShapeAppearanceModel(c7801j);
        materialShapeDrawable.m4467k(this.f14831c);
        materialShapeDrawable.f15183a.f15216k = this.f14833e;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
        ColorStateList colorStateList = c7791b.f15209d;
        ColorStateList colorStateList2 = this.f14832d;
        if (colorStateList != colorStateList2) {
            c7791b.f15209d = colorStateList2;
            materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
        }
        ColorStateList colorStateList3 = this.f14830b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f14829a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(textView, insetDrawable);
    }
}
