package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzctx implements zzcyd {
    private final Context zza;
    private final zzfaa zzb;
    private final zzbzz zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdse zze;
    private final zzfft zzf;
    private final String zzg;

    public zzctx(Context context, zzfaa zzfaaVar, zzbzz zzbzzVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdse zzdseVar, zzfft zzfftVar, String str) {
        this.zza = context;
        this.zzb = zzfaaVar;
        this.zzc = zzbzzVar;
        this.zzd = zzgVar;
        this.zze = zzdseVar;
        this.zzf = zzfftVar;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdH)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfu)).booleanValue()) {
            String str = this.zzg;
            if (str == "app_open_ad") {
                return;
            }
            if (str != null && str.equals("app_open_ad")) {
                return;
            }
        }
        this.zze.zzr();
    }
}
