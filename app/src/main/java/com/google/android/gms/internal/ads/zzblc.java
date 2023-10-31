package com.google.android.gms.internal.ads;

import com.adcolony.sdk.C2362x3;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zzblc {
    public static void zza(zzbld zzbldVar, String str, Map map) {
        try {
            zzbldVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzbzt.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbld zzbldVar, String str, JSONObject jSONObject) {
        StringBuilder m9460b = C2362x3.m9460b("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzbzt.zze("Dispatching AFMA event: ".concat(m9460b.toString()));
        zzbldVar.zza(m9460b.toString());
    }

    public static void zzc(zzbld zzbldVar, String str, String str2) {
        zzbldVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbld zzbldVar, String str, JSONObject jSONObject) {
        zzbldVar.zzb(str, jSONObject.toString());
    }
}
