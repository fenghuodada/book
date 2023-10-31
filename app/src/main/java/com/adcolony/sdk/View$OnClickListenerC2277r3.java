package com.adcolony.sdk;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.adcolony.sdk.r3 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2277r3 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2257q3 f5540a;

    public View$OnClickListenerC2277r3(C2257q3 c2257q3) {
        this.f5540a = c2257q3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2257q3 c2257q3 = this.f5540a;
        C2232o6.m9554i(new Intent("android.intent.action.VIEW", Uri.parse(c2257q3.f5503H)), false);
        C2332v5 m9702a = C2201m0.m9588d().m9702a();
        String adSessionId = c2257q3.getAdSessionId();
        m9702a.getClass();
        C2332v5.m9476d(adSessionId);
    }
}
