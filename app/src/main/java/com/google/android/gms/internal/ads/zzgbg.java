package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import androidx.core.content.C0663f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgbg extends zzfyh {
    private final zzgbl zza;
    private final zzgmv zzb;
    private final zzgmu zzc;
    @Nullable
    private final Integer zzd;

    private zzgbg(zzgbl zzgblVar, zzgmv zzgmvVar, zzgmu zzgmuVar, @Nullable Integer num) {
        this.zza = zzgblVar;
        this.zzb = zzgmvVar;
        this.zzc = zzgmuVar;
        this.zzd = num;
    }

    public static zzgbg zza(zzgbk zzgbkVar, zzgmv zzgmvVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgmu zzb;
        zzgbk zzgbkVar2 = zzgbk.zzc;
        if (zzgbkVar != zzgbkVar2 && num == null) {
            throw new GeneralSecurityException(C0663f.m12005a("For given Variant ", zzgbkVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgbkVar == zzgbkVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgmvVar.zza() == 32) {
            zzgbl zzb2 = zzgbl.zzb(zzgbkVar);
            if (zzb2.zza() == zzgbkVar2) {
                zzb = zzgmu.zzb(new byte[0]);
            } else if (zzb2.zza() == zzgbk.zzb) {
                zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzgbk.zza) {
                zzb = zzgmu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzgbg(zzb2, zzgmvVar, zzb, num);
        }
        throw new GeneralSecurityException(C0235r.m12816a("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgmvVar.zza()));
    }
}
