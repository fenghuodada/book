package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggt implements zzgfp {
    private final zzgfa zza;

    public zzggt(zzgfa zzgfaVar) throws GeneralSecurityException {
        if (!zzgcv.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzgfaVar;
    }
}
