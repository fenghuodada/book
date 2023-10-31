package com.android.tool.util.weight.sectionDialog;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class CenterLayoutManager extends LinearLayoutManager {
    public CenterLayoutManager() {
        super(1);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public final void mo4606A0(RecyclerView recyclerView, int i) {
        C2623a c2623a = new C2623a(recyclerView.getContext());
        c2623a.f3758a = i;
        m10345B0(c2623a);
    }
}
