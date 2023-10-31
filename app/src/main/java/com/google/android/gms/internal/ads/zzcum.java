package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcum {
    private final zzfed zza;
    private final zzbzz zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgvi zzg;
    private final String zzh;
    private final zzeqt zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfaa zzk;

    public zzcum(zzfed zzfedVar, zzbzz zzbzzVar, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzgvi zzgviVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzeqt zzeqtVar, zzfaa zzfaaVar) {
        this.zza = zzfedVar;
        this.zzb = zzbzzVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgviVar;
        this.zzh = str2;
        this.zzi = zzeqtVar;
        this.zzj = zzgVar;
        this.zzk = zzfaaVar;
    }

    public final /* synthetic */ zzbug zza(zzfwb zzfwbVar) throws Exception {
        return new zzbug((Bundle) zzfwbVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfwb) this.zzg.zzb()).get(), this.zzh, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgT)).booleanValue() && this.zzj.zzP(), this.zzk.zzb());
    }

    public final zzfwb zzb() {
        zzfed zzfedVar = this.zza;
        return zzfdn.zzc(this.zzi.zza(new Bundle()), zzfdx.SIGNALS, zzfedVar).zza();
    }

    public final zzfwb zzc() {
        final zzfwb zzb = zzb();
        return this.zza.zza(zzfdx.REQUEST_PARCEL, zzb, (zzfwb) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcum.this.zza(zzb);
            }
        }).zza();
    }
}
