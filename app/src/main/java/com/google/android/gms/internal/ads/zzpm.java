package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpm {
    private final zzdr[] zza;
    private final zzqe zzb;
    private final zzdu zzc;

    public zzpm(zzdr... zzdrVarArr) {
        zzqe zzqeVar = new zzqe();
        zzdu zzduVar = new zzdu();
        this.zza = r2;
        System.arraycopy(zzdrVarArr, 0, r2, 0, 0);
        this.zzb = zzqeVar;
        this.zzc = zzduVar;
        zzdr[] zzdrVarArr2 = {zzqeVar, zzduVar};
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzci zzc(zzci zzciVar) {
        this.zzc.zzk(zzciVar.zzc);
        this.zzc.zzj(zzciVar.zzd);
        return zzciVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdr[] zze() {
        return this.zza;
    }
}
