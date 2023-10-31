package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdsc implements zzfvn {
    final /* synthetic */ zzdse zza;

    public zzdsc(zzdse zzdseVar) {
        this.zza = zzdseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        long j;
        zzcal zzcalVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdse zzdseVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdseVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzcalVar = this.zza.zze;
            zzcalVar.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdse zzdseVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdseVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsb
                @Override // java.lang.Runnable
                public final void run() {
                    zzdsc zzdscVar = zzdsc.this;
                    zzdse.zzj(zzdscVar.zza, str);
                }
            });
        }
    }
}
