package com.android.tool.util.weight.sectionDialog;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1640o;

/* renamed from: com.android.tool.util.weight.sectionDialog.a */
/* loaded from: classes.dex */
public final class C2623a extends C1640o {
    public C2623a(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.C1640o
    /* renamed from: e */
    public final int mo9321e(int i, int i2, int i3, int i4, int i5) {
        return (((i4 - i3) / 2) + i3) - (((i2 - i) / 2) + i);
    }

    @Override // androidx.recyclerview.widget.C1640o
    /* renamed from: g */
    public final float mo4607g(DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }
}
