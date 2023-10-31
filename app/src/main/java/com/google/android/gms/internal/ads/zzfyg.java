package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfyg {
    @Deprecated
    static final zzgld zza;
    @Deprecated
    static final zzgld zzb;
    @Deprecated
    static final zzgld zzc;

    static {
        new zzfys();
        new zzgae();
        new zzgav();
        new zzfzn();
        new zzgbt();
        new zzgbx();
        new zzgbj();
        new zzgcb();
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
        zzfyl.zze();
        zzggm.zza();
        zzfyd.zze(new zzfys(), true);
        int i = zzfzd.zza;
        zzfzd.zza(zzgds.zzb());
        zzfyd.zze(new zzgae(), true);
        int i2 = zzgao.zza;
        zzgao.zza(zzgds.zzb());
        if (zzgcw.zzb()) {
            return;
        }
        zzfyd.zze(new zzfzn(), true);
        int i3 = zzfzx.zza;
        zzfzx.zza(zzgds.zzb());
        zzgav.zzg(true);
        zzfyd.zze(new zzgbj(), true);
        int i4 = zzgbq.zza;
        zzgbq.zza(zzgds.zzb());
        zzfyd.zze(new zzgbt(), true);
        zzfyd.zze(new zzgbx(), true);
        zzfyd.zze(new zzgcb(), true);
        int i5 = zzgci.zza;
        zzgci.zza(zzgds.zzb());
    }
}
