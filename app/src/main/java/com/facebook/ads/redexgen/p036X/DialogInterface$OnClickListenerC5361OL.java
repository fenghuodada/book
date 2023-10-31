package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.OL */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC5361OL implements DialogInterface.OnClickListener {
    public final /* synthetic */ C5363ON A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public DialogInterface$OnClickListenerC5361OL(C5363ON c5363on, String str, Map map) {
        this.A00 = c5363on;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC5080Jh interfaceC5080Jh;
        interfaceC5080Jh = this.A00.A04;
        interfaceC5080Jh.A9N(this.A01, this.A02);
    }
}
