package com.github.appintro.internal;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m508d2 = {"Lcom/github/appintro/internal/ScrollerCustomDuration;", "Landroid/widget/Scroller;", "", "startX", "startY", "dx", "dy", "duration", "Lkotlin/p;", "startScroll", "", "scrollDurationFactor", "D", "getScrollDurationFactor", "()D", "setScrollDurationFactor", "(D)V", "Landroid/content/Context;", "context", "Landroid/view/animation/Interpolator;", "interpolator", "<init>", "(Landroid/content/Context;Landroid/view/animation/Interpolator;)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ScrollerCustomDuration extends Scroller {
    private double scrollDurationFactor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerCustomDuration(@NotNull Context context, @NotNull Interpolator interpolator) {
        super(context, interpolator);
        C10843j.m430f(context, "context");
        C10843j.m430f(interpolator, "interpolator");
        this.scrollDurationFactor = 6.0d;
    }

    public final double getScrollDurationFactor() {
        return this.scrollDurationFactor;
    }

    public final void setScrollDurationFactor(double d) {
        this.scrollDurationFactor = d;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, (int) (i5 * this.scrollDurationFactor));
    }
}
