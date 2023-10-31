package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class zzlo extends BroadcastReceiver {
    final /* synthetic */ zzlp zza;

    public /* synthetic */ zzlo(zzlp zzlpVar, zzln zzlnVar) {
        this.zza = zzlpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzlp zzlpVar = this.zza;
        zzlp.zzc(zzlpVar).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // java.lang.Runnable
            public final void run() {
                zzlp.zzd(zzlp.this);
            }
        });
    }
}
