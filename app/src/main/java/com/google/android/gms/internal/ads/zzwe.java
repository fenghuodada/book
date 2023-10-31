package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzwe implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwe(zzam zzamVar, int i) {
        this.zza = 1 == (zzamVar.zze & 1);
        this.zzb = zzwv.zzm(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzwe zzweVar) {
        return zzfrg.zzj().zzd(this.zzb, zzweVar.zzb).zzd(this.zza, zzweVar.zza).zza();
    }
}
