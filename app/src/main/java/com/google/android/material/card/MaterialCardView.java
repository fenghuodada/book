package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.C0158a;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.ambrose.overwall.R;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7813n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC7813n {

    /* renamed from: i */
    public static final int[] f14607i = {R.attr.state_dragged};

    /* renamed from: h */
    public boolean f14608h;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CheckedIconGravity {
    }

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7622a {
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    @Dimension
    public int getCheckedIconMargin() {
        throw null;
    }

    @Dimension
    public int getCheckedIconSize() {
        throw null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    @FloatRange(from = 0.0d, m13045to = 1.0d)
    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    @NonNull
    public C7801j getShapeAppearanceModel() {
        throw null;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    @Dimension
    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.f14608h) {
            View.mergeDrawableStates(onCreateDrawableState, f14607i);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i) {
        throw null;
    }

    public void setCheckedIconMargin(@Dimension int i) {
        throw null;
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        C0158a.m12920a(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(@Dimension int i) {
        throw null;
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    public void setDragged(boolean z) {
        if (this.f14608h != z) {
            this.f14608h = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC7622a interfaceC7622a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(@FloatRange(from = 0.0d, m13045to = 1.0d) float f) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(@ColorRes int i) {
        ContextCompat.m12039b(getContext(), i);
        throw null;
    }

    @Override // com.google.android.material.shape.InterfaceC7813n
    public void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        setClipToOutline(c7801j.m4455d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(@Dimension int i) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }
}
