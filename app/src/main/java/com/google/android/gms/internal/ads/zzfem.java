package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.VungleApiClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfem {
    private final HashMap zza;
    private final zzfes zzb;

    private zzfem() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfes(com.google.android.gms.ads.internal.zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static zzfem zzb(String str) {
        zzfem zzfemVar = new zzfem();
        zzfemVar.zza.put("action", str);
        return zzfemVar;
    }

    public static zzfem zzc(String str) {
        zzfem zzfemVar = new zzfem();
        zzfemVar.zza.put("request_id", str);
        return zzfemVar;
    }

    public final zzfem zza(@NonNull String str, @NonNull String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfem zzd(@NonNull String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfem zze(@NonNull String str, @NonNull String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfem zzf(zzezf zzezfVar) {
        this.zza.put("aai", zzezfVar.zzx);
        return this;
    }

    public final zzfem zzg(zzezi zzeziVar) {
        if (!TextUtils.isEmpty(zzeziVar.zzb)) {
            this.zza.put("gqi", zzeziVar.zzb);
        }
        return this;
    }

    public final zzfem zzh(zzezr zzezrVar, @Nullable zzbzg zzbzgVar) {
        HashMap hashMap;
        String str;
        zzezq zzezqVar = zzezrVar.zzb;
        zzg(zzezqVar.zzb);
        if (!zzezqVar.zza.isEmpty()) {
            int i = ((zzezf) zzezqVar.zza.get(0)).zzb;
            String str2 = FirebaseAnalytics.Param.AD_FORMAT;
            switch (i) {
                case 1:
                    hashMap = this.zza;
                    str = "banner";
                    hashMap.put(str2, str);
                    break;
                case 2:
                    hashMap = this.zza;
                    str = "interstitial";
                    hashMap.put(str2, str);
                    break;
                case 3:
                    hashMap = this.zza;
                    str = "native_express";
                    hashMap.put(str2, str);
                    break;
                case 4:
                    hashMap = this.zza;
                    str = "native_advanced";
                    hashMap.put(str2, str);
                    break;
                case 5:
                    hashMap = this.zza;
                    str = "rewarded";
                    hashMap.put(str2, str);
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzbzgVar != null) {
                        hashMap = this.zza;
                        str = true != zzbzgVar.zzk() ? "0" : "1";
                        str2 = "as";
                        hashMap.put(str2, str);
                        break;
                    }
                    break;
                default:
                    hashMap = this.zza;
                    str = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
                    hashMap.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final zzfem zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfer zzferVar : this.zzb.zza()) {
            hashMap.put(zzferVar.zza, zzferVar.zzb);
        }
        return hashMap;
    }
}
