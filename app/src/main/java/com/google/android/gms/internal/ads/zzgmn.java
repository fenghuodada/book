package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzgmn implements zzghf {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzgmn(String str, Key key) throws GeneralSecurityException {
        char c;
        int i;
        zzgmm zzgmmVar = new zzgmm(this);
        this.zza = zzgmmVar;
        if (!zzgcv.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 20;
        } else if (c == 1) {
            i = 28;
        } else if (c == 2) {
            i = 32;
        } else if (c == 3) {
            i = 48;
        } else if (c != 4) {
            throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        } else {
            i = 64;
        }
        this.zzd = i;
        zzgmmVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzghf
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.zzd) {
            ((Mac) this.zza.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
