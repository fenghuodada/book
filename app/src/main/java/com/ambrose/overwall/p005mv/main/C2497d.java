package com.ambrose.overwall.p005mv.main;

import com.android.tool.bean.ListServerBean;
import io.reactivex.rxjava3.functions.InterfaceC10174b;

/* renamed from: com.ambrose.overwall.mv.main.d */
/* loaded from: classes.dex */
public final class C2497d implements InterfaceC10174b<ListServerBean> {

    /* renamed from: b */
    public final /* synthetic */ C2506m f5958b;

    public C2497d(C2506m c2506m) {
        this.f5958b = c2506m;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(ListServerBean listServerBean) throws Throwable {
        ListServerBean listServerBean2 = listServerBean;
        C2506m c2506m = this.f5958b;
        if (listServerBean2 != null && listServerBean2.getResults().size() != 0) {
            c2506m.f5972c.mo10510i(listServerBean2.getResults());
        } else {
            c2506m.f5972c.mo10510i(null);
        }
    }
}
