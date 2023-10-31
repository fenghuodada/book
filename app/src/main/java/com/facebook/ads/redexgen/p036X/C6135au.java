package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.au */
/* loaded from: assets/audience_network.dex */
public class C6135au implements InterfaceC43306v {
    public final /* synthetic */ C6134at A00;

    public C6135au(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0F(ActivityManager.isRunningInTestHarness());
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
