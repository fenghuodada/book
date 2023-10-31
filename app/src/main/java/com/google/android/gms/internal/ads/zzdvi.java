package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.warren.VungleApiClient;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdvi {
    private final zzcgw zza;
    private final Context zzb;
    private final zzbzz zzc;
    private final zzfaa zzd;
    private final Executor zze;
    private final String zzf;
    private final zzffq zzg;
    private final zzfam zzh;
    private final zzdpx zzi;

    public zzdvi(zzcgw zzcgwVar, Context context, zzbzz zzbzzVar, zzfaa zzfaaVar, Executor executor, String str, zzffq zzffqVar, zzdpx zzdpxVar) {
        this.zza = zzcgwVar;
        this.zzb = context;
        this.zzc = zzbzzVar;
        this.zzd = zzfaaVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzffqVar;
        this.zzh = zzcgwVar.zzv();
        this.zzi = zzdpxVar;
    }

    private final zzfwb zzc(final String str, final String str2) {
        zzfff zza = zzffe.zza(this.zzb, 11);
        zza.zzh();
        zzbmy zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbms zzbmsVar = zzbmv.zza;
        final zzbmo zza3 = zza2.zza("google.afma.response.normalize", zzbmsVar, zzbmsVar);
        zzfwb zzm = zzfvr.zzm(zzfvr.zzm(zzfvr.zzm(zzfvr.zzh(""), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdvf
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfvr.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdvg
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzbmo.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdvh
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdvi.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzffp.zza(zzm, this.zzg, zza);
        return zzm;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && VungleApiClient.ConnectionTypeDetail.UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzbzt.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfwb zza() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvi.zza():com.google.android.gms.internal.ads.zzfwb");
    }

    public final /* synthetic */ zzfwb zzb(JSONObject jSONObject) throws Exception {
        return zzfvr.zzh(new zzezr(new zzezo(this.zzd), zzezq.zza(new StringReader(jSONObject.toString()))));
    }
}
