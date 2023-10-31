package com.vungle.warren.p058ui.presenter;

import android.content.DialogInterface;
import com.vungle.warren.model.C9867g;

/* renamed from: com.vungle.warren.ui.presenter.b */
/* loaded from: classes3.dex */
public final class DialogInterface$OnClickListenerC10017b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9867g f20149a;

    /* renamed from: b */
    public final /* synthetic */ C10012a f20150b;

    public DialogInterface$OnClickListenerC10017b(C10012a c10012a, C9867g c9867g) {
        this.f20150b = c10012a;
        this.f20149a = c9867g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        if (i == -2) {
            str = "opted_out";
        } else if (i == -1) {
            str = "opted_in";
        } else {
            str = "opted_out_by_timeout";
        }
        C9867g c9867g = this.f20149a;
        c9867g.m1445d(str, "consent_status");
        c9867g.m1445d(Long.valueOf(System.currentTimeMillis() / 1000), "timestamp");
        c9867g.m1445d("vungle_modal", "consent_source");
        C10012a c10012a = this.f20150b;
        c10012a.f20125i.m1375x(c9867g, null, true);
        c10012a.start();
    }
}
