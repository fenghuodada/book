package com.facebook.ads.redexgen.p036X;

import android.app.KeyguardManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.ZO */
/* loaded from: assets/audience_network.dex */
public class C6041ZO implements InterfaceC43306v {
    public final /* synthetic */ C6040ZN A00;

    public C6041ZO(C6040ZN c6040zn) {
        this.A00 = c6040zn;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                return this.A00.A07(EnumC434176.A07);
            }
            C6040ZN c6040zn = this.A00;
            keyguardManager2 = c6040zn.A00;
            return c6040zn.A0F(keyguardManager2.isKeyguardSecure());
        }
        return this.A00.A07(EnumC434176.A05);
    }
}
