package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgfd extends zzgdg {
    public zzgfd(zzgfe zzgfeVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ zzgqg zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghl zzghlVar = (zzghl) zzgqgVar;
        zzghh zzc = zzghi.zzc();
        zzc.zzc(0);
        byte[] zza = zzgmq.zza(zzghlVar.zza());
        zzc.zza(zzgno.zzv(zza, 0, zza.length));
        zzc.zzb(zzghlVar.zzf());
        return (zzghi) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ zzgqg zzb(zzgno zzgnoVar) throws zzgpi {
        return zzghl.zze(zzgnoVar, zzgoi.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzghk zzc = zzghl.zzc();
        zzc.zza(32);
        zzghn zzc2 = zzgho.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgho) zzc2.zzal());
        hashMap.put("AES_CMAC", new zzgdf((zzghl) zzc.zzal(), 1));
        zzghk zzc3 = zzghl.zzc();
        zzc3.zza(32);
        zzghn zzc4 = zzgho.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzgho) zzc4.zzal());
        hashMap.put("AES256_CMAC", new zzgdf((zzghl) zzc3.zzal(), 1));
        zzghk zzc5 = zzghl.zzc();
        zzc5.zza(32);
        zzghn zzc6 = zzgho.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzgho) zzc6.zzal());
        hashMap.put("AES256_CMAC_RAW", new zzgdf((zzghl) zzc5.zzal(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ void zzd(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzghl zzghlVar = (zzghl) zzgqgVar;
        zzgfe.zzn(zzghlVar.zzf());
        zzgfe.zzo(zzghlVar.zza());
    }
}
