package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbmi implements zzcap {
    final /* synthetic */ zzbmj zza;

    public zzbmi(zzbmj zzbmjVar) {
        this.zza = zzbmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzblf zzblfVar = (zzblf) obj;
        zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmh
            @Override // java.lang.Runnable
            public final void run() {
                zzblf zzblfVar2 = zzblfVar;
                zzblfVar2.zzr("/result", zzbih.zzo);
                zzblfVar2.zzc();
            }
        });
    }
}
