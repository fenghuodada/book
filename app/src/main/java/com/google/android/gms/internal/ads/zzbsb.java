package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbsb {
    public final boolean zza;
    public final String zzb;

    public zzbsb(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    @Nullable
    public static zzbsb zza(JSONObject jSONObject) {
        return new zzbsb(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
