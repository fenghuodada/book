package com.qmuiteam.qmui.alpha;

import android.content.Context;
import android.util.AttributeSet;
import com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView;

/* renamed from: com.qmuiteam.qmui.alpha.g */
/* loaded from: classes3.dex */
public class C9005g extends QMUISpanTouchFixTextView {

    /* renamed from: l */
    public C9006h f17191l;

    public C9005g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17191l == null) {
            this.f17191l = new C9006h(this);
        }
        return this.f17191l;
    }

    public void setChangeAlphaWhenDisable(boolean z) {
        getAlphaViewHelper().m2816c(z);
    }

    public void setChangeAlphaWhenPress(boolean z) {
        getAlphaViewHelper().f17193b = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getAlphaViewHelper().m2818a(this, z);
    }

    @Override // com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView
    /* renamed from: u */
    public final void mo2538u(boolean z) {
        super.mo2538u(z);
        getAlphaViewHelper().m2817b(this, z);
    }
}
