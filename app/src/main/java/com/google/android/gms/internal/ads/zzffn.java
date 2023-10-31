package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzffn implements zzfvn {
    final /* synthetic */ zzffq zza;
    final /* synthetic */ zzfff zzb;
    final /* synthetic */ boolean zzc;

    public zzffn(zzffq zzffqVar, zzfff zzfffVar, boolean z) {
        this.zza = zzffqVar;
        this.zzb = zzfffVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzfff zzfffVar = this.zzb;
        if (zzfffVar.zzj()) {
            zzffq zzffqVar = this.zza;
            zzfffVar.zzg(th);
            zzfffVar.zzf(false);
            zzffqVar.zza(zzfffVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(Object obj) {
        zzffq zzffqVar = this.zza;
        zzfff zzfffVar = this.zzb;
        zzfffVar.zzf(true);
        zzffqVar.zza(zzfffVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
