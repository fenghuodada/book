package com.qmuiteam.qmui.widget.pullRefreshLayout;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.collection.C0482i;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.nestedScroll.C9084d;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import com.qmuiteam.qmui.widget.section.C9246e;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b */
/* loaded from: classes3.dex */
public final class C9233b extends ViewGroup {

    /* renamed from: a */
    public boolean f17916a;

    /* renamed from: b */
    public View f17917b;

    /* renamed from: c */
    public int f17918c;

    /* renamed from: d */
    public int f17919d;

    /* renamed from: e */
    public boolean f17920e;

    /* renamed from: f */
    public boolean f17921f;

    /* renamed from: g */
    public int f17922g;

    /* renamed from: h */
    public boolean f17923h;

    /* renamed from: i */
    public float f17924i;

    /* renamed from: j */
    public float f17925j;

    /* renamed from: k */
    public float f17926k;

    /* renamed from: l */
    public float f17927l;

    /* renamed from: m */
    public InterfaceC9238e f17928m;

    /* renamed from: n */
    public VelocityTracker f17929n;

    /* renamed from: o */
    public int f17930o;

    /* renamed from: p */
    public boolean f17931p;

    /* renamed from: q */
    public RunnableC9235b f17932q;

    /* renamed from: r */
    public boolean f17933r;

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$a */
    /* loaded from: classes3.dex */
    public class RunnableC9234a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f17934a;

        public RunnableC9234a(boolean z) {
            this.f17934a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9233b c9233b = C9233b.this;
            c9233b.setTargetViewToTop(c9233b.f17917b);
            if (this.f17934a) {
                c9233b.f17930o = 2;
                c9233b.invalidate();
            } else {
                c9233b.m2557d(c9233b.f17919d, true);
            }
            if (c9233b.f17916a) {
                return;
            }
            c9233b.f17916a = true;
            throw null;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$b */
    /* loaded from: classes3.dex */
    public class RunnableC9235b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ long f17936a;

        /* renamed from: b */
        public final /* synthetic */ boolean f17937b;

        public RunnableC9235b(long j, boolean z) {
            this.f17936a = j;
            this.f17937b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9233b.this.m2556e(this.f17936a, this.f17937b);
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9236c {
    }

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC9237d {
    }

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC9238e {
    }

    /* renamed from: com.qmuiteam.qmui.widget.pullRefreshLayout.b$f */
    /* loaded from: classes3.dex */
    public static class C9239f extends AppCompatImageView implements InterfaceC9103a {

        /* renamed from: e */
        public static final C0482i<String, Integer> f17939e;

        /* renamed from: d */
        public int f17940d;

        static {
            C0482i<String, Integer> c0482i = new C0482i<>(4);
            f17939e = c0482i;
            c0482i.put("tintColor", Integer.valueOf((int) R.attr.qmui_skin_support_pull_refresh_view_color));
        }

        @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
        public C0482i<String, Integer> getDefaultSkinAttrs() {
            return f17939e;
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onMeasure(int i, int i2) {
            int i3 = this.f17940d;
            setMeasuredDimension(i3, i3);
        }

        public void setColorSchemeColors(@ColorInt int... iArr) {
            throw null;
        }

        public void setColorSchemeResources(@ColorRes int... iArr) {
            Context context = getContext();
            int[] iArr2 = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                Object obj = ContextCompat.f2323a;
                iArr2[i] = ContextCompat.C0652d.m12030a(context, i2);
            }
            setColorSchemeColors(iArr2);
        }

        public void setSize(int i) {
            if (i == 0 || i == 1) {
                this.f17940d = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
                setImageDrawable(null);
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m2560a(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof C9084d) {
            if (((C9084d) view).getCurrentScroll() <= 0) {
                return false;
            }
            return true;
        } else if (view instanceof C9246e) {
            return m2560a(((C9246e) view).getRecyclerView());
        } else {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return view.canScrollVertically(-1);
        }
    }

    /* renamed from: b */
    public final void m2559b() {
        RunnableC9235b runnableC9235b;
        if (this.f17917b == null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (!childAt.equals(null)) {
                    this.f17917b = childAt;
                    break;
                }
                i++;
            }
        }
        if (this.f17917b == null || (runnableC9235b = this.f17932q) == null) {
            return;
        }
        this.f17932q = null;
        runnableC9235b.run();
    }

    /* renamed from: c */
    public final void m2558c(float f) {
        m2557d((int) (this.f17918c + f), false);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* renamed from: d */
    public final void m2557d(int i, boolean z) {
        int i2 = this.f17919d;
        boolean z2 = this.f17921f;
        int max = Math.max(i, 0);
        if (!z2) {
            max = Math.min(max, i2);
        }
        int i3 = this.f17918c;
        if (max == i3 && !z) {
            return;
        }
        int i4 = max - i3;
        View view = this.f17917b;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        view.offsetTopAndBottom(i4);
        this.f17918c = max;
        int i5 = this.f17919d - 0;
        if (this.f17916a) {
            if (this.f17928m == null) {
                this.f17928m = new C9232a();
            }
            throw null;
        }
        Math.min(max - 0, i5);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (this.f17931p) {
                if (action == 2) {
                    if (!this.f17916a) {
                        throw null;
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (this.f17916a || (this.f17930o & 4) != 0) {
            z = true;
        }
        this.f17931p = z;
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m2556e(long j, boolean z) {
        if (this.f17917b == null) {
            this.f17932q = new RunnableC9235b(j, z);
            return;
        }
        RunnableC9234a runnableC9234a = new RunnableC9234a(z);
        if (j == 0) {
            runnableC9234a.run();
        } else {
            postDelayed(runnableC9234a, j);
        }
    }

    /* renamed from: f */
    public final void m2555f(float f, float f2) {
        boolean z;
        float f3 = f - this.f17925j;
        float f4 = f2 - this.f17924i;
        if (Math.abs(f4) > Math.abs(f3)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f5 = 0;
            if ((f4 > f5 || (f4 < f5 && this.f17918c > 0)) && !this.f17923h) {
                this.f17926k = this.f17924i + f5;
                this.f17923h = true;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return i2 == 0 ? i - 1 : i2 > 0 ? i2 - 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public int getRefreshEndOffset() {
        return 0;
    }

    public int getRefreshInitOffset() {
        return 0;
    }

    public float getScrollerFriction() {
        return ViewConfiguration.getScrollFriction();
    }

    public int getTargetInitOffset() {
        return 0;
    }

    public int getTargetRefreshOffset() {
        return this.f17919d;
    }

    public View getTargetView() {
        return this.f17917b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2559b();
        int action = motionEvent.getAction();
        int i = 0;
        if (!isEnabled() || m2560a(this.f17917b)) {
            return false;
        }
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f17922g) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                this.f17922g = motionEvent.getPointerId(i);
                            }
                        }
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f17922g);
                    if (findPointerIndex < 0) {
                        Log.e("QMUIPullRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    m2555f(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
                }
            }
            this.f17923h = false;
            this.f17922g = -1;
        } else {
            this.f17923h = false;
            int pointerId = motionEvent.getPointerId(0);
            this.f17922g = pointerId;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f17925j = motionEvent.getX(findPointerIndex2);
            this.f17924i = motionEvent.getY(findPointerIndex2);
        }
        return this.f17923h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        m2559b();
        if (this.f17917b == null) {
            Log.d("QMUIPullRefreshLayout", "onLayout: mTargetView == null");
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop2 = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        View view = this.f17917b;
        int i5 = this.f17918c;
        view.layout(paddingLeft, paddingTop + i5, paddingLeft2 + paddingLeft, paddingTop + paddingTop2 + i5);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        View.MeasureSpec.makeMeasureSpec((size2 - getPaddingTop()) - getPaddingBottom(), 1073741824);
        measureChild(null, i, i2);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        try {
            return super.onNestedFling(view, f, f2, z);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.f17918c <= 0) {
            return false;
        }
        this.f17923h = false;
        if (this.f17931p) {
            return true;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.f17918c - 0;
        if (i2 > 0 && i3 > 0) {
            if (i2 >= i3) {
                iArr[1] = i3;
                m2557d(0, false);
                return;
            }
            iArr[1] = i2;
            m2558c(-i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (i4 < 0 && !m2560a(this.f17917b)) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (this.f17920e || !isEnabled() || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 0;
        if (isEnabled() && !m2560a(this.f17917b)) {
            if (this.f17929n == null) {
                this.f17929n = VelocityTracker.obtain();
            }
            this.f17929n.addMovement(motionEvent);
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == this.f17922g) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        this.f17922g = motionEvent.getPointerId(i);
                                    }
                                }
                            } else {
                                int actionIndex2 = motionEvent.getActionIndex();
                                if (actionIndex2 < 0) {
                                    Log.e("QMUIPullRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.f17922g = motionEvent.getPointerId(actionIndex2);
                            }
                        } else {
                            VelocityTracker velocityTracker = this.f17929n;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                                this.f17929n.recycle();
                                this.f17929n = null;
                            }
                            return false;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f17922g);
                        if (findPointerIndex < 0) {
                            Log.e("QMUIPullRefreshLayout", "onTouchEvent Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        m2555f(x, y);
                        if (this.f17923h) {
                            float f = (y - this.f17926k) * this.f17927l;
                            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                            m2558c(f);
                            if (i2 < 0) {
                                float abs = Math.abs(f) - Math.abs(0);
                                if (abs > 0.0f) {
                                    motionEvent.setAction(0);
                                    float f2 = 1;
                                    if (abs <= f2) {
                                        abs = f2;
                                    }
                                    motionEvent.offsetLocation(0.0f, abs);
                                    super.dispatchTouchEvent(motionEvent);
                                    motionEvent.setAction(action);
                                    motionEvent.offsetLocation(0.0f, -abs);
                                    super.dispatchTouchEvent(motionEvent);
                                }
                            }
                            this.f17926k = y;
                        }
                    }
                    return true;
                } else if (motionEvent.findPointerIndex(this.f17922g) < 0) {
                    Log.e("QMUIPullRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                } else if (!this.f17923h) {
                    this.f17922g = -1;
                    VelocityTracker velocityTracker2 = this.f17929n;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                        this.f17929n.recycle();
                        this.f17929n = null;
                    }
                    return false;
                } else {
                    this.f17923h = false;
                    this.f17929n.computeCurrentVelocity(1000, 0.0f);
                    Math.abs(this.f17929n.getYVelocity(this.f17922g));
                    throw null;
                }
            }
            this.f17923h = false;
            this.f17930o = 0;
            throw null;
        }
        Log.d("QMUIPullRefreshLayout", "fast end onTouchEvent: isEnabled = " + isEnabled() + "; canChildScrollUp = " + m2560a(this.f17917b) + " ; mNestedScrollInProgress = false");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f17933r) {
            super.requestDisallowInterceptTouchEvent(z);
            this.f17933r = false;
        }
        View view = this.f17917b;
        if (view != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (!ViewCompat.C0819i.m11706p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAutoScrollToRefreshMinOffset(int i) {
    }

    public void setChildScrollUpCallback(InterfaceC9236c interfaceC9236c) {
    }

    public void setDisableNestScrollImpl(boolean z) {
        this.f17920e = z;
    }

    public void setDragRate(float f) {
        this.f17920e = true;
        this.f17927l = f;
    }

    public void setEnableOverPull(boolean z) {
        this.f17921f = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        throw null;
    }

    public void setOnPullListener(InterfaceC9237d interfaceC9237d) {
    }

    public void setRefreshOffsetCalculator(InterfaceC9238e interfaceC9238e) {
        this.f17928m = interfaceC9238e;
    }

    public void setTargetRefreshOffset(int i) {
        this.f17919d = i;
    }

    public void setTargetViewToTop(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).m10380a0(0);
        } else if (view instanceof AbsListView) {
            ((AbsListView) view).setSelectionFromTop(0, 0);
        } else {
            view.scrollTo(0, 0);
        }
    }

    public void setToRefreshDirectly(long j) {
        m2556e(j, true);
    }
}
