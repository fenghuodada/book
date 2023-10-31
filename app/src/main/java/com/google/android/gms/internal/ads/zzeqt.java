package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeqt {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzffq zzd;
    private final zzdqc zze;

    public zzeqt(Context context, Executor executor, Set set, zzffq zzffqVar, zzdqc zzdqcVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzffqVar;
        this.zze = zzdqcVar;
    }

    public final zzfwb zza(final Object obj) {
        zzfff zza = zzffe.zza(this.zza, 8);
        zza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzeqq zzeqqVar : this.zzb) {
            zzfwb zzb = zzeqqVar.zzb();
            final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqr
                @Override // java.lang.Runnable
                public final void run() {
                    zzeqt.this.zzb(elapsedRealtime, zzeqqVar);
                }
            }, zzcag.zzf);
            arrayList.add(zzb);
        }
        zzfwb zza2 = zzfvr.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfwb> list = arrayList;
                Object obj2 = obj;
                for (zzfwb zzfwbVar : list) {
                    zzeqp zzeqpVar = (zzeqp) zzfwbVar.get();
                    if (zzeqpVar != null) {
                        zzeqpVar.zzh(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfft.zza()) {
            zzffp.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j, zzeqq zzeqqVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbdh.zza.zze()).booleanValue()) {
            String zzc = zzfpo.zzc(zzeqqVar.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzc + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbT)).booleanValue()) {
            zzdqb zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzeqqVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbU)).booleanValue()) {
                zza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzg().zzc());
            }
            zza.zzh();
        }
    }
}
