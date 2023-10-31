package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgey {
    @Nullable
    private zzgfj zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgey() {
    }

    public /* synthetic */ zzgey(zzgex zzgexVar) {
    }

    public final zzgey zza(zzgmv zzgmvVar) throws GeneralSecurityException {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzgey zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgey zzc(zzgfj zzgfjVar) {
        this.zza = zzgfjVar;
        return this;
    }

    public final zzgfa zzd() throws GeneralSecurityException {
        zzgmv zzgmvVar;
        zzgmu zzb;
        zzgfj zzgfjVar = this.zza;
        if (zzgfjVar == null || (zzgmvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgfjVar.zza() == zzgmvVar.zza()) {
            if (zzgfjVar.zzd() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.zza.zzd() || this.zzc == null) {
                if (this.zza.zzc() == zzgfh.zzd) {
                    zzb = zzgmu.zzb(new byte[0]);
                } else if (this.zza.zzc() == zzgfh.zzc || this.zza.zzc() == zzgfh.zzb) {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzc() != zzgfh.zza) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                } else {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                }
                return new zzgfa(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
