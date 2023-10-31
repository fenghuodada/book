package com.qmuiteam.qmui.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.appbar.AppBarLayout;
import com.qmuiteam.qmui.C8997a;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.InterfaceC9100b;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9150j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.qmuiteam.qmui.widget.c */
/* loaded from: classes3.dex */
public final class C9160c extends FrameLayout implements InterfaceC9100b {

    /* renamed from: a */
    public int f17645a;

    /* renamed from: b */
    public int f17646b;

    /* renamed from: c */
    public int f17647c;

    /* renamed from: d */
    public int f17648d;

    /* renamed from: e */
    public boolean f17649e;

    /* renamed from: f */
    public Drawable f17650f;

    /* renamed from: g */
    public Drawable f17651g;

    /* renamed from: h */
    public int f17652h;

    /* renamed from: i */
    public boolean f17653i;

    /* renamed from: j */
    public ValueAnimator f17654j;

    /* renamed from: k */
    public long f17655k;

    /* renamed from: l */
    public int f17656l;

    /* renamed from: m */
    public C9162b f17657m;

    /* renamed from: n */
    public ValueAnimator.AnimatorUpdateListener f17658n;

    /* renamed from: o */
    public int f17659o;

    /* renamed from: p */
    public int f17660p;

    /* renamed from: q */
    public int f17661q;

    /* renamed from: r */
    public int f17662r;

    /* renamed from: s */
    public int f17663s;

    /* renamed from: com.qmuiteam.qmui.widget.c$a */
    /* loaded from: classes3.dex */
    public static class C9161a extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public final int f17664a;

        /* renamed from: b */
        public float f17665b;

        public C9161a() {
            super(-1, -1);
            this.f17664a = 0;
            this.f17665b = 0.5f;
        }

        public C9161a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17664a = 0;
            this.f17665b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9056b.f17306a);
            this.f17664a = obtainStyledAttributes.getInt(0, 0);
            this.f17665b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public C9161a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17664a = 0;
            this.f17665b = 0.5f;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.c$b */
    /* loaded from: classes3.dex */
    public class C9162b implements AppBarLayout.InterfaceC7568a {
        public C9162b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7568a
        /* renamed from: a */
        public final void mo2602a(int i) {
            int m2643b;
            C9160c c9160c = C9160c.this;
            c9160c.f17659o = i;
            int windowInsetTop = c9160c.getWindowInsetTop();
            int childCount = c9160c.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c9160c.getChildAt(i2);
                C9161a c9161a = (C9161a) childAt.getLayoutParams();
                C9150j m2604d = C9160c.m2604d(childAt);
                int i3 = c9161a.f17664a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        m2643b = Math.round((-i) * c9161a.f17665b);
                    }
                } else {
                    m2643b = C9143d.m2643b(-i, 0, ((c9160c.getHeight() - C9160c.m2604d(childAt).f17587b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((C9161a) childAt.getLayoutParams())).bottomMargin);
                }
                m2604d.m2623d(m2643b);
            }
            c9160c.m2603e();
            if (c9160c.f17651g != null && windowInsetTop > 0) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11754k(c9160c);
            }
            c9160c.getHeight();
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0814d.m11761d(c9160c);
            Math.abs(i);
            throw null;
        }
    }

    /* renamed from: d */
    public static C9150j m2604d(View view) {
        C9150j c9150j = (C9150j) view.getTag(R.id.qmui_view_offset_helper);
        if (c9150j == null) {
            C9150j c9150j2 = new C9150j(view);
            view.setTag(R.id.qmui_view_offset_helper, c9150j2);
            return c9150j2;
        }
        return c9150j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWindowInsetTop() {
        return 0;
    }

    private void setContentScrimInner(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17650f;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f17650f = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f17650f.setCallback(this);
                this.f17650f.setAlpha(this.f17652h);
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    private void setStatusBarScrimInner(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f17651g;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f17651g = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f17651g.setState(getDrawableState());
                }
                Drawable drawable4 = this.f17651g;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                C0700a.C0703c.m11921b(drawable4, ViewCompat.C0815e.m11742d(this));
                Drawable drawable5 = this.f17651g;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f17651g.setCallback(this);
                this.f17651g.setAlpha(this.f17652h);
            }
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    @Override // com.qmuiteam.qmui.skin.InterfaceC9100b
    /* renamed from: a */
    public final void mo2566a(@NotNull Resources.Theme theme) {
        if (this.f17660p != 0) {
            setContentScrimInner(C9145f.m2635f(this.f17660p, getContext(), theme));
        }
        if (this.f17661q != 0) {
            setStatusBarScrimInner(C9145f.m2635f(this.f17661q, getContext(), theme));
        }
        int i = this.f17662r;
        if (i != 0) {
            C9106f.m2679a(i, this);
            throw null;
        }
        int i2 = this.f17663s;
        if (i2 == 0) {
            return;
        }
        C9106f.m2679a(i2, this);
        throw null;
    }

    /* renamed from: c */
    public final void m2605c() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C9161a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        super.dispatchApplyWindowInsets(windowInsets);
        return windowInsets;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int windowInsetTop;
        super.draw(canvas);
        m2605c();
        Drawable drawable = this.f17650f;
        if (drawable != null && this.f17652h > 0) {
            drawable.mutate().setAlpha(this.f17652h);
            this.f17650f.draw(canvas);
        }
        if (this.f17649e) {
            throw null;
        }
        if (this.f17651g == null || this.f17652h <= 0 || (windowInsetTop = getWindowInsetTop()) <= 0) {
            return;
        }
        this.f17651g.setBounds(0, -this.f17659o, getWidth(), windowInsetTop - this.f17659o);
        this.f17651g.mutate().setAlpha(this.f17652h);
        this.f17651g.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        boolean z2;
        Drawable drawable = this.f17650f;
        if (drawable != null && this.f17652h > 0) {
            if (view == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                drawable.mutate().setAlpha(this.f17652h);
                this.f17650f.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17651g;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f17650f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m2603e() {
        if (this.f17650f == null && this.f17651g == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f17659o < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C9161a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C9161a(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9161a(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        throw null;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        throw null;
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.f17650f;
    }

    public int getExpandedTitleGravity() {
        throw null;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f17648d;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f17647c;
    }

    public int getExpandedTitleMarginStart() {
        return this.f17645a;
    }

    public int getExpandedTitleMarginTop() {
        return this.f17646b;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        throw null;
    }

    public int getScrimAlpha() {
        return this.f17652h;
    }

    public long getScrimAnimationDuration() {
        return this.f17655k;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f17656l;
        if (i >= 0) {
            return i;
        }
        int windowInsetTop = getWindowInsetTop();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int m11761d = ViewCompat.C0814d.m11761d(this);
        if (m11761d > 0) {
            return Math.min((m11761d * 2) + windowInsetTop, getHeight());
        }
        return getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.f17651g;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.f17649e) {
            throw null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            setFitsSystemWindows(ViewCompat.C0814d.m11763b((View) parent));
            if (this.f17657m == null) {
                this.f17657m = new C9162b();
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            C9162b c9162b = this.f17657m;
            if (appBarLayout.f14307g == null) {
                appBarLayout.f14307g = new ArrayList();
            }
            if (c9162b != null && !appBarLayout.f14307g.contains(c9162b)) {
                appBarLayout.f14307g.add(c9162b);
            }
            ViewCompat.C0818h.m11722c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        C9162b c9162b = this.f17657m;
        if (c9162b != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f14307g) != null) {
            arrayList.remove(c9162b);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            m2604d(getChildAt(i5)).m2625b(false);
        }
        if (!this.f17649e) {
            m2603e();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                m2604d(getChildAt(i6)).m2626a();
            }
            return;
        }
        m2604d(null);
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m2605c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f17650f;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof QMUITopBar) {
            ((QMUITopBar) view).m2615k();
        }
    }

    public void setCollapsedTextColorSkinAttr(int i) {
        this.f17662r = i;
        if (i == 0) {
            return;
        }
        C9106f.m2679a(i, this);
        throw null;
    }

    public void setCollapsedTitleGravity(int i) {
        throw null;
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        throw null;
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f17662r = 0;
        throw null;
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        throw null;
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        this.f17660p = 0;
        setContentScrimInner(drawable);
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f2323a;
        setContentScrim(ContextCompat.C0651c.m12032b(context, i));
    }

    public void setContentScrimSkinAttr(int i) {
        this.f17660p = i;
        if (i != 0) {
            int i2 = C9106f.f17535a;
            setStatusBarScrimInner(C9145f.m2635f(i, getContext(), C9106f.m2678b(this)));
        }
    }

    public void setExpandedTextColorSkinAttr(int i) {
        this.f17663s = i;
        if (i == 0) {
            return;
        }
        C9106f.m2679a(i, this);
        throw null;
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        throw null;
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f17648d = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f17647c = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f17645a = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f17646b = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        throw null;
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f17663s = 0;
        throw null;
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        throw null;
    }

    public void setScrimAlpha(int i) {
        if (i != this.f17652h) {
            Drawable drawable = this.f17650f;
            this.f17652h = i;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.f17655k = j;
    }

    public void setScrimUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.f17658n;
        if (animatorUpdateListener2 != animatorUpdateListener) {
            ValueAnimator valueAnimator = this.f17654j;
            if (valueAnimator == null) {
                this.f17658n = animatorUpdateListener;
                return;
            }
            if (animatorUpdateListener2 != null) {
                valueAnimator.removeUpdateListener(animatorUpdateListener2);
            }
            this.f17658n = animatorUpdateListener;
            if (animatorUpdateListener != null) {
                this.f17654j.addUpdateListener(animatorUpdateListener);
            }
        }
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.f17656l != i) {
            this.f17656l = i;
            m2603e();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int i = 0;
        if (ViewCompat.C0817g.m11729c(this) && !isInEditMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f17653i != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                ValueAnimator valueAnimator = this.f17654j;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f17654j = valueAnimator2;
                    valueAnimator2.setDuration(this.f17655k);
                    ValueAnimator valueAnimator3 = this.f17654j;
                    if (i2 > this.f17652h) {
                        timeInterpolator = C8997a.f17182a;
                    } else {
                        timeInterpolator = C8997a.f17183b;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.f17654j.addUpdateListener(new C9159b(this));
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f17658n;
                    if (animatorUpdateListener != null) {
                        this.f17654j.addUpdateListener(animatorUpdateListener);
                    }
                } else if (valueAnimator.isRunning()) {
                    this.f17654j.cancel();
                }
                this.f17654j.setIntValues(this.f17652h, i2);
                this.f17654j.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f17653i = z;
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        this.f17661q = 0;
        setStatusBarScrimInner(drawable);
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f2323a;
        setStatusBarScrim(ContextCompat.C0651c.m12032b(context, i));
    }

    public void setStatusBarScrimSkinAttr(int i) {
        this.f17661q = i;
        if (i != 0) {
            int i2 = C9106f.f17535a;
            setStatusBarScrimInner(C9145f.m2635f(i, getContext(), C9106f.m2678b(this)));
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        throw null;
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f17649e) {
            this.f17649e = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f17651g;
        if (drawable != null && drawable.isVisible() != z) {
            this.f17651g.setVisible(z, false);
        }
        Drawable drawable2 = this.f17650f;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f17650f.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17650f || drawable == this.f17651g;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C9161a();
    }
}
