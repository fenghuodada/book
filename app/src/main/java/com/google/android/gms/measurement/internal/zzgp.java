package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgp implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgv zzc;

    public zzgp(zzgv zzgvVar, zzau zzauVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzc.zza;
        zzlhVar2.zzF(this.zza, this.zzb);
    }
}
