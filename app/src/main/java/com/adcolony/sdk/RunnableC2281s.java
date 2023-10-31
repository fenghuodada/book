package com.adcolony.sdk;

import android.content.Context;

/* renamed from: com.adcolony.sdk.s */
/* loaded from: classes.dex */
public final class RunnableC2281s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2145j1 f5550a;

    /* renamed from: b */
    public final /* synthetic */ String f5551b = "Controller was reloaded and current ad was closed";

    /* renamed from: c */
    public final /* synthetic */ C2249q f5552c;

    public RunnableC2281s(C2249q c2249q, C2145j1 c2145j1) {
        this.f5552c = c2249q;
        this.f5550a = c2145j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = C2201m0.f5363a;
        boolean z = context instanceof ActivityC2209n0;
        C2145j1 c2145j1 = this.f5550a;
        C2249q c2249q = this.f5552c;
        if (z) {
            C2367y1 c2367y1 = new C2367y1();
            c2145j1.getClass();
            C2145j1.m9609a(context, c2367y1, this.f5551b);
        } else {
            AbstractC2317u abstractC2317u = c2249q.f5476a;
            if (abstractC2317u != null) {
                abstractC2317u.onClosed(c2249q);
                c2249q.f5476a = null;
            }
            c2249q.m9521a();
            C2201m0.m9588d().m9692k().f5266c.remove(c2249q.f5482g);
            C2201m0.m9588d().f4959A = false;
        }
        C2135i1 c2135i1 = c2249q.f5478c;
        if (c2135i1 != null) {
            c2145j1.m9607c(c2135i1);
            c2249q.f5478c = null;
        }
    }
}
