package com.github.appintro.indicator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import com.github.appintro.C6356R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R*\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u001a"}, m508d2 = {"Lcom/github/appintro/indicator/DotIndicatorController;", "Lcom/github/appintro/indicator/IndicatorController;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/view/View;", "newInstance", "", "slideCount", "Lkotlin/p;", "initialize", FirebaseAnalytics.Param.INDEX, "selectPosition", "value", "selectedIndicatorColor", "I", "getSelectedIndicatorColor", "()I", "setSelectedIndicatorColor", "(I)V", "unselectedIndicatorColor", "getUnselectedIndicatorColor", "setUnselectedIndicatorColor", "currentPosition", "<init>", "(Landroid/content/Context;)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class DotIndicatorController extends LinearLayout implements IndicatorController {
    private int currentPosition;
    private int selectedIndicatorColor;
    private int slideCount;
    private int unselectedIndicatorColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotIndicatorController(@NotNull Context context) {
        super(context);
        C10843j.m430f(context, "context");
        int i = C6356R.C6357color.appintro_default_selected_color;
        Object obj = ContextCompat.f2323a;
        this.selectedIndicatorColor = ContextCompat.C0652d.m12030a(context, i);
        this.unselectedIndicatorColor = ContextCompat.C0652d.m12030a(context, C6356R.C6357color.appintro_default_unselected_color);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getSelectedIndicatorColor() {
        return this.selectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public int getUnselectedIndicatorColor() {
        return this.unselectedIndicatorColor;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void initialize(int i) {
        this.slideCount = i;
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(getContext());
            Context context = getContext();
            int i3 = C6356R.C6358drawable.ic_appintro_indicator;
            Object obj = ContextCompat.f2323a;
            imageView.setImageDrawable(ContextCompat.C0651c.m12032b(context, i3));
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i == 1) {
                imageView.setVisibility(4);
            }
            addView(imageView, layoutParams);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    @NotNull
    public View newInstance(@NotNull Context context) {
        C10843j.m430f(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(17);
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i) {
        int unselectedIndicatorColor;
        this.currentPosition = i;
        int i2 = this.slideCount;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i) {
                unselectedIndicatorColor = getSelectedIndicatorColor();
            } else {
                unselectedIndicatorColor = getUnselectedIndicatorColor();
            }
            View childAt = getChildAt(i3);
            if (childAt != null) {
                C0700a.C0702b.m11925g(((ImageView) childAt).getDrawable(), unselectedIndicatorColor);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
        }
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i) {
        this.selectedIndicatorColor = i;
        selectPosition(this.currentPosition);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i) {
        this.unselectedIndicatorColor = i;
        selectPosition(this.currentPosition);
    }
}
