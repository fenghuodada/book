package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.qmuiteam.qmui.layout.C9059c;
import com.qmuiteam.qmui.util.C9152l;
import com.qmuiteam.qmui.util.C9156m;

@Deprecated
/* loaded from: classes3.dex */
public class QMUIWindowInsetLayout extends C9059c {
    public QMUIWindowInsetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C9152l.m2621a(view, new C9156m(), false);
    }
}
