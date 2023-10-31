package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgfs implements zzfyb {
    private static final zzgfs zza = new zzgfs();

    private zzgfs() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzfyd.zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zza() {
        return zzgfp.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zzb() {
        return zzgfp.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final /* bridge */ /* synthetic */ Object zzc(zzfya zzfyaVar) throws GeneralSecurityException {
        if (zzfyaVar.zza() != null) {
            for (List<zzfxw> list : zzfyaVar.zzd()) {
                for (zzfxw zzfxwVar : list) {
                    zzfxwVar.zzd();
                }
            }
            return new zzgfr(zzfyaVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
