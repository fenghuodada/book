package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import androidx.appcompat.graphics.drawable.C0171d;

/* renamed from: androidx.interpolator.view.animation.d  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AbstractanimationInterpolatorC1439d implements Interpolator {

    /* renamed from: a */
    public final float[] f3374a;

    /* renamed from: b */
    public final float f3375b;

    public AbstractanimationInterpolatorC1439d(float[] fArr) {
        this.f3374a = fArr;
        this.f3375b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3374a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f3375b;
        float f3 = fArr[min];
        return C0171d.m12907a(fArr[min + 1], f3, (f - (min * f2)) / f2, f3);
    }
}
