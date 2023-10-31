package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdlw implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcfn zzb;
    private final Context zzc;
    private final zzdqc zzd;
    private final zzfen zze;
    private final zzebc zzf;
    private final Executor zzg;
    private final zzaqq zzh;
    private final zzbzz zzi;
    private final zzfgj zzj;

    public zzdlw(Context context, Executor executor, zzaqq zzaqqVar, zzbzz zzbzzVar, com.google.android.gms.ads.internal.zza zzaVar, zzcfn zzcfnVar, zzebc zzebcVar, zzfgj zzfgjVar, zzdqc zzdqcVar, zzfen zzfenVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaqqVar;
        this.zzi = zzbzzVar;
        this.zza = zzaVar;
        this.zzb = zzcfnVar;
        this.zzf = zzebcVar;
        this.zzj = zzfgjVar;
        this.zzd = zzdqcVar;
        this.zze = zzfenVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdlw zzdlwVar) {
        return zzdlwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzaqq zzb(zzdlw zzdlwVar) {
        return zzdlwVar.zzh;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdlw zzdlwVar) {
        return zzdlwVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzbzz zzd(zzdlw zzdlwVar) {
        return zzdlwVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzcfn zze(zzdlw zzdlwVar) {
        return zzdlwVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzdqc zzf(zzdlw zzdlwVar) {
        return zzdlwVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzebc zzg(zzdlw zzdlwVar) {
        return zzdlwVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfen zzh(zzdlw zzdlwVar) {
        return zzdlwVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfgj zzi(zzdlw zzdlwVar) {
        return zzdlwVar.zzj;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdlw zzdlwVar) {
        return zzdlwVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlz zzdlzVar = new zzdlz(this);
        zzdlzVar.zzh();
        return zzdlzVar;
    }
}
