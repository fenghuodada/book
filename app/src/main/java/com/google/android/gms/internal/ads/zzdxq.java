package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdxq extends zzdxt {
    private zzbtk zzh;

    public zzdxq(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(@Nullable Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            this.zzd.zzp().zzf(this.zzh, new zzdxs(this));
        } catch (RemoteException unused) {
            this.zza.zze(new zzdwc(1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxt, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzbzt.zze(format);
        this.zza.zze(new zzdwc(1, format));
    }

    public final synchronized zzfwb zza(zzbtk zzbtkVar, long j) {
        if (this.zzb) {
            return zzfvr.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtkVar;
        zzb();
        zzfwb zzn = zzfvr.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // java.lang.Runnable
            public final void run() {
                zzdxq.this.zzc();
            }
        }, zzcag.zzf);
        return zzn;
    }
}
