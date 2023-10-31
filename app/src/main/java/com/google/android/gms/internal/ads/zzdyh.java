package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzdyh implements zzbmr {
    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdyi zzdyiVar = (zzdyi) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziK)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdyiVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzdyiVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzdyiVar.zzd.zzb());
        jSONObject2.put("signals", zzdyiVar.zzc);
        jSONObject3.put("body", zzdyiVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzdyiVar.zzb.zzb));
        jSONObject3.put("response_code", zzdyiVar.zzb.zza);
        jSONObject3.put("latency", zzdyiVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdyiVar.zzd.zzg());
        return jSONObject;
    }
}
