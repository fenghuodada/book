package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class zzatf implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzarr zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzano zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzatf(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2) {
        this.zzb = zzarrVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzanoVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        long nanoTime;
        Method zzj;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzaql zzd = this.zzb.zzd();
        if (zzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
