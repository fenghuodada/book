package com.bitvale.switcher;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000bR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0014@TX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m508d2 = {"Lcom/bitvale/switcher/SwitcherC;", "Lcom/bitvale/switcher/b;", "", "value", "y", "F", "getIconProgress", "()F", "setIconProgress", "(F)V", "iconProgress", "a", "library_release"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class SwitcherC extends AbstractC3403b {

    /* renamed from: x */
    public float f8999x;

    /* renamed from: y */
    public float f9000y;

    @TargetApi(21)
    /* renamed from: com.bitvale.switcher.SwitcherC$a */
    /* loaded from: classes.dex */
    public static final class C3401a extends ViewOutlineProvider {

        /* renamed from: a */
        public final int f9001a;

        public C3401a(int i) {
            this.f9001a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            C10843j.m430f(view, "view");
            C10843j.m430f(outline, "outline");
            int i = this.f9001a;
            outline.setRoundRect(0, 0, i * 2, i * 2, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitcherC(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C10843j.m430f(context, "context");
    }

    @Override // com.bitvale.switcher.AbstractC3403b
    /* renamed from: a */
    public final void mo6790a() {
        setCurrentColor(getOffColor());
        setIconProgress(1.0f);
    }

    @Override // com.bitvale.switcher.AbstractC3403b
    /* renamed from: b */
    public final void mo6789b(boolean z, boolean z2) {
        double d;
        double d2;
        int offColor;
        if (this.f9009f != z) {
            setChecked(z);
            float f = 0.0f;
            if (z2 && getWidth() != 0) {
                AnimatorSet animatorSet = getAnimatorSet();
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                setAnimatorSet(new AnimatorSet());
                if (this.f9009f) {
                    d = 0.15d;
                    d2 = 12.0d;
                } else {
                    d = 0.2d;
                    f = 1.0f;
                    d2 = 14.5d;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(getIconProgress(), f);
                ofFloat.addUpdateListener(new C3405c(this));
                ofFloat.setInterpolator(new animationInterpolatorC3402a(d, d2));
                ofFloat.setDuration(800L);
                if (this.f9009f) {
                    offColor = getOnColor();
                } else {
                    offColor = getOffColor();
                }
                getIconClipPaint().setColor(offColor);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.addUpdateListener(new C3406d(this));
                valueAnimator.setIntValues(getCurrentColor(), offColor);
                valueAnimator.setEvaluator(new ArgbEvaluator());
                valueAnimator.setDuration(300L);
                AnimatorSet animatorSet2 = getAnimatorSet();
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new C3407e(this));
                    animatorSet2.playTogether(ofFloat, valueAnimator);
                    animatorSet2.start();
                    return;
                }
                return;
            }
            AnimatorSet animatorSet3 = getAnimatorSet();
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            if (!z) {
                setCurrentColor(getOffColor());
                setIconProgress(1.0f);
            } else {
                setCurrentColor(getOnColor());
                setIconProgress(0.0f);
            }
            InterfaceC10820l<Boolean, C10868p> listener = getListener();
            if (listener != null) {
                listener.invoke(Boolean.valueOf(this.f9009f));
            }
        }
    }

    @Override // com.bitvale.switcher.AbstractC3403b
    public float getIconProgress() {
        return this.f9000y;
    }

    @Override // android.view.View
    public final void onDraw(@Nullable Canvas canvas) {
        if (canvas != null) {
            canvas.drawCircle(getShadowOffset() + this.f8999x, (getShadowOffset() / 2) + this.f8999x, this.f8999x, getSwitcherPaint());
        }
        if (canvas != null) {
            RectF iconRect = getIconRect();
            float f = this.f8999x;
            canvas.drawRoundRect(iconRect, f, f, getIconPaint());
        }
        if (getIconClipRect().width() <= getIconCollapsedWidth() || canvas == null) {
            return;
        }
        canvas.drawRoundRect(getIconClipRect(), getIconRadius(), getIconRadius(), getIconClipPaint());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            size = (int) Math.min(getDefWidth(), getDefHeight());
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f8999x = (Math.min(i, i2) / 2.0f) - getShadowOffset();
        setOutlineProvider(new C3401a((int) this.f8999x));
        setElevation(getSwitchElevation());
        setIconRadius(this.f8999x * 0.5f);
        setIconClipRadius(getIconRadius() / 2.25f);
        setIconCollapsedWidth((getIconRadius() - getIconClipRadius()) * 1.1f);
        setIconHeight(getIconRadius() * 2.0f);
        RectF iconRect = getIconRect();
        float shadowOffset = getShadowOffset() + (this.f8999x - (getIconCollapsedWidth() / 2.0f));
        float f = 2;
        float shadowOffset2 = (getShadowOffset() / f) + (((this.f8999x * 2.0f) - getIconHeight()) / 2.0f);
        float shadowOffset3 = getShadowOffset() + (getIconCollapsedWidth() / 2.0f) + this.f8999x;
        float f2 = this.f8999x;
        iconRect.set(shadowOffset, shadowOffset2, shadowOffset3, (getShadowOffset() / f) + ((f2 * 2.0f) - (((f2 * 2.0f) - getIconHeight()) / 2.0f)));
        if (!this.f9009f) {
            getIconRect().left = getShadowOffset() + ((this.f8999x - (getIconCollapsedWidth() / 2.0f)) - (getIconRadius() - (getIconCollapsedWidth() / 2.0f)));
            getIconRect().right = getShadowOffset() + (getIconRadius() - (getIconCollapsedWidth() / 2.0f)) + (getIconCollapsedWidth() / 2.0f) + this.f8999x;
            getIconClipRect().set(getIconRect().centerX() - getIconClipRadius(), getIconRect().centerY() - getIconClipRadius(), getIconClipRadius() + getIconRect().centerX(), getIconClipRadius() + getIconRect().centerY());
        }
    }

    @Override // com.bitvale.switcher.AbstractC3403b
    public void setIconProgress(float f) {
        if (this.f9000y != f) {
            this.f9000y = f;
            float f2 = 2;
            float iconRadius = (((getIconRadius() - (getIconCollapsedWidth() / f2)) - 0.0f) * f) + 0.0f;
            getIconRect().left = getShadowOffset() + ((this.f8999x - (getIconCollapsedWidth() / f2)) - iconRadius);
            getIconRect().right = getShadowOffset() + (getIconCollapsedWidth() / f2) + this.f8999x + iconRadius;
            float iconClipRadius = ((getIconClipRadius() - 0.0f) * f) + 0.0f;
            getIconClipRect().set(getIconRect().centerX() - iconClipRadius, getIconRect().centerY() - iconClipRadius, getIconRect().centerX() + iconClipRadius, getIconRect().centerY() + iconClipRadius);
            postInvalidateOnAnimation();
        }
    }
}
