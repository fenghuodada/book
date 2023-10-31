package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzglo implements zzfww {
    private static final ThreadLocal zza = new zzglm();
    private static final ThreadLocal zzb = new zzgln();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzglo(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zzgcv.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i;
        zzgms.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zze = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzb2 = zzb(cipher.doFinal(new byte[16]));
        this.zzc = zzb2;
        this.zzd = zzb(zzb2);
    }

    private static byte[] zzb(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    private final byte[] zzc(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(zzd(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = zzd(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzd(doFinal, bArr2));
    }

    private static byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.zzf) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, this.zze);
            byte[] zzc = zzc(cipher, 0, bArr, 0, this.zzf);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] zzc2 = zzc(cipher, 1, bArr3, 0, bArr3.length);
            byte[] zzc3 = zzc(cipher, 2, bArr, this.zzf, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ zzc2[i3]) ^ zzc[i3]) ^ zzc3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) zzb.get();
                cipher2.init(1, this.zze, new IvParameterSpec(zzc));
                return cipher2.doFinal(bArr, this.zzf, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
