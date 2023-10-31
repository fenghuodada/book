package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.ak */
/* loaded from: assets/audience_network.dex */
public class C6125ak implements InterfaceC43306v {
    public final /* synthetic */ C6113aY A00;

    public C6125ak(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        Context context;
        context = this.A00.A00;
        return this.A00.A06(new File(context.getApplicationInfo().publicSourceDir).length());
    }
}
