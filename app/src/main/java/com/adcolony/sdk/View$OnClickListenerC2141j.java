package com.adcolony.sdk;

import android.content.Context;
import android.view.View;

/* renamed from: com.adcolony.sdk.j */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2141j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f5221a;

    public View$OnClickListenerC2141j(Context context) {
        this.f5221a = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.f5221a;
        if (context instanceof AdColonyAdViewActivity) {
            ((AdColonyAdViewActivity) context).m9710e();
        }
    }
}
