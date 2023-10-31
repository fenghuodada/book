package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgdn {
    public static final zzggy zza = new zzgdm(null);

    public static zzghe zza(zzfya zzfyaVar) {
        zzfxg zzfxgVar;
        zzgha zzghaVar = new zzgha();
        zzghaVar.zzb(zzfyaVar.zzb());
        for (List<zzfxw> list : zzfyaVar.zzd()) {
            for (zzfxw zzfxwVar : list) {
                int zzh = zzfxwVar.zzh() - 2;
                if (zzh == 1) {
                    zzfxgVar = zzfxg.zza;
                } else if (zzh == 2) {
                    zzfxgVar = zzfxg.zzb;
                } else if (zzh != 3) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    zzfxgVar = zzfxg.zzc;
                }
                int zza2 = zzfxwVar.zza();
                String zzf = zzfxwVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzghaVar.zza(zzfxgVar, zza2, zzf, zzfxwVar.zzc().name());
            }
        }
        if (zzfyaVar.zza() != null) {
            zzghaVar.zzc(zzfyaVar.zza().zza());
        }
        try {
            return zzghaVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
