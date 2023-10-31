package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeib {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    @GuardedBy("this")
    private final Map zzb = new HashMap();
    @GuardedBy("this")
    private final Map zzc = new HashMap();
    private final Executor zzd;
    private JSONObject zze;

    public zzeib(Executor executor) {
        this.zzd = executor;
    }

    private final synchronized List zzg(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle zzl = zzl(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            zzf(str2);
            if (((zzeid) this.zza.get(str2)) != null) {
                arrayList.add(new zzeid(str2, str, zzl));
            }
        }
        return arrayList;
    }

    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        zzj();
        zzk();
    }

    private final synchronized void zzi(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.zzc.put(str, map);
        List list2 = (List) map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    private final synchronized void zzj() {
        JSONArray optJSONArray;
        JSONObject zzf = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzf();
        if (zzf != null) {
            try {
                JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                this.zze = zzf.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjs)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(zzg(optJSONArray.getJSONObject(i2), optString));
                            }
                        }
                        zzi(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized void zzk() {
        if (!((Boolean) zzbdj.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbF)).booleanValue()) {
                JSONObject zzf = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzf();
                if (zzf == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle zzl = zzl(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeif(optString, optBoolean2, optBoolean, zzl));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle zzl(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                return zzfru.zzd();
            }
            List<zzeid> list = (List) map.get(str2);
            if (list == null) {
                String zza = zzdoe.zza(this.zze, str2, str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjs)).booleanValue()) {
                    zza = zza.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(zza);
            }
            if (list == null) {
                return zzfru.zzd();
            }
            HashMap hashMap = new HashMap();
            for (zzeid zzeidVar : list) {
                String str3 = zzeidVar.zza;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(zzeidVar.zzc);
            }
            return zzfru.zzc(hashMap);
        }
        return zzfru.zzd();
    }

    public final synchronized Map zzb() {
        return zzfru.zzc(this.zzb);
    }

    public final void zzd() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehz
            @Override // java.lang.Runnable
            public final void run() {
                zzeib.this.zze();
            }
        });
        this.zzd.execute(new zzeia(this));
    }

    public final /* synthetic */ void zze() {
        this.zzd.execute(new zzeia(this));
    }

    public final synchronized void zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.zza.containsKey(str)) {
            return;
        }
        this.zza.put(str, new zzeid(str, "", new Bundle()));
    }
}
