package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzckr implements zzdms {
    private final zzcir zza;
    private zzexa zzb;
    private zzewd zzc;
    private zzdav zzd;
    private zzcus zze;

    public /* synthetic */ zzckr(zzcir zzcirVar, zzckq zzckqVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdms
    public final /* synthetic */ zzdms zzc(zzdav zzdavVar) {
        this.zzd = zzdavVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdms
    public final /* synthetic */ zzdms zzd(zzcus zzcusVar) {
        this.zze = zzcusVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuo
    /* renamed from: zze */
    public final zzdmt zzh() {
        zzgvw.zzc(this.zzd, zzdav.class);
        zzgvw.zzc(this.zze, zzcus.class);
        return new zzckt(this.zza, new zzcso(), new zzfbe(), new zzctz(), new zzdqp(), this.zzd, this.zze, zzeft.zza(), null, this.zzb, this.zzc, null);
    }
}
