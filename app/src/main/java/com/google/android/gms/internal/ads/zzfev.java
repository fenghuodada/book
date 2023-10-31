package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfev {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfev(Context context, zzbzz zzbzzVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzbzzVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzp());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzA(this.zza) ? "0" : "1");
        zzbbc zzbbcVar = zzbbk.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgF)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjK)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzx(this.zza) ? "1" : "0");
        }
    }
}
