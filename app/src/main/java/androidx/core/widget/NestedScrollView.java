package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.core.view.C0851a;
import androidx.core.view.C0910e0;
import androidx.core.view.C0922g2;
import androidx.core.view.C0926h0;
import androidx.core.view.InterfaceC0905d0;
import androidx.core.view.InterfaceC0920g0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.C0881q;
import androidx.core.widget.C1047d;
import com.ambrose.overwall.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0920g0, InterfaceC0905d0 {

    /* renamed from: A */
    public static final float f2669A = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B */
    public static final C1031a f2670B = new C1031a();

    /* renamed from: C */
    public static final int[] f2671C = {16843130};

    /* renamed from: a */
    public final float f2672a;

    /* renamed from: b */
    public long f2673b;

    /* renamed from: c */
    public final Rect f2674c;

    /* renamed from: d */
    public OverScroller f2675d;
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    @VisibleForTesting

    /* renamed from: e */
    public final EdgeEffect f2676e;
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    @VisibleForTesting

    /* renamed from: f */
    public final EdgeEffect f2677f;

    /* renamed from: g */
    public int f2678g;

    /* renamed from: h */
    public boolean f2679h;

    /* renamed from: i */
    public boolean f2680i;

    /* renamed from: j */
    public View f2681j;

    /* renamed from: k */
    public boolean f2682k;

    /* renamed from: l */
    public VelocityTracker f2683l;

    /* renamed from: m */
    public boolean f2684m;

    /* renamed from: n */
    public boolean f2685n;

    /* renamed from: o */
    public int f2686o;

    /* renamed from: p */
    public int f2687p;

    /* renamed from: q */
    public int f2688q;

    /* renamed from: r */
    public int f2689r;

    /* renamed from: s */
    public final int[] f2690s;

    /* renamed from: t */
    public final int[] f2691t;

    /* renamed from: u */
    public int f2692u;

    /* renamed from: v */
    public int f2693v;

    /* renamed from: w */
    public C1034d f2694w;

    /* renamed from: x */
    public final C0926h0 f2695x;

    /* renamed from: y */
    public final C0910e0 f2696y;

    /* renamed from: z */
    public float f2697z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    public static class C1031a extends C0851a {
        @Override // androidx.core.view.C0851a
        /* renamed from: c */
        public final void mo4531c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo4531c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0881q.m11541c(accessibilityEvent, nestedScrollView.getScrollX());
            C0881q.m11540d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, C0874o c0874o) {
            int scrollRange;
            this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0874o.m11551g(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                c0874o.m11548j(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c0874o.m11556b(C0874o.C0875a.f2611g);
                    c0874o.m11556b(C0874o.C0875a.f2615k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c0874o.m11556b(C0874o.C0875a.f2610f);
                    c0874o.m11556b(C0874o.C0875a.f2616l);
                }
            }
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: g */
        public final boolean mo4307g(View view, int i, Bundle bundle) {
            if (super.mo4307g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m11306u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m11306u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public static class C1032b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m11303a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1033c {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    /* loaded from: classes.dex */
    public static class C1034d extends View.BaseSavedState {
        public static final Parcelable.Creator<C1034d> CREATOR = new C1035a();

        /* renamed from: a */
        public int f2698a;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        /* loaded from: classes.dex */
        public class C1035a implements Parcelable.Creator<C1034d> {
            @Override // android.os.Parcelable.Creator
            public final C1034d createFromParcel(Parcel parcel) {
                return new C1034d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C1034d[] newArray(int i) {
                return new C1034d[i];
            }
        }

        public C1034d(Parcel parcel) {
            super(parcel);
            this.f2698a = parcel.readInt();
        }

        public C1034d(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return C0539e.m12264b(sb, this.f2698a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2698a);
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f2674c = new Rect();
        this.f2679h = true;
        this.f2680i = false;
        this.f2681j = null;
        this.f2682k = false;
        this.f2685n = true;
        this.f2689r = -1;
        this.f2690s = new int[2];
        this.f2691t = new int[2];
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = C1047d.C1049b.m11260a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f2676e = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = C1047d.C1049b.m11260a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f2677f = edgeEffect2;
        this.f2672a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2675d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2686o = viewConfiguration.getScaledTouchSlop();
        this.f2687p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2688q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2671C, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2695x = new C0926h0();
        this.f2696y = new C0910e0(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m11771n(this, f2670B);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2697z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2697z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2697z;
    }

    /* renamed from: h */
    public static boolean m11314h(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m11314h((View) parent, view2);
    }

    /* renamed from: a */
    public final boolean m11321a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m11313i(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f2674c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m11319c(m11320b(rect));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m11319c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!m11313i(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final int m11320b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: c */
    public final void m11319c(int i) {
        if (i != 0) {
            if (this.f2685n) {
                m11306u(0, i, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public final void m11318d() {
        this.f2682k = false;
        VelocityTracker velocityTracker = this.f2683l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2683l = null;
        }
        m11304w(0);
        this.f2676e.onRelease();
        this.f2677f.onRelease();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m11317e(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2696y.m11495a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2696y.m11494b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return this.f2696y.m11493c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return this.f2696y.m11491e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2676e;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C1032b.m11303a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C1032b.m11303a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11754k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2677f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C1032b.m11303a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (C1032b.m11303a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                ViewCompat.C0814d.m11754k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11317e(@androidx.annotation.NonNull android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m11317e(android.view.KeyEvent):boolean");
    }

    /* renamed from: f */
    public final void m11316f(int i) {
        if (getChildCount() > 0) {
            this.f2675d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2696y.m11489g(2, 1);
            this.f2693v = getScrollY();
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    /* renamed from: g */
    public final boolean m11315g(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2674c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return m11308s(i, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0926h0 c0926h0 = this.f2695x;
        return c0926h0.f2636b | c0926h0.f2635a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2696y.m11490f(0) != null;
    }

    /* renamed from: i */
    public final boolean m11313i(View view, int i, int i2) {
        Rect rect = this.f2674c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2696y.f2628d;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: j */
    public final void mo2713j(int i, @NonNull View view) {
        C0926h0 c0926h0 = this.f2695x;
        if (i == 1) {
            c0926h0.f2636b = 0;
        } else {
            c0926h0.f2635a = 0;
        }
        m11304w(i);
    }

    @Override // androidx.core.view.InterfaceC0920g0
    /* renamed from: k */
    public final void mo11312k(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        m11311p(i4, i5, iArr);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public final void mo2712l(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        m11311p(i4, i5, null);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: m */
    public final boolean mo2711m(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(@NonNull View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: n */
    public final void mo2710n(@NonNull View view, @NonNull View view2, int i, int i2) {
        C0926h0 c0926h0 = this.f2695x;
        if (i2 == 1) {
            c0926h0.f2636b = i;
        } else {
            c0926h0.f2635a = i;
        }
        this.f2696y.m11489g(2, i2);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: o */
    public final void mo2709o(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        this.f2696y.m11493c(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2680i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(@androidx.annotation.NonNull android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto Lbe
            boolean r0 = r8.f2682k
            if (r0 != 0) goto Lbe
            r0 = 2
            boolean r0 = androidx.core.view.C0900c0.m11519a(r9, r0)
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 9
            goto L22
        L18:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.C0900c0.m11519a(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
        L22:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L27:
            r0 = r1
        L28:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbe
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 >= 0) goto L79
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L54
            if (r1 != r4) goto L52
            int r1 = r8.getScrollRange()
            if (r1 <= 0) goto L52
            goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L5f
            boolean r9 = androidx.core.view.C0900c0.m11519a(r9, r6)
            if (r9 != 0) goto L5f
            r9 = r4
            goto L60
        L5f:
            r9 = r2
        L60:
            if (r9 == 0) goto L77
            float r9 = (float) r0
            float r9 = -r9
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f2676e
            androidx.core.widget.C1047d.m11262b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r9 = r4
            goto Lb3
        L77:
            r9 = r2
            goto Lb3
        L79:
            if (r0 <= r1) goto Lb1
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L8c
            if (r7 != r4) goto L8a
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L8a
            goto L8c
        L8a:
            r7 = r2
            goto L8d
        L8c:
            r7 = r4
        L8d:
            if (r7 == 0) goto L97
            boolean r9 = androidx.core.view.C0900c0.m11519a(r9, r6)
            if (r9 != 0) goto L97
            r9 = r4
            goto L98
        L97:
            r9 = r2
        L98:
            if (r9 == 0) goto Lae
            int r0 = r0 - r1
            float r9 = (float) r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f2677f
            androidx.core.widget.C1047d.m11262b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r2 = r4
        Lae:
            r9 = r2
            r2 = r1
            goto Lb3
        Lb1:
            r9 = r2
            r2 = r0
        Lb3:
            if (r2 == r3) goto Lbd
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r4
        Lbd:
            return r9
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f2679h = false;
        View view = this.f2681j;
        if (view != null && m11314h(view, this)) {
            View view2 = this.f2681j;
            Rect rect = this.f2674c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m11320b = m11320b(rect);
            if (m11320b != 0) {
                scrollBy(0, m11320b);
            }
        }
        this.f2681j = null;
        if (!this.f2680i) {
            if (this.f2694w != null) {
                scrollTo(getScrollX(), this.f2694w.f2698a);
                this.f2694w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2680i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2684m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m11316f((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        mo2709o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        m11311p(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        mo2710n(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ m11313i(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1034d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1034d c1034d = (C1034d) parcelable;
        super.onRestoreInstanceState(c1034d.getSuperState());
        this.f2694w = c1034d;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        C1034d c1034d = new C1034d(super.onSaveInstanceState());
        c1034d.f2698a = getScrollY();
        return c1034d;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m11313i(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f2674c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        m11319c(m11320b(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return mo2711m(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@NonNull View view) {
        mo2713j(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x024e, code lost:
        if (m11307t(r10, r2) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m11311p(int i, int i2, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2696y.m11492d(scrollY2, i - scrollY2, i2, iArr);
    }

    /* renamed from: q */
    public final void m11310q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2689r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2678g = (int) motionEvent.getY(i);
            this.f2689r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2683l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11309r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            androidx.core.view.e0 r2 = r9.f2696y
            android.view.ViewParent r2 = r2.m11490f(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f2675d
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m11309r(int, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f2679h) {
            Rect rect = this.f2674c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m11320b = m11320b(rect);
            if (m11320b != 0) {
                scrollBy(0, m11320b);
            }
        } else {
            this.f2681j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m11320b = m11320b(rect);
        if (m11320b != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, m11320b);
            } else {
                m11306u(0, m11320b, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f2683l) != null) {
            velocityTracker.recycle();
            this.f2683l = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2679h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m11308s(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m11319c(i4);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2684m) {
            this.f2684m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0910e0 c0910e0 = this.f2696y;
        if (c0910e0.f2628d) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0819i.m11696z(c0910e0.f2627c);
        }
        c0910e0.f2628d = z;
    }

    public void setOnScrollChangeListener(@Nullable InterfaceC1033c interfaceC1033c) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2685n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f2696y.m11489g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m11304w(0);
    }

    /* renamed from: t */
    public final boolean m11307t(@NonNull EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float m11263a = C1047d.m11263a(edgeEffect) * getHeight();
        float f = this.f2672a * 0.015f;
        double log = Math.log((Math.abs(-i) * 0.35f) / f);
        double d = f2669A;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < m11263a) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m11306u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2673b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2675d;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                this.f2696y.m11489g(2, 1);
            } else {
                m11304w(1);
            }
            this.f2693v = getScrollY();
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        } else {
            if (!this.f2675d.isFinished()) {
                this.f2675d.abortAnimation();
                m11304w(1);
            }
            scrollBy(i, i2);
        }
        this.f2673b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m11305v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f2676e;
        if (C1047d.m11263a(edgeEffect) != 0.0f) {
            C1047d.m11262b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2677f;
        if (C1047d.m11263a(edgeEffect2) != 0.0f) {
            C1047d.m11262b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: w */
    public final void m11304w(int i) {
        this.f2696y.m11488h(i);
    }
}
