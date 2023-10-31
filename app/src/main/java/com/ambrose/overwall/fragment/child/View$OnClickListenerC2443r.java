package com.ambrose.overwall.fragment.child;

import android.view.View;
import com.ambrose.overwall.R;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;

/* renamed from: com.ambrose.overwall.fragment.child.r */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2443r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2439o f5853a;

    public View$OnClickListenerC2443r(C2439o c2439o) {
        this.f5853a = c2439o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = C2439o.f5842C;
        C2439o c2439o = this.f5853a;
        DialogC9181l.C9183b c9183b = new DialogC9181l.C9183b(c2439o.getActivity());
        c9183b.m2592h(c2439o.getString(R.string.proxy_port));
        c9183b.f17697j = C9108h.m2670f(c2439o.getContext());
        c9183b.f17734o = 2;
        c9183b.f17731l = C2603g.m9338b("ProxyPort");
        c9183b.m2595a(c2439o.getString(R.string.show_cancal), 1, new C2445t());
        c9183b.m2595a(c2439o.getString(R.string.show_ok), 1, new C2444s(c2439o, c9183b));
        c9183b.m2594b(c2439o.f5848y).show();
    }
}
