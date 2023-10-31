package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdrf {
    @Nullable
    private Long zza;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private Integer zzd;
    @Nullable
    private String zze;
    @Nullable
    private Integer zzf;

    public /* synthetic */ zzdrf(String str, zzdre zzdreVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdrf zzdrfVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjb);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdrfVar.zza);
            jSONObject.put("eventCategory", zzdrfVar.zzb);
            jSONObject.putOpt("event", zzdrfVar.zzc);
            jSONObject.putOpt("errorCode", zzdrfVar.zzd);
            jSONObject.putOpt("rewardType", zzdrfVar.zze);
            jSONObject.putOpt("rewardAmount", zzdrfVar.zzf);
        } catch (JSONException unused) {
            zzbzt.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
