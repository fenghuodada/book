package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgfg {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    private zzgfh zzc;

    private zzgfg() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    public /* synthetic */ zzgfg(zzgff zzgffVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgfh.zzd;
    }

    public final zzgfg zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
    }

    public final zzgfg zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(C0235r.m12816a("Invalid tag size for AesCmacParameters: ", i));
    }

    public final zzgfg zzc(zzgfh zzgfhVar) {
        this.zzc = zzgfhVar;
        return this;
    }

    public final zzgfj zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgfj(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }
}
