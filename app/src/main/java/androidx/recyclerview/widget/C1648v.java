package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C1614b;

/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes.dex */
public final class C1648v implements C1614b.InterfaceC1616b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4007a;

    public C1648v(RecyclerView recyclerView) {
        this.f4007a = recyclerView;
    }

    /* renamed from: a */
    public final int m10104a() {
        return this.f4007a.getChildCount();
    }

    /* renamed from: b */
    public final void m10103b(int i) {
        RecyclerView recyclerView = this.f4007a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m10362o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
