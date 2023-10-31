package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgag {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    @Nullable
    private Integer zzc;
    private zzgah zzd;

    private zzgag() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzgag(zzgaf zzgafVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgah.zzc;
    }

    public final zzgag zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgag zzb(int i) throws GeneralSecurityException {
        if (i == 16 || i == 24 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }

    public final zzgag zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgag zzd(zzgah zzgahVar) {
        this.zzd = zzgahVar;
        return this;
    }

    public final zzgaj zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzgaj(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
