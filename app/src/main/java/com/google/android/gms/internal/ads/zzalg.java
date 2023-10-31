package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzalg implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzali zzc;

    public zzalg(zzali zzaliVar, String str, long j) {
        this.zzc = zzaliVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzalt zzaltVar;
        zzalt zzaltVar2;
        zzaltVar = this.zzc.zza;
        zzaltVar.zza(this.zza, this.zzb);
        zzali zzaliVar = this.zzc;
        zzaltVar2 = zzaliVar.zza;
        zzaltVar2.zzb(zzaliVar.toString());
    }
}
