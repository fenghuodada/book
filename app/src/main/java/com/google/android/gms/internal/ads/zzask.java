package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzask implements Callable {
    private final zzarr zza;
    private final zzano zzb;

    public zzask(zzarr zzarrVar, zzano zzanoVar) {
        this.zza = zzarrVar;
        this.zzb = zzanoVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaol zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzano zzanoVar = this.zzb;
                    byte[] zzax = zzc.zzax();
                    zzanoVar.zzak(zzax, 0, zzax.length, zzgoi.zza());
                }
                return null;
            } catch (zzgpi | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
