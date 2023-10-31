package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C1640o extends RecyclerView.AbstractC1591u {

    /* renamed from: k */
    public PointF f3994k;

    /* renamed from: l */
    public final DisplayMetrics f3995l;

    /* renamed from: n */
    public float f3997n;

    /* renamed from: i */
    public final LinearInterpolator f3992i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f3993j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f3996m = false;

    /* renamed from: o */
    public int f3998o = 0;

    /* renamed from: p */
    public int f3999p = 0;

    public C1640o(Context context) {
        this.f3995l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1591u
    /* renamed from: c */
    public void mo10110c(View view, RecyclerView.AbstractC1591u.C1592a c1592a) {
        int i;
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f3994k;
        int i5 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i4 > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        int mo4685f = mo4685f(i, view);
        PointF pointF2 = this.f3994k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i3 > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        } else {
            i2 = 0;
        }
        RecyclerView.LayoutManager layoutManager = this.f3760c;
        if (layoutManager != null && layoutManager.mo10230f()) {
            RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
            i5 = mo9321e(RecyclerView.LayoutManager.m10343D(view) - ((ViewGroup.MarginLayoutParams) c1579k).topMargin, RecyclerView.LayoutManager.m10307z(view) + ((ViewGroup.MarginLayoutParams) c1579k).bottomMargin, layoutManager.m10337J(), layoutManager.f3729o - layoutManager.m10340G(), i2);
        }
        int ceil = (int) Math.ceil(mo10109h((int) Math.sqrt((i5 * i5) + (mo4685f * mo4685f))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3993j;
            c1592a.f3766a = -mo4685f;
            c1592a.f3767b = -i5;
            c1592a.f3768c = ceil;
            c1592a.f3770e = decelerateInterpolator;
            c1592a.f3771f = true;
        }
    }

    /* renamed from: e */
    public int mo9321e(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    /* renamed from: f */
    public int mo4685f(int i, View view) {
        RecyclerView.LayoutManager layoutManager = this.f3760c;
        if (layoutManager != null && layoutManager.mo10232e()) {
            RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
            return mo9321e(RecyclerView.LayoutManager.m10346B(view) - ((ViewGroup.MarginLayoutParams) c1579k).leftMargin, RecyclerView.LayoutManager.m10344C(view) + ((ViewGroup.MarginLayoutParams) c1579k).rightMargin, layoutManager.m10339H(), layoutManager.f3728n - layoutManager.m10338I(), i);
        }
        return 0;
    }

    /* renamed from: g */
    public float mo4607g(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: h */
    public int mo10109h(int i) {
        float abs = Math.abs(i);
        if (!this.f3996m) {
            this.f3997n = mo4607g(this.f3995l);
            this.f3996m = true;
        }
        return (int) Math.ceil(abs * this.f3997n);
    }
}
