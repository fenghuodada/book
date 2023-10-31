package com.qmuiteam.qmui.widget.dialog;

import android.content.res.TypedArray;
import android.view.View;

/* renamed from: com.qmuiteam.qmui.widget.dialog.c */
/* loaded from: classes3.dex */
public final class View$OnClickListenerC9170c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ QMUIBottomSheet f17705a;

    public View$OnClickListenerC9170c(QMUIBottomSheet qMUIBottomSheet) {
        this.f17705a = qMUIBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QMUIBottomSheet qMUIBottomSheet = this.f17705a;
        if (qMUIBottomSheet.f17669k.f14455L != 2 && qMUIBottomSheet.f17700f && qMUIBottomSheet.isShowing()) {
            if (!qMUIBottomSheet.f17702h) {
                TypedArray obtainStyledAttributes = qMUIBottomSheet.getContext().obtainStyledAttributes(new int[]{16843611});
                qMUIBottomSheet.f17701g = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                qMUIBottomSheet.f17702h = true;
            }
            if (qMUIBottomSheet.f17701g) {
                qMUIBottomSheet.cancel();
            }
        }
    }
}
