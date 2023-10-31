package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzepx implements zzeqq {
    private final String zza;
    private final zzfwc zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfaa zze;
    private final zzcgw zzf;

    public zzepx(zzfwc zzfwcVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfaa zzfaaVar, zzcgw zzcgwVar) {
        this.zzb = zzfwcVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfaaVar;
        this.zzf = zzcgwVar;
    }

    public static /* synthetic */ zzfwb zzc(zzepx zzepxVar) {
        String str = zzepxVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgR)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn = zzepxVar.zzf.zzn();
        zzcuq zzcuqVar = new zzcuq();
        zzcuqVar.zze(zzepxVar.zzd);
        zzezy zzezyVar = new zzezy();
        zzezyVar.zzs("adUnitId");
        zzezyVar.zzE(zzepxVar.zze.zzd);
        zzezyVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzcuqVar.zzi(zzezyVar.zzG());
        zzn.zza(zzcuqVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(str);
        zzn.zzb(zzacVar.zzb());
        new zzdat();
        return zzfvr.zze(zzfvr.zzl((zzfvi) zzfvr.zzn(zzfvi.zzv(zzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgS)).longValue(), TimeUnit.MILLISECONDS, zzepxVar.zzc), new zzfon() { // from class: com.google.android.gms.internal.ads.zzepv
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzepy(zzamVar.zza) : new zzepy(null);
            }
        }, zzepxVar.zzb), Exception.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzepw
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzbzt.zzh("", (Exception) obj);
                return new zzepy(null);
            }
        }, zzepxVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgQ)).booleanValue() || "adUnitId".equals(this.zze.zzf)) ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzepy(null);
            }
        }) : zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzepu
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzepx.zzc(zzepx.this);
            }
        }, this.zzb);
    }
}
