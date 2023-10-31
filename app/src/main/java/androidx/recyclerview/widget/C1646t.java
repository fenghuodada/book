package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public final class C1646t extends C1640o {

    /* renamed from: q */
    public final /* synthetic */ C1647u f4004q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646t(C1647u c1647u, Context context) {
        super(context);
        this.f4004q = c1647u;
    }

    @Override // androidx.recyclerview.widget.C1640o, androidx.recyclerview.widget.RecyclerView.AbstractC1591u
    /* renamed from: c */
    public final void mo10110c(View view, RecyclerView.AbstractC1591u.C1592a c1592a) {
        C1647u c1647u = this.f4004q;
        int[] mo10108a = c1647u.mo10108a(c1647u.f3867a.getLayoutManager(), view);
        int i = mo10108a[0];
        int i2 = mo10108a[1];
        int ceil = (int) Math.ceil(mo10109h(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3993j;
            c1592a.f3766a = i;
            c1592a.f3767b = i2;
            c1592a.f3768c = ceil;
            c1592a.f3770e = decelerateInterpolator;
            c1592a.f3771f = true;
        }
    }

    @Override // androidx.recyclerview.widget.C1640o
    /* renamed from: g */
    public final float mo4607g(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C1640o
    /* renamed from: h */
    public final int mo10109h(int i) {
        return Math.min(100, super.mo10109h(i));
    }
}
