package com.ambrose.overwall.fragment.child;

import androidx.lifecycle.InterfaceC1490s;
import com.ambrose.overwall.fragment.child.C2414b;
import com.android.tool.adapter.C2536b;
import com.android.tool.pref.C2553a;
import java.util.List;

/* renamed from: com.ambrose.overwall.fragment.child.c */
/* loaded from: classes.dex */
public final class C2420c implements InterfaceC1490s<List<C2553a>> {

    /* renamed from: a */
    public final /* synthetic */ C2414b.C2418d f5810a;

    public C2420c(C2414b.C2418d c2418d) {
        this.f5810a = c2418d;
    }

    @Override // androidx.lifecycle.InterfaceC1490s
    public final void onChanged(List<C2553a> list) {
        List<C2553a> list2 = list;
        if (list2 != null) {
            C2414b.C2418d c2418d = this.f5810a;
            C2536b c2536b = C2414b.this.f5800v;
            c2536b.getClass();
            c2536b.f9967h.addAll(list2);
            c2536b.notifyItemRangeInserted((c2536b.f9967h.size() - list2.size()) + 0, list2.size());
            if (c2536b.f9967h.size() == list2.size()) {
                c2536b.notifyDataSetChanged();
            }
            C2414b c2414b = C2414b.this;
            c2414b.f5800v.notifyDataSetChanged();
            c2414b.f5803y.f5753e.setVisibility(8);
            c2414b.f5803y.f5751c.setVisibility(0);
        }
    }
}
