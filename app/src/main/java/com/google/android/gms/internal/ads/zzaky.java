package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaky implements Runnable {
    private final zzali zza;
    private final zzalo zzb;
    private final Runnable zzc;

    public zzaky(zzali zzaliVar, zzalo zzaloVar, Runnable runnable) {
        this.zza = zzaliVar;
        this.zzb = zzaloVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzalo zzaloVar = this.zzb;
        if (zzaloVar.zzc()) {
            this.zza.zzo(zzaloVar.zza);
        } else {
            this.zza.zzn(zzaloVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
