package com.adcolony.sdk;

import java.util.concurrent.Callable;

/* renamed from: com.adcolony.sdk.k4 */
/* loaded from: classes.dex */
public final class CallableC2184k4 implements Callable<C2367y1> {

    /* renamed from: a */
    public final /* synthetic */ long f5335a;

    /* renamed from: b */
    public final /* synthetic */ C2247p4 f5336b;

    public CallableC2184k4(C2247p4 c2247p4, long j) {
        this.f5336b = c2247p4;
        this.f5335a = j;
    }

    @Override // java.util.concurrent.Callable
    public final C2367y1 call() throws Exception {
        C2247p4 c2247p4 = this.f5336b;
        C2376z1 c2376z1 = c2247p4.f5465a;
        if (!c2376z1.f5701a) {
            long j = this.f5335a;
            if (j > 0) {
                c2376z1.m9428a(j);
            }
        }
        return c2247p4.m9529b();
    }
}
