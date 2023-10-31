package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C2178k;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.i */
/* loaded from: classes.dex */
public final class RunnableC2133i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2178k f5190a;

    public RunnableC2133i(C2178k c2178k) {
        this.f5190a = c2178k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = C2201m0.f5363a;
        if (context instanceof AdColonyAdViewActivity) {
            ((AdColonyAdViewActivity) context).m9710e();
        }
        C2145j1 m9692k = C2201m0.m9588d().m9692k();
        String str = this.f5190a.f5312d;
        synchronized (m9692k.f5270g) {
            m9692k.f5269f.remove(str);
        }
        m9692k.m9607c(this.f5190a.f5309a);
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5190a.f5312d);
        new C2100e2(1, c2367y1, "AdSession.on_ad_view_destroyed").m9640b();
        C2178k.InterfaceC2179a interfaceC2179a = this.f5190a.f5330v;
        if (interfaceC2179a != null) {
            C2058b3 c2058b3 = ((C2109f3) interfaceC2179a).f5108a;
            int i = c2058b3.f4981W - 1;
            c2058b3.f4981W = i;
            if (i == 0) {
                c2058b3.m9701b();
            }
        }
    }
}
