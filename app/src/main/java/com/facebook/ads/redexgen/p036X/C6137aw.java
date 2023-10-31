package com.facebook.ads.redexgen.p036X;

import android.app.ActivityManager;

/* renamed from: com.facebook.ads.redexgen.X.aw */
/* loaded from: assets/audience_network.dex */
public class C6137aw implements InterfaceC43306v {
    public final /* synthetic */ C6134at A00;

    public C6137aw(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2;
        runningAppProcessInfo = this.A00.A01;
        if (runningAppProcessInfo != null) {
            C6134at c6134at = this.A00;
            runningAppProcessInfo2 = c6134at.A01;
            return c6134at.A04(runningAppProcessInfo2.importance);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
