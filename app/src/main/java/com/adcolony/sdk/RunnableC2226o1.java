package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.o1 */
/* loaded from: classes.dex */
public final class RunnableC2226o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5424a;

    /* renamed from: b */
    public final /* synthetic */ String f5425b;

    /* renamed from: c */
    public final /* synthetic */ long f5426c;

    /* renamed from: d */
    public final /* synthetic */ C2145j1 f5427d;

    public RunnableC2226o1(C2145j1 c2145j1, String str, String str2, long j) {
        this.f5427d = c2145j1;
        this.f5424a = str;
        this.f5425b = str2;
        this.f5426c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2145j1 c2145j1 = this.f5427d;
        ConcurrentHashMap<String, Runnable> concurrentHashMap = c2145j1.f5264a;
        String str = this.f5424a;
        concurrentHashMap.remove(str);
        AbstractC2187l remove = c2145j1.f5267d.remove(str);
        if (remove != null) {
            String str2 = this.f5425b;
            remove.onRequestNotFilled(C2074d.m9676a(str2));
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, str);
            C2080d1.m9660h(c2367y1, "zone_id", str2);
            C2080d1.m9657k(1, c2367y1, "type");
            C2080d1.m9657k(26, c2367y1, "request_fail_reason");
            new C2100e2(1, c2367y1, "AdSession.on_request_failure").m9640b();
            StringBuilder sb = new StringBuilder("RequestNotFilled called due to a native timeout. ");
            sb.append("Timeout set to: " + C2201m0.m9588d().f4978T + " ms. ");
            sb.append("AdView request time allowed: " + this.f5426c + " ms. ");
            sb.append("AdView with adSessionId(" + str + ") - request failed.");
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }
}
