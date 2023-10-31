package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C7764q;
import com.google.android.material.motion.C7769a;
import com.google.android.material.shape.C7798g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0587b {

    /* renamed from: m0 */
    public static final /* synthetic */ int f14405m0 = 0;
    @Nullable

    /* renamed from: U */
    public Integer f14406U;
    @Nullable

    /* renamed from: V */
    public Animator f14407V;
    @Nullable

    /* renamed from: W */
    public Animator f14408W;

    /* renamed from: d0 */
    public int f14409d0;

    /* renamed from: e0 */
    public int f14410e0;

    /* renamed from: f0 */
    public int f14411f0;
    @InterfaceC0074Px

    /* renamed from: g0 */
    public int f14412g0;

    /* renamed from: h0 */
    public int f14413h0;

    /* renamed from: i0 */
    public boolean f14414i0;
    @MenuRes

    /* renamed from: j0 */
    public int f14415j0;

    /* renamed from: k0 */
    public boolean f14416k0;

    /* renamed from: l0 */
    public Behavior f14417l0;

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @NonNull

        /* renamed from: j */
        public final Rect f14418j;

        /* renamed from: k */
        public WeakReference<BottomAppBar> f14419k;

        /* renamed from: l */
        public int f14420l;

        /* renamed from: m */
        public final View$OnLayoutChangeListenerC7589a f14421m;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes3.dex */
        public class View$OnLayoutChangeListenerC7589a implements View.OnLayoutChangeListener {
            public View$OnLayoutChangeListenerC7589a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f14419k.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (!(view instanceof FloatingActionButton)) {
                    CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) view.getLayoutParams();
                    if (behavior.f14420l == 0) {
                        if (bottomAppBar.f14411f0 == 1) {
                            ((ViewGroup.MarginLayoutParams) c0590e).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) c0590e).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c0590e).rightMargin = bottomAppBar.getRightInset();
                        if (C7764q.m4505a(view)) {
                            ((ViewGroup.MarginLayoutParams) c0590e).leftMargin += 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0590e).rightMargin += 0;
                        }
                    }
                    int i9 = BottomAppBar.f14405m0;
                    bottomAppBar.m4767A();
                    throw null;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                behavior.f14418j.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
            this.f14421m = new View$OnLayoutChangeListenerC7589a();
            this.f14418j = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14421m = new View$OnLayoutChangeListenerC7589a();
            this.f14418j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: h */
        public final boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f14419k = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f14405m0;
            View m4762w = bottomAppBar.m4762w();
            if (m4762w != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (!ViewCompat.C0817g.m11729c(m4762w)) {
                    CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) m4762w.getLayoutParams();
                    c0590e.f2216d = 17;
                    int i3 = bottomAppBar.f14411f0;
                    if (i3 == 1) {
                        c0590e.f2216d = 49;
                    }
                    if (i3 == 0) {
                        c0590e.f2216d |= 80;
                    }
                    this.f14420l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0590e) m4762w.getLayoutParams())).bottomMargin;
                    if (m4762w instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) m4762w;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.m4567c();
                        floatingActionButton.m4566d(new C7598e(bottomAppBar));
                        floatingActionButton.m4565e();
                    }
                    m4762w.addOnLayoutChangeListener(this.f14421m);
                    bottomAppBar.m4767A();
                    throw null;
                }
            }
            coordinatorLayout.m12118q(i, bottomAppBar);
            super.mo2724h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: q */
        public final boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.mo2598q(coordinatorLayout, bottomAppBar, view2, view3, i, i2)) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface MenuAlignmentMode {
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes3.dex */
    public class RunnableC7590a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f14423a;

        /* renamed from: b */
        public final /* synthetic */ int f14424b;

        /* renamed from: c */
        public final /* synthetic */ boolean f14425c;

        public RunnableC7590a(ActionMenuView actionMenuView, int i, boolean z) {
            this.f14423a = actionMenuView;
            this.f14424b = i;
            this.f14425c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f14424b;
            boolean z = this.f14425c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f14423a;
            actionMenuView.setTranslationX(bottomAppBar.m4761x(actionMenuView, i, z));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes3.dex */
    public static class C7591b extends AbstractC1068a {
        public static final Parcelable.Creator<C7591b> CREATOR = new C7592a();

        /* renamed from: c */
        public int f14427c;

        /* renamed from: d */
        public boolean f14428d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes3.dex */
        public class C7592a implements Parcelable.ClassLoaderCreator<C7591b> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7591b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7591b[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7591b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7591b(parcel, classLoader);
            }
        }

        public C7591b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14427c = parcel.readInt();
            this.f14428d = parcel.readInt() != 0;
        }

        public C7591b(Toolbar.C0281i c0281i) {
            super(c0281i);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f14427c);
            parcel.writeInt(this.f14428d ? 1 : 0);
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C7769a.m4500c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return m4760y(this.f14409d0);
    }

    private float getFabTranslationY() {
        int i;
        if (this.f14411f0 == 1) {
            return -getTopEdgeTreatment().f14442c;
        }
        View m4762w = m4762w();
        if (m4762w != null) {
            i = (-((getMeasuredHeight() + getBottomInset()) - m4762w.getMeasuredHeight())) / 2;
        } else {
            i = 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    @NonNull
    private C7599f getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: A */
    public final void m4767A() {
        C7599f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f14416k0) {
            m4759z();
        }
        throw null;
    }

    /* renamed from: B */
    public final void m4766B(@NonNull ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        RunnableC7590a runnableC7590a = new RunnableC7590a(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(runnableC7590a);
        } else {
            runnableC7590a.run();
        }
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0587b
    @NonNull
    public Behavior getBehavior() {
        if (this.f14417l0 == null) {
            this.f14417l0 = new Behavior();
        }
        return this.f14417l0;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f14442c;
    }

    public int getFabAlignmentMode() {
        return this.f14409d0;
    }

    @InterfaceC0074Px
    public int getFabAlignmentModeEndMargin() {
        return this.f14412g0;
    }

    public int getFabAnchorMode() {
        return this.f14411f0;
    }

    public int getFabAnimationMode() {
        return this.f14410e0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f14441b;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f14440a;
    }

    public boolean getHideOnScroll() {
        return this.f14414i0;
    }

    public int getMenuAlignmentMode() {
        return this.f14413h0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7798g.m4461b(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f14408W;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f14407V;
            if (animator2 != null) {
                animator2.cancel();
            }
            m4767A();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f14408W == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m4759z()) {
                m4766B(actionMenuView, 0, false, false);
            } else {
                m4766B(actionMenuView, this.f14409d0, this.f14416k0, false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7591b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7591b c7591b = (C7591b) parcelable;
        super.onRestoreInstanceState(c7591b.f2747a);
        this.f14409d0 = c7591b.f14427c;
        this.f14416k0 = c7591b.f14428d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        C7591b c7591b = new C7591b((Toolbar.C0281i) super.onSaveInstanceState());
        c7591b.f14427c = this.f14409d0;
        c7591b.f14428d = this.f14416k0;
        return c7591b;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        C0700a.C0702b.m11924h(null, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f) {
        if (f != getCradleVerticalOffset()) {
            C7599f topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.f14442c = f;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        this.f14415j0 = 0;
        boolean z = this.f14416k0;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11729c(this)) {
            int i3 = this.f14415j0;
            if (i3 != 0) {
                this.f14415j0 = 0;
                getMenu().clear();
                mo4478k(i3);
            }
        } else {
            Animator animator = this.f14408W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m4759z()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
                if (Math.abs(actionMenuView.getTranslationX() - m4761x(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                    ofFloat2.addListener(new C7597d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f14408W = animatorSet2;
            animatorSet2.addListener(new C7596c(this));
            this.f14408W.start();
        }
        if (this.f14409d0 != i && ViewCompat.C0817g.m11729c(this)) {
            Animator animator2 = this.f14407V;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            FloatingActionButton floatingActionButton = null;
            if (this.f14410e0 == 1) {
                View m4762w = m4762w();
                if (m4762w instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) m4762w;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, "translationX", m4760y(i));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View m4762w2 = m4762w();
                if (m4762w2 instanceof FloatingActionButton) {
                    floatingActionButton = (FloatingActionButton) m4762w2;
                }
                if (floatingActionButton != null && !floatingActionButton.m4562h()) {
                    floatingActionButton.m4563g(new C7594b(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(C7769a.m4499d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C7556a.f14282a));
            this.f14407V = animatorSet3;
            animatorSet3.addListener(new C7593a(this));
            this.f14407V.start();
        }
        this.f14409d0 = i;
    }

    public void setFabAlignmentModeEndMargin(@InterfaceC0074Px int i) {
        if (this.f14412g0 == i) {
            return;
        }
        this.f14412g0 = i;
        m4767A();
        throw null;
    }

    public void setFabAnchorMode(int i) {
        this.f14411f0 = i;
        m4767A();
        throw null;
    }

    public void setFabAnimationMode(int i) {
        this.f14410e0 = i;
    }

    public void setFabCornerSize(@Dimension float f) {
        if (f == getTopEdgeTreatment().f14443d) {
            return;
        }
        getTopEdgeTreatment().f14443d = f;
        throw null;
    }

    public void setFabCradleMargin(@Dimension float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f14441b = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f14440a = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f14414i0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f14413h0 != i) {
            this.f14413h0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m4766B(actionMenuView, this.f14409d0, m4759z(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f14406U != null) {
            drawable = drawable.mutate();
            C0700a.C0702b.m11925g(drawable, this.f14406U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f14406U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @androidx.annotation.Nullable
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m4762w() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            androidx.coordinatorlayout.widget.a<android.view.View> r2 = r0.f2193b
            androidx.collection.i<T, java.util.ArrayList<T>> r2 = r2.f2233b
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.f2195d
            r0.clear()
            if (r2 == 0) goto L24
            r0.addAll(r2)
        L24:
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L3c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L28
        L3c:
            return r2
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m4762w():android.view.View");
    }

    /* renamed from: x */
    public final int m4761x(@NonNull ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        if (this.f14413h0 == 1 || (i == 1 && z)) {
            boolean m4505a = C7764q.m4505a(this);
            int measuredWidth = m4505a ? getMeasuredWidth() : 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt.getLayoutParams() instanceof Toolbar.C0279g) && (((Toolbar.C0279g) childAt.getLayoutParams()).f148a & 8388615) == 8388611) {
                    measuredWidth = m4505a ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            int right = m4505a ? actionMenuView.getRight() : actionMenuView.getLeft();
            if (getNavigationIcon() == null) {
                i2 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
                if (!m4505a) {
                    i2 = -i2;
                }
            } else {
                i2 = 0;
            }
            return measuredWidth - ((right + 0) + i2);
        }
        return 0;
    }

    /* renamed from: y */
    public final float m4760y(int i) {
        boolean m4505a = C7764q.m4505a(this);
        if (i == 1) {
            View m4762w = m4762w();
            int i2 = 0;
            if (this.f14412g0 != -1 && m4762w != null) {
                i2 = 0 + (m4762w.getMeasuredWidth() / 2) + this.f14412g0;
            }
            return ((getMeasuredWidth() / 2) - i2) * (m4505a ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: z */
    public final boolean m4759z() {
        FloatingActionButton floatingActionButton;
        View m4762w = m4762w();
        if (m4762w instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton) m4762w;
        } else {
            floatingActionButton = null;
        }
        if (floatingActionButton != null && floatingActionButton.m4561i()) {
            return true;
        }
        return false;
    }
}
