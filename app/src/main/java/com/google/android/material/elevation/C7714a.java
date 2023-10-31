package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0689a;
import com.ambrose.overwall.R;
import com.google.android.material.color.C7661a;
import com.google.android.material.resources.C7773b;

/* renamed from: com.google.android.material.elevation.a */
/* loaded from: classes3.dex */
public final class C7714a {

    /* renamed from: f */
    public static final int f14923f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f14924a;

    /* renamed from: b */
    public final int f14925b;

    /* renamed from: c */
    public final int f14926c;

    /* renamed from: d */
    public final int f14927d;

    /* renamed from: e */
    public final float f14928e;

    public C7714a(@NonNull Context context) {
        boolean m4497b = C7773b.m4497b(context, R.attr.elevationOverlayEnabled, false);
        int m4620b = C7661a.m4620b(context, R.attr.elevationOverlayColor, 0);
        int m4620b2 = C7661a.m4620b(context, R.attr.elevationOverlayAccentColor, 0);
        int m4620b3 = C7661a.m4620b(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f14924a = m4497b;
        this.f14925b = m4620b;
        this.f14926c = m4620b2;
        this.f14927d = m4620b3;
        this.f14928e = f;
    }

    @ColorInt
    /* renamed from: a */
    public final int m4572a(float f, @ColorInt int i) {
        boolean z;
        float f2;
        float f3;
        int i2;
        if (this.f14924a) {
            if (C0689a.m11970c(i, 255) == this.f14927d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f14928e > 0.0f && f > 0.0f) {
                    f3 = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f3 = 0.0f;
                }
                int alpha = Color.alpha(i);
                int m4618d = C7661a.m4618d(C0689a.m11970c(i, 255), f3, this.f14925b);
                if (f3 > 0.0f && (i2 = this.f14926c) != 0) {
                    m4618d = C0689a.m11971b(C0689a.m11970c(i2, f14923f), m4618d);
                }
                return C0689a.m11970c(m4618d, alpha);
            }
        }
        return i;
    }
}
