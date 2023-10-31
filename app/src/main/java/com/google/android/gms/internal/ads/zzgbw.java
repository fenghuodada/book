package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzgbw extends zzgdg {
    final /* synthetic */ zzgbx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbw(zzgbx zzgbxVar, Class cls) {
        super(cls);
        this.zza = zzgbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgku zzc = zzgkv.zzc();
        zzc.zza((zzgky) zzgqgVar);
        zzc.zzb(0);
        return (zzgkv) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgky.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgky zzgkyVar = (zzgky) zzgqgVar;
        if (zzgkyVar.zzf().isEmpty() || !zzgkyVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
