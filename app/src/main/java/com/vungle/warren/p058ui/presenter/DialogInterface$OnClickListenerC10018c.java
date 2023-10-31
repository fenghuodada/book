package com.vungle.warren.p058ui.presenter;

import android.content.DialogInterface;
import android.text.TextUtils;

/* renamed from: com.vungle.warren.ui.presenter.c */
/* loaded from: classes3.dex */
public final class DialogInterface$OnClickListenerC10018c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10012a f20151a;

    public DialogInterface$OnClickListenerC10018c(C10012a c10012a) {
        this.f20151a = c10012a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            C10012a c10012a = this.f20151a;
            c10012a.m1343t("video_close", null);
            if (!TextUtils.isEmpty(c10012a.f20123g.f19752q)) {
                c10012a.m1344s();
            } else {
                c10012a.m1348o();
            }
        }
    }
}
