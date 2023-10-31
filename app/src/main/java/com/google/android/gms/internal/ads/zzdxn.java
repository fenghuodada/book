package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdxn extends zzdxt {
    private zzbto zzh;

    public zzdxn(Context context, ScheduledExecutorService scheduledExecutorService) {
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
            this.zzd.zzp().zze(this.zzh, new zzdxs(this));
        } catch (RemoteException unused) {
            this.zza.zze(new zzdwc(1));
        }
    }

    public final synchronized zzfwb zza(zzbto zzbtoVar, long j) {
        if (this.zzb) {
            return zzfvr.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbtoVar;
        zzb();
        zzfwb zzn = zzfvr.zzn(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // java.lang.Runnable
            public final void run() {
                zzdxn.this.zzc();
            }
        }, zzcag.zzf);
        return zzn;
    }
}
