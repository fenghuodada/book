package com.qmuiteam.qmui.widget.dialog;

import android.view.View;
import com.qmuiteam.qmui.layout.C9064h;
import com.qmuiteam.qmui.util.C9141b;

/* renamed from: com.qmuiteam.qmui.widget.dialog.s */
/* loaded from: classes3.dex */
public final class View$OnLayoutChangeListenerC9196s implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9064h f17751a;

    /* renamed from: b */
    public final /* synthetic */ QMUIDialogBuilder f17752b;

    public View$OnLayoutChangeListenerC9196s(QMUIDialogBuilder qMUIDialogBuilder, C9064h c9064h) {
        this.f17752b = qMUIDialogBuilder;
        this.f17751a = c9064h;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        C9064h c9064h = this.f17751a;
        int childCount = c9064h.getChildCount();
        if (childCount > 0) {
            View childAt = c9064h.getChildAt(childCount - 1);
            if (childAt.getRight() > i9) {
                int max = Math.max(0, childAt.getPaddingLeft() - C9141b.m2646a(this.f17752b.f17688a, 3));
                for (int i10 = 0; i10 < childCount; i10++) {
                    c9064h.getChildAt(i10).setPadding(max, 0, max, 0);
                }
            }
        }
    }
}
