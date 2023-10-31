package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.K2 */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC5101K2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC5723UD A00;

    public DialogInterface$OnClickListenerC5101K2(View$OnClickListenerC5723UD view$OnClickListenerC5723UD) {
        this.A00 = view$OnClickListenerC5723UD;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            C6298da c6298da = this.A00.A01.A0a;
            A01 = this.A00.A01();
            c6298da.A0P(A01);
        }
    }
}
