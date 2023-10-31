package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzetz implements zzeqp {
    private final String zza;

    public zzetz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e) {
            zzbzt.zzk("Failed putting trustless token.", e);
        }
    }
}
