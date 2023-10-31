package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgml implements zzghf {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgml(byte[] bArr) throws GeneralSecurityException {
        zzgms.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzggs.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzggs.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgcv.zza(1)) {
            return (Cipher) zzgma.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzghf
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzc;
        if (i <= 16) {
            Cipher zzb = zzb();
            zzb.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                zzc = zzglq.zzd(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                int length2 = copyOfRange.length;
                if (length2 >= 16) {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[length2] = Byte.MIN_VALUE;
                zzc = zzglq.zzc(copyOf, this.zzc);
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = zzb.doFinal(zzglq.zzd(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzglq.zzc(zzc, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
