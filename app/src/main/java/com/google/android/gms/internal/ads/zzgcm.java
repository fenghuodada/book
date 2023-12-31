package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class zzgcm extends zzgcn {
    public zzgcm(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    public final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzgcj.zzb(iArr2, this.zza);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
