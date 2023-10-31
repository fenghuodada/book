package com.facebook.ads.redexgen.p036X;

import android.content.pm.ConfigurationInfo;

/* renamed from: com.facebook.ads.redexgen.X.ax */
/* loaded from: assets/audience_network.dex */
public class C6138ax implements InterfaceC43306v {
    public final /* synthetic */ C6134at A00;

    public C6138ax(C6134at c6134at) {
        this.A00 = c6134at;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ConfigurationInfo configurationInfo;
        ConfigurationInfo configurationInfo2;
        configurationInfo = this.A00.A00;
        if (configurationInfo != null) {
            C6134at c6134at = this.A00;
            configurationInfo2 = c6134at.A00;
            return c6134at.A04(configurationInfo2.reqTouchScreen);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
