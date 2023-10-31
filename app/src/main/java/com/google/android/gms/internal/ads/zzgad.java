package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgad extends zzgdg {
    final /* synthetic */ zzgae zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgad(zzgae zzgaeVar, Class cls) {
        super(cls);
        this.zza = zzgaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgio zzc = zzgip.zzc();
        byte[] zza = zzgmq.zza(((zzgis) zzgqgVar).zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        zzc.zzb(0);
        return (zzgip) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgis.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzgae.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzgae.zzg(16, 3));
        hashMap.put("AES256_GCM", zzgae.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzgae.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgms.zza(((zzgis) zzgqgVar).zza());
    }
}
