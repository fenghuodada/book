package com.android.tool.util.weight.recommendDialog;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.android.tool.util.weight.recommendDialog.c */
/* loaded from: classes.dex */
public final class C2621c extends RecyclerView.AbstractC1583o {

    /* renamed from: a */
    public final /* synthetic */ C2618a f6162a;

    public C2621c(C2618a c2618a) {
        this.f6162a = c2618a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: a */
    public final void mo4583a(int i, @NonNull RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() != null) {
            C2618a c2618a = this.f6162a;
            View m10315v = ((LinearLayoutManager) c2618a.f6151k.getLayoutManager()).m10315v(0);
            if (m10315v != null) {
                c2618a.f6157q = m10315v.getTop();
                c2618a.f6158r = RecyclerView.LayoutManager.m10336K(m10315v);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: b */
    public final void mo4582b(@NonNull RecyclerView recyclerView, int i, int i2) {
    }
}
