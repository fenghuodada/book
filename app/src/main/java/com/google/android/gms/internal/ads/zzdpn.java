package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdpn implements zzcyd, zzcww, zzcvl {
    private final zzdpx zza;
    private final zzdqh zzb;

    public zzdpn(zzdpx zzdpxVar, zzdqh zzdqhVar) {
        this.zza = zzdpxVar;
        this.zzb = zzdqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zze(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        this.zza.zzb(zzezrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
        this.zza.zzc(zzbugVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
