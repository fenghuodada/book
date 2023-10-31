package com.ambrose.overwall.p005mv.main;

import com.android.tool.bean.ListServerBean;
import io.reactivex.rxjava3.functions.InterfaceC10174b;

/* renamed from: com.ambrose.overwall.mv.main.f */
/* loaded from: classes.dex */
public final class C2499f implements InterfaceC10174b<ListServerBean> {

    /* renamed from: b */
    public final /* synthetic */ C2506m f5962b;

    public C2499f(C2506m c2506m) {
        this.f5962b = c2506m;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(ListServerBean listServerBean) throws Throwable {
        ListServerBean listServerBean2 = listServerBean;
        C2506m c2506m = this.f5962b;
        if (listServerBean2 != null && listServerBean2.getResults().size() != 0) {
            c2506m.f5972c.mo10510i(listServerBean2.getResults());
        } else {
            c2506m.f5972c.mo10510i(null);
        }
    }
}
