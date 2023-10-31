package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
final class zzhk extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzhm zza;
    private final zzhl zzb;
    private final Handler zzc;

    public zzhk(zzhm zzhmVar, Handler handler, zzhl zzhlVar) {
        this.zza = zzhmVar;
        this.zzc = handler;
        this.zzb = zzhlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
