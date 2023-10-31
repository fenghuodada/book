package com.adcolony.sdk;

import com.adcolony.sdk.C2175j6;

/* renamed from: com.adcolony.sdk.w2 */
/* loaded from: classes.dex */
public final class C2353w2 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5666a;

    public C2353w2(C2058b3 c2058b3) {
        this.f5666a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2175j6 c2175j6 = this.f5666a.f4995m;
        if (C2201m0.m9586f()) {
            if (!c2175j6.f5303a) {
                c2175j6.f5306d = new C2175j6.C2177b(c2100e2.f5098b);
                Runnable runnable = c2175j6.f5305c;
                if (runnable != null) {
                    C2232o6.m9545r(runnable);
                    C2232o6.m9548o(c2175j6.f5305c);
                    return;
                }
                C2175j6.RunnableC2176a runnableC2176a = c2175j6.f5304b;
                C2232o6.m9545r(runnableC2176a);
                C2232o6.m9556g(runnableC2176a, C2201m0.m9588d().f4979U);
                return;
            }
            return;
        }
        c2175j6.getClass();
    }
}
