package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzfhp {
    private zzfin zza;
    private long zzb;
    private int zzc;

    public zzfhp() {
        zzb();
        this.zza = new zzfin(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzb || this.zzc == 3) {
            return;
        }
        this.zzc = 3;
        zzfhi.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfhi.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfgs zzfgsVar, zzfgq zzfgqVar) {
        zzg(zzfgsVar, zzfgqVar, null);
    }

    public final void zzg(zzfgs zzfgsVar, zzfgq zzfgqVar, JSONObject jSONObject) {
        String zzh = zzfgsVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfht.zze(jSONObject2, "environment", "app");
        zzfht.zze(jSONObject2, "adSessionType", zzfgqVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfht.zze(jSONObject3, "deviceType", str + "; " + str2);
        zzfht.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfht.zze(jSONObject3, "os", "Android");
        zzfht.zze(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfht.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfht.zze(jSONObject4, "partnerName", zzfgqVar.zze().zzb());
        zzfht.zze(jSONObject4, "partnerVersion", zzfgqVar.zze().zzc());
        zzfht.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfht.zze(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        zzfht.zze(jSONObject5, "appId", zzfhg.zzb().zza().getApplicationContext().getPackageName());
        zzfht.zze(jSONObject2, "app", jSONObject5);
        if (zzfgqVar.zzf() != null) {
            zzfht.zze(jSONObject2, "contentUrl", zzfgqVar.zzf());
        }
        zzfht.zze(jSONObject2, "customReferenceData", zzfgqVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfgqVar.zzh().iterator();
        if (it.hasNext()) {
            zzfgy zzfgyVar = (zzfgy) it.next();
            throw null;
        } else {
            zzfhi.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        }
    }

    public final void zzh(float f) {
        zzfhi.zza().zze(zza(), f);
    }

    public final void zzi(WebView webView) {
        this.zza = new zzfin(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != 0;
    }
}
