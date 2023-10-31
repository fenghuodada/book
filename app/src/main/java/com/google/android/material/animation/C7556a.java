package com.google.android.material.animation;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.C0171d;
import androidx.interpolator.view.animation.C1436a;
import androidx.interpolator.view.animation.C1437b;
import androidx.interpolator.view.animation.C1438c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.animation.a */
/* loaded from: classes3.dex */
public final class C7556a {

    /* renamed from: a */
    public static final LinearInterpolator f14282a = new LinearInterpolator();

    /* renamed from: b */
    public static final C1437b f14283b = new C1437b();

    /* renamed from: c */
    public static final C1436a f14284c = new C1436a();

    /* renamed from: d */
    public static final C1438c f14285d = new C1438c();

    /* renamed from: e */
    public static final DecelerateInterpolator f14286e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m4809a(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : C0171d.m12907a(f2, f, (f5 - f3) / (f4 - f3), f);
    }
}
