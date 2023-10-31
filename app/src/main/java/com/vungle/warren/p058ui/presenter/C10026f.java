package com.vungle.warren.p058ui.presenter;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Report;
import com.vungle.warren.p058ui.contract.InterfaceC10007e;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10079d;
import java.io.File;

/* renamed from: com.vungle.warren.ui.presenter.f */
/* loaded from: classes3.dex */
public final class C10026f implements C10079d.InterfaceC10081b {

    /* renamed from: a */
    public final /* synthetic */ File f20182a;

    /* renamed from: b */
    public final /* synthetic */ C10019d f20183b;

    public C10026f(C10019d c10019d, File file) {
        this.f20183b = c10019d;
        this.f20182a = file;
    }

    @Override // com.vungle.warren.utility.C10079d.InterfaceC10081b
    /* renamed from: a */
    public final void mo1276a(boolean z) {
        Report report;
        C10019d c10019d = this.f20183b;
        if (!z) {
            c10019d.m1329p(new VungleException(27));
            c10019d.m1329p(new VungleException(10));
            c10019d.f20165n.close();
            return;
        }
        InterfaceC10007e interfaceC10007e = c10019d.f20165n;
        interfaceC10007e.mo1300o("file://" + this.f20182a.getPath());
        String id = c10019d.f20159h.getId();
        C9928h c9928h = c10019d.f20163l;
        Advertisement advertisement = (Advertisement) c9928h.m1383p(Advertisement.class, id).get();
        if (advertisement != null && (report = c10019d.f20160i) != null) {
            report.f19787g = !advertisement.f19734V;
            c9928h.m1375x(report, c10019d.f20171t, true);
        }
    }
}
