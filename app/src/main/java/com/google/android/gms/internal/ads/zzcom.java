package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public final class zzcom {
    private final zzfen zza;
    private final zzdqc zzb;
    private final zzezr zzc;

    public zzcom(zzdqc zzdqcVar, zzezr zzezrVar, zzfen zzfenVar) {
        this.zza = zzfenVar;
        this.zzb = zzdqcVar;
        this.zzc = zzezrVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue()) {
            zzfen zzfenVar = this.zza;
            zzfem zzb = zzfem.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfenVar.zzb(zzb);
            return;
        }
        zzdqb zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}
