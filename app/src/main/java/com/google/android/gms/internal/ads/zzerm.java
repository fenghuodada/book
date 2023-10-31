package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzerm implements zzeqp {
    private final String zza;

    public zzerm(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
