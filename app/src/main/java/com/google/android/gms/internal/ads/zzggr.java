package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0484a;
import com.adcolony.sdk.C2362x3;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzggr implements zzfyb {
    private static final Logger zza = Logger.getLogger(zzggr.class.getName());
    private static final byte[] zzb = {0};
    private static final zzggr zzc = new zzggr();

    public static void zze() throws GeneralSecurityException {
        zzfyd.zzf(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zza() {
        return zzfxs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zzb() {
        return zzfxs.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final /* bridge */ /* synthetic */ Object zzc(zzfya zzfyaVar) throws GeneralSecurityException {
        for (List<zzfxw> list : zzfyaVar.zzd()) {
            for (zzfxw zzfxwVar : list) {
                if (zzfxwVar.zzb() instanceof zzggn) {
                    zzggn zzggnVar = (zzggn) zzfxwVar.zzb();
                    zzgmu zzb2 = zzgmu.zzb(zzfxwVar.zzg());
                    if (!zzb2.equals(zzggnVar.zzb())) {
                        String valueOf = String.valueOf(zzggnVar.zza());
                        String zzgmuVar = zzggnVar.zzb().toString();
                        throw new GeneralSecurityException(C0484a.m12392a(C2362x3.m9460b("Mac Key with parameters ", valueOf, " has wrong output prefix (", zzgmuVar, ") instead of ("), zzb2.toString(), ")"));
                    }
                }
            }
        }
        return new zzggq(zzfyaVar, null);
    }
}
