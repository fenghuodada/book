package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgbi extends zzgdg {
    final /* synthetic */ zzgbj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbi(zzgbj zzgbjVar, Class cls) {
        super(cls);
        this.zza = zzgbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgje zzgjeVar = (zzgje) zzgqgVar;
        zzgja zzc = zzgjb.zzc();
        zzc.zzb(0);
        byte[] zza = zzgmq.zza(32);
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        return (zzgjb) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzgje.zzd(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgdf(zzgje.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgdf(zzgje.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgje zzgjeVar = (zzgje) zzgqgVar;
    }
}
