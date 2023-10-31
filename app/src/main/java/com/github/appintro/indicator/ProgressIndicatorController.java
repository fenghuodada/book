package com.github.appintro.indicator;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016R*\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, m508d2 = {"Lcom/github/appintro/indicator/ProgressIndicatorController;", "Lcom/github/appintro/indicator/IndicatorController;", "Landroid/widget/ProgressBar;", "Landroid/content/Context;", "context", "newInstance", "", "slideCount", "Lkotlin/p;", "initialize", FirebaseAnalytics.Param.INDEX, "selectPosition", "value", "selectedIndicatorColor", "I", "getSelectedIndicatorColor", "()I", "setSelectedIndicatorColor", "(I)V", "unselectedIndicatorColor", "getUnselectedIndicatorColor", "setUnselectedIndicatorColor", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ProgressIndicatorController extends ProgressBar implements IndicatorController {
    private int selectedIndicatorColor;
    private int unselectedIndicatorColor;

    @JvmOverloads
    public ProgressIndicatorController(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ProgressIndicatorController(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressIndicatorController(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10843j.m430f(context, "context");
        this.selectedIndicatorColor = 1;
        this.unselectedIndicatorColor = 1;
    }

    public /* synthetic */ ProgressIndicatorController(Context context, AttributeSet attributeSet, int i, int i2, C10839f c10839f) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842872 : i);
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
        setMax(i);
        if (i == 1) {
            setVisibility(4);
        }
        selectPosition(0);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    @NotNull
    public ProgressIndicatorController newInstance(@NotNull Context context) {
        C10843j.m430f(context, "context");
        return this;
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void selectPosition(int i) {
        setProgress(i + 1);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setSelectedIndicatorColor(int i) {
        this.selectedIndicatorColor = i;
        getProgressDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // com.github.appintro.indicator.IndicatorController
    public void setUnselectedIndicatorColor(int i) {
        this.unselectedIndicatorColor = i;
        getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
