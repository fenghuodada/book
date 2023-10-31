package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0414t;
import androidx.core.widget.C1045b;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.color.C7661a;
import com.google.android.material.internal.C7758l;
import com.google.android.material.resources.C7774c;
import com.google.android.material.theme.overlay.C7899a;

/* renamed from: com.google.android.material.radiobutton.a */
/* loaded from: classes3.dex */
public final class C7770a extends C0414t {

    /* renamed from: g */
    public static final int[][] f15131g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @Nullable

    /* renamed from: e */
    public ColorStateList f15132e;

    /* renamed from: f */
    public boolean f15133f;

    public C7770a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.radioButtonStyle, 2132018323), attributeSet);
        Context context2 = getContext();
        TypedArray m4508d = C7758l.m4508d(context2, attributeSet, C7621c.f14595o, R.attr.radioButtonStyle, 2132018323, new int[0]);
        if (m4508d.hasValue(0)) {
            C1045b.m11266c(this, C7774c.m4495a(context2, m4508d, 0));
        }
        this.f15133f = m4508d.getBoolean(1, false);
        m4508d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15132e == null) {
            int m4621a = C7661a.m4621a(R.attr.colorControlActivated, this);
            int m4621a2 = C7661a.m4621a(R.attr.colorOnSurface, this);
            int m4621a3 = C7661a.m4621a(R.attr.colorSurface, this);
            this.f15132e = new ColorStateList(f15131g, new int[]{C7661a.m4618d(m4621a3, 1.0f, m4621a), C7661a.m4618d(m4621a3, 0.54f, m4621a2), C7661a.m4618d(m4621a3, 0.38f, m4621a2), C7661a.m4618d(m4621a3, 0.38f, m4621a2)});
        }
        return this.f15132e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15133f && C1045b.m11268a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f15133f = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C1045b.m11266c(this, colorStateList);
    }
}
