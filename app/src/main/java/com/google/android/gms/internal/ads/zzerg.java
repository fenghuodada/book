package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzerg implements zzeqp {
    @Nullable
    private final AdvertisingIdClient.Info zza;
    @Nullable
    private final String zzb;
    private final zzflw zzc;

    public zzerg(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzflw zzflwVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.zza.getId());
            zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            zzflw zzflwVar = this.zzc;
            if (zzflwVar.zzc()) {
                zzf.put("paidv1_id_android_3p", zzflwVar.zzb());
                zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
