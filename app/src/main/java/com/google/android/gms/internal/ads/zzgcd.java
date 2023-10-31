package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgcd extends zzfyi {
    private final zzgcc zza;

    private zzgcd(zzgcc zzgccVar) {
        this.zza = zzgccVar;
    }

    public static zzgcd zzb(zzgcc zzgccVar) {
        return new zzgcd(zzgccVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgcd) && ((zzgcd) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcd.class, this.zza});
    }

    public final String toString() {
        return C0663f.m12005a("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzgcc zza() {
        return this.zza;
    }
}
