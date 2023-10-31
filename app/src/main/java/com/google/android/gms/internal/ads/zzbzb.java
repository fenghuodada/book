package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbzb {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzb() {
    }

    public /* synthetic */ zzbzb(zzbza zzbzaVar) {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfI)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }
}
