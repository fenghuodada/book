package com.adcolony.sdk;

import android.content.Context;
import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.l1 */
/* loaded from: classes.dex */
public final class RunnableC2189l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5345a;

    /* renamed from: b */
    public final /* synthetic */ C2100e2 f5346b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2187l f5347c;

    /* renamed from: d */
    public final /* synthetic */ String f5348d;

    /* renamed from: e */
    public final /* synthetic */ C2145j1 f5349e;

    public RunnableC2189l1(C2145j1 c2145j1, Context context, C2100e2 c2100e2, AbstractC2187l abstractC2187l, String str) {
        this.f5349e = c2145j1;
        this.f5345a = context;
        this.f5346b = c2100e2;
        this.f5347c = abstractC2187l;
        this.f5348d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2178k c2178k;
        try {
            c2178k = new C2178k(this.f5345a, this.f5346b, this.f5347c);
        } catch (RuntimeException e) {
            C1169e.m11129c(e.toString(), 0, 0, true);
            c2178k = null;
        }
        synchronized (this.f5349e.f5270g) {
            if (this.f5349e.f5268e.remove(this.f5348d) == null) {
                return;
            }
            if (c2178k == null) {
                C2145j1 c2145j1 = this.f5349e;
                AbstractC2187l abstractC2187l = this.f5347c;
                c2145j1.getClass();
                C2232o6.m9548o(new RunnableC2211n1(abstractC2187l));
                return;
            }
            this.f5349e.f5269f.put(this.f5348d, c2178k);
            c2178k.setOmidManager(this.f5347c.m9597b());
            C2218o0 webView = c2178k.getWebView();
            if (c2178k.f5317i != null && webView != null) {
                C2145j1 m9692k = C2201m0.m9588d().m9692k();
                String str = webView.f5405h;
                C2135i1 c2135i1 = webView.f5409l;
                m9692k.getClass();
                C2232o6.m9548o(new RunnableC2274r1(m9692k, str, webView, c2135i1));
            }
            this.f5347c.m9600a((C2120g4) null);
            this.f5347c.onRequestFilled(c2178k);
        }
    }
}
