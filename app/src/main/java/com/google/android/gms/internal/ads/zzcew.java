package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
final class zzcew implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsPromptResult zza;

    public zzcew(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
