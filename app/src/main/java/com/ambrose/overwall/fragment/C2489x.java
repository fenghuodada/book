package com.ambrose.overwall.fragment;

import androidx.lifecycle.InterfaceC1490s;
import com.android.tool.bean.PingBean;
import com.kongzue.dialogx.dialogs.C8897o;

/* renamed from: com.ambrose.overwall.fragment.x */
/* loaded from: classes.dex */
public final class C2489x implements InterfaceC1490s<PingBean> {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5947a;

    public C2489x(C2470n c2470n) {
        this.f5947a = c2470n;
    }

    @Override // androidx.lifecycle.InterfaceC1490s
    public final void onChanged(PingBean pingBean) {
        PingBean pingBean2 = pingBean;
        C2470n c2470n = this.f5947a;
        c2470n.f5927w.get(pingBean2.getPosition()).setMs(pingBean2.getMs());
        int i = c2470n.f5913O + 1;
        c2470n.f5913O = i;
        if (i == c2470n.f5912N) {
            C8897o.m2905E();
            C2470n.m9408z(c2470n, c2470n.f5927w);
            return;
        }
        C8897o.m2896N(c2470n.f5913O + " / " + c2470n.f5912N);
    }
}
