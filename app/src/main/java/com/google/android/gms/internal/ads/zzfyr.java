package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfyr extends zzgdg {
    final /* synthetic */ zzfys zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyr(zzfys zzfysVar, Class cls) {
        super(cls);
        this.zza = zzfysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghu zzghuVar = (zzghu) zzgqgVar;
        new zzfzg();
        zzghx zzf = zzfzf.zzf(zzghuVar.zze());
        zzgqg zza = new zzgga().zza().zza(zzghuVar.zzf());
        zzghq zzc = zzghr.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgjj) zza);
        zzc.zzc(0);
        return (zzghr) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzghu.zzd(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfys.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfys.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfys.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfys.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghu zzghuVar = (zzghu) zzgqgVar;
        ((zzfzf) new zzfzg().zza()).zzd(zzghuVar.zze());
        new zzgga().zza().zzd(zzghuVar.zzf());
        zzgms.zza(zzghuVar.zze().zza());
    }
}
