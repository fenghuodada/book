package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfzp {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    @Nullable
    private Integer zzc;
    private zzfzq zzd;

    private zzfzp() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzfzp(zzfzo zzfzoVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfzq.zzc;
    }

    public final zzfzp zza(int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
    }

    public final zzfzp zzb(int i) throws GeneralSecurityException {
        if (i == 16 || i == 24 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }

    public final zzfzp zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzfzp zzd(zzfzq zzfzqVar) {
        this.zzd = zzfzqVar;
        return this;
    }

    public final zzfzs zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzd != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        int intValue2 = this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzfzs(intValue, intValue2, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
