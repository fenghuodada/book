package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.b3 */
/* loaded from: assets/audience_network.dex */
public class C6144b3 implements InterfaceC43306v {
    public final /* synthetic */ C6134at A00;

    public C6144b3(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                C6134at c6134at = this.A00;
                activityManager2 = c6134at.A02;
                return c6134at.A04(activityManager2.getLockTaskModeState());
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
