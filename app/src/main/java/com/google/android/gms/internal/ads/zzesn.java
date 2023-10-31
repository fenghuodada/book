package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzesn implements zzeqp {
    private final String zza;

    public zzesn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            zzf.put("attok", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e);
        }
    }
}
