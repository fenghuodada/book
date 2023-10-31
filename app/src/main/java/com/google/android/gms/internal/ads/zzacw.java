package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzacw {
    protected final zzabr zza;

    public zzacw(zzabr zzabrVar) {
        this.zza = zzabrVar;
    }

    public abstract boolean zza(zzfd zzfdVar) throws zzce;

    public abstract boolean zzb(zzfd zzfdVar, long j) throws zzce;

    public final boolean zzf(zzfd zzfdVar, long j) throws zzce {
        return zza(zzfdVar) && zzb(zzfdVar, j);
    }
}
