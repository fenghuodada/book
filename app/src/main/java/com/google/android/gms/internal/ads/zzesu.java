package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzesu implements zzeqq {
    private final JSONObject zza;

    public zzesu(Context context) {
        this.zza = zzbuq.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzh(new zzeqp() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                zzesu.this.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
