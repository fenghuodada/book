package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdme {
    private final zzcvg zza;
    private final zzcwp zzb;
    private final zzcxc zzc;
    private final zzcxo zzd;
    private final zzdac zze;
    private final zzdcu zzf;

    public zzdme(zzcvg zzcvgVar, zzcwp zzcwpVar, zzcxc zzcxcVar, zzcxo zzcxoVar, zzdac zzdacVar, zzdcu zzdcuVar) {
        this.zza = zzcvgVar;
        this.zzb = zzcwpVar;
        this.zzc = zzcxcVar;
        this.zzd = zzcxoVar;
        this.zze = zzdacVar;
        this.zzf = zzdcuVar;
    }

    public final void zza(zzdmf zzdmfVar) {
        zzdmc zzdmcVar;
        zzdmcVar = zzdmfVar.zza;
        zzcvg zzcvgVar = this.zza;
        zzcxc zzcxcVar = this.zzc;
        zzcxo zzcxoVar = this.zzd;
        zzdac zzdacVar = this.zze;
        final zzcwp zzcwpVar = this.zzb;
        zzcwpVar.getClass();
        zzdmcVar.zzi(zzcvgVar, zzcxcVar, zzcxoVar, zzdacVar, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzcwp.this.zzb();
            }
        }, this.zzf);
    }
}
