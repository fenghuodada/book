package com.qmuiteam.qmui.alpha;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: com.qmuiteam.qmui.alpha.b */
/* loaded from: classes3.dex */
public class C9000b extends ConstraintLayout {

    /* renamed from: q */
    public C9006h f17186q;

    public C9000b(Context context) {
        super(context);
    }

    public C9000b(Context context, int i) {
        super(context, null, i);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17186q == null) {
            this.f17186q = new C9006h(this);
        }
        return this.f17186q;
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
