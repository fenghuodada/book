package com.qmuiteam.qmui.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ambrose.overwall.R;

/* renamed from: com.qmuiteam.qmui.alpha.f */
/* loaded from: classes3.dex */
public class C9004f extends RelativeLayout {

    /* renamed from: a */
    public C9006h f17190a;

    public C9004f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9004f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.QMUITopBarStyle);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17190a == null) {
            this.f17190a = new C9006h(this);
        }
        return this.f17190a;
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
