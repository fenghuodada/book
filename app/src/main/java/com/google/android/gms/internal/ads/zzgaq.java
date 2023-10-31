package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgaq {
    @Nullable
    private zzgba zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgaq() {
    }

    public /* synthetic */ zzgaq(zzgap zzgapVar) {
    }

    public final zzgaq zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgaq zzb(zzgmv zzgmvVar) {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzgaq zzc(zzgba zzgbaVar) {
        this.zza = zzgbaVar;
        return this;
    }

    public final zzgas zzd() throws GeneralSecurityException {
        zzgmv zzgmvVar;
        zzgmu zzb;
        zzgba zzgbaVar = this.zza;
        if (zzgbaVar == null || (zzgmvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgbaVar.zza() == zzgmvVar.zza()) {
            if (zzgbaVar.zzc() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.zza.zzc() || this.zzc == null) {
                if (this.zza.zzb() == zzgay.zzc) {
                    zzb = zzgmu.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzgay.zzb) {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() != zzgay.zza) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                } else {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                }
                return new zzgas(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
