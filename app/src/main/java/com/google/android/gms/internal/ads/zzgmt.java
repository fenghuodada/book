package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgmt implements zzfww {
    private final zzgcr zza;

    public zzgmt(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgcr(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.zza.zzb(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
