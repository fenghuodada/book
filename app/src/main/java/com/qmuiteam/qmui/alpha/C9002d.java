package com.qmuiteam.qmui.alpha;

import android.content.Context;
import androidx.appcompat.widget.C0398o;

/* renamed from: com.qmuiteam.qmui.alpha.d */
/* loaded from: classes3.dex */
public final class C9002d extends C0398o {

    /* renamed from: d */
    public C9006h f17188d;

    public C9002d(Context context) {
        super(context, null);
    }

    private C9006h getAlphaViewHelper() {
        if (this.f17188d == null) {
            this.f17188d = new C9006h(this);
        }
        return this.f17188d;
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
