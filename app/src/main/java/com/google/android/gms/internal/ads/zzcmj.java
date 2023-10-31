package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcmj {
    private final Map zza;
    private final Map zzb;

    public zzcmj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzezr zzezrVar) throws Exception {
        for (zzezp zzezpVar : zzezrVar.zzb.zzc) {
            if (this.zza.containsKey(zzezpVar.zza)) {
                ((zzcmm) this.zza.get(zzezpVar.zza)).zza(zzezpVar.zzb);
            } else if (this.zzb.containsKey(zzezpVar.zza)) {
                zzcml zzcmlVar = (zzcml) this.zzb.get(zzezpVar.zza);
                JSONObject jSONObject = zzezpVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcmlVar.zza(hashMap);
            }
        }
    }
}
