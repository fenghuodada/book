package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nh */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5321Nh implements View.OnClickListener {
    public static String[] A02 = {"0jbDV4SqpRnuIwDLdLhaSwFsy", "4CrQo2YdoWcqlYT3QJHt1izZuISw0o1a", "L1hOW0A7sRjLAVrGrG7yuKVrDUUFxwrZ", "r8z", "jBR", "EADx", "Dw2r3KoKizw7HI548vOXrftmgV6TcaYT", "JzZVJSkZeh7kJVI6l2oDTz"};
    public final /* synthetic */ C5305NR A00;
    public final /* synthetic */ C5665TG A01;

    public View$OnClickListenerC5321Nh(C5665TG c5665tg, C5305NR c5305nr) {
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
            this.A01.A0B.ABW(EnumC40442F.A03);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A02[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "wzs";
            strArr[0] = "95EfxSbyIArn9raLN6CoppC7A";
        }
    }
}
