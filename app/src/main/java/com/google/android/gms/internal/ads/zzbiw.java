package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbiw implements zzbii {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbiv zzbivVar = (zzbiv) this.zzb.remove(str);
            if (zzbivVar == null) {
                zzbzt.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzbivVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzbivVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject2);
                    }
                    zzbivVar.zzb(jSONObject);
                } catch (JSONException e) {
                    zzbivVar.zza(e.getMessage());
                }
            }
        }
    }

    public final zzfwb zzb(zzblo zzbloVar, String str, JSONObject jSONObject) {
        zzcal zzcalVar = new zzcal();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbiu(this, zzcalVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookAdapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbloVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcalVar.zze(e);
        }
        return zzcalVar;
    }

    public final void zzc(String str, zzbiv zzbivVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbivVar);
        }
    }
}
