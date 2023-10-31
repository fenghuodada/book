package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzglr implements zzfww {
    private final zzgco zza;

    public zzglr(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgco(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
