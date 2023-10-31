package com.qmuiteam.qmui;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.C1436a;
import androidx.interpolator.view.animation.C1437b;
import androidx.interpolator.view.animation.C1438c;

/* renamed from: com.qmuiteam.qmui.a */
/* loaded from: classes3.dex */
public final class C8997a {

    /* renamed from: a */
    public static final C1436a f17182a;

    /* renamed from: b */
    public static final C1438c f17183b;

    /* renamed from: c */
    public static final animationInterpolatorC8998a f17184c;

    /* renamed from: com.qmuiteam.qmui.a$a  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class animationInterpolatorC8998a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    static {
        new LinearInterpolator();
        new C1437b();
        f17182a = new C1436a();
        f17183b = new C1438c();
        new DecelerateInterpolator();
        new AccelerateInterpolator();
        new AccelerateDecelerateInterpolator();
        f17184c = new animationInterpolatorC8998a();
    }
}
