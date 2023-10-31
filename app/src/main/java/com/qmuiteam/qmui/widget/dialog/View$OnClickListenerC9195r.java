package com.qmuiteam.qmui.widget.dialog;

import android.view.View;

/* renamed from: com.qmuiteam.qmui.widget.dialog.r */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC9195r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ DialogC9181l f17749a;

    /* renamed from: b */
    public final /* synthetic */ QMUIDialogAction f17750b;

    public View$OnClickListenerC9195r(QMUIDialogAction qMUIDialogAction, DialogC9181l dialogC9181l, int i) {
        this.f17750b = qMUIDialogAction;
        this.f17749a = dialogC9181l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QMUIDialogAction qMUIDialogAction = this.f17750b;
        if (qMUIDialogAction.f17685e != null && qMUIDialogAction.f17686f.isEnabled()) {
            qMUIDialogAction.f17685e.mo2596a(this.f17749a);
        }
    }
}
