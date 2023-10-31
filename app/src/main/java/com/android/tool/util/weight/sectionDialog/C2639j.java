package com.android.tool.util.weight.sectionDialog;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.tool.util.weight.sectionDialog.C2640k;

/* renamed from: com.android.tool.util.weight.sectionDialog.j */
/* loaded from: classes.dex */
public final class C2639j extends RecyclerView.AbstractC1583o {

    /* renamed from: a */
    public final /* synthetic */ C2640k.C2641a f6193a;

    public C2639j(C2640k.C2641a c2641a) {
        this.f6193a = c2641a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: a */
    public final void mo4583a(int i, @NonNull RecyclerView recyclerView) {
        C2640k.C2641a c2641a;
        CenterLayoutManager centerLayoutManager;
        View m10315v;
        if (recyclerView.getLayoutManager() != null && (centerLayoutManager = (c2641a = this.f6193a).f6208w) != null && (m10315v = centerLayoutManager.m10315v(0)) != null) {
            c2641a.f6205t = m10315v.getTop();
            c2641a.f6208w.getClass();
            c2641a.f6206u = RecyclerView.LayoutManager.m10336K(m10315v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: b */
    public final void mo4582b(@NonNull RecyclerView recyclerView, int i, int i2) {
    }
}
