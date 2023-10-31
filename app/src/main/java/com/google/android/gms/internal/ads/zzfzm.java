package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfzm extends zzgdg {
    final /* synthetic */ zzfzn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzm(zzfzn zzfznVar, Class cls) {
        super(cls);
        this.zza = zzfznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgij zzgijVar = (zzgij) zzgqgVar;
        zzgif zzc = zzgig.zzc();
        byte[] zza = zzgmq.zza(zzgijVar.zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        zzc.zzb(zzgijVar.zzf());
        zzc.zzc(0);
        return (zzgig) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgij.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfzn.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfzn.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfzn.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfzn.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgij zzgijVar = (zzgij) zzgqgVar;
        zzgms.zza(zzgijVar.zza());
        if (zzgijVar.zzf().zza() != 12 && zzgijVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
