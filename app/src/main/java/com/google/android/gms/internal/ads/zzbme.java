package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbme extends zzcas {
    private final Object zza = new Object();
    private final zzbmj zzb;
    private boolean zzc;

    public zzbme(zzbmj zzbmjVar) {
        this.zzb = zzbmjVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbmb(this), new zzcao());
            zzi(new zzbmc(this), new zzbmd(this));
        }
    }
}
