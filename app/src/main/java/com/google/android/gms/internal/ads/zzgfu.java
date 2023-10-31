package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgfu {
    @Nullable
    private zzggg zza = null;
    @Nullable
    private zzgmv zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgfu() {
    }

    public /* synthetic */ zzgfu(zzgft zzgftVar) {
    }

    public final zzgfu zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfu zzb(zzgmv zzgmvVar) {
        this.zzb = zzgmvVar;
        return this;
    }

    public final zzgfu zzc(zzggg zzgggVar) {
        this.zza = zzgggVar;
        return this;
    }

    public final zzgfw zzd() throws GeneralSecurityException {
        zzgmv zzgmvVar;
        zzgmu zzb;
        zzggg zzgggVar = this.zza;
        if (zzgggVar == null || (zzgmvVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgggVar.zza() == zzgmvVar.zza()) {
            if (zzgggVar.zzd() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.zza.zzd() || this.zzc == null) {
                if (this.zza.zzc() == zzgge.zzd) {
                    zzb = zzgmu.zzb(new byte[0]);
                } else if (this.zza.zzc() == zzgge.zzc || this.zza.zzc() == zzgge.zzb) {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzc() != zzgge.zza) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                } else {
                    zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                }
                return new zzgfw(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
