package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NY */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5312NY implements View.OnClickListener {
    public static String[] A02 = {"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    public final /* synthetic */ C5305NR A00;
    public final /* synthetic */ C5666TH A01;

    public View$OnClickListenerC5312NY(C5666TH c5666th, C5305NR c5305nr) {
        this.A01 = c5666th;
        this.A00 = c5305nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABW(EnumC40442F.A05);
        } catch (Throwable th) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            A02[2] = "snOHg";
            C5158L0.A00(th, this);
        }
    }
}
