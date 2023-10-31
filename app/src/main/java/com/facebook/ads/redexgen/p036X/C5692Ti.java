package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ti */
/* loaded from: assets/audience_network.dex */
public class C5692Ti extends AbstractRunnableC5165L8 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterface$OnClickListenerC5258Mf A01;

    public C5692Ti(DialogInterface$OnClickListenerC5258Mf dialogInterface$OnClickListenerC5258Mf, DialogInterface dialogInterface) {
        this.A01 = dialogInterface$OnClickListenerC5258Mf;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        InterfaceC5527R2 interfaceC5527R2;
        InterfaceC5527R2 interfaceC5527R22;
        C5952Xx c5952Xx;
        Map<? extends String, ? extends String> A04;
        interfaceC5527R2 = this.A01.A01.A02;
        if (interfaceC5527R2 != null) {
            interfaceC5527R22 = this.A01.A01.A02;
            c5952Xx = this.A01.A01.A00;
            String A03 = C5147Ko.A03(c5952Xx);
            C5541RG c5541rg = new C5541RG();
            A04 = this.A01.A01.A04(this.A01.A00.getText().toString());
            interfaceC5527R22.ADB(A03, c5541rg.A05(A04).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
