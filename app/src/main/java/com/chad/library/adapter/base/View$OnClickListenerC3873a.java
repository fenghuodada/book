package com.chad.library.adapter.base;

import android.view.View;
import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.fragment.C2480p;
import com.android.tool.bean.ResultsBean;
import com.android.tool.util.util.C2603g;
import com.android.tool.util.weight.recommendDialog.C2618a;
import com.android.tool.util.weight.recommendDialog.C2620b;
import com.android.tool.util.weight.recommendDialog.InterfaceC2622d;
import com.chad.library.adapter.base.listener.InterfaceC3876a;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.chad.library.adapter.base.a */
/* loaded from: classes.dex */
public final class View$OnClickListenerC3873a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3874b f9965a;

    /* renamed from: b */
    public final /* synthetic */ BaseViewHolder f9966b;

    public View$OnClickListenerC3873a(AbstractC3874b abstractC3874b, BaseViewHolder baseViewHolder) {
        this.f9965a = abstractC3874b;
        this.f9966b = baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String msg;
        int adapterPosition = this.f9966b.getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        AbstractC3874b abstractC3874b = this.f9965a;
        abstractC3874b.getClass();
        int i = adapterPosition + 0;
        C10843j.m431e(v, "v");
        InterfaceC3876a interfaceC3876a = abstractC3874b.f9970k;
        if (interfaceC3876a != null) {
            C2618a c2618a = ((C2620b) interfaceC3876a).f6161a;
            if (c2618a.f6155o != null) {
                if (C2603g.m9339a("LocaleLan") != 0 && ((ResultsBean) c2618a.f6154n.f9967h.get(i)).getMsg().contains(" ")) {
                    msg = ((ResultsBean) c2618a.f6154n.f9967h.get(i)).getMsg().split(" ")[C2603g.m9339a("LocaleLan")];
                } else {
                    msg = ((ResultsBean) c2618a.f6154n.f9967h.get(i)).getMsg();
                }
                c2618a.f6156p = msg;
                C2603g.m9336d("SELECTSERVER", ((ResultsBean) c2618a.f6154n.f9967h.get(i)).getGoFlyKey());
                InterfaceC2622d interfaceC2622d = c2618a.f6155o;
                C2470n.m9414A(((C2480p) interfaceC2622d).f5939a, c2618a.f6156p + "\u3000" + ((ResultsBean) c2618a.f6154n.f9967h.get(i)).getObjectId());
                c2618a.m9322f();
            }
        }
    }
}
