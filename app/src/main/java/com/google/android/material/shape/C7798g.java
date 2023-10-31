package com.google.android.material.shape;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.material.elevation.C7714a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.shape.g */
/* loaded from: classes3.dex */
public final class C7798g {
    @NonNull
    /* renamed from: a */
    public static C7795d m4462a(int i) {
        if (i != 0) {
            if (i != 1) {
                return new C7800i();
            }
            return new C7796e();
        }
        return new C7800i();
    }

    /* renamed from: b */
    public static void m4461b(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        boolean z;
        C7714a c7714a = materialShapeDrawable.f15183a.f15207b;
        if (c7714a != null && c7714a.f14924a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                f += ViewCompat.C0819i.m11713i((View) parent);
            }
            MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
            if (c7791b.f15218m != f) {
                c7791b.f15218m = f;
                materialShapeDrawable.m4464n();
            }
        }
    }
}
