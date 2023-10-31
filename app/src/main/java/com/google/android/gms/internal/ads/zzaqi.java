package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaqi implements Runnable {
    final /* synthetic */ zzaqj zza;

    public zzaqi(zzaqj zzaqjVar) {
        this.zza = zzaqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfit zzfitVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (z) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzaqj.zzj(this.zza);
            } catch (Exception e) {
                zzfitVar = this.zza.zzh;
                zzfitVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
