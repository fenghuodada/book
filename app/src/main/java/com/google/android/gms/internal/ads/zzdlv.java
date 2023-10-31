package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdlv {
    private final zzcvg zza;
    private final zzcwp zzb;
    private final zzcxc zzc;
    private final zzcxo zzd;
    private final zzdac zze;
    private final zzezf zzf;
    private final zzezi zzg;

    public zzdlv(zzcvg zzcvgVar, zzcwp zzcwpVar, zzcxc zzcxcVar, zzcxo zzcxoVar, zzdac zzdacVar, zzezf zzezfVar, zzezi zzeziVar) {
        this.zza = zzcvgVar;
        this.zzb = zzcwpVar;
        this.zzc = zzcxcVar;
        this.zzd = zzcxoVar;
        this.zze = zzdacVar;
        this.zzf = zzezfVar;
        this.zzg = zzeziVar;
    }

    public final void zza(zzdlz zzdlzVar) {
        zzdlm zzdlmVar;
        zzdlmVar = zzdlzVar.zza;
        zzcvg zzcvgVar = this.zza;
        zzcxc zzcxcVar = this.zzc;
        zzcxo zzcxoVar = this.zzd;
        zzdac zzdacVar = this.zze;
        final zzcwp zzcwpVar = this.zzb;
        zzcwpVar.getClass();
        zzdlmVar.zzh(zzcvgVar, zzcxcVar, zzcxoVar, zzdacVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcwp.this.zzb();
            }
        });
        zzdlzVar.zze(this.zzf, this.zzg);
    }
}
