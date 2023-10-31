package com.qmuiteam.qmui.widget.section;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.qmuiteam.qmui.widget.section.b */
/* loaded from: classes3.dex */
public final class C9242b extends RecyclerView.AbstractC1575g {

    /* renamed from: b */
    public final /* synthetic */ C9243c f17947b;

    public C9242b(C9243c c9243c) {
        this.f17947b = c9243c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
    public final void onChanged() {
        super.onChanged();
        C9243c c9243c = this.f17947b;
        c9243c.f17949b = -1;
        ((C9245d) c9243c.f17948a).f17951a.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
    public final void onItemRangeChanged(int i, int i2) {
        super.onItemRangeChanged(i, i2);
        C9243c c9243c = this.f17947b;
        int i3 = c9243c.f17949b;
        if (i3 >= i && i3 < i + i2) {
            c9243c.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
    public final void onItemRangeInserted(int i, int i2) {
        super.onItemRangeInserted(i, i2);
        C9243c c9243c = this.f17947b;
        if (i > c9243c.f17949b) {
            return;
        }
        c9243c.f17949b = -1;
        ((C9245d) c9243c.f17948a).f17951a.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
    public final void onItemRangeMoved(int i, int i2, int i3) {
        super.onItemRangeMoved(i, i2, i3);
        C9243c c9243c = this.f17947b;
        int i4 = c9243c.f17949b;
        if (i != i4 && i2 != i4) {
            return;
        }
        c9243c.f17949b = -1;
        ((C9245d) c9243c.f17948a).f17951a.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
    public final void onItemRangeRemoved(int i, int i2) {
        super.onItemRangeRemoved(i, i2);
        C9243c c9243c = this.f17947b;
        int i3 = c9243c.f17949b;
        if (i3 >= i && i3 < i + i2) {
            c9243c.f17949b = -1;
            c9243c.m2554f();
        }
    }
}
