package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgax {
    @Nullable
    private Integer zza;
    private zzgay zzb;

    private zzgax() {
        this.zza = null;
        throw null;
    }

    public /* synthetic */ zzgax(zzgaw zzgawVar) {
        this.zza = null;
        this.zzb = zzgay.zzc;
    }

    public final zzgax zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }

    public final zzgax zzb(zzgay zzgayVar) {
        this.zzb = zzgayVar;
        return this;
    }

    public final zzgba zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzgba(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
