package com.ambrose.overwall.p005mv.main;

import android.content.SharedPreferences;
import com.android.tool.ApplicationC2534a;
import com.android.tool.bean.TitleBean;
import com.android.tool.util.manager.C2559b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;

/* renamed from: com.ambrose.overwall.mv.main.j */
/* loaded from: classes.dex */
public final class C2503j implements InterfaceC10174b<TitleBean> {

    /* renamed from: b */
    public final /* synthetic */ C2506m f5968b;

    public C2503j(C2506m c2506m) {
        this.f5968b = c2506m;
    }

    @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
    public final void accept(TitleBean titleBean) throws Throwable {
        TitleBean titleBean2 = titleBean;
        if (titleBean2 != null && titleBean2.getResults().size() != 0) {
            C2559b m9372a = C2559b.m9372a(ApplicationC2534a.f6025a);
            long currentTimeMillis = System.currentTimeMillis();
            m9372a.getClass();
            SharedPreferences.Editor edit = C2559b.f6057a.edit();
            edit.putLong("AnnouncementTime", currentTimeMillis);
            edit.apply();
            this.f5968b.f5973d.mo10510i(titleBean2.getResults().get(0));
        }
    }
}
