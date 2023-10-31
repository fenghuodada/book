package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgca extends zzgdg {
    final /* synthetic */ zzgcb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgca(zzgcb zzgcbVar, Class cls) {
        super(cls);
        this.zza = zzgcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzglj zzgljVar = (zzglj) zzgqgVar;
        zzglf zzc = zzglg.zzc();
        zzc.zzb(0);
        byte[] zza = zzgmq.zza(32);
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        return (zzglg) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzglj.zzd(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgdf(zzglj.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgdf(zzglj.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzglj zzgljVar = (zzglj) zzgqgVar;
    }
}
