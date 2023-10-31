package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.C0181c;
import com.ambrose.overwall.R;

/* renamed from: com.google.android.material.theme.overlay.a */
/* loaded from: classes3.dex */
public final class C7899a {

    /* renamed from: a */
    public static final int[] f15614a = {16842752, R.attr.theme};

    /* renamed from: b */
    public static final int[] f15615b = {R.attr.materialThemeOverlay};

    @NonNull
    /* renamed from: a */
    public static Context m4316a(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15615b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C0181c) && ((C0181c) context).f509a == resourceId) {
            z = true;
        } else {
            z = false;
        }
        if (resourceId != 0 && !z) {
            C0181c c0181c = new C0181c(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f15614a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                c0181c.getTheme().applyStyle(resourceId2, true);
            }
            return c0181c;
        }
        return context;
    }
}
