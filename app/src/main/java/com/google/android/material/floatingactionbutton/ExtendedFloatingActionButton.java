package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.C0235r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7563h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C7745d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0587b {

    /* loaded from: classes3.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0588c<T> {

        /* renamed from: a */
        public Rect f14929a;

        /* renamed from: b */
        public final boolean f14930b;

        /* renamed from: c */
        public final boolean f14931c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f14930b = false;
            this.f14931c = true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14586f);
            this.f14930b = obtainStyledAttributes.getBoolean(0, false);
            this.f14931c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo4558a(@NonNull View view) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: c */
        public final void mo4304c(@NonNull CoordinatorLayout.C0590e c0590e) {
            if (c0590e.f2220h == 0) {
                c0590e.f2220h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: d */
        public final boolean mo2730d(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m4570t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0590e) {
                    z = ((CoordinatorLayout.C0590e) layoutParams).f2213a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m4569u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: h */
        public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList m12125d = coordinatorLayout.m12125d(extendedFloatingActionButton);
            int size = m12125d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) m12125d.get(i2);
                if (view2 instanceof AppBarLayout) {
                    m4570t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0590e) {
                        z = ((CoordinatorLayout.C0590e) layoutParams).f2213a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m4569u(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.m12118q(i, extendedFloatingActionButton);
            return true;
        }

        /* renamed from: t */
        public final void m4570t(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) extendedFloatingActionButton.getLayoutParams();
            boolean z2 = this.f14930b;
            int i = 1;
            int i2 = 0;
            boolean z3 = this.f14931c;
            if ((!z2 && !z3) || c0590e.f2218f != appBarLayout.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
            if (this.f14929a == null) {
                this.f14929a = new Rect();
            }
            Rect rect = this.f14929a;
            C7745d.m4517a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z3) {
                    i = 2;
                }
                ExtendedFloatingActionButton.m4571l(extendedFloatingActionButton, i);
                throw null;
            }
            if (z3) {
                i2 = 3;
            }
            ExtendedFloatingActionButton.m4571l(extendedFloatingActionButton, i2);
            throw null;
        }

        /* renamed from: u */
        public final void m4569u(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) extendedFloatingActionButton.getLayoutParams();
            boolean z2 = this.f14930b;
            int i = 1;
            int i2 = 0;
            boolean z3 = this.f14931c;
            if ((!z2 && !z3) || c0590e.f2218f != view.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0590e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z3) {
                    i = 2;
                }
                ExtendedFloatingActionButton.m4571l(extendedFloatingActionButton, i);
                throw null;
            }
            if (z3) {
                i2 = 3;
            }
            ExtendedFloatingActionButton.m4571l(extendedFloatingActionButton, i2);
            throw null;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes3.dex */
    public class C7716a extends Property<View, Float> {
        public C7716a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes3.dex */
    public class C7717b extends Property<View, Float> {
        public C7717b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes3.dex */
    public class C7718c extends Property<View, Float> {
        public C7718c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return Float.valueOf(ViewCompat.C0815e.m11740f(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            int intValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0815e.m11735k(view2, intValue, paddingTop, ViewCompat.C0815e.m11741e(view2), view2.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes3.dex */
    public class C7719d extends Property<View, Float> {
        public C7719d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return Float.valueOf(ViewCompat.C0815e.m11741e(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f) {
            View view2 = view;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0815e.m11735k(view2, ViewCompat.C0815e.m11740f(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new C7716a();
        new C7717b();
        new C7718c();
        new C7719d();
    }

    /* renamed from: l */
    public static void m4571l(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(C0235r.m12816a("Unknown strategy type: ", i));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0587b
    @NonNull
    public CoordinatorLayout.AbstractC0588c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        return 0;
    }

    @Nullable
    public C7563h getExtendMotionSpec() {
        throw null;
    }

    @Nullable
    public C7563h getHideMotionSpec() {
        throw null;
    }

    @Nullable
    public C7563h getShowMotionSpec() {
        throw null;
    }

    @Nullable
    public C7563h getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(@Nullable C7563h c7563h) {
        throw null;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i) {
        setExtendMotionSpec(C7563h.m4807a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(@Nullable C7563h c7563h) {
        throw null;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(C7563h.m4807a(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setShowMotionSpec(@Nullable C7563h c7563h) {
        throw null;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(C7563h.m4807a(getContext(), i));
    }

    public void setShrinkMotionSpec(@Nullable C7563h c7563h) {
        throw null;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i) {
        setShrinkMotionSpec(C7563h.m4807a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
