package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfyn {
    @Nullable
    private zzfyy zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private zzgmv zzc = null;
    @Nullable
    private Integer zzd = null;

    private zzfyn() {
    }

    public /* synthetic */ zzfyn(zzfym zzfymVar) {
    }

    public final zzfyn zza(zzgmv zzgmvVar) {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzfyn zzb(zzgmv zzgmvVar) {
        this.zzc = zzgmvVar;
        return this;
    }

    public final zzfyn zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzfyn zzd(zzfyy zzfyyVar) {
        this.zza = zzfyyVar;
        return this;
    }

    public final zzfyp zze() throws GeneralSecurityException {
        zzgmu zzb;
        zzfyy zzfyyVar = this.zza;
        if (zzfyyVar != null) {
            zzgmv zzgmvVar = this.zzb;
            if (zzgmvVar == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzfyyVar.zza() == zzgmvVar.zza()) {
                if (zzfyyVar.zzc() == this.zzc.zza()) {
                    if (this.zza.zze() && this.zzd == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (this.zza.zze() || this.zzd == null) {
                        if (this.zza.zzd() == zzfyw.zzc) {
                            zzb = zzgmu.zzb(new byte[0]);
                        } else if (this.zza.zzd() == zzfyw.zzb) {
                            zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                        } else if (this.zza.zzd() != zzfyw.zza) {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                        } else {
                            zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                        }
                        return new zzfyp(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }
}
