package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgfz extends zzgdg {
    final /* synthetic */ zzgga zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgfz(zzgga zzggaVar, Class cls) {
        super(cls);
        this.zza = zzggaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = (zzgjm) zzgqgVar;
        zzgji zzc = zzgjj.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgjmVar.zzg());
        byte[] zza = zzgmq.zza(zzgjmVar.zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        return (zzgjj) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgjm.zzf(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgga.zzn(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgga.zzn(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgga.zzn(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgga.zzn(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgga.zzn(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgga.zzn(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgga.zzn(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgga.zzn(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgga.zzn(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgga.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = (zzgjm) zzgqgVar;
        if (zzgjmVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgga.zzo(zzgjmVar.zzg());
    }
}
