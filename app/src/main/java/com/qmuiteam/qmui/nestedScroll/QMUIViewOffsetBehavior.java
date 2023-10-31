package com.qmuiteam.qmui.nestedScroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.qmuiteam.qmui.util.C9150j;

/* loaded from: classes3.dex */
public class QMUIViewOffsetBehavior<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {

    /* renamed from: a */
    public C9150j f17423a;

    /* renamed from: b */
    public int f17424b;

    public QMUIViewOffsetBehavior() {
        this.f17424b = 0;
    }

    public QMUIViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17424b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public boolean mo2724h(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo2722u(coordinatorLayout, v, i);
        if (this.f17423a == null) {
            this.f17423a = new C9150j(v);
        }
        this.f17423a.m2625b(true);
        int i2 = this.f17424b;
        if (i2 != 0) {
            this.f17423a.m2623d(i2);
            this.f17424b = 0;
        }
        return true;
    }

    /* renamed from: t */
    public final int m2723t() {
        C9150j c9150j = this.f17423a;
        if (c9150j != null) {
            return c9150j.f17587b;
        }
        return 0;
    }

    /* renamed from: u */
    public void mo2722u(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m12118q(i, v);
    }

    /* renamed from: v */
    public boolean mo2721v(int i) {
        C9150j c9150j = this.f17423a;
        if (c9150j != null) {
            return c9150j.m2623d(i);
        }
        this.f17424b = i;
        return false;
    }
}
