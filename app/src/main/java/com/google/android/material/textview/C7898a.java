package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.C0383m0;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7773b;
import com.google.android.material.theme.overlay.C7899a;

/* renamed from: com.google.android.material.textview.a */
/* loaded from: classes3.dex */
public final class C7898a extends C0383m0 {
    public C7898a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (C7773b.m4497b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C7621c.f14598r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m4322v = m4322v(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m4322v != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    m4323u(resourceId, theme);
                }
            }
        }
    }

    /* renamed from: v */
    public static int m4322v(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // androidx.appcompat.widget.C0383m0, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (C7773b.m4497b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            m4323u(i, context.getTheme());
        }
    }

    /* renamed from: u */
    public final void m4323u(int i, @NonNull Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C7621c.f14597q);
        int m4322v = m4322v(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m4322v >= 0) {
            setLineHeight(m4322v);
        }
    }
}
