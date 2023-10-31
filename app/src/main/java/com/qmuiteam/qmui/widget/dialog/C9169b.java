package com.qmuiteam.qmui.widget.dialog;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.qmuiteam.qmui.widget.dialog.b */
/* loaded from: classes3.dex */
public final class C9169b extends BottomSheetBehavior.AbstractC7602c {

    /* renamed from: a */
    public final /* synthetic */ QMUIBottomSheet f17704a;

    public C9169b(QMUIBottomSheet qMUIBottomSheet) {
        this.f17704a = qMUIBottomSheet;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7602c
    /* renamed from: a */
    public final void mo2590a() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7602c
    /* renamed from: b */
    public final void mo2589b(int i) {
        if (i == 5) {
            QMUIBottomSheet qMUIBottomSheet = this.f17704a;
            if (!qMUIBottomSheet.f17670l && qMUIBottomSheet.f17671m) {
                qMUIBottomSheet.dismiss();
            } else {
                qMUIBottomSheet.cancel();
            }
        }
    }
}
