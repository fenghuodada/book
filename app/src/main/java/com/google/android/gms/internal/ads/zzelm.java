package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzelm implements zzeqp {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzbzz zzb;
    private final boolean zzc;

    public zzelm(com.google.android.gms.ads.internal.client.zzw zzwVar, zzbzz zzbzzVar, boolean z) {
        this.zza = zzwVar;
        this.zzb = zzbzzVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeV)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeW)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                str = "p";
            } else if (i != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
