package com.facebook.ads.redexgen.p036X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Lq */
/* loaded from: assets/audience_network.dex */
public final class C5207Lq {
    public static void A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, @Nullable Context context) {
        if (context == null || !(context instanceof Activity)) {
            onClickListener.onClick(null, 0);
        } else {
            new AlertDialog.Builder(context).setTitle(C5064JR.A0V(context)).setMessage(C5064JR.A0T(context)).setPositiveButton(C5064JR.A0U(context), new DialogInterface$OnClickListenerC5206Lp(onClickListener)).setNegativeButton(C5064JR.A0S(context), new DialogInterface$OnClickListenerC5205Lo(onClickListener2)).show();
        }
    }
}
