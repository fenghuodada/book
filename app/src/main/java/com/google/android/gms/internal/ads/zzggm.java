package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggm {
    @Deprecated
    static final zzgld zza;
    @Deprecated
    static final zzgld zzb;
    @Deprecated
    static final zzgld zzc;

    static {
        new zzgga();
        zzgld zzc2 = zzgld.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzggr.zze();
        zzgfs.zzd();
        zzgga.zzh(true);
        if (zzgcw.zzb()) {
            return;
        }
        zzgfe.zzm(true);
    }
}
