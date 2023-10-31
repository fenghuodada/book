package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public class zzegb extends zzehc {
    private final zzddf zza;

    public zzegb(zzcvg zzcvgVar, zzdcu zzdcuVar, zzcwa zzcwaVar, zzcwp zzcwpVar, zzcwu zzcwuVar, zzcvv zzcvvVar, zzdac zzdacVar, zzddm zzddmVar, zzcxo zzcxoVar, zzddf zzddfVar, zzczy zzczyVar) {
        super(zzcvgVar, zzdcuVar, zzcwaVar, zzcwpVar, zzcwuVar, zzdacVar, zzcxoVar, zzddmVar, zzczyVar, zzcvvVar);
        this.zza = zzddfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc, com.google.android.gms.internal.ads.zzboe
    public final void zzs(zzbvi zzbviVar) {
        this.zza.zza(zzbviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehc, com.google.android.gms.internal.ads.zzboe
    public final void zzt(zzbvm zzbvmVar) throws RemoteException {
        this.zza.zza(new zzbvi(zzbvmVar.zzf(), zzbvmVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzehc, com.google.android.gms.internal.ads.zzboe
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzehc, com.google.android.gms.internal.ads.zzboe
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzehc, com.google.android.gms.internal.ads.zzboe
    public final void zzy() {
        this.zza.zzc();
    }
}
