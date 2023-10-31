package com.qmuiteam.qmui.nestedScroll;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.qmuiteam.qmui.nestedScroll.C9087g;

/* renamed from: com.qmuiteam.qmui.nestedScroll.d */
/* loaded from: classes3.dex */
public final class C9084d extends CoordinatorLayout implements C9087g.InterfaceC9089b {

    /* renamed from: A */
    public boolean f17425A;

    /* renamed from: y */
    public C9087g f17426y;

    /* renamed from: z */
    public boolean f17427z;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            motionEvent.getAction();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public QMUIContinuousNestedBottomAreaBehavior getBottomAreaBehavior() {
        return null;
    }

    public InterfaceC9080a getBottomView() {
        return null;
    }

    public int getCurrentScroll() {
        return getOffsetCurrent() + 0;
    }

    public float getCurrentScrollPercent() {
        int scrollRange = getScrollRange();
        if (scrollRange == 0) {
            return 0.0f;
        }
        return (getCurrentScroll() * 1.0f) / scrollRange;
    }

    public int getOffsetCurrent() {
        return 0;
    }

    public int getOffsetRange() {
        return 0;
    }

    public int getScrollRange() {
        return getOffsetRange() + 0;
    }

    public QMUIContinuousNestedTopAreaBehavior getTopAreaBehavior() {
        return null;
    }

    public InterfaceC9083c getTopView() {
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public final void mo2712l(View view, int i, int i2, int i3, int i4, int i5) {
        super.mo2712l(view, i, i2, i3, i4, i5);
        if (i4 > 0) {
            getCurrentScroll();
            getScrollRange();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        removeCallbacks(null);
        post(null);
    }

    public void setDraggableScrollBarEnabled(boolean z) {
        if (this.f17425A != z) {
            this.f17425A = z;
            if (z && !this.f17427z) {
                m2718z();
                this.f17426y.setPercent(getCurrentScrollPercent());
                this.f17426y.m2708a();
            }
            C9087g c9087g = this.f17426y;
            if (c9087g != null) {
                c9087g.setVisibility(z ? 0 : 8);
            }
        }
    }

    public void setEnableScrollBarFadeInOut(boolean z) {
        if (this.f17427z != z) {
            this.f17427z = z;
            if (this.f17425A && !z) {
                m2718z();
                this.f17426y.setPercent(getCurrentScrollPercent());
                this.f17426y.m2708a();
            }
            C9087g c9087g = this.f17426y;
            if (c9087g != null) {
                c9087g.setEnableFadeInAndOut(z);
                this.f17426y.invalidate();
            }
        }
    }

    public void setKeepBottomAreaStableWhenCheckLayout(boolean z) {
    }

    /* renamed from: z */
    public final void m2718z() {
        if (this.f17426y == null) {
            C9087g c9087g = new C9087g(getContext());
            this.f17426y = c9087g;
            c9087g.setEnableFadeInAndOut(this.f17427z);
            this.f17426y.setCallback(this);
            CoordinatorLayout.C0590e c0590e = new CoordinatorLayout.C0590e(-1);
            c0590e.f2215c = 5;
            addView(this.f17426y, c0590e);
        }
    }
}
