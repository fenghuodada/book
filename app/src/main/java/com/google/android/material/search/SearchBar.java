package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbstractC1068a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C7759m;
import com.google.android.material.shape.C7798g;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class SearchBar extends Toolbar {
    @Nullable

    /* renamed from: U */
    public Drawable f15159U;

    /* renamed from: V */
    public int f15160V;

    /* renamed from: W */
    public boolean f15161W;

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g */
        public boolean f15162g;

        public ScrollingViewBehavior() {
            this.f15162g = false;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15162g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: d */
        public final boolean mo2730d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            super.mo2730d(coordinatorLayout, view, view2);
            if (!this.f15162g && (view2 instanceof AppBarLayout)) {
                this.f15162g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$a */
    /* loaded from: classes3.dex */
    public static class C7782a extends AbstractC1068a {
        public static final Parcelable.Creator<C7782a> CREATOR = new C7783a();

        /* renamed from: c */
        public String f15163c;

        public C7782a(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15163c = parcel.readString();
        }

        public C7782a(Toolbar.C0281i c0281i) {
            super(c0281i);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeString(this.f15163c);
        }

        /* renamed from: com.google.android.material.search.SearchBar$a$a */
        /* loaded from: classes3.dex */
        public class C7783a implements Parcelable.ClassLoaderCreator<C7782a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C7782a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C7782a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C7782a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7782a(parcel, classLoader);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton m4507a = C7759m.m4507a(this);
        if (m4507a == null) {
            return;
        }
        m4507a.setClickable(!z);
        m4507a.setFocusable(!z);
        Drawable background = m4507a.getBackground();
        if (background != null) {
            this.f15159U = background;
        }
        m4507a.setBackgroundDrawable(z ? null : this.f15159U);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Nullable
    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        return ViewCompat.C0819i.m11713i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    @Nullable
    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f15160V;
    }

    @ColorInt
    public int getStrokeColor() {
        throw null;
    }

    @Dimension
    public float getStrokeWidth() {
        throw null;
    }

    @Nullable
    public CharSequence getText() {
        throw null;
    }

    @NonNull
    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: k */
    public final void mo4478k(@MenuRes int i) {
        super.mo4478k(i);
        this.f15160V = i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7798g.m4461b(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7782a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7782a c7782a = (C7782a) parcelable;
        super.onRestoreInstanceState(c7782a.f2747a);
        setText(c7782a.f15163c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        C7782a c7782a = new C7782a((Toolbar.C0281i) super.onSaveInstanceState());
        CharSequence text = getText();
        c7782a.f15163c = text == null ? null : text.toString();
        return c7782a;
    }

    public void setCenterView(@Nullable View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f15161W = z;
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f15161W) {
                if (layoutParams.f14330a == 0) {
                    layoutParams.f14330a = 53;
                }
            } else if (layoutParams.f14330a == 53) {
                layoutParams.f14330a = 0;
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
    }

    public void setHint(@StringRes int i) {
        throw null;
    }

    public void setHint(@Nullable CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        throw null;
    }

    public void setStrokeColor(@ColorInt int i) {
        if (getStrokeColor() == i) {
            return;
        }
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(@Dimension float f) {
        if (getStrokeWidth() != f) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@StringRes int i) {
        throw null;
    }

    public void setText(@Nullable CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
