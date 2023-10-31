package com.qmuiteam.qmui.widget.dialog;

import android.view.View;

/* renamed from: com.qmuiteam.qmui.widget.dialog.f */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC9173f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ QMUIBottomSheet f17707a;

    public View$OnClickListenerC9173f(QMUIBottomSheet qMUIBottomSheet) {
        this.f17707a = qMUIBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f17707a.cancel();
    }
}
