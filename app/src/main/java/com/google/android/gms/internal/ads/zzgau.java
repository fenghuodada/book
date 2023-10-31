package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgau extends zzgdg {
    final /* synthetic */ zzgav zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgau(zzgav zzgavVar, Class cls) {
        super(cls);
        this.zza = zzgavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgiu zzc = zzgiv.zzc();
        byte[] zza = zzgmq.zza(((zzgiy) zzgqgVar).zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        zzc.zzb(0);
        return (zzgiv) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgiy.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzgav.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzgav.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzgav.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzgav.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgms.zza(((zzgiy) zzgqgVar).zza());
    }
}
