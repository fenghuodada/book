package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgem implements zzgen {
    private final zzgmu zza;
    private final zzgjz zzb;

    private zzgem(zzgjz zzgjzVar) {
        this.zzb = zzgjzVar;
        this.zza = zzgew.zza(zzgjzVar.zzg());
    }

    public static zzgem zza(zzgjz zzgjzVar) {
        return new zzgem(zzgjzVar);
    }

    public final zzgjz zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgmu zzd() {
        return this.zza;
    }
}
