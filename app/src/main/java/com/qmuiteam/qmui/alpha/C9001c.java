package com.qmuiteam.qmui.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.qmuiteam.qmui.alpha.c */
/* loaded from: classes3.dex */
public class C9001c extends FrameLayout {

    /* renamed from: a */
    public C9006h f17187a;

    public C9001c(Context context) {
        super(context);
    }

    public C9001c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C9001c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17187a == null) {
            this.f17187a = new C9006h(this);
        }
        return this.f17187a;
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
