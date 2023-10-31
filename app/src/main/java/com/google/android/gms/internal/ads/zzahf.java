package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahf implements zzabn {
    final /* synthetic */ zzahg zza;

    public /* synthetic */ zzahf(zzahg zzahgVar, zzahe zzaheVar) {
        this.zza = zzahgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        zzahs zzahsVar;
        long j;
        zzahg zzahgVar = this.zza;
        zzahsVar = zzahgVar.zzd;
        j = zzahgVar.zzf;
        return zzahsVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        zzahs zzahsVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzahg zzahgVar = this.zza;
        zzahsVar = zzahgVar.zzd;
        long zzg = zzahsVar.zzg(j);
        j2 = zzahgVar.zzb;
        j3 = zzahgVar.zzc;
        j4 = zzahgVar.zzb;
        long j8 = (j3 - j4) * zzg;
        j5 = zzahgVar.zzf;
        long j9 = (j8 / j5) + j2;
        j6 = zzahgVar.zzb;
        j7 = zzahgVar.zzc;
        zzabo zzaboVar = new zzabo(j, Math.max(j6, Math.min(j9 - 30000, j7 - 1)));
        return new zzabl(zzaboVar, zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
