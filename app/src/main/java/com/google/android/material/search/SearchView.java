package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC0587b {
    @Nullable

    /* renamed from: a */
    public SearchBar f15164a;

    /* renamed from: b */
    public int f15165b;
    @NonNull

    /* renamed from: c */
    public EnumC7787c f15166c;

    /* loaded from: classes3.dex */
    public static class Behavior extends CoordinatorLayout.AbstractC0588c<SearchView> {
        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: d */
        public final boolean mo2730d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            boolean z;
            SearchView searchView2 = searchView;
            if (searchView2.f15164a != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (view instanceof SearchBar)) {
                searchView2.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$a */
    /* loaded from: classes3.dex */
    public static class C7784a extends AbstractC1068a {
        public static final Parcelable.Creator<C7784a> CREATOR = new C7785a();

        /* renamed from: c */
        public String f15167c;

        /* renamed from: d */
        public int f15168d;

        public C7784a() {
            throw null;
        }

        public C7784a(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15167c = parcel.readString();
            this.f15168d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeString(this.f15167c);
            parcel.writeInt(this.f15168d);
        }

        /* renamed from: com.google.android.material.search.SearchView$a$a */
        /* loaded from: classes3.dex */
        public class C7785a implements Parcelable.ClassLoaderCreator<C7784a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C7784a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C7784a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C7784a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7784a(parcel, classLoader);
            }
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7786b {
        /* renamed from: a */
        void m4477a();
    }

    /* renamed from: com.google.android.material.search.SearchView$c */
    /* loaded from: classes3.dex */
    public enum EnumC7787c {
        /* JADX INFO: Fake field, exist only in values array */
        HIDING,
        /* JADX INFO: Fake field, exist only in values array */
        HIDDEN,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWING,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWN
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f15164a;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @InterfaceC0074Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
    }

    private void setUpHeaderLayout(int i) {
        if (i == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(@InterfaceC0074Px int i) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0587b
    @NonNull
    public CoordinatorLayout.AbstractC0588c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public EnumC7787c getCurrentTransitionState() {
        return this.f15166c;
    }

    @NonNull
    public EditText getEditText() {
        return null;
    }

    @Nullable
    public CharSequence getHint() {
        throw null;
    }

    @NonNull
    public TextView getSearchPrefix() {
        return null;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f15165b;
    }

    @Nullable
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    @NonNull
    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C7798g.m4461b(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f15165b = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof C7784a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7784a c7784a = (C7784a) parcelable;
        super.onRestoreInstanceState(c7784a.f2747a);
        setText(c7784a.f15167c);
        if (c7784a.f15168d == 0) {
            z = true;
        } else {
            z = false;
        }
        setVisible(z);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            Editable text = getText();
            if (text != null) {
                text.toString();
            }
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setAnimatedNavigationIcon(boolean z) {
    }

    public void setAutoShowKeyboard(boolean z) {
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@StringRes int i) {
        throw null;
    }

    public void setHint(@Nullable CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z) {
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.InterfaceC0280h interfaceC0280h) {
        throw null;
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        throw null;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        setStatusBarSpacerEnabledInternal(z);
    }

    public void setText(@StringRes int i) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        throw null;
    }

    public void setTransitionState(@NonNull EnumC7787c enumC7787c) {
        if (this.f15166c.equals(enumC7787c)) {
            return;
        }
        this.f15166c = enumC7787c;
        for (InterfaceC7786b interfaceC7786b : new LinkedHashSet((Collection) null)) {
            interfaceC7786b.m4477a();
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
    }

    public void setVisible(boolean z) {
        throw null;
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f15164a = searchBar;
        throw null;
    }
}
