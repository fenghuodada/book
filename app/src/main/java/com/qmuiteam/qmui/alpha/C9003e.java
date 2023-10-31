package com.qmuiteam.qmui.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ambrose.overwall.R;

/* renamed from: com.qmuiteam.qmui.alpha.e */
/* loaded from: classes3.dex */
public class C9003e extends LinearLayout {

    /* renamed from: a */
    public C9006h f17189a;

    public C9003e(Context context) {
        super(context);
    }

    public C9003e(Context context, int i) {
        super(context, null, R.attr.qmui_dialog_action_container_style);
    }

    public C9003e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17189a == null) {
            this.f17189a = new C9006h(this);
        }
        return this.f17189a;
    }

    public void setChangeAlphaWhenDisable(boolean z) {
        getAlphaViewHelper().m2816c(z);
    }

    public void setChangeAlphaWhenPress(boolean z) {
        getAlphaViewHelper().f17193b = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getAlphaViewHelper().m2818a(this, z);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        getAlphaViewHelper().m2817b(this, z);
    }
}
