package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcib implements zzdfl {
    private final zzcir zza;
    private zzexa zzb;
    private zzewd zzc;
    private zzdav zzd;
    private zzcus zze;
    private zzdfh zzf;
    private zzcpa zzg;

    public /* synthetic */ zzcib(zzcir zzcirVar, zzcia zzciaVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final /* synthetic */ zzdfl zzc(zzcpa zzcpaVar) {
        this.zzg = zzcpaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final /* synthetic */ zzdfl zzd(zzdfh zzdfhVar) {
        this.zzf = zzdfhVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final /* synthetic */ zzdfl zze(zzdav zzdavVar) {
        this.zzd = zzdavVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final /* synthetic */ zzdfl zzf(zzcus zzcusVar) {
        this.zze = zzcusVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    /* renamed from: zzg */
    public final zzdfm zzh() {
        zzgvw.zzc(this.zzd, zzdav.class);
        zzgvw.zzc(this.zze, zzcus.class);
        zzgvw.zzc(this.zzf, zzdfh.class);
        zzgvw.zzc(this.zzg, zzcpa.class);
        return new zzcid(this.zza, this.zzg, this.zzf, new zzcso(), new zzfbe(), new zzctz(), new zzdqp(), this.zzd, this.zze, zzeft.zza(), null, this.zzb, this.zzc, null);
    }
}
