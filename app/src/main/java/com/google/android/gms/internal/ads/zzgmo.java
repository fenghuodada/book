package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zzgmo implements zzfxs {
    private final zzghf zza;
    private final int zzb;

    public zzgmo(zzghf zzghfVar, int i) throws GeneralSecurityException {
        this.zza = zzghfVar;
        this.zzb = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzghfVar.zza(new byte[0], i);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
