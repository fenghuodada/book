package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.b2 */
/* loaded from: assets/audience_network.dex */
public class C6143b2 implements InterfaceC43306v {
    public final /* synthetic */ C6134at A00;

    public C6143b2(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            activityManager = this.A00.A02;
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager2 = this.A00.A02;
                activityManager2.getMemoryInfo(memoryInfo);
                return this.A00.A06(memoryInfo.totalMem / 1048576);
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
