package com.qmuiteam.qmui.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.ambrose.overwall.R;

/* renamed from: com.qmuiteam.qmui.alpha.a */
/* loaded from: classes3.dex */
public class C8999a extends AppCompatButton {

    /* renamed from: d */
    public C9006h f17185d;

    public C8999a(Context context) {
        super(context, null);
    }

    public C8999a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8999a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.QMUIButtonStyle);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17185d == null) {
            this.f17185d = new C9006h(this);
        }
        return this.f17185d;
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

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        getAlphaViewHelper().m2817b(this, z);
    }
}
