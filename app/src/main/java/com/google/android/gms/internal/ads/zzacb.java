package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzacb implements zzabn {
    final /* synthetic */ zzace zza;
    private final long zzb;

    public zzacb(zzace zzaceVar, long j) {
        this.zza = zzaceVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        zzach[] zzachVarArr;
        zzach[] zzachVarArr2;
        zzach[] zzachVarArr3;
        zzachVarArr = this.zza.zzg;
        zzabl zza = zzachVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzace zzaceVar = this.zza;
            zzachVarArr2 = zzaceVar.zzg;
            if (i >= zzachVarArr2.length) {
                return zza;
            }
            zzachVarArr3 = zzaceVar.zzg;
            zzabl zza2 = zzachVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
