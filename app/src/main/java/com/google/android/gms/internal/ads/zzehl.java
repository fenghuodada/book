package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzehl implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcal zza;
    final /* synthetic */ zzezr zzb;
    final /* synthetic */ zzezf zzc;
    final /* synthetic */ zzehr zzd;
    final /* synthetic */ zzehm zze;

    public zzehl(zzehm zzehmVar, zzcal zzcalVar, zzezr zzezrVar, zzezf zzezfVar, zzehr zzehrVar) {
        this.zze = zzehmVar;
        this.zza = zzcalVar;
        this.zzb = zzezrVar;
        this.zzc = zzezfVar;
        this.zzd = zzehrVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzehv zzehvVar;
        zzcal zzcalVar = this.zza;
        zzehvVar = this.zze.zzd;
        zzcalVar.zzd(zzehvVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
