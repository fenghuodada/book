package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfzz {
    @Nullable
    private zzgaj zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzfzz() {
    }

    public /* synthetic */ zzfzz(zzfzy zzfzyVar) {
    }

    public final zzfzz zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfzz zzb(zzgmv zzgmvVar) {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzfzz zzc(zzgaj zzgajVar) {
        this.zza = zzgajVar;
        return this;
    }

    public final zzgab zzd() throws GeneralSecurityException {
        zzgmv zzgmvVar;
        zzgmu zzb;
        zzgaj zzgajVar = this.zza;
        if (zzgajVar == null || (zzgmvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgajVar.zza() == zzgmvVar.zza()) {
            if (zzgajVar.zzc() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.zza.zzc() || this.zzc == null) {
                if (this.zza.zzb() == zzgah.zzc) {
                    zzb = zzgmu.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzgah.zzb) {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() != zzgah.zza) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                } else {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                }
                return new zzgab(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
