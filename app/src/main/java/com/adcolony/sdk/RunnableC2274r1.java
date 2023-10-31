package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.r1 */
/* loaded from: classes.dex */
public final class RunnableC2274r1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5533a;

    /* renamed from: b */
    public final /* synthetic */ C2218o0 f5534b;

    /* renamed from: c */
    public final /* synthetic */ C2135i1 f5535c;

    /* renamed from: d */
    public final /* synthetic */ C2145j1 f5536d;

    public RunnableC2274r1(C2145j1 c2145j1, String str, C2218o0 c2218o0, C2135i1 c2135i1) {
        this.f5536d = c2145j1;
        this.f5533a = str;
        this.f5534b = c2218o0;
        this.f5535c = c2135i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2120g4 c2120g4;
        int i;
        String str = this.f5533a;
        C2145j1 c2145j1 = this.f5536d;
        try {
            C2249q c2249q = c2145j1.f5266c.get(str);
            C2178k c2178k = c2145j1.f5269f.get(str);
            if (c2249q == null) {
                c2120g4 = null;
            } else {
                c2120g4 = c2249q.f5480e;
            }
            if (c2120g4 == null && c2178k != null) {
                c2120g4 = c2178k.getOmidManager();
            }
            if (c2120g4 == null) {
                i = -1;
            } else {
                i = c2120g4.f5141e;
            }
            if (c2120g4 != null && i == 2) {
                c2120g4.m9626a(this.f5534b);
                c2120g4.m9625b(this.f5535c);
            }
        } catch (IllegalArgumentException unused) {
            C1169e.m11129c("IllegalArgumentException when creating omid session", 0, 0, true);
        }
    }
}
