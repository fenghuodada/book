package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdzf implements zzcyd, zzcww, zzcvl {
    private final zzfem zza;
    private final zzfen zzb;
    private final zzbzg zzc;

    public zzdzf(zzfem zzfemVar, zzfen zzfenVar, zzbzg zzbzgVar) {
        this.zza = zzfemVar;
        this.zzb = zzfenVar;
        this.zzc = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfem zzfemVar = this.zza;
        zzfemVar.zza("action", "ftl");
        zzfemVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfemVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        this.zza.zzh(zzezrVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
        this.zza.zzi(zzbugVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        zzfen zzfenVar = this.zzb;
        zzfem zzfemVar = this.zza;
        zzfemVar.zza("action", "loaded");
        zzfenVar.zzb(zzfemVar);
    }
}
