package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzfyl implements zzfyb {
    private static final Logger zza = Logger.getLogger(zzfyl.class.getName());
    private static final zzfyl zzb = new zzfyl();

    public static void zze() throws GeneralSecurityException {
        zzfyd.zzf(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zza() {
        return zzfww.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final Class zzb() {
        return zzfww.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfyb
    public final /* synthetic */ Object zzc(zzfya zzfyaVar) throws GeneralSecurityException {
        return new zzfyk(zzfyaVar, null);
    }
}
