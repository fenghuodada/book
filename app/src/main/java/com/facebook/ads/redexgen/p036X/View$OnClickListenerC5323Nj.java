package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nj */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5323Nj implements View.OnClickListener {
    public static String[] A02 = {"9sVCZE1JzKyNlgcXamStOEuF7vpp11q7", "2ezkH3kSqCf8dvr0XQnySHd1TgVVvlpb", "j6uQAgvGWfRMr40VSzlVsWkcoISldlVB", "dNEMzbO6BFzdIEcJ0MNYA8UShcXW2fNX", "CiFQ7cnsU8a2IY039", "of093nELJxDtvmpwlx40Sj96vTqfYWfZ", "89mnR6KKQKsitukE0pK0FSEAWYYgI9MC", "iqJuIXwOIBXLoaWKOF5L6veUHjclhPcL"};
    public final /* synthetic */ C5305NR A00;
    public final /* synthetic */ C5665TG A01;

    public View$OnClickListenerC5323Nj(C5665TG c5665tg, C5305NR c5305nr) {
        this.A01 = c5665tg;
        this.A00 = c5305nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A8l();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(23) == strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            A02[3] = "erh4HILEwUj6GeiKdMF57q4cd8pDAg7o";
        }
    }
}
