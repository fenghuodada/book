package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.ambrose.overwall.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes3.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: B */
    public static final int[] f15369B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    @Nullable

    /* renamed from: A */
    public final AccessibilityManager f15370A;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.C7828e {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C7828e, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f15370A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: a */
    public final void mo4418a() {
        m4425b(3);
    }

    /* renamed from: g */
    public final int m4417g() {
        int recommendedTimeoutMillis;
        int i = this.f15343k;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.f15370A.getRecommendedTimeoutMillis(i, 3);
            return recommendedTimeoutMillis;
        }
        return i;
    }
}
