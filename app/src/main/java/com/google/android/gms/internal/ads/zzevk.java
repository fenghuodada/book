package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzevk implements zzeju {
    final /* synthetic */ zzevl zza;

    public zzevk(zzevl zzevlVar) {
        this.zza = zzevlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeju
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzevd zzevdVar;
        zzevd zzevdVar2;
        zzdqc zzdqcVar;
        zzcox zzcoxVar = (zzcox) obj;
        synchronized (this.zza) {
            zzcox zzcoxVar2 = this.zza.zza;
            if (zzcoxVar2 != null) {
                zzcoxVar2.zzb();
            }
            zzevl zzevlVar = this.zza;
            zzevlVar.zza = zzcoxVar;
            zzcoxVar.zzc(zzevlVar);
            zzevl zzevlVar2 = this.zza;
            zzevdVar = zzevlVar2.zzg;
            zzevdVar2 = zzevlVar2.zzg;
            zzdqcVar = zzevlVar2.zzi;
            zzevdVar.zzl(new zzcoy(zzcoxVar, zzevlVar2, zzevdVar2, zzdqcVar));
            zzcoxVar.zzj();
        }
    }
}
