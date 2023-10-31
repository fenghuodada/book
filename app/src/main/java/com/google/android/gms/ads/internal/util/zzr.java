package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class zzr extends BroadcastReceiver {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzs zzsVar;
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzsVar = this.zza;
            z = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            zzsVar = this.zza;
            z = false;
        }
        zzs.zze(zzsVar, z);
    }
}
