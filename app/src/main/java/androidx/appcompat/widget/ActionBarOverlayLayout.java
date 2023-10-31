package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0107e0;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.C0189g;
import androidx.appcompat.view.menu.C0210g;
import androidx.core.graphics.C0690b;
import androidx.core.view.C0922g2;
import androidx.core.view.C0926h0;
import androidx.core.view.InterfaceC0915f0;
import androidx.core.view.InterfaceC0920g0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0408r0, InterfaceC0915f0, InterfaceC0920g0 {

    /* renamed from: B */
    public static final int[] f815B = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public final C0926h0 f816A;

    /* renamed from: a */
    public int f817a;

    /* renamed from: b */
    public int f818b;

    /* renamed from: c */
    public ContentFrameLayout f819c;

    /* renamed from: d */
    public ActionBarContainer f820d;

    /* renamed from: e */
    public InterfaceC0412s0 f821e;

    /* renamed from: f */
    public Drawable f822f;

    /* renamed from: g */
    public boolean f823g;

    /* renamed from: h */
    public boolean f824h;

    /* renamed from: i */
    public boolean f825i;

    /* renamed from: j */
    public boolean f826j;

    /* renamed from: k */
    public boolean f827k;

    /* renamed from: l */
    public int f828l;

    /* renamed from: m */
    public int f829m;

    /* renamed from: n */
    public final Rect f830n;

    /* renamed from: o */
    public final Rect f831o;

    /* renamed from: p */
    public final Rect f832p;
    @NonNull

    /* renamed from: q */
    public WindowInsetsCompat f833q;
    @NonNull

    /* renamed from: r */
    public WindowInsetsCompat f834r;
    @NonNull

    /* renamed from: s */
    public WindowInsetsCompat f835s;
    @NonNull

    /* renamed from: t */
    public WindowInsetsCompat f836t;

    /* renamed from: u */
    public InterfaceC0242d f837u;

    /* renamed from: v */
    public OverScroller f838v;

    /* renamed from: w */
    public ViewPropertyAnimator f839w;

    /* renamed from: x */
    public final C0239a f840x;

    /* renamed from: y */
    public final RunnableC0240b f841y;

    /* renamed from: z */
    public final RunnableC0241c f842z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public class C0239a extends AnimatorListenerAdapter {
        public C0239a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f839w = null;
            actionBarOverlayLayout.f827k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f839w = null;
            actionBarOverlayLayout.f827k = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC0240b implements Runnable {
        public RunnableC0240b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m12802q();
            actionBarOverlayLayout.f839w = actionBarOverlayLayout.f820d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f840x);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC0241c implements Runnable {
        public RunnableC0241c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m12802q();
            actionBarOverlayLayout.f839w = actionBarOverlayLayout.f820d.animate().translationY(-actionBarOverlayLayout.f820d.getHeight()).setListener(actionBarOverlayLayout.f840x);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0242d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0243e extends ViewGroup.MarginLayoutParams {
        public C0243e() {
            super(-1, -1);
        }

        public C0243e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0243e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f818b = 0;
        this.f830n = new Rect();
        this.f831o = new Rect();
        this.f832p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f2564b;
        this.f833q = windowInsetsCompat;
        this.f834r = windowInsetsCompat;
        this.f835s = windowInsetsCompat;
        this.f836t = windowInsetsCompat;
        this.f840x = new C0239a();
        this.f841y = new RunnableC0240b();
        this.f842z = new RunnableC0241c();
        m12801r(context);
        this.f816A = new C0926h0();
    }

    /* renamed from: p */
    public static boolean m12803p(@NonNull FrameLayout frameLayout, @NonNull Rect rect, boolean z) {
        boolean z2;
        C0243e c0243e = (C0243e) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0243e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0243e).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0243e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0243e).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0243e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0243e).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0243e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0243e).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: a */
    public final boolean mo12535a() {
        m12800s();
        return this.f821e.mo12521a();
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: b */
    public final void mo12534b() {
        m12800s();
        this.f821e.mo12520b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: c */
    public final boolean mo12533c() {
        m12800s();
        return this.f821e.mo12519c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0243e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: d */
    public final boolean mo12532d() {
        m12800s();
        return this.f821e.mo12518d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f822f == null || this.f823g) {
            return;
        }
        if (this.f820d.getVisibility() == 0) {
            i = (int) (this.f820d.getTranslationY() + this.f820d.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f822f.setBounds(0, i, getWidth(), this.f822f.getIntrinsicHeight() + i);
        this.f822f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: e */
    public final void mo12531e(C0210g c0210g, LayoutInflater$Factory2C0114h.C0118d c0118d) {
        m12800s();
        this.f821e.mo12517e(c0210g, c0118d);
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: f */
    public final boolean mo12530f() {
        m12800s();
        return this.f821e.mo12516f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: g */
    public final boolean mo12529g() {
        m12800s();
        return this.f821e.mo12515g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0243e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0243e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0243e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f820d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0926h0 c0926h0 = this.f816A;
        return c0926h0.f2636b | c0926h0.f2635a;
    }

    public CharSequence getTitle() {
        m12800s();
        return this.f821e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: h */
    public final void mo12528h(int i) {
        m12800s();
        if (i == 2) {
            this.f821e.mo12504r();
        } else if (i == 5) {
            this.f821e.mo12503s();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    /* renamed from: i */
    public final void mo12527i() {
        m12800s();
        this.f821e.mo12514h();
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: j */
    public final void mo2713j(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0920g0
    /* renamed from: k */
    public final void mo11312k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo2712l(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public final void mo2712l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: m */
    public final boolean mo2711m(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: n */
    public final void mo2710n(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: o */
    public final void mo2709o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        m12800s();
        WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(this, windowInsets);
        boolean m12803p = m12803p(this.f820d, new Rect(m11635i.m11641c(), m11635i.m11639e(), m11635i.m11640d(), m11635i.m11642b()), false);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        Rect rect = this.f830n;
        ViewCompat.C0819i.m11720b(this, m11635i, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        WindowInsetsCompat.C0849k c0849k = m11635i.f2565a;
        WindowInsetsCompat mo11606m = c0849k.mo11606m(i, i2, i3, i4);
        this.f833q = mo11606m;
        boolean z = true;
        if (!this.f834r.equals(mo11606m)) {
            this.f834r = this.f833q;
            m12803p = true;
        }
        Rect rect2 = this.f831o;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = m12803p;
        }
        if (z) {
            requestLayout();
        }
        return c0849k.mo11618a().f2565a.mo11616c().f2565a.mo11617b().m11636h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m12801r(getContext());
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0818h.m11722c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12802q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0243e c0243e = (C0243e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0243e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0243e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        WindowInsetsCompat.C0843e c0840b;
        WindowInsetsCompat mo11631b;
        m12800s();
        measureChildWithMargins(this.f820d, i, 0, i2, 0);
        C0243e c0243e = (C0243e) this.f820d.getLayoutParams();
        int max = Math.max(0, this.f820d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0243e).leftMargin + ((ViewGroup.MarginLayoutParams) c0243e).rightMargin);
        int max2 = Math.max(0, this.f820d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0243e).topMargin + ((ViewGroup.MarginLayoutParams) c0243e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f820d.getMeasuredState());
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if ((ViewCompat.C0814d.m11758g(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f817a;
            if (this.f825i && this.f820d.getTabContainer() != null) {
                measuredHeight += this.f817a;
            }
        } else {
            measuredHeight = this.f820d.getVisibility() != 8 ? this.f820d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f830n;
        Rect rect2 = this.f832p;
        rect2.set(rect);
        WindowInsetsCompat windowInsetsCompat = this.f833q;
        this.f835s = windowInsetsCompat;
        if (!this.f824h && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            mo11631b = windowInsetsCompat.f2565a.mo11606m(0, measuredHeight, 0, 0);
        } else {
            C0690b m11968b = C0690b.m11968b(windowInsetsCompat.m11641c(), this.f835s.m11639e() + measuredHeight, this.f835s.m11640d(), this.f835s.m11642b() + 0);
            WindowInsetsCompat windowInsetsCompat2 = this.f835s;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                c0840b = new WindowInsetsCompat.C0842d(windowInsetsCompat2);
            } else if (i3 >= 29) {
                c0840b = new WindowInsetsCompat.C0841c(windowInsetsCompat2);
            } else {
                c0840b = new WindowInsetsCompat.C0840b(windowInsetsCompat2);
            }
            c0840b.mo11626g(m11968b);
            mo11631b = c0840b.mo11631b();
        }
        this.f835s = mo11631b;
        m12803p(this.f819c, rect2, true);
        if (!this.f836t.equals(this.f835s)) {
            WindowInsetsCompat windowInsetsCompat3 = this.f835s;
            this.f836t = windowInsetsCompat3;
            ViewCompat.m11783b(this.f819c, windowInsetsCompat3);
        }
        measureChildWithMargins(this.f819c, i, 0, i2, 0);
        C0243e c0243e2 = (C0243e) this.f819c.getLayoutParams();
        int max3 = Math.max(max, this.f819c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0243e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0243e2).rightMargin);
        int max4 = Math.max(max2, this.f819c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0243e2).topMargin + ((ViewGroup.MarginLayoutParams) c0243e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f819c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f826j || !z) {
            return false;
        }
        this.f838v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f838v.getFinalY() > this.f820d.getHeight()) {
            z2 = true;
        }
        if (z2) {
            m12802q();
            this.f842z.run();
        } else {
            m12802q();
            this.f841y.run();
        }
        this.f827k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f828l + i2;
        this.f828l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0107e0 c0107e0;
        C0189g c0189g;
        this.f816A.f2635a = i;
        this.f828l = getActionBarHideOffset();
        m12802q();
        InterfaceC0242d interfaceC0242d = this.f837u;
        if (interfaceC0242d != null && (c0189g = (c0107e0 = (C0107e0) interfaceC0242d).f274t) != null) {
            c0189g.m12871a();
            c0107e0.f274t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f820d.getVisibility() != 0) {
            return false;
        }
        return this.f826j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f826j && !this.f827k) {
            if (this.f828l <= this.f820d.getHeight()) {
                m12802q();
                postDelayed(this.f841y, 600L);
                return;
            }
            m12802q();
            postDelayed(this.f842z, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        m12800s();
        int i2 = this.f829m ^ i;
        this.f829m = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC0242d interfaceC0242d = this.f837u;
        if (interfaceC0242d != null) {
            ((C0107e0) interfaceC0242d).f270p = !z2;
            if (!z && z2) {
                C0107e0 c0107e0 = (C0107e0) interfaceC0242d;
                if (!c0107e0.f271q) {
                    c0107e0.f271q = true;
                    c0107e0.m13010s(true);
                }
            } else {
                C0107e0 c0107e02 = (C0107e0) interfaceC0242d;
                if (c0107e02.f271q) {
                    c0107e02.f271q = false;
                    c0107e02.m13010s(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f837u != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f818b = i;
        InterfaceC0242d interfaceC0242d = this.f837u;
        if (interfaceC0242d != null) {
            ((C0107e0) interfaceC0242d).f269o = i;
        }
    }

    /* renamed from: q */
    public final void m12802q() {
        removeCallbacks(this.f841y);
        removeCallbacks(this.f842z);
        ViewPropertyAnimator viewPropertyAnimator = this.f839w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void m12801r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f815B);
        this.f817a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f822f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f823g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f838v = new OverScroller(context);
    }

    /* renamed from: s */
    public final void m12800s() {
        InterfaceC0412s0 wrapper;
        if (this.f819c == null) {
            this.f819c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f820d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0412s0) {
                wrapper = (InterfaceC0412s0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f821e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        m12802q();
        this.f820d.setTranslationY(-Math.max(0, Math.min(i, this.f820d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0242d interfaceC0242d) {
        this.f837u = interfaceC0242d;
        if (getWindowToken() != null) {
            ((C0107e0) this.f837u).f269o = this.f818b;
            int i = this.f829m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0818h.m11722c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f825i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f826j) {
            this.f826j = z;
            if (z) {
                return;
            }
            m12802q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m12800s();
        this.f821e.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m12800s();
        this.f821e.setIcon(drawable);
    }

    public void setLogo(int i) {
        m12800s();
        this.f821e.mo12509m(i);
    }

    public void setOverlayMode(boolean z) {
        this.f824h = z;
        this.f823g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    public void setWindowCallback(Window.Callback callback) {
        m12800s();
        this.f821e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0408r0
    public void setWindowTitle(CharSequence charSequence) {
        m12800s();
        this.f821e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
