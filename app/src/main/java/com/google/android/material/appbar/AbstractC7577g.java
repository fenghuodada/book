package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.C0728a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.appbar.g */
/* loaded from: classes3.dex */
public abstract class AbstractC7577g<V extends View> extends C7580i<V> {
    @Nullable

    /* renamed from: c */
    public RunnableC7578a f14357c;

    /* renamed from: d */
    public OverScroller f14358d;

    /* renamed from: e */
    public boolean f14359e;

    /* renamed from: f */
    public int f14360f;

    /* renamed from: g */
    public int f14361g;

    /* renamed from: h */
    public int f14362h;
    @Nullable

    /* renamed from: i */
    public VelocityTracker f14363i;

    /* renamed from: com.google.android.material.appbar.g$a */
    /* loaded from: classes3.dex */
    public class RunnableC7578a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f14364a;

        /* renamed from: b */
        public final V f14365b;

        public RunnableC7578a(CoordinatorLayout coordinatorLayout, V v) {
            this.f14364a = coordinatorLayout;
            this.f14365b = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC7577g abstractC7577g;
            OverScroller overScroller;
            V v = this.f14365b;
            if (v != null && (overScroller = (abstractC7577g = AbstractC7577g.this).f14358d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f14364a;
                if (computeScrollOffset) {
                    abstractC7577g.m4783B(coordinatorLayout, v, abstractC7577g.f14358d.getCurrY());
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11752m(v, this);
                    return;
                }
                abstractC7577g.mo4778z(v, coordinatorLayout);
            }
        }
    }

    public AbstractC7577g() {
        this.f14360f = -1;
        this.f14362h = -1;
    }

    public AbstractC7577g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14360f = -1;
        this.f14362h = -1;
    }

    /* renamed from: A */
    public int mo4784A(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int m11870a;
        int m4774t = m4774t();
        if (i2 != 0 && m4774t >= i2 && m4774t <= i3 && m4774t != (m11870a = C0728a.m11870a(i, i2, i3))) {
            C7581j c7581j = this.f14371a;
            if (c7581j != null) {
                if (c7581j.f14376d != m11870a) {
                    c7581j.f14376d = m11870a;
                    c7581j.m4772a();
                }
            } else {
                this.f14372b = m11870a;
            }
            return m4774t - m11870a;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public final void m4783B(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo4784A(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public final boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f14362h < 0) {
            this.f14362h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f14359e) {
            int i = this.f14360f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f14361g) > this.f14362h) {
                this.f14361g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f14360f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (mo4782v(v) && coordinatorLayout.m12120i(v, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.f14359e = z;
            if (z) {
                this.f14361g = y2;
                this.f14360f = motionEvent.getPointerId(0);
                if (this.f14363i == null) {
                    this.f14363i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f14358d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f14358d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f14363i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2597s(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r20, @androidx.annotation.NonNull V r21, @androidx.annotation.NonNull android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC7577g.mo2597s(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public boolean mo4782v(V v) {
        return false;
    }

    /* renamed from: w */
    public int mo4781w(@NonNull V v) {
        return -v.getHeight();
    }

    /* renamed from: x */
    public int mo4780x(@NonNull V v) {
        return v.getHeight();
    }

    /* renamed from: y */
    public int mo4779y() {
        return m4774t();
    }

    /* renamed from: z */
    public void mo4778z(View view, CoordinatorLayout coordinatorLayout) {
    }
}
