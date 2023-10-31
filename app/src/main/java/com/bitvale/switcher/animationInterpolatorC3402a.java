package com.bitvale.switcher;

import android.view.animation.Interpolator;

/* renamed from: com.bitvale.switcher.a  reason: invalid class name */
/* loaded from: classes.dex */
public final class animationInterpolatorC3402a implements Interpolator {

    /* renamed from: a */
    public final double f9002a;

    /* renamed from: b */
    public final double f9003b;

    public animationInterpolatorC3402a(double d, double d2) {
        this.f9002a = d;
        this.f9003b = d2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.cos(this.f9003b * f) * Math.pow(2.718281828459045d, (-f) / this.f9002a) * (-1)) + 1);
    }
}
