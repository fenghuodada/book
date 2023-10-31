package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzbxz {
    @VisibleForTesting
    @GuardedBy("ScionComponent.class")
    static zzbxz zza;

    public static synchronized zzbxz zzd(Context context) {
        synchronized (zzbxz.class) {
            zzbxz zzbxzVar = zza;
            if (zzbxzVar != null) {
                return zzbxzVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbbk.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzbxd zzbxdVar = new zzbxd(null);
            zzbxdVar.zzb(applicationContext);
            zzbxdVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzbxdVar.zza(zzh);
            zzbxdVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzbxz zze = zzbxdVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbyd zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzar)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzat));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        zzc.zzc(str);
                    }
                    zzc.zzd(new zzbyb(zzc, hashMap));
                } catch (JSONException e) {
                    zzbzt.zzf("Failed to parse listening list", e);
                }
            }
            return zza;
        }
    }

    public abstract zzbww zza();

    public abstract zzbxa zzb();

    public abstract zzbyd zzc();
}
