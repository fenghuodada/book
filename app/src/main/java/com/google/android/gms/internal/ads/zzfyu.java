package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfyu {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    @Nullable
    private Integer zzc;
    private zzfyv zzd;
    private zzfyw zze;

    private zzfyu() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        throw null;
    }

    public /* synthetic */ zzfyu(zzfyt zzfytVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = zzfyw.zzc;
    }

    public final zzfyu zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 24 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }

    public final zzfyu zzb(zzfyv zzfyvVar) {
        this.zzd = zzfyvVar;
        return this;
    }

    public final zzfyu zzc(int i) throws GeneralSecurityException {
        if (i >= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public final zzfyu zzd(int i) throws GeneralSecurityException {
        if (i >= 10) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    public final zzfyu zze(zzfyw zzfywVar) {
        this.zze = zzfywVar;
        return this;
    }

    public final zzfyy zzf() throws GeneralSecurityException {
        if (this.zza != null) {
            if (this.zzb != null) {
                Integer num = this.zzc;
                if (num != null) {
                    if (this.zzd != null) {
                        if (this.zze != null) {
                            int intValue = num.intValue();
                            zzfyv zzfyvVar = this.zzd;
                            if (zzfyvVar == zzfyv.zza) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                }
                            } else if (zzfyvVar == zzfyv.zzb) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                }
                            } else if (zzfyvVar == zzfyv.zzc) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                }
                            } else if (zzfyvVar == zzfyv.zzd) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                }
                            } else if (zzfyvVar != zzfyv.zze) {
                                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                            } else {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                }
                            }
                            return new zzfyy(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zze, this.zzd, null);
                        }
                        throw new GeneralSecurityException("variant is not set");
                    }
                    throw new GeneralSecurityException("hash type is not set");
                }
                throw new GeneralSecurityException("tag size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }
}
