package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.C0363j;
import androidx.collection.C0482i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7563h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.C7594b;
import com.google.android.material.bottomappbar.C7598e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.InterfaceC7715a;
import com.google.android.material.floatingactionbutton.C7726d;
import com.google.android.material.internal.C7745d;
import com.google.android.material.internal.C7767r;
import com.google.android.material.shadow.InterfaceC7789b;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7813n;
import com.google.android.material.stateful.C7848a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class FloatingActionButton extends C7767r implements InterfaceC0969m0, InterfaceC7715a, InterfaceC7813n, CoordinatorLayout.InterfaceC0587b {
    @Nullable

    /* renamed from: b */
    public ColorStateList f14932b;
    @Nullable

    /* renamed from: c */
    public PorterDuff.Mode f14933c;
    @Nullable

    /* renamed from: d */
    public ColorStateList f14934d;
    @Nullable

    /* renamed from: e */
    public PorterDuff.Mode f14935e;
    @Nullable

    /* renamed from: f */
    public ColorStateList f14936f;

    /* renamed from: g */
    public int f14937g;

    /* renamed from: h */
    public int f14938h;

    /* renamed from: i */
    public int f14939i;

    /* renamed from: j */
    public boolean f14940j;

    /* renamed from: k */
    public C7738g f14941k;

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0588c<T> {

        /* renamed from: a */
        public Rect f14942a;

        /* renamed from: b */
        public final boolean f14943b;

        public BaseBehavior() {
            this.f14943b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14587g);
            this.f14943b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: a */
        public final boolean mo4558a(@NonNull View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
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
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m4556u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0590e) {
                    z = ((CoordinatorLayout.C0590e) layoutParams).f2213a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m4555v(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: h */
        public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            boolean z;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList m12125d = coordinatorLayout.m12125d(floatingActionButton);
            int size = m12125d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) m12125d.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (m4556u(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0590e) {
                        z = ((CoordinatorLayout.C0590e) layoutParams).f2213a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && m4555v(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m12118q(i, floatingActionButton);
            return true;
        }

        /* renamed from: t */
        public final boolean m4557t(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) floatingActionButton.getLayoutParams();
            if (!this.f14943b || c0590e.f2218f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: u */
        public final boolean m4556u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (m4557t(appBarLayout, floatingActionButton)) {
                if (this.f14942a == null) {
                    this.f14942a = new Rect();
                }
                Rect rect = this.f14942a;
                C7745d.m4517a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m4563g(null, false);
                    return true;
                }
                floatingActionButton.m4559k(null, false);
                return true;
            }
            return false;
        }

        /* renamed from: v */
        public final boolean m4555v(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (m4557t(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0590e) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m4563g(null, false);
                    return true;
                }
                floatingActionButton.m4559k(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface Size {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7720a {
        /* renamed from: a */
        public void mo4554a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo4553b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes3.dex */
    public class C7721b implements InterfaceC7789b {
        public C7721b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes3.dex */
    public class C7722c<T extends FloatingActionButton> implements C7726d.InterfaceC7732f {
        public C7722c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.InterfaceC7732f
        /* renamed from: a */
        public final void mo4546a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C7726d.InterfaceC7732f
        /* renamed from: b */
        public final void mo4545b() {
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof C7722c) {
                ((C7722c) obj).getClass();
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private C7726d getImpl() {
        if (this.f14941k == null) {
            this.f14941k = new C7738g(this, new C7721b());
        }
        return this.f14941k;
    }

    @Override // com.google.android.material.expandable.InterfaceC7715a
    /* renamed from: a */
    public final boolean mo4568a() {
        throw null;
    }

    /* renamed from: c */
    public final void m4567c() {
        C7726d impl = getImpl();
        if (impl.f14979o == null) {
            impl.f14979o = new ArrayList<>();
        }
        impl.f14979o.add(null);
    }

    /* renamed from: d */
    public final void m4566d(@NonNull C7598e c7598e) {
        C7726d impl = getImpl();
        if (impl.f14978n == null) {
            impl.f14978n = new ArrayList<>();
        }
        impl.f14978n.add(c7598e);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo4539i(getDrawableState());
    }

    /* renamed from: e */
    public final void m4565e() {
        C7726d impl = getImpl();
        C7722c c7722c = new C7722c(this);
        if (impl.f14980p == null) {
            impl.f14980p = new ArrayList<>();
        }
        impl.f14980p.add(c7722c);
    }

    /* renamed from: f */
    public final int m4564f(int i) {
        int i2 = this.f14938h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m4564f(1) : m4564f(0);
    }

    /* renamed from: g */
    public final void m4563g(@Nullable C7594b c7594b, boolean z) {
        C7723a c7723a;
        boolean z2;
        int i;
        AnimatorSet m4550c;
        C7726d impl = getImpl();
        if (c7594b == null) {
            c7723a = null;
        } else {
            c7723a = new C7723a(this, c7594b);
        }
        boolean z3 = true;
        if (impl.f14981q.getVisibility() != 0 ? impl.f14977m != 2 : impl.f14977m == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = impl.f14971g;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            FloatingActionButton floatingActionButton = impl.f14981q;
            if (!ViewCompat.C0817g.m11729c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z3 = false;
            }
            if (z3) {
                C7563h c7563h = impl.f14973i;
                if (c7563h != null) {
                    m4550c = impl.m4551b(c7563h, 0.0f, 0.0f, 0.0f);
                } else {
                    m4550c = impl.m4550c(0.0f, 0.4f, 0.4f, C7726d.f14954A, C7726d.f14955B);
                }
                m4550c.addListener(new C7724b(impl, z, c7723a));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f14979o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        m4550c.addListener(it.next());
                    }
                }
                m4550c.start();
                return;
            }
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.m4503b(i, z);
            if (c7723a != null) {
                c7723a.f14945a.mo4554a(c7723a.f14946b);
            }
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f14932b;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f14933c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0587b
    @NonNull
    public CoordinatorLayout.AbstractC0588c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo4543e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f14969e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f14970f;
    }

    @Nullable
    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    @InterfaceC0074Px
    public int getCustomSize() {
        return this.f14938h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    @Nullable
    public C7563h getHideMotionSpec() {
        return getImpl().f14973i;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f14936f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f14936f;
    }

    @NonNull
    public C7801j getShapeAppearanceModel() {
        C7801j c7801j = getImpl().f14965a;
        c7801j.getClass();
        return c7801j;
    }

    @Nullable
    public C7563h getShowMotionSpec() {
        return getImpl().f14972h;
    }

    public int getSize() {
        return this.f14937g;
    }

    public int getSizeDimension() {
        return m4564f(this.f14937g);
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f14934d;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f14935e;
    }

    public boolean getUseCompatPadding() {
        return this.f14940j;
    }

    /* renamed from: h */
    public final boolean m4562h() {
        C7726d impl = getImpl();
        int visibility = impl.f14981q.getVisibility();
        int i = impl.f14977m;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m4561i() {
        C7726d impl = getImpl();
        int visibility = impl.f14981q.getVisibility();
        int i = impl.f14977m;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m4560j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f14934d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f14935e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0363j.m12613c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo4541g();
    }

    /* renamed from: k */
    public final void m4559k(@Nullable C7594b.C7595a c7595a, boolean z) {
        C7723a c7723a;
        boolean z2;
        boolean z3;
        AnimatorSet m4550c;
        float f;
        float f2;
        C7726d impl = getImpl();
        if (c7595a == null) {
            c7723a = null;
        } else {
            c7723a = new C7723a(this, c7595a);
        }
        boolean z4 = true;
        if (impl.f14981q.getVisibility() == 0 ? impl.f14977m != 1 : impl.f14977m == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Animator animator = impl.f14971g;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f14972h == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            FloatingActionButton floatingActionButton = impl.f14981q;
            if (!ViewCompat.C0817g.m11729c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z4 = false;
            }
            Matrix matrix = impl.f14986v;
            if (z4) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f3 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z3) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    if (z3) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f2);
                    if (z3) {
                        f3 = 0.4f;
                    }
                    impl.f14975k = f3;
                    impl.m4552a(f3, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                C7563h c7563h = impl.f14972h;
                if (c7563h != null) {
                    m4550c = impl.m4551b(c7563h, 1.0f, 1.0f, 1.0f);
                } else {
                    m4550c = impl.m4550c(1.0f, 1.0f, 1.0f, C7726d.f14963y, C7726d.f14964z);
                }
                m4550c.addListener(new C7725c(impl, z, c7723a));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f14978n;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        m4550c.addListener(it.next());
                    }
                }
                m4550c.start();
                return;
            }
            floatingActionButton.m4503b(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f14975k = 1.0f;
            impl.m4552a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (c7723a != null) {
                c7723a.f14945a.mo4553b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7726d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C7738g)) {
            ViewTreeObserver viewTreeObserver = impl.f14981q.getViewTreeObserver();
            if (impl.f14987w == null) {
                impl.f14987w = new ViewTreeObserver$OnPreDrawListenerC7737f(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f14987w);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7726d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f14981q.getViewTreeObserver();
        ViewTreeObserver$OnPreDrawListenerC7737f viewTreeObserver$OnPreDrawListenerC7737f = impl.f14987w;
        if (viewTreeObserver$OnPreDrawListenerC7737f != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC7737f);
            impl.f14987w = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = (getSizeDimension() - this.f14939i) / 2;
        getImpl().m4547n();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7848a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7848a c7848a = (C7848a) parcelable;
        super.onRestoreInstanceState(c7848a.f2747a);
        c7848a.f15397c.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new C0482i();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11729c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f14932b != colorStateList) {
            this.f14932b = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f14933c != mode) {
            this.f14933c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        C7726d impl = getImpl();
        if (impl.f14968d != f) {
            impl.f14968d = f;
            impl.mo4538j(f, impl.f14969e, impl.f14970f);
        }
    }

    public void setCompatElevationResource(@DimenRes int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C7726d impl = getImpl();
        if (impl.f14969e != f) {
            impl.f14969e = f;
            impl.mo4538j(impl.f14968d, f, impl.f14970f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C7726d impl = getImpl();
        if (impl.f14970f != f) {
            impl.f14970f = f;
            impl.mo4538j(impl.f14968d, impl.f14969e, f);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@InterfaceC0074Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f14938h) {
            this.f14938h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f14966b) {
            getImpl().f14966b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        throw null;
    }

    public void setHideMotionSpec(@Nullable C7563h c7563h) {
        getImpl().f14973i = c7563h;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(C7563h.m4807a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C7726d impl = getImpl();
            float f = impl.f14975k;
            impl.f14975k = f;
            Matrix matrix = impl.f14986v;
            impl.m4552a(f, matrix);
            impl.f14981q.setImageMatrix(matrix);
            if (this.f14934d != null) {
                m4560j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        this.f14939i = i;
        C7726d impl = getImpl();
        if (impl.f14976l != i) {
            impl.f14976l = i;
            float f = impl.f14975k;
            impl.f14975k = f;
            Matrix matrix = impl.f14986v;
            impl.m4552a(f, matrix);
            impl.f14981q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@ColorInt int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f14936f != colorStateList) {
            this.f14936f = colorStateList;
            getImpl().mo4537l();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<C7726d.InterfaceC7732f> arrayList = getImpl().f14980p;
        if (arrayList != null) {
            Iterator<C7726d.InterfaceC7732f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4545b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<C7726d.InterfaceC7732f> arrayList = getImpl().f14980p;
        if (arrayList != null) {
            Iterator<C7726d.InterfaceC7732f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4545b();
            }
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z) {
        C7726d impl = getImpl();
        impl.f14967c = z;
        impl.m4547n();
        throw null;
    }

    @Override // com.google.android.material.shape.InterfaceC7813n
    public void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        getImpl().f14965a = c7801j;
    }

    public void setShowMotionSpec(@Nullable C7563h c7563h) {
        getImpl().f14972h = c7563h;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(C7563h.m4807a(getContext(), i));
    }

    public void setSize(int i) {
        this.f14938h = 0;
        if (i != this.f14937g) {
            this.f14937g = i;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC0969m0
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f14934d != colorStateList) {
            this.f14934d = colorStateList;
            m4560j();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f14935e != mode) {
            this.f14935e = mode;
            m4560j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m4548k();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m4548k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m4548k();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f14940j != z) {
            this.f14940j = z;
            getImpl().mo4540h();
        }
    }

    @Override // com.google.android.material.internal.C7767r, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
