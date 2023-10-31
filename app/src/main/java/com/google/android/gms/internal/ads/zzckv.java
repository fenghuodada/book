package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzckv implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzcir zza;
    private zzcus zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzae zzc;

    public /* synthetic */ zzckv(zzcir zzcirVar, zzcku zzckuVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzcus zzcusVar) {
        this.zzb = zzcusVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar) {
        this.zzc = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgvw.zzc(this.zzb, zzcus.class);
        zzgvw.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzae.class);
        return new zzckx(this.zza, this.zzc, new zzcso(), new zzdqp(), this.zzb, null, null, null);
    }
}
