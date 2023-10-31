package com.qmuiteam.qmui.widget;

import android.content.Context;
import android.widget.ScrollView;

/* renamed from: com.qmuiteam.qmui.widget.d */
/* loaded from: classes3.dex */
public class C9163d extends ScrollView {

    /* renamed from: a */
    public int f17667a;

    public C9163d(Context context) {
        super(context);
        this.f17667a = 0;
    }

    public int getScrollOffset() {
        return this.f17667a;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f17667a = i2;
    }
}
