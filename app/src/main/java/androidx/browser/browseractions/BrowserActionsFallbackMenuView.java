package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.ambrose.overwall.R;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    public final int f1458a;

    /* renamed from: b */
    public final int f1459b;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1458a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f1459b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1458a * 2), this.f1459b), 1073741824), i2);
    }
}
