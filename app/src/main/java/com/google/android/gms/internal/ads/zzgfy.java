package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzgfy extends zzgef {
    public zzgfy(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final /* bridge */ /* synthetic */ Object zza(zzgqg zzgqgVar) throws GeneralSecurityException {
        zzgjj zzgjjVar = (zzgjj) zzgqgVar;
        int zzg = zzgjjVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgjjVar.zzh().zzA(), "HMAC");
        int zza = zzgjjVar.zzg().zza();
        int i = zzg - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new zzgmo(new zzgmn("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgmo(new zzgmn("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgmo(new zzgmn("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgmo(new zzgmn("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgmo(new zzgmn("HMACSHA1", secretKeySpec), zza);
    }
}
