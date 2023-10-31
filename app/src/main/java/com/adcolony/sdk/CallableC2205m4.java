package com.adcolony.sdk;

import java.util.concurrent.Callable;

/* renamed from: com.adcolony.sdk.m4 */
/* loaded from: classes.dex */
public final class CallableC2205m4 implements Callable<C2367y1> {

    /* renamed from: a */
    public final /* synthetic */ long f5372a;

    /* renamed from: b */
    public final /* synthetic */ C2247p4 f5373b;

    public CallableC2205m4(C2247p4 c2247p4, long j) {
        this.f5373b = c2247p4;
        this.f5372a = j;
    }

    @Override // java.util.concurrent.Callable
    public final C2367y1 call() throws Exception {
        C2247p4 c2247p4 = this.f5373b;
        C2376z1 c2376z1 = c2247p4.f5466b;
        if (!c2376z1.f5701a) {
            long j = this.f5372a;
            if (j > 0) {
                c2376z1.m9428a(j);
            }
        }
        return c2247p4.m9528c();
    }
}
