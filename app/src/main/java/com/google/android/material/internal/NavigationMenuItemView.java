package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.appcompat.widget.C0324d2;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C0676f;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.widget.TextViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends C7747f implements InterfaceC0228n.InterfaceC0229a {

    /* renamed from: F */
    public static final int[] f15012F = {16842912};

    /* renamed from: A */
    public C0214i f15013A;

    /* renamed from: B */
    public ColorStateList f15014B;

    /* renamed from: C */
    public boolean f15015C;

    /* renamed from: D */
    public Drawable f15016D;

    /* renamed from: E */
    public final C7741a f15017E;

    /* renamed from: v */
    public int f15018v;

    /* renamed from: w */
    public boolean f15019w;

    /* renamed from: x */
    public boolean f15020x;

    /* renamed from: y */
    public final CheckedTextView f15021y;

    /* renamed from: z */
    public FrameLayout f15022z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes3.dex */
    public class C7741a extends C0851a {
        public C7741a() {
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, @NonNull C0874o c0874o) {
            View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f15020x);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C7741a c7741a = new C7741a();
        this.f15017E = c7741a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f15021y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m11771n(checkedTextView, c7741a);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f15022z == null) {
                this.f15022z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f15022z.removeAllViews();
            this.f15022z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    public C0214i getItemData() {
        return this.f15013A;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    /* renamed from: j */
    public final void mo4533j(@NonNull C0214i c0214i) {
        int i;
        LinearLayoutCompat.C0250a c0250a;
        int i2;
        StateListDrawable stateListDrawable;
        this.f15013A = c0214i;
        int i3 = c0214i.f715a;
        if (i3 > 0) {
            setId(i3);
        }
        if (c0214i.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f15012F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11748q(this, stateListDrawable);
        }
        setCheckable(c0214i.isCheckable());
        setChecked(c0214i.isChecked());
        setEnabled(c0214i.isEnabled());
        setTitle(c0214i.f719e);
        setIcon(c0214i.getIcon());
        setActionView(c0214i.getActionView());
        setContentDescription(c0214i.f731q);
        C0324d2.m12689a(this, c0214i.f732r);
        C0214i c0214i2 = this.f15013A;
        if (c0214i2.f719e != null || c0214i2.getIcon() != null || this.f15013A.getActionView() == null) {
            z = false;
        }
        CheckedTextView checkedTextView = this.f15021y;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f15022z;
            if (frameLayout != null) {
                c0250a = (LinearLayoutCompat.C0250a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f15022z;
            if (frameLayout2 != null) {
                c0250a = (LinearLayoutCompat.C0250a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) c0250a).width = i2;
        this.f15022z.setLayoutParams(c0250a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0214i c0214i = this.f15013A;
        if (c0214i != null && c0214i.isCheckable() && this.f15013A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15012F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f15020x != z) {
            this.f15020x = z;
            this.f15017E.mo10094h(this.f15021y, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f15021y;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f15015C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                C0700a.C0702b.m11924h(drawable, this.f15014B);
            }
            int i = this.f15018v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f15019w) {
            if (this.f15016D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C0676f.f2356a;
                Drawable m11986a = C0676f.C0677a.m11986a(resources, R.drawable.navigation_empty_icon, theme);
                this.f15016D = m11986a;
                if (m11986a != null) {
                    int i2 = this.f15018v;
                    m11986a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f15016D;
        }
        TextViewCompat.C1037b.m11290e(this.f15021y, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f15021y.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@Dimension int i) {
        this.f15018v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f15014B = colorStateList;
        this.f15015C = colorStateList != null;
        C0214i c0214i = this.f15013A;
        if (c0214i != null) {
            setIcon(c0214i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f15021y.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f15019w = z;
    }

    public void setTextAppearance(int i) {
        this.f15021y.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f15021y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f15021y.setText(charSequence);
    }
}
