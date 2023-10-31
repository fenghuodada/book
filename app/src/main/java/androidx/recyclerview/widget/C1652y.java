package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes.dex */
public final class C1652y {
    /* renamed from: a */
    public static int m10092a(RecyclerView.C1594v c1594v, AbstractC1645s abstractC1645s, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m10313w() == 0 || c1594v.m10276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return Math.min(abstractC1645s.mo10114l(), abstractC1645s.mo10124b(view2) - abstractC1645s.mo10121e(view));
        }
        return Math.abs(RecyclerView.LayoutManager.m10336K(view) - RecyclerView.LayoutManager.m10336K(view2)) + 1;
    }

    /* renamed from: b */
    public static int m10091b(RecyclerView.C1594v c1594v, AbstractC1645s abstractC1645s, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.m10313w() == 0 || c1594v.m10276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (c1594v.m10276b() - Math.max(RecyclerView.LayoutManager.m10336K(view), RecyclerView.LayoutManager.m10336K(view2))) - 1) : Math.max(0, Math.min(RecyclerView.LayoutManager.m10336K(view), RecyclerView.LayoutManager.m10336K(view2)));
        if (z) {
            return Math.round((max * (Math.abs(abstractC1645s.mo10124b(view2) - abstractC1645s.mo10121e(view)) / (Math.abs(RecyclerView.LayoutManager.m10336K(view) - RecyclerView.LayoutManager.m10336K(view2)) + 1))) + (abstractC1645s.mo10115k() - abstractC1645s.mo10121e(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m10090c(RecyclerView.C1594v c1594v, AbstractC1645s abstractC1645s, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m10313w() == 0 || c1594v.m10276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z) {
            return (int) (((abstractC1645s.mo10124b(view2) - abstractC1645s.mo10121e(view)) / (Math.abs(RecyclerView.LayoutManager.m10336K(view) - RecyclerView.LayoutManager.m10336K(view2)) + 1)) * c1594v.m10276b());
        }
        return c1594v.m10276b();
    }
}
