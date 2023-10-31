package com.adcolony.sdk;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.adcolony.sdk.q2 */
/* loaded from: classes.dex */
public final class C2256q2 implements InterfaceC2203m2 {
    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        int m9441r = c2100e2.f5098b.m9441r("number");
        C2367y1 c2367y1 = new C2367y1();
        ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
        C2328v1 c2328v1 = new C2328v1();
        for (int i = 0; i < m9441r; i++) {
            c2328v1.m9483d(C2232o6.m9559d());
        }
        C2080d1.m9662f(c2367y1, "uuids", c2328v1);
        c2100e2.m9641a(c2367y1).m9640b();
    }
}
