package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.t3 */
/* loaded from: classes.dex */
public final class C2296t3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2354w3 f5589a;

    public C2296t3(C2354w3 c2354w3) {
        this.f5589a = c2354w3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2354w3 c2354w3 = this.f5589a;
        if (c2354w3.f5667a == null) {
            c2354w3.f5667a = Executors.newSingleThreadScheduledExecutor();
        }
        if (c2354w3.f5668b == null) {
            try {
                c2354w3.f5668b = c2354w3.f5667a.scheduleAtFixedRate(new RunnableC2330v3(c2354w3), 0L, 1000L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C1169e.m11129c("Error when scheduling network checks: " + e.toString(), 0, 0, true);
            }
            c2354w3.m9464a();
        }
    }
}
