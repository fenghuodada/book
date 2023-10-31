package com.android.tool.util.weight.sectionDialog;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.tool.util.weight.sectionDialog.C2640k;

/* renamed from: com.android.tool.util.weight.sectionDialog.i */
/* loaded from: classes.dex */
public final class C2638i extends RecyclerView.AbstractC1583o {

    /* renamed from: a */
    public int f6191a;

    /* renamed from: b */
    public final /* synthetic */ C2640k.C2641a f6192b;

    public C2638i(C2640k.C2641a c2641a) {
        this.f6192b = c2641a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: a */
    public final void mo4583a(int i, @NonNull RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        View m10315v;
        C2640k.C2641a c2641a = this.f6192b;
        if (i == 0) {
            c2641a.f6196k.m10377c0(c2641a.f6199n.f6174j.get(this.f6191a).f6187e);
        }
        if (recyclerView.getLayoutManager() != null && (gridLayoutManager = c2641a.f6209x) != null && (m10315v = gridLayoutManager.m10315v(0)) != null) {
            c2641a.f6203r = m10315v.getTop();
            c2641a.f6209x.getClass();
            c2641a.f6204s = RecyclerView.LayoutManager.m10336K(m10315v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1583o
    /* renamed from: b */
    public final void mo4582b(@NonNull RecyclerView recyclerView, int i, int i2) {
        C2640k.C2641a c2641a = this.f6192b;
        GridLayoutManager gridLayoutManager = c2641a.f6209x;
        if (gridLayoutManager != null) {
            int m10434N0 = gridLayoutManager.m10434N0();
            this.f6191a = m10434N0;
            c2641a.f6198m.m9320b(c2641a.f6199n.f6174j.get(m10434N0).f6187e);
        }
    }
}
