package com.qmuiteam.qmui.nestedScroll;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.InterfaceC0905d0;
import androidx.core.view.InterfaceC0915f0;
import com.qmuiteam.qmui.nestedScroll.InterfaceC9081b;
import com.qmuiteam.qmui.util.C9150j;

/* renamed from: com.qmuiteam.qmui.nestedScroll.f */
/* loaded from: classes3.dex */
public final class C9086f extends FrameLayout implements InterfaceC0905d0, InterfaceC0915f0, InterfaceC9083c {

    /* renamed from: a */
    public InterfaceC9081b.InterfaceC9082a f17430a;

    /* renamed from: b */
    public View f17431b;

    /* renamed from: c */
    public InterfaceC9083c f17432c;

    /* renamed from: d */
    public View f17433d;

    /* renamed from: e */
    public C9150j f17434e;

    /* renamed from: f */
    public C9150j f17435f;

    /* renamed from: g */
    public C9150j f17436g;

    /* renamed from: h */
    public int f17437h;

    /* renamed from: i */
    public int f17438i;

    @Override // com.qmuiteam.qmui.nestedScroll.InterfaceC9081b
    /* renamed from: a */
    public final void mo2716a(C9085e c9085e) {
        this.f17430a = c9085e;
        InterfaceC9083c interfaceC9083c = this.f17432c;
        if (interfaceC9083c != null) {
            interfaceC9083c.mo2716a(new C9085e(this, c9085e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    @Override // com.qmuiteam.qmui.nestedScroll.InterfaceC9083c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo2715d(int r6) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.nestedScroll.C9086f.mo2715d(int):int");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        throw null;
    }

    /* renamed from: e */
    public final void m2714e(int i) {
        this.f17437h = i;
        C9150j c9150j = this.f17434e;
        if (c9150j != null) {
            c9150j.m2623d(-i);
        }
        C9150j c9150j2 = this.f17435f;
        if (c9150j2 != null) {
            c9150j2.m2623d(-i);
        }
        C9150j c9150j3 = this.f17436g;
        if (c9150j3 != null) {
            c9150j3.m2623d(-i);
        }
        InterfaceC9081b.InterfaceC9082a interfaceC9082a = this.f17430a;
        if (interfaceC9082a != null) {
            getCurrentScroll();
            getScrollOffsetRange();
            ((C9085e) interfaceC9082a).m2717a();
        }
    }

    public int getContainerHeaderOffsetRange() {
        if (this.f17438i == 0 || this.f17431b == null) {
            return 0;
        }
        return Math.min(this.f17431b.getHeight() + getPaddingTop(), this.f17438i);
    }

    public int getContainerOffsetCurrent() {
        return this.f17437h;
    }

    public int getContainerOffsetRange() {
        return this.f17438i;
    }

    @Override // com.qmuiteam.qmui.nestedScroll.InterfaceC9083c
    public int getCurrentScroll() {
        int i = this.f17437h;
        InterfaceC9083c interfaceC9083c = this.f17432c;
        return interfaceC9083c != null ? i + interfaceC9083c.getCurrentScroll() : i;
    }

    public InterfaceC9083c getDelegateView() {
        return this.f17432c;
    }

    public View getFooterView() {
        return this.f17433d;
    }

    public View getHeaderView() {
        return this.f17431b;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    @Override // com.qmuiteam.qmui.nestedScroll.InterfaceC9083c
    public int getScrollOffsetRange() {
        int i = this.f17438i;
        InterfaceC9083c interfaceC9083c = this.f17432c;
        return interfaceC9083c != null ? i + interfaceC9083c.getScrollOffsetRange() : i;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        throw null;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: j */
    public final void mo2713j(int i, @NonNull View view) {
        throw null;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public final void mo2712l(View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (i4 > 0) {
            i6 = this.f17437h;
            int i8 = i6 + i4;
            int i9 = this.f17438i;
            if (i8 > i9) {
                if (i6 <= i9) {
                    m2714e(i9);
                }
                throw null;
            }
            i7 = i6 + i4;
        } else {
            if (i4 < 0) {
                i6 = this.f17437h;
                if (i6 + i4 < 0) {
                    i7 = i6 >= 0 ? 0 : 0;
                }
                i7 = i6 + i4;
            }
            throw null;
        }
        m2714e(i7);
        throw null;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: m */
    public final boolean mo2711m(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: n */
    public final void mo2710n(@NonNull View view, @NonNull View view2, int i, int i2) {
        throw null;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: o */
    public final void mo2709o(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        View view = this.f17431b;
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            this.f17431b.layout(0, paddingTop, i5, measuredHeight);
            paddingTop = measuredHeight;
        }
        InterfaceC9083c interfaceC9083c = this.f17432c;
        if (interfaceC9083c != null) {
            View view2 = (View) interfaceC9083c;
            int measuredHeight2 = view2.getMeasuredHeight() + paddingTop;
            view2.layout(0, paddingTop, i5, measuredHeight2);
            paddingTop = measuredHeight2;
        }
        View view3 = this.f17433d;
        if (view3 != null) {
            int measuredHeight3 = view3.getMeasuredHeight() + paddingTop;
            this.f17433d.layout(0, paddingTop, i5, measuredHeight3);
            paddingTop = measuredHeight3;
        }
        this.f17438i = Math.max(0, (getPaddingBottom() + paddingTop) - i6);
        C9150j c9150j = this.f17434e;
        if (c9150j != null) {
            c9150j.m2625b(true);
            this.f17437h = -this.f17434e.f17589d;
        }
        C9150j c9150j2 = this.f17435f;
        if (c9150j2 != null) {
            c9150j2.m2625b(true);
            this.f17437h = -this.f17435f.f17589d;
        }
        C9150j c9150j3 = this.f17436g;
        if (c9150j3 != null) {
            c9150j3.m2625b(true);
            this.f17437h = -this.f17436g.f17589d;
        }
        int i7 = this.f17437h;
        int i8 = this.f17438i;
        if (i7 > i8) {
            m2714e(i8);
        }
        removeCallbacks(null);
        post(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop();
        View view = this.f17431b;
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 0));
            paddingTop += this.f17431b.getMeasuredHeight();
        }
        InterfaceC9083c interfaceC9083c = this.f17432c;
        if (interfaceC9083c != null) {
            View view2 = (View) interfaceC9083c;
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            paddingTop += view2.getMeasuredHeight();
        }
        View view3 = this.f17433d;
        if (view3 != null) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 0));
            paddingTop += this.f17433d.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (paddingBottom < size2) {
            setMeasuredDimension(size, paddingBottom);
        } else {
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2712l(view, i, i2, i3, i4, 0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2711m(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    public void setDelegateView(@NonNull InterfaceC9083c interfaceC9083c) {
        if (!(interfaceC9083c instanceof View)) {
            throw new IllegalArgumentException("delegateView must be a instance of View");
        }
        InterfaceC9083c interfaceC9083c2 = this.f17432c;
        if (interfaceC9083c2 != null) {
            interfaceC9083c2.mo2716a(null);
        }
        this.f17432c = interfaceC9083c;
        View view = (View) interfaceC9083c;
        this.f17435f = new C9150j(view);
        addView(view, new FrameLayout.LayoutParams(-1, -2));
    }

    public void setFooterView(@NonNull View view) {
        this.f17433d = view;
        this.f17436g = new C9150j(view);
        addView(view, new FrameLayout.LayoutParams(-1, -2));
    }

    public void setHeaderView(@NonNull View view) {
        this.f17431b = view;
        this.f17434e = new C9150j(view);
        addView(view, new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        throw null;
    }
}
