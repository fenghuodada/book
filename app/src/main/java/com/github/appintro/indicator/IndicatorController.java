package com.github.appintro.indicator;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H&R\u001c\u0010\u0010\u001a\u00020\u00068g@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u00068g@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, m508d2 = {"Lcom/github/appintro/indicator/IndicatorController;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "newInstance", "", "slideCount", "Lkotlin/p;", "initialize", FirebaseAnalytics.Param.INDEX, "selectPosition", "getSelectedIndicatorColor", "()I", "setSelectedIndicatorColor", "(I)V", "selectedIndicatorColor", "getUnselectedIndicatorColor", "setUnselectedIndicatorColor", "unselectedIndicatorColor", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public interface IndicatorController {
    @ColorInt
    int getSelectedIndicatorColor();

    @ColorInt
    int getUnselectedIndicatorColor();

    void initialize(int i);

    @NotNull
    View newInstance(@NotNull Context context);

    void selectPosition(int i);

    void setSelectedIndicatorColor(int i);

    void setUnselectedIndicatorColor(int i);
}
