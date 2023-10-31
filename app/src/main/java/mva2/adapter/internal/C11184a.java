package mva2.adapter.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import mva2.adapter.C11180f;
import mva2.adapter.decorator.AbstractC11178a;

/* renamed from: mva2.adapter.internal.a */
/* loaded from: classes3.dex */
public final class C11184a extends RecyclerView.AbstractC1578j {

    /* renamed from: a */
    public final C11180f f21853a;

    public C11184a(C11180f c11180f) {
        this.f21853a = c11180f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: c */
    public final void mo69c(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
        int i;
        recyclerView.getClass();
        RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(view);
        if (m10398J != null) {
            i = m10398J.getAbsoluteAdapterPosition();
        } else {
            i = -1;
        }
        if (i < 0) {
            return;
        }
        C11180f c11180f = this.f21853a;
        c11180f.f21838h.m82s(i, rect, view, recyclerView, c1594v, i);
        Iterator it = c11180f.m88b(i).f21830a.iterator();
        while (it.hasNext()) {
            ((AbstractC11178a) it.next()).mo89a(rect, recyclerView, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: d */
    public final void mo68d(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
        int i;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(childAt);
            if (m10398J != null) {
                i = m10398J.getAbsoluteAdapterPosition();
            } else {
                i = -1;
            }
            int i3 = i;
            if (i3 < 0) {
                return;
            }
            C11180f c11180f = this.f21853a;
            c11180f.f21838h.m85p(i3, canvas, recyclerView, c1594v, childAt, i3);
            Iterator it = c11180f.m88b(i3).f21830a.iterator();
            while (it.hasNext()) {
                ((AbstractC11178a) it.next()).getClass();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
    /* renamed from: e */
    public final void mo67e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
        int i;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerView.AbstractC1597y m10398J = RecyclerView.m10398J(childAt);
            if (m10398J != null) {
                i = m10398J.getAbsoluteAdapterPosition();
            } else {
                i = -1;
            }
            int i3 = i;
            if (i3 < 0) {
                return;
            }
            C11180f c11180f = this.f21853a;
            c11180f.f21838h.m84q(i3, canvas, recyclerView, c1594v, childAt, i3);
            Iterator it = c11180f.m88b(i3).f21830a.iterator();
            while (it.hasNext()) {
                ((AbstractC11178a) it.next()).getClass();
            }
        }
    }
}
