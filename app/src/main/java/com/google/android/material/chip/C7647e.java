package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.C7746e;
import java.util.List;

/* renamed from: com.google.android.material.chip.e */
/* loaded from: classes3.dex */
public final class C7647e extends C7746e {
    @Dimension

    /* renamed from: e */
    public int f14771e;
    @Dimension

    /* renamed from: f */
    public int f14772f;

    /* renamed from: com.google.android.material.chip.e$a */
    /* loaded from: classes3.dex */
    public class C7648a implements InterfaceC7651d {
    }

    /* renamed from: com.google.android.material.chip.e$b */
    /* loaded from: classes3.dex */
    public static class C7649b extends ViewGroup.MarginLayoutParams {
        public C7649b() {
            super(-2, -2);
        }

        public C7649b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C7649b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.e$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7650c {
    }

    /* renamed from: com.google.android.material.chip.e$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7651d {
    }

    private int getVisibleChipCount() {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (getChildAt(i2).getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.C7746e
    /* renamed from: a */
    public final boolean mo4515a() {
        return this.f15089c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C7649b);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7649b();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7649b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7649b(layoutParams);
    }

    @IdRes
    public int getCheckedChipId() {
        throw null;
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f14771e;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f14772f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f15089c) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.f14771e != i) {
            this.f14771e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@DimenRes int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@Dimension int i) {
        if (this.f14772f != i) {
            this.f14772f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable InterfaceC7650c interfaceC7650c) {
        setOnCheckedStateChangeListener(interfaceC7650c == null ? null : new C7648a());
    }

    public void setOnCheckedStateChangeListener(@Nullable InterfaceC7651d interfaceC7651d) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // com.google.android.material.internal.C7746e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        throw null;
    }
}
