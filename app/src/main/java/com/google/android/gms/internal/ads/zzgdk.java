package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgdk extends zzfxt {
    private final zzgem zza;

    public zzgdk(zzgem zzgemVar) {
        this.zza = zzgemVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgdk) {
            zzgem zzgemVar = ((zzgdk) obj).zza;
            return this.zza.zzb().zze().equals(zzgemVar.zzb().zze()) && this.zza.zzb().zzg().equals(zzgemVar.zzb().zzg()) && this.zza.zzb().zzf().equals(zzgemVar.zzb().zzf());
        }
        return false;
    }

    public final int hashCode() {
        zzgem zzgemVar = this.zza;
        return Arrays.hashCode(new Object[]{zzgemVar.zzb(), zzgemVar.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzb().zzg();
        zzgla zze = this.zza.zzb().zze();
        zzgla zzglaVar = zzgla.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzgem zza() {
        return this.zza;
    }
}
