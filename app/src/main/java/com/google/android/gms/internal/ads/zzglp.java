package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzglp implements zzfww {
    private final zzgcl zza;

    public zzglp(byte[] bArr) throws GeneralSecurityException {
        if (!zzgcv.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = new zzgcl(bArr, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
