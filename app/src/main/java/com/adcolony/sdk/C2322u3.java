package com.adcolony.sdk;

import java.util.concurrent.ScheduledFuture;

/* renamed from: com.adcolony.sdk.u3 */
/* loaded from: classes.dex */
public final class C2322u3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2354w3 f5627a;

    public C2322u3(C2354w3 c2354w3) {
        this.f5627a = c2354w3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2354w3 c2354w3 = this.f5627a;
        ScheduledFuture<?> scheduledFuture = c2354w3.f5668b;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                c2354w3.f5668b.cancel(false);
            }
            c2354w3.f5668b = null;
        }
    }
}
