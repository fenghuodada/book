package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.C9549a;

/* renamed from: com.unity3d.services.core.misc.k */
/* loaded from: classes3.dex */
public class C9565k {
    /* renamed from: a */
    public static float m1983a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static void m1982a(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            ((ViewGroup) view.getParent()).removeView(view);
        } catch (Exception e) {
            C9549a.m2023a("Error while removing view from it's parent", e);
        }
    }

    /* renamed from: a */
    public static void m1981a(View view, Drawable drawable) {
        try {
            View.class.getMethod("setBackground", Drawable.class).invoke(view, drawable);
        } catch (Exception e) {
            C9549a.m2023a("Couldn't run".concat("setBackground"), e);
        }
    }

    /* renamed from: b */
    public static float m1980b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }
}
