package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import androidx.core.content.C0663f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgby extends zzfyh {
    private final zzgcd zza;
    private final zzgmv zzb;
    private final zzgmu zzc;
    @Nullable
    private final Integer zzd;

    private zzgby(zzgcd zzgcdVar, zzgmv zzgmvVar, zzgmu zzgmuVar, @Nullable Integer num) {
        this.zza = zzgcdVar;
        this.zzb = zzgmvVar;
        this.zzc = zzgmuVar;
        this.zzd = num;
    }

    public static zzgby zza(zzgcc zzgccVar, zzgmv zzgmvVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgmu zzb;
        zzgcc zzgccVar2 = zzgcc.zzc;
        if (zzgccVar != zzgccVar2 && num == null) {
            throw new GeneralSecurityException(C0663f.m12005a("For given Variant ", zzgccVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgccVar == zzgccVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgmvVar.zza() == 32) {
            zzgcd zzb2 = zzgcd.zzb(zzgccVar);
            if (zzb2.zza() == zzgccVar2) {
                zzb = zzgmu.zzb(new byte[0]);
            } else if (zzb2.zza() == zzgcc.zzb) {
                zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzgcc.zza) {
                zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzgby(zzb2, zzgmvVar, zzb, num);
        }
        throw new GeneralSecurityException(C0235r.m12816a("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgmvVar.zza()));
    }
}
