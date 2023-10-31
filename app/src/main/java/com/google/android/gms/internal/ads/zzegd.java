package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzegd implements zzebx {
    private final Map zza = new HashMap();
    private final zzdnx zzb;

    public zzegd(zzdnx zzdnxVar) {
        this.zzb = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final zzeby zza(String str, JSONObject jSONObject) throws zzfaf {
        zzeby zzebyVar;
        synchronized (this) {
            zzebyVar = (zzeby) this.zza.get(str);
            if (zzebyVar == null) {
                zzebyVar = new zzeby(this.zzb.zzc(str, jSONObject), new zzeds(), str);
                this.zza.put(str, zzebyVar);
            }
        }
        return zzebyVar;
    }
}
