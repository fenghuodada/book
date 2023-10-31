package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagh implements zzagf {
    private final int zza;
    private final int zzb;
    private final zzfd zzc;

    public zzagh(zzagb zzagbVar, zzam zzamVar) {
        zzfd zzfdVar = zzagbVar.zza;
        this.zzc = zzfdVar;
        zzfdVar.zzF(12);
        int zzn = zzfdVar.zzn();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int zzk = zzfn.zzk(zzamVar.zzB, zzamVar.zzz);
            if (zzn == 0 || zzn % zzk != 0) {
                zzer.zze("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzk + ", stsz sample size: " + zzn);
                zzn = zzk;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = zzfdVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagf
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
