package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaix implements zzajg {
    private zzam zza;
    private zzfl zzb;
    private zzabr zzc;

    public zzaix(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        this.zza = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(zzfd zzfdVar) {
        zzdy.zzb(this.zzb);
        int i = zzfn.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd == -9223372036854775807L || zze == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (zze != zzamVar.zzq) {
            zzak zzb = zzamVar.zzb();
            zzb.zzW(zze);
            zzam zzY = zzb.zzY();
            this.zza = zzY;
            this.zzc.zzk(zzY);
        }
        int zza = zzfdVar.zza();
        this.zzc.zzq(zzfdVar, zza);
        this.zzc.zzs(zzd, 1, zza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(zzfl zzflVar, zzaar zzaarVar, zzajt zzajtVar) {
        this.zzb = zzflVar;
        zzajtVar.zzc();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
