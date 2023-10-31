package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.m1 */
/* loaded from: classes.dex */
public final class RunnableC2202m1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2100e2 f5368a;

    /* renamed from: b */
    public final /* synthetic */ C2249q f5369b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2317u f5370c;

    public RunnableC2202m1(C2100e2 c2100e2, C2249q c2249q, AbstractC2317u abstractC2317u) {
        this.f5368a = c2100e2;
        this.f5369b = c2249q;
        this.f5370c = abstractC2317u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2367y1 c2367y1 = this.f5368a.f5098b;
        C2249q c2249q = this.f5369b;
        if (c2249q.f5480e == null) {
            C2367y1 m9439t = c2367y1.m9439t("iab");
            if (!m9439t.m9449j()) {
                c2249q.f5480e = new C2120g4(m9439t, c2249q.f5482g);
            }
        }
        c2249q.f5483h = c2367y1.m9436w("ad_id");
        c2367y1.m9436w("creative_id");
        c2249q.f5489n = c2367y1.m9436w("view_network_pass_filter");
        C2120g4 c2120g4 = c2249q.f5480e;
        if (c2120g4 != null && c2120g4.f5141e != 2) {
            try {
                c2120g4.m9626a(null);
            } catch (IllegalArgumentException unused) {
                C1169e.m11129c("IllegalArgumentException when creating omid session", 0, 0, true);
            }
        }
        this.f5370c.onRequestFilled(c2249q);
    }
}
