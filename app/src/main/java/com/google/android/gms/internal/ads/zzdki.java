package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdki {
    private final Executor zza;
    private final zzdkd zzb;

    public zzdki(Executor executor, zzdkd zzdkdVar) {
        this.zza = executor;
        this.zzb = zzdkdVar;
    }

    public final zzfwb zza(JSONObject jSONObject, String str) {
        final String optString;
        zzfwb zzl;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfvr.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            zzdkh zzdkhVar = null;
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    zzdkhVar = new zzdkh(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    zzl = zzfvr.zzl(this.zzb.zze(optJSONObject, "image_value"), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdkf
                        @Override // com.google.android.gms.internal.ads.zzfon
                        public final Object apply(Object obj) {
                            return new zzdkh(optString, (zzbec) obj);
                        }
                    }, this.zza);
                    arrayList.add(zzl);
                }
            }
            zzl = zzfvr.zzh(zzdkhVar);
            arrayList.add(zzl);
        }
        return zzfvr.zzl(zzfvr.zzd(arrayList), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdkh zzdkhVar2 : (List) obj) {
                    if (zzdkhVar2 != null) {
                        arrayList2.add(zzdkhVar2);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
