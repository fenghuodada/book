package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.VungleApiClient;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes.dex */
public final class zzdpx {
    private final ConcurrentHashMap zza;
    private final zzbzg zzb;
    private final zzfaa zzc;
    private final String zzd;
    private final String zze;

    public zzdpx(zzdqh zzdqhVar, zzbzg zzbzgVar, zzfaa zzfaaVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdqhVar.zzc();
        this.zza = zzc;
        this.zzb = zzbzgVar;
        this.zzc = zzfaaVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgL)).booleanValue()) {
            int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfaaVar);
            int i = zze - 1;
            if (i == 0) {
                zzc.put("scar", "false");
                return;
            }
            zzc.put("se", i != 1 ? i != 2 ? i != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhk)).booleanValue()) {
                zzc.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfaaVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfaaVar.zzd)));
        }
    }

    private final void zzd(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzezr zzezrVar) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (!zzezrVar.zzb.zza.isEmpty()) {
            switch (((zzezf) zzezrVar.zzb.zza.get(0)).zzb) {
                case 1:
                    concurrentHashMap = this.zza;
                    str = "banner";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 2:
                    concurrentHashMap = this.zza;
                    str = "interstitial";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 3:
                    concurrentHashMap = this.zza;
                    str = "native_express";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 4:
                    concurrentHashMap = this.zza;
                    str = "native_advanced";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 5:
                    concurrentHashMap = this.zza;
                    str = "rewarded";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzk() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.zza;
                    str = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
            }
        }
        zzd("gqi", zzezrVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
