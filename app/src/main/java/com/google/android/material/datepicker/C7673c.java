package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7773b;
import com.google.android.material.resources.C7774c;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes3.dex */
public final class C7673c {
    @NonNull

    /* renamed from: a */
    public final C7671b f14835a;
    @NonNull

    /* renamed from: b */
    public final C7671b f14836b;
    @NonNull

    /* renamed from: c */
    public final C7671b f14837c;
    @NonNull

    /* renamed from: d */
    public final C7671b f14838d;
    @NonNull

    /* renamed from: e */
    public final C7671b f14839e;
    @NonNull

    /* renamed from: f */
    public final C7671b f14840f;
    @NonNull

    /* renamed from: g */
    public final C7671b f14841g;
    @NonNull

    /* renamed from: h */
    public final Paint f14842h;

    public C7673c(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7773b.m4496c(context, R.attr.materialCalendarStyle, C7688j.class.getCanonicalName()).data, C7621c.f14592l);
        this.f14835a = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f14841g = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f14836b = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f14837c = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList m4495a = C7774c.m4495a(context, obtainStyledAttributes, 6);
        this.f14838d = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f14839e = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f14840f = C7671b.m4609a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f14842h = paint;
        paint.setColor(m4495a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
