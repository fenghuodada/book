package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzews {
    private final zzfbm zza;
    private final zzcup zzb;
    private final Executor zzc;
    private zzewr zzd;

    public zzews(zzfbm zzfbmVar, zzcup zzcupVar, Executor executor) {
        this.zza = zzfbmVar;
        this.zzb = zzcupVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfbw zze() {
        zzfaa zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfwb zzc() {
        zzfwb zze;
        zzewr zzewrVar = this.zzd;
        if (zzewrVar == null) {
            if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
                zze = zzfvr.zze(zzfvr.zzl(zzfvi.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzewp(this), this.zzc), zzdwc.class, new zzewo(this), this.zzc);
            } else {
                zzewr zzewrVar2 = new zzewr(null, zze(), null);
                this.zzd = zzewrVar2;
                zze = zzfvr.zzh(zzewrVar2);
            }
            return zzfvr.zzl(zze, new zzfon() { // from class: com.google.android.gms.internal.ads.zzewn
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    return (zzewr) obj;
                }
            }, this.zzc);
        }
        return zzfvr.zzh(zzewrVar);
    }
}
