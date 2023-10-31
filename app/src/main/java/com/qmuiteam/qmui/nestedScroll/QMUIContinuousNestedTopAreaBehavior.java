package com.qmuiteam.qmui.nestedScroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.qmuiteam.qmui.C8997a;

/* loaded from: classes3.dex */
public class QMUIContinuousNestedTopAreaBehavior extends QMUIViewOffsetBehavior<View> {

    /* renamed from: c */
    public final RunnableC9079a f17406c;

    /* renamed from: d */
    public final int[] f17407d;

    /* renamed from: e */
    public boolean f17408e;

    /* renamed from: f */
    public int f17409f;

    /* renamed from: g */
    public int f17410g;

    /* renamed from: h */
    public int f17411h;

    /* renamed from: i */
    public VelocityTracker f17412i;

    /* renamed from: j */
    public boolean f17413j;

    /* renamed from: k */
    public final boolean f17414k;

    /* renamed from: com.qmuiteam.qmui.nestedScroll.QMUIContinuousNestedTopAreaBehavior$a */
    /* loaded from: classes3.dex */
    public class RunnableC9079a implements Runnable {

        /* renamed from: a */
        public int f17415a;

        /* renamed from: b */
        public OverScroller f17416b;

        /* renamed from: c */
        public C8997a.animationInterpolatorC8998a f17417c;

        /* renamed from: d */
        public boolean f17418d;

        /* renamed from: e */
        public boolean f17419e;

        /* renamed from: f */
        public CoordinatorLayout f17420f;

        /* renamed from: g */
        public View f17421g;

        public RunnableC9079a(Context context) {
            C8997a.animationInterpolatorC8998a animationinterpolatorc8998a = C8997a.f17184c;
            this.f17417c = animationinterpolatorc8998a;
            this.f17418d = false;
            this.f17419e = false;
            this.f17416b = new OverScroller(context, animationinterpolatorc8998a);
        }

        /* renamed from: b */
        public final void m2725b() {
            View view = this.f17421g;
            if (view != null) {
                view.removeCallbacks(this);
            }
            this.f17416b.abortAnimation();
            this.f17421g = null;
            this.f17420f = null;
            QMUIContinuousNestedTopAreaBehavior.this.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r7 = this;
                r0 = 0
                r7.f17419e = r0
                r1 = 1
                r7.f17418d = r1
                android.widget.OverScroller r2 = r7.f17416b
                boolean r3 = r2.computeScrollOffset()
                com.qmuiteam.qmui.nestedScroll.QMUIContinuousNestedTopAreaBehavior r4 = com.qmuiteam.qmui.nestedScroll.QMUIContinuousNestedTopAreaBehavior.this
                if (r3 == 0) goto L66
                int r2 = r2.getCurrY()
                int r3 = r7.f17415a
                int r3 = r2 - r3
                r7.f17415a = r2
                androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r7.f17420f
                if (r2 == 0) goto L66
                android.view.View r5 = r7.f17421g
                if (r5 == 0) goto L66
                boolean r5 = r2 instanceof com.qmuiteam.qmui.nestedScroll.C9084d
                if (r5 == 0) goto L3f
                com.qmuiteam.qmui.nestedScroll.d r2 = (com.qmuiteam.qmui.nestedScroll.C9084d) r2
                if (r3 <= 0) goto L35
                int r5 = r2.getCurrentScroll()
                int r6 = r2.getScrollRange()
                if (r5 < r6) goto L35
                goto L3d
            L35:
                if (r3 >= 0) goto L3f
                int r2 = r2.getCurrentScroll()
                if (r2 > 0) goto L3f
            L3d:
                r2 = r0
                goto L40
            L3f:
                r2 = r1
            L40:
                if (r2 == 0) goto L61
                androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r7.f17420f
                android.view.View r5 = r7.f17421g
                r4.m2726w(r2, r5, r3)
                boolean r2 = r7.f17418d
                if (r2 == 0) goto L50
                r7.f17419e = r1
                goto L66
            L50:
                android.view.View r1 = r7.f17421g
                if (r1 == 0) goto L66
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r7.f17420f
                r1.removeCallbacks(r7)
                android.view.View r1 = r7.f17421g
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r2 = androidx.core.view.ViewCompat.f2518a
                androidx.core.view.ViewCompat.C0814d.m11752m(r1, r7)
                goto L66
            L61:
                android.widget.OverScroller r1 = r7.f17416b
                r1.abortAnimation()
            L66:
                r7.f17418d = r0
                boolean r0 = r7.f17419e
                if (r0 == 0) goto L7d
                android.view.View r0 = r7.f17421g
                if (r0 == 0) goto L85
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r7.f17420f
                r0.removeCallbacks(r7)
                android.view.View r0 = r7.f17421g
                java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r1 = androidx.core.view.ViewCompat.f2518a
                androidx.core.view.ViewCompat.C0814d.m11752m(r0, r7)
                goto L85
            L7d:
                r0 = 0
                r7.f17420f = r0
                r7.f17421g = r0
                r4.getClass()
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.nestedScroll.QMUIContinuousNestedTopAreaBehavior.RunnableC9079a.run():void");
        }
    }

    public QMUIContinuousNestedTopAreaBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17407d = new int[2];
        this.f17409f = -1;
        this.f17411h = -1;
        this.f17413j = false;
        this.f17414k = true;
        this.f17406c = new RunnableC9079a(context);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: g */
    public final boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f17411h < 0) {
            this.f17411h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f17408e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex != 0 && !coordinatorLayout.m12120i(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && coordinatorLayout.m12120i(view, (int) motionEvent.getX(actionIndex), (int) motionEvent.getY(actionIndex))) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else {
                    int i = this.f17409f;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.f17410g) > this.f17411h) {
                            this.f17408e = true;
                            if ((view instanceof WebView) || (view instanceof C9086f)) {
                                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.offsetLocation(-view.getLeft(), -view.getTop());
                                if (this.f17414k) {
                                    obtain.setAction(2);
                                } else {
                                    obtain.setAction(3);
                                }
                                view.dispatchTouchEvent(obtain);
                                obtain.recycle();
                            }
                            this.f17410g = y;
                        }
                    }
                }
            }
            this.f17413j = false;
            this.f17408e = false;
            this.f17409f = -1;
            VelocityTracker velocityTracker = this.f17412i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17412i = null;
            }
        } else {
            this.f17406c.m2725b();
            this.f17413j = true;
            this.f17408e = false;
            int y2 = (int) motionEvent.getY();
            if (coordinatorLayout.m12120i(view, (int) motionEvent.getX(), y2)) {
                this.f17410g = y2;
                this.f17409f = motionEvent.getPointerId(0);
                if (this.f17412i == null) {
                    this.f17412i = VelocityTracker.obtain();
                }
            }
        }
        VelocityTracker velocityTracker2 = this.f17412i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.f17408e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: i */
    public final boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        int size = View.MeasureSpec.getSize(i3);
        if (i4 != -1) {
            size = 16777215;
        } else if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m12117r(view, i, i2, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: k */
    public final void mo2728k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, @NonNull int[] iArr, int i3) {
        int height;
        int height2;
        if (view2.getParent() != coordinatorLayout) {
            return;
        }
        if (view2 == view) {
            if (i2 < 0) {
                if (view.getTop() <= i2) {
                    super.mo2721v((view.getTop() - i2) - m2723t());
                    iArr[1] = iArr[1] + i2;
                } else if (view.getTop() < 0) {
                    int top = view.getTop();
                    super.mo2721v(0 - m2723t());
                    iArr[1] = iArr[1] + top;
                }
            }
        } else if (i2 <= 0 || !(view2 instanceof InterfaceC9080a)) {
        } else {
            int m2719c = ((InterfaceC9080a) view2).m2719c();
            int height3 = coordinatorLayout.getHeight();
            if (m2719c != -1) {
                height = height3 - m2719c;
                height2 = view.getHeight();
            } else {
                height = height3 - view.getHeight();
                height2 = view2.getHeight();
            }
            int i4 = height - height2;
            if (view.getTop() - i2 >= i4) {
                super.mo2721v((view.getTop() - i2) - m2723t());
                iArr[1] = iArr[1] + i2;
            } else if (view.getTop() > i4) {
                int top2 = view.getTop() - i4;
                super.mo2721v(i4);
                iArr[1] = iArr[1] + top2;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: l */
    public final void mo2727l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2) {
        int top;
        View view3;
        int top2;
        if (view2.getParent() != coordinatorLayout) {
            return;
        }
        boolean z = false;
        if (view2 == view) {
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < coordinatorLayout.getChildCount()) {
                        view3 = coordinatorLayout.getChildAt(i3);
                        if (view3 instanceof InterfaceC9080a) {
                            break;
                        }
                        i3++;
                    } else {
                        view3 = null;
                        break;
                    }
                }
                if (view3 != null && view3.getVisibility() != 8) {
                    InterfaceC9080a interfaceC9080a = (InterfaceC9080a) view3;
                    int m2719c = interfaceC9080a.m2719c();
                    int height = coordinatorLayout.getHeight();
                    if (m2719c != -1) {
                        height = (view3.getHeight() + coordinatorLayout.getHeight()) - m2719c;
                    } else {
                        z = true;
                    }
                    if (view3.getBottom() - height > i2) {
                        top = view2.getTop();
                    } else {
                        if (view3.getBottom() - height > 0) {
                            super.mo2721v((view2.getTop() - (view3.getBottom() - height)) - m2723t());
                        }
                        if (z) {
                            interfaceC9080a.m2720b();
                            return;
                        }
                        return;
                    }
                } else {
                    int height2 = coordinatorLayout.getHeight();
                    if (view2.getBottom() - height2 >= i2) {
                        top2 = view2.getTop() - i2;
                    } else if (view2.getBottom() - height2 > 0) {
                        top2 = view2.getTop() - (view2.getBottom() - height2);
                    } else {
                        return;
                    }
                    super.mo2721v(top2 - m2723t());
                    return;
                }
            } else {
                return;
            }
        } else if (i2 < 0) {
            if (view.getTop() <= i2) {
                top = view.getTop();
            } else {
                if (view.getTop() < 0) {
                    int top3 = view.getTop();
                    super.mo2721v(0 - m2723t());
                    if (i2 != Integer.MIN_VALUE) {
                        i = i2 - top3;
                    }
                    i2 = i;
                }
                if (view instanceof InterfaceC9083c) {
                    ((InterfaceC9083c) view).mo2715d(i2);
                    return;
                }
                return;
            }
        } else {
            return;
        }
        super.mo2721v((top - i2) - m2723t());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: q */
    public final boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r4 != 3) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2597s(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r19, @androidx.annotation.NonNull android.view.View r20, @androidx.annotation.NonNull android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.nestedScroll.QMUIContinuousNestedTopAreaBehavior.mo2597s(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.qmuiteam.qmui.nestedScroll.QMUIViewOffsetBehavior
    /* renamed from: v */
    public final boolean mo2721v(int i) {
        throw null;
    }

    /* renamed from: w */
    public final void m2726w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        int[] iArr = this.f17407d;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2728k(coordinatorLayout, view, view, 0, i, iArr, 0);
        int i2 = i - iArr[1];
        if (view instanceof InterfaceC9083c) {
            i2 = ((InterfaceC9083c) view).mo2715d(i2);
        }
        int i3 = i2;
        mo2727l(coordinatorLayout, view, view, i - i3, i3);
    }
}
