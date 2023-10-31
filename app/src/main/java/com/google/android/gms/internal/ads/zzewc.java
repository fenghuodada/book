package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzewc implements zzeww {
    private final zzeww zza;
    private final zzeww zzb;
    private final zzfci zzc;
    private final String zzd;
    private zzcup zze;
    private final Executor zzf;

    public zzewc(zzeww zzewwVar, zzeww zzewwVar2, zzfci zzfciVar, String str, Executor executor) {
        this.zza = zzewwVar;
        this.zzb = zzewwVar2;
        this.zzc = zzfciVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfwb zzg(zzfbv zzfbvVar, zzewx zzewxVar) {
        zzcup zzcupVar = zzfbvVar.zza;
        this.zze = zzcupVar;
        if (zzfbvVar.zzc != null) {
            if (zzcupVar.zzf() != null) {
                zzfbvVar.zzc.zzo().zzbG(zzfbvVar.zza.zzf());
            }
            return zzfvr.zzh(zzfbvVar.zzc);
        }
        zzcupVar.zzb().zzl(zzfbvVar.zzb);
        return ((zzewm) this.zza).zzb(zzewxVar, null, zzfbvVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    /* renamed from: zza */
    public final synchronized zzcup zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzfwb zzb(zzewx zzewxVar, zzewb zzewbVar, zzewv zzewvVar, zzcup zzcupVar, zzewh zzewhVar) throws Exception {
        if (zzewhVar != null) {
            zzewb zzewbVar2 = new zzewb(zzewbVar.zza, zzewbVar.zzb, zzewbVar.zzc, zzewbVar.zzd, zzewbVar.zze, zzewbVar.zzf, zzewhVar.zza);
            if (zzewhVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzewbVar2);
                return zzg(zzewhVar.zzc, zzewxVar);
            }
            zzfwb zza = this.zzc.zza(zzewbVar2);
            if (zza != null) {
                this.zze = null;
                return zzfvr.zzm(zza, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzevy
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        return zzewc.this.zze((zzfcf) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzewbVar2);
            zzewxVar = new zzewx(zzewxVar.zzb, zzewhVar.zzb);
        }
        zzfwb zzb = ((zzewm) this.zza).zzb(zzewxVar, zzewvVar, zzcupVar);
        this.zze = zzcupVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ zzfwb zzc(zzewx zzewxVar, zzewv zzewvVar, Object obj) {
        return zzf(zzewxVar, zzewvVar, null);
    }

    public final /* synthetic */ zzfwb zze(zzfcf zzfcfVar) throws Exception {
        zzfch zzfchVar;
        if (zzfcfVar == null || zzfcfVar.zza == null || (zzfchVar = zzfcfVar.zzb) == null) {
            throw new zzdtz(1, "Empty prefetch");
        }
        zzaxm zza = zzaxs.zza();
        zzaxk zza2 = zzaxl.zza();
        zza2.zzd(2);
        zza2.zzb(zzaxp.zzd());
        zza.zza(zza2);
        zzfcfVar.zza.zza.zzb().zzc().zzi((zzaxs) zza.zzal());
        return zzg(zzfcfVar.zza, ((zzewb) zzfchVar).zzb);
    }

    public final synchronized zzfwb zzf(final zzewx zzewxVar, final zzewv zzewvVar, zzcup zzcupVar) {
        zzcuo zza = zzewvVar.zza(zzewxVar.zzb);
        zza.zza(new zzewd(this.zzd));
        final zzcup zzcupVar2 = (zzcup) zza.zzh();
        zzcupVar2.zzg();
        zzcupVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcupVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfaa zzg = zzcupVar2.zzg();
            final zzewb zzewbVar = new zzewb(zzewvVar, zzewxVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfvr.zzm(zzfvi.zzv(((zzewi) this.zzb).zzb(zzewxVar, zzewvVar, zzcupVar2)), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzevz
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzewc.this.zzb(zzewxVar, zzewbVar, zzewvVar, zzcupVar2, (zzewh) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcupVar2;
        return ((zzewm) this.zza).zzb(zzewxVar, zzewvVar, zzcupVar2);
    }
}
