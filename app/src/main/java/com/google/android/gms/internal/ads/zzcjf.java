package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcjf implements zzcpz {
    private final zzcir zza;
    private zzexa zzb;
    private zzewd zzc;
    private zzdav zzd;
    private zzcus zze;
    private zzeho zzf;
    private zzcqx zzg;
    private zzefr zzh;
    private zzcpa zzi;
    private zzdfh zzj;

    public /* synthetic */ zzcjf(zzcir zzcirVar, zzcje zzcjeVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final /* synthetic */ zzcuo zza(zzewd zzewdVar) {
        this.zzc = zzewdVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    public final /* synthetic */ zzcuo zzb(zzexa zzexaVar) {
        this.zzb = zzexaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzc(zzcpa zzcpaVar) {
        this.zzi = zzcpaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzd(zzdfh zzdfhVar) {
        this.zzj = zzdfhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zze(zzeho zzehoVar) {
        this.zzf = zzehoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzf(zzdav zzdavVar) {
        this.zzd = zzdavVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzg(zzcqx zzcqxVar) {
        this.zzg = zzcqxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzi(zzcus zzcusVar) {
        this.zze = zzcusVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpz
    public final /* synthetic */ zzcpz zzj(zzefr zzefrVar) {
        this.zzh = zzefrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    /* renamed from: zzk */
    public final zzcqa zzh() {
        zzgvw.zzc(this.zzd, zzdav.class);
        zzgvw.zzc(this.zze, zzcus.class);
        zzgvw.zzc(this.zzf, zzeho.class);
        zzgvw.zzc(this.zzg, zzcqx.class);
        if (this.zzh == null) {
            this.zzh = zzeft.zza();
        }
        zzgvw.zzc(this.zzi, zzcpa.class);
        zzgvw.zzc(this.zzj, zzdfh.class);
        return new zzcjh(this.zza, this.zzi, this.zzj, new zzcso(), new zzfbe(), new zzctz(), new zzdqp(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}
