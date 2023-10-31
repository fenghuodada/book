package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggu implements zzgfp {
    private final zzgfw zza;

    public zzggu(zzgfw zzgfwVar) throws GeneralSecurityException {
        if (!zzgcv.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgfwVar;
    }
}
