package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzewa implements zzfcg {
    private final zzeww zza;

    public zzewa(zzeww zzewwVar) {
        this.zza = zzewwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcg
    public final zzfwb zza(zzfch zzfchVar) {
        zzewb zzewbVar = (zzewb) zzfchVar;
        return ((zzevx) this.zza).zzb(zzewbVar.zzb, zzewbVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfcg
    public final void zzb(zzfbv zzfbvVar) {
        zzfbvVar.zza = ((zzevx) this.zza).zza();
    }
}
