package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgv zze;

    public zzgu(zzgv zzgvVar, String str, String str2, String str3, long j) {
        this.zze = zzgvVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        String str = this.zza;
        if (str == null) {
            zzlhVar2 = this.zze.zza;
            zzlhVar2.zzR(this.zzb, null);
            return;
        }
        zzir zzirVar = new zzir(this.zzc, str, this.zzd);
        zzlhVar = this.zze.zza;
        zzlhVar.zzR(this.zzb, zzirVar);
    }
}
