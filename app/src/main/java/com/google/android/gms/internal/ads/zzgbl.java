package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgbl extends zzfyi {
    private final zzgbk zza;

    private zzgbl(zzgbk zzgbkVar) {
        this.zza = zzgbkVar;
    }

    public static zzgbl zzb(zzgbk zzgbkVar) {
        return new zzgbl(zzgbkVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgbl) && ((zzgbl) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbl.class, this.zza});
    }

    public final String toString() {
        return C0663f.m12005a("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgbk zza() {
        return this.zza;
    }
}
