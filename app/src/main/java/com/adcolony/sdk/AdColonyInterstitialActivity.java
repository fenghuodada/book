package com.adcolony.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class AdColonyInterstitialActivity extends ActivityC2209n0 {

    /* renamed from: j */
    public C2249q f4910j;

    /* renamed from: k */
    public C2182k2 f4911k;

    public AdColonyInterstitialActivity() {
        C2249q c2249q;
        if (!C2201m0.m9586f()) {
            c2249q = null;
        } else {
            c2249q = C2201m0.m9588d().f4997o;
        }
        this.f4910j = c2249q;
    }

    @Override // com.adcolony.sdk.ActivityC2209n0
    /* renamed from: b */
    public final void mo9582b(C2100e2 c2100e2) {
        String str;
        super.mo9582b(c2100e2);
        C2145j1 m9692k = C2201m0.m9588d().m9692k();
        C2367y1 m9439t = c2100e2.f5098b.m9439t("v4iap");
        C2328v1 m9666b = C2080d1.m9666b(m9439t, "product_ids");
        C2249q c2249q = this.f4910j;
        if (c2249q != null && c2249q.f5476a != null) {
            synchronized (m9666b.f5642a) {
                if (!m9666b.f5642a.isNull(0)) {
                    Object opt = m9666b.f5642a.opt(0);
                    if (opt instanceof String) {
                        str = (String) opt;
                    } else if (opt != null) {
                        str = String.valueOf(opt);
                    }
                }
                str = null;
            }
            if (str != null) {
                C2249q c2249q2 = this.f4910j;
                c2249q2.f5476a.onIAPEvent(c2249q2, str, m9439t.m9441r("engagement_type"));
            }
        }
        m9692k.m9607c(this.f5376a);
        C2249q c2249q3 = this.f4910j;
        if (c2249q3 != null) {
            m9692k.f5266c.remove(c2249q3.f5482g);
            C2249q c2249q4 = this.f4910j;
            AbstractC2317u abstractC2317u = c2249q4.f5476a;
            if (abstractC2317u != null) {
                abstractC2317u.onClosed(c2249q4);
                C2249q c2249q5 = this.f4910j;
                c2249q5.f5478c = null;
                c2249q5.f5476a = null;
            }
            this.f4910j.m9521a();
            this.f4910j = null;
        }
        C2182k2 c2182k2 = this.f4911k;
        if (c2182k2 != null) {
            Context context = C2201m0.f5363a;
            if (context != null) {
                context.getApplicationContext().getContentResolver().unregisterContentObserver(c2182k2);
            }
            c2182k2.f5333b = null;
            c2182k2.f5332a = null;
            this.f4911k = null;
        }
    }

    @Override // com.adcolony.sdk.ActivityC2209n0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C2249q c2249q;
        C2249q c2249q2 = this.f4910j;
        if (c2249q2 == null) {
            i = -1;
        } else {
            i = c2249q2.f5481f;
        }
        this.f5377b = i;
        super.onCreate(bundle);
        if (C2201m0.m9586f() && (c2249q = this.f4910j) != null) {
            C2120g4 c2120g4 = c2249q.f5480e;
            if (c2120g4 != null) {
                c2120g4.m9625b(this.f5376a);
            }
            this.f4911k = new C2182k2(new Handler(Looper.getMainLooper()), this.f4910j);
            C2249q c2249q3 = this.f4910j;
            AbstractC2317u abstractC2317u = c2249q3.f5476a;
            if (abstractC2317u != null) {
                abstractC2317u.onOpened(c2249q3);
            }
        }
    }
}
