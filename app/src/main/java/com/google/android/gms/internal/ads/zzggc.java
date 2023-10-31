package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzggc {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    private zzggd zzc;
    private zzgge zzd;

    private zzggc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzggc(zzggb zzggbVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgge.zzd;
    }

    public final zzggc zza(zzggd zzggdVar) {
        this.zzc = zzggdVar;
        return this;
    }

    public final zzggc zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzggc zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzggc zzd(zzgge zzggeVar) {
        this.zzd = zzggeVar;
        return this;
    }

    public final zzggg zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd != null) {
                        if (num.intValue() >= 16) {
                            int intValue = this.zzb.intValue();
                            zzggd zzggdVar = this.zzc;
                            if (intValue >= 10) {
                                if (zzggdVar == zzggd.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (zzggdVar == zzggd.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (zzggdVar == zzggd.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (zzggdVar == zzggd.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (zzggdVar != zzggd.zze) {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                } else {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                }
                                return new zzggg(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
