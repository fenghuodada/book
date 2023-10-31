package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.p1 */
/* loaded from: classes.dex */
public final class RunnableC2238p1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5454a;

    /* renamed from: b */
    public final /* synthetic */ String f5455b;

    /* renamed from: c */
    public final /* synthetic */ long f5456c;

    /* renamed from: d */
    public final /* synthetic */ C2145j1 f5457d;

    public RunnableC2238p1(C2145j1 c2145j1, String str, String str2, long j) {
        this.f5457d = c2145j1;
        this.f5454a = str;
        this.f5455b = str2;
        this.f5456c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2317u abstractC2317u;
        C2145j1 c2145j1 = this.f5457d;
        ConcurrentHashMap<String, Runnable> concurrentHashMap = c2145j1.f5264a;
        String str = this.f5454a;
        concurrentHashMap.remove(str);
        C2249q remove = c2145j1.f5266c.remove(str);
        if (remove == null) {
            abstractC2317u = null;
        } else {
            abstractC2317u = remove.f5476a;
        }
        if (abstractC2317u != null) {
            String str2 = this.f5455b;
            abstractC2317u.onRequestNotFilled(C2074d.m9676a(str2));
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, str);
            C2080d1.m9660h(c2367y1, "zone_id", str2);
            C2080d1.m9657k(0, c2367y1, "type");
            C2080d1.m9657k(26, c2367y1, "request_fail_reason");
            new C2100e2(1, c2367y1, "AdSession.on_request_failure").m9640b();
            StringBuilder sb = new StringBuilder("RequestNotFilled called due to a native timeout. ");
            sb.append("Timeout set to: " + C2201m0.m9588d().f4978T + " ms. ");
            sb.append("Interstitial request time allowed: " + this.f5456c + " ms. ");
            sb.append("Interstitial with adSessionId(" + str + ") - request failed.");
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }
}
