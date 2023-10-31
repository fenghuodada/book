package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzadc implements zzabn {
    final /* synthetic */ zzabn zza;
    final /* synthetic */ zzadd zzb;

    public zzadc(zzadd zzaddVar, zzabn zzabnVar) {
        this.zzb = zzaddVar;
        this.zza = zzabnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        long j2;
        long j3;
        zzabl zzg = this.zza.zzg(j);
        zzabo zzaboVar = zzg.zza;
        long j4 = zzaboVar.zzb;
        long j5 = zzaboVar.zzc;
        j2 = this.zzb.zzb;
        zzabo zzaboVar2 = new zzabo(j4, j2 + j5);
        zzabo zzaboVar3 = zzg.zzb;
        long j6 = zzaboVar3.zzb;
        long j7 = zzaboVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzabl(zzaboVar2, new zzabo(j6, j3 + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
