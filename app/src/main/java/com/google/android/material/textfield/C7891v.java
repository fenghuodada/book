package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.textfield.v */
/* loaded from: classes3.dex */
public final class C7891v {
    /* renamed from: a */
    public static void m4339a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                C0700a.C0702b.m11924h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                C0700a.C0702b.m11924h(drawable, colorStateList);
            }
            if (mode != null) {
                C0700a.C0702b.m11923i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public static ImageView.ScaleType m4338b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: c */
    public static void m4337c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            C0700a.C0702b.m11924h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    public static void m4336d(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        boolean m11765a = ViewCompat.C0813c.m11765a(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (m11765a || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m11765a);
        checkableImageButton.setPressable(m11765a);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        ViewCompat.C0814d.m11746s(checkableImageButton, i);
    }
}
