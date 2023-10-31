package com.qmuiteam.qmui.widget.section;

import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: com.qmuiteam.qmui.widget.section.c */
/* loaded from: classes3.dex */
public final class C9243c<VH> extends RecyclerView.AbstractC1578j {

    /* renamed from: a */
    public final InterfaceC9244a<VH> f17948a;

    /* renamed from: b */
    public int f17949b = -1;

    /* renamed from: c */
    public final WeakReference<ViewGroup> f17950c = new WeakReference<>(null);

    /* renamed from: com.qmuiteam.qmui.widget.section.c$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9244a<ViewHolder> {
    }

    public C9243c(@NonNull C9245d c9245d) {
        this.f17948a = c9245d;
        new C9242b(this);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: e */
    public final void mo67e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
        if (this.f17950c.get() == null) {
            return;
        }
        if (recyclerView.getChildCount() == 0) {
            m2554f();
        }
        if (recyclerView.getAdapter() == null) {
            m2554f();
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            m2554f();
        } else if (((LinearLayoutManager) layoutManager).m10434N0() == -1) {
            m2554f();
        } else {
            ((C9245d) this.f17948a).getClass();
            throw null;
        }
    }

    /* renamed from: f */
    public final void m2554f() {
        ViewGroup viewGroup = this.f17950c.get();
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
        this.f17948a.getClass();
    }
}
