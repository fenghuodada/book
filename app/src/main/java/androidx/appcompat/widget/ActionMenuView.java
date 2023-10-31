package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.C0092b0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.appcompat.widget.C0309c;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.InterfaceC0895b0;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements C0210g.InterfaceC0212b, InterfaceC0228n {

    /* renamed from: A */
    public InterfaceC0248e f846A;

    /* renamed from: p */
    public C0210g f847p;

    /* renamed from: q */
    public Context f848q;

    /* renamed from: r */
    public int f849r;

    /* renamed from: s */
    public boolean f850s;

    /* renamed from: t */
    public C0309c f851t;

    /* renamed from: u */
    public InterfaceC0226m.InterfaceC0227a f852u;

    /* renamed from: v */
    public C0210g.InterfaceC0211a f853v;

    /* renamed from: w */
    public boolean f854w;

    /* renamed from: x */
    public int f855x;

    /* renamed from: y */
    public final int f856y;

    /* renamed from: z */
    public final int f857z;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0244a {
        /* renamed from: d */
        boolean mo12702d();

        /* renamed from: f */
        boolean mo12701f();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0245b implements InterfaceC0226m.InterfaceC0227a {
        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: b */
        public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: c */
        public final boolean mo12697c(@NonNull C0210g c0210g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0246c extends LinearLayoutCompat.C0250a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f858a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f859b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f860c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f861d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f862e;

        /* renamed from: f */
        public boolean f863f;

        public C0246c() {
            super(-2, -2);
            this.f858a = false;
        }

        public C0246c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0246c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0246c(C0246c c0246c) {
            super(c0246c);
            this.f858a = c0246c.f858a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0247d implements C0210g.InterfaceC0211a {
        public C0247d() {
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: a */
        public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
            boolean z;
            boolean z2;
            InterfaceC0248e interfaceC0248e = ActionMenuView.this.f846A;
            if (interfaceC0248e == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<InterfaceC0895b0> it = toolbar.f1016G.f2663b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().onMenuItemSelected(menuItem)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            } else {
                Toolbar.InterfaceC0280h interfaceC0280h = toolbar.f1018I;
                if (interfaceC0280h != null) {
                    z2 = C0092b0.this.f225b.onMenuItemSelected(0, menuItem);
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: b */
        public final void mo12746b(@NonNull C0210g c0210g) {
            C0210g.InterfaceC0211a interfaceC0211a = ActionMenuView.this.f853v;
            if (interfaceC0211a != null) {
                interfaceC0211a.mo12746b(c0210g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0248e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f856y = (int) (56.0f * f);
        this.f857z = (int) (f * 4.0f);
        this.f848q = context;
        this.f849r = 0;
    }

    /* renamed from: i */
    public static C0246c m12798i(ViewGroup.LayoutParams layoutParams) {
        C0246c c0246c;
        if (layoutParams != null) {
            if (layoutParams instanceof C0246c) {
                c0246c = new C0246c((C0246c) layoutParams);
            } else {
                c0246c = new C0246c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0246c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0246c).gravity = 16;
            }
            return c0246c;
        }
        C0246c c0246c2 = new C0246c();
        ((LinearLayout.LayoutParams) c0246c2).gravity = 16;
        return c0246c2;
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0212b
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final boolean mo12799a(C0214i c0214i) {
        return this.f847p.m12842q(c0214i, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public final void mo4532b(C0210g c0210g) {
        this.f847p = c0210g;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0246c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: e */
    public final LinearLayoutCompat.C0250a mo12793e() {
        C0246c c0246c = new C0246c();
        ((LinearLayout.LayoutParams) c0246c).gravity = 16;
        return c0246c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: f */
    public final LinearLayoutCompat.C0250a mo12792f(AttributeSet attributeSet) {
        return new C0246c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.C0250a mo12791g(ViewGroup.LayoutParams layoutParams) {
        return m12798i(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0246c c0246c = new C0246c();
        ((LinearLayout.LayoutParams) c0246c).gravity = 16;
        return c0246c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0246c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m12798i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f847p == null) {
            Context context = getContext();
            C0210g c0210g = new C0210g(context);
            this.f847p = c0210g;
            c0210g.f689e = new C0247d();
            C0309c c0309c = new C0309c(context);
            this.f851t = c0309c;
            c0309c.f1143l = true;
            c0309c.f1144m = true;
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f852u;
            if (interfaceC0227a == null) {
                interfaceC0227a = new C0245b();
            }
            c0309c.f659e = interfaceC0227a;
            this.f847p.m12849b(c0309c, this.f848q);
            C0309c c0309c2 = this.f851t;
            c0309c2.f662h = this;
            this.f847p = c0309c2.f657c;
        }
        return this.f847p;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        C0309c c0309c = this.f851t;
        C0309c.C0313d c0313d = c0309c.f1140i;
        if (c0313d != null) {
            return c0313d.getDrawable();
        }
        if (c0309c.f1142k) {
            return c0309c.f1141j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f849r;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public final boolean m12797k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0244a)) {
            z = false | ((InterfaceC0244a) childAt).mo12702d();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0244a)) ? z : z | ((InterfaceC0244a) childAt2).mo12701f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0309c c0309c = this.f851t;
        if (c0309c != null) {
            c0309c.mo12707g();
            if (this.f851t.m12704k()) {
                this.f851t.m12706h();
                this.f851t.m12703l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0309c c0309c = this.f851t;
        if (c0309c != null) {
            c0309c.m12706h();
            C0309c.C0310a c0310a = c0309c.f1151t;
            if (c0310a != null && c0310a.m12828b()) {
                c0310a.f762j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f854w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m12616a = C0362i2.m12616a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0246c c0246c = (C0246c) childAt.getLayoutParams();
                if (c0246c.f858a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m12797k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m12616a) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0246c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0246c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0246c).leftMargin) + ((LinearLayout.LayoutParams) c0246c).rightMargin;
                    m12797k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m12616a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0246c c0246c2 = (C0246c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0246c2.f858a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0246c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0246c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0246c c0246c3 = (C0246c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0246c3.f858a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0246c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0246c3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z6;
        int i9;
        int i10;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i12;
        boolean z8;
        C0210g c0210g;
        boolean z9 = this.f854w;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f854w = z;
        if (z9 != z) {
            this.f855x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f854w && (c0210g = this.f847p) != null && size != this.f855x) {
            this.f855x = size;
            c0210g.m12843p(true);
        }
        int childCount = getChildCount();
        if (this.f854w && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i13 = size2 - paddingRight;
            int i14 = this.f856y;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = (i16 / i15) + i14;
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            int i22 = 0;
            long j = 0;
            while (true) {
                i3 = this.f857z;
                if (i21 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i21);
                int i23 = size3;
                int i24 = i13;
                if (childAt.getVisibility() == 8) {
                    i10 = mode;
                    i11 = paddingBottom;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i25 = i19 + 1;
                    if (z11) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    C0246c c0246c = (C0246c) childAt.getLayoutParams();
                    c0246c.f863f = false;
                    c0246c.f860c = 0;
                    c0246c.f859b = 0;
                    c0246c.f861d = false;
                    ((LinearLayout.LayoutParams) c0246c).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c0246c).rightMargin = 0;
                    if (z11 && ((ActionMenuItemView) childAt).m12861u()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c0246c.f862e = z6;
                    if (c0246c.f858a) {
                        i9 = 1;
                    } else {
                        i9 = i15;
                    }
                    C0246c c0246c2 = (C0246c) childAt.getLayoutParams();
                    i10 = mode;
                    i11 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.m12861u()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i9 > 0 && (!z7 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z7 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (!c0246c2.f858a && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c0246c2.f861d = z8;
                    c0246c2.f859b = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i12, 1073741824), makeMeasureSpec);
                    i20 = Math.max(i20, i12);
                    if (c0246c.f861d) {
                        i22++;
                    }
                    if (c0246c.f858a) {
                        z10 = true;
                    }
                    i15 -= i12;
                    i18 = Math.max(i18, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i25;
                }
                i21++;
                size3 = i23;
                i13 = i24;
                paddingBottom = i11;
                mode = i10;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            if (z10 && i19 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i22 > 0 && i15 > 0) {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    C0246c c0246c3 = (C0246c) getChildAt(i31).getLayoutParams();
                    boolean z13 = z12;
                    if (c0246c3.f861d) {
                        int i32 = c0246c3.f859b;
                        if (i32 < i29) {
                            j2 = 1 << i31;
                            i29 = i32;
                            i30 = 1;
                        } else if (i32 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z12 = z13;
                }
                z3 = z12;
                j |= j2;
                if (i30 > i15) {
                    break;
                }
                int i33 = i29 + 1;
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    C0246c c0246c4 = (C0246c) childAt2.getLayoutParams();
                    int i35 = i18;
                    int i36 = childMeasureSpec;
                    int i37 = childCount2;
                    long j3 = 1 << i34;
                    if ((j2 & j3) == 0) {
                        if (c0246c4.f859b == i33) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && c0246c4.f862e) {
                            r4 = 1;
                            r4 = 1;
                            if (i15 == 1) {
                                childAt2.setPadding(i3 + i17, 0, i3, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        c0246c4.f859b += r4;
                        c0246c4.f863f = r4;
                        i15--;
                    }
                    i34++;
                    childMeasureSpec = i36;
                    i18 = i35;
                    childCount2 = i37;
                }
                z12 = true;
            }
            z3 = z12;
            int i38 = i18;
            int i39 = childMeasureSpec;
            int i40 = childCount2;
            if (!z10 && i19 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z4 || i20 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((C0246c) getChildAt(0).getLayoutParams()).f862e) {
                        bitCount -= 0.5f;
                    }
                    int i41 = i40 - 1;
                    if ((j & (1 << i41)) != 0 && !((C0246c) getChildAt(i41).getLayoutParams()).f862e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i15 * i17) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z14 = z3;
                i4 = i40;
                for (int i42 = 0; i42 < i4; i42++) {
                    if ((j & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        C0246c c0246c5 = (C0246c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0246c5.f860c = i8;
                            c0246c5.f863f = true;
                            if (i42 == 0 && !c0246c5.f862e) {
                                ((LinearLayout.LayoutParams) c0246c5).leftMargin = (-i8) / 2;
                            }
                            z14 = true;
                        } else {
                            if (c0246c5.f858a) {
                                c0246c5.f860c = i8;
                                c0246c5.f863f = true;
                                ((LinearLayout.LayoutParams) c0246c5).rightMargin = (-i8) / 2;
                                z14 = true;
                            } else {
                                if (i42 != 0) {
                                    ((LinearLayout.LayoutParams) c0246c5).leftMargin = i8 / 2;
                                }
                                if (i42 != i4 - 1) {
                                    ((LinearLayout.LayoutParams) c0246c5).rightMargin = i8 / 2;
                                }
                            }
                        }
                    }
                }
                z5 = z14;
            } else {
                i4 = i40;
                z5 = z3;
            }
            if (z5) {
                int i43 = 0;
                while (i43 < i4) {
                    View childAt4 = getChildAt(i43);
                    C0246c c0246c6 = (C0246c) childAt4.getLayoutParams();
                    if (!c0246c6.f863f) {
                        i7 = i39;
                    } else {
                        i7 = i39;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0246c6.f859b * i17) + c0246c6.f860c, 1073741824), i7);
                    }
                    i43++;
                    i39 = i7;
                }
            }
            if (i26 != 1073741824) {
                i6 = i27;
                i5 = i38;
            } else {
                i5 = i28;
                i6 = i27;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            C0246c c0246c7 = (C0246c) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) c0246c7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0246c7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f851t.f1148q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0248e interfaceC0248e) {
        this.f846A = interfaceC0248e;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        C0309c c0309c = this.f851t;
        C0309c.C0313d c0313d = c0309c.f1140i;
        if (c0313d != null) {
            c0313d.setImageDrawable(drawable);
            return;
        }
        c0309c.f1142k = true;
        c0309c.f1141j = drawable;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f850s = z;
    }

    public void setPopupTheme(@StyleRes int i) {
        if (this.f849r != i) {
            this.f849r = i;
            if (i == 0) {
                this.f848q = getContext();
            } else {
                this.f848q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public void setPresenter(C0309c c0309c) {
        this.f851t = c0309c;
        c0309c.f662h = this;
        this.f847p = c0309c.f657c;
    }
}
