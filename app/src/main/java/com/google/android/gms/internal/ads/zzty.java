package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzty implements zzwx {
    private final zzwx zza;
    private final zzcz zzb;

    public zzty(zzwx zzwxVar, zzcz zzczVar) {
        this.zza = zzwxVar;
        this.zzb = zzczVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzty) {
            zzty zztyVar = (zzty) obj;
            return this.zza.equals(zztyVar.zza) && this.zzb.equals(zztyVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final zzam zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final zzcz zze() {
        return this.zzb;
    }
}
