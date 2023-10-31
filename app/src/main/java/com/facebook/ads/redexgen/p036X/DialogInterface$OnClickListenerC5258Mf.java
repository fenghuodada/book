package com.facebook.ads.redexgen.p036X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Mf */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC5258Mf implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C5691Th A01;

    public DialogInterface$OnClickListenerC5258Mf(C5691Th c5691Th, EditText editText) {
        this.A01 = c5691Th;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C5692Ti(this, dialogInterface));
    }
}
