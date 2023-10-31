package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfzi {
    @Nullable
    private zzfzs zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzfzi() {
    }

    public /* synthetic */ zzfzi(zzfzh zzfzhVar) {
    }

    public final zzfzi zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfzi zzb(zzgmv zzgmvVar) {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzfzi zzc(zzfzs zzfzsVar) {
        this.zza = zzfzsVar;
        return this;
    }

    public final zzfzk zzd() throws GeneralSecurityException {
        zzgmv zzgmvVar;
        zzgmu zzb;
        zzfzs zzfzsVar = this.zza;
        if (zzfzsVar == null || (zzgmvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfzsVar.zza() == zzgmvVar.zza()) {
            if (zzfzsVar.zzc() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.zza.zzc() || this.zzc == null) {
                if (this.zza.zzb() == zzfzq.zzc) {
                    zzb = zzgmu.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzfzq.zzb) {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() != zzfzq.zza) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                } else {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                }
                return new zzfzk(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
