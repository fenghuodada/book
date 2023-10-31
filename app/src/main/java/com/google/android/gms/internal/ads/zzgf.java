package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgf implements zzfw {
    @Nullable
    private zzgz zzb;
    @Nullable
    private String zzc;
    private boolean zzf;
    private final zzgt zza = new zzgt();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgf zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgf zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgf zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgf zze(@Nullable zzgz zzgzVar) {
        this.zzb = zzgzVar;
        return this;
    }

    public final zzgf zzf(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    /* renamed from: zzg */
    public final zzgk zza() {
        zzgk zzgkVar = new zzgk(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzgz zzgzVar = this.zzb;
        if (zzgzVar != null) {
            zzgkVar.zzf(zzgzVar);
        }
        return zzgkVar;
    }
}
