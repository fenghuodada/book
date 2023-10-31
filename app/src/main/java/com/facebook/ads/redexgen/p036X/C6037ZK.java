package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.ZK */
/* loaded from: assets/audience_network.dex */
public class C6037ZK implements InterfaceC43306v {
    public final /* synthetic */ C6035ZI A00;

    public C6037ZK(C6035ZI c6035zi) {
        this.A00 = c6035zi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(EnumC434176.A05);
        }
        return this.A00.A08(Locale.getDefault().getScript());
    }
}
