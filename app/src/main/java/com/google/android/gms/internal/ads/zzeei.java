package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeei implements zzebx {
    private final zzdnx zza;

    public zzeei(zzdnx zzdnxVar) {
        this.zza = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final zzeby zza(String str, JSONObject jSONObject) throws zzfaf {
        return new zzeby(this.zza.zzc(str, jSONObject), new zzedr(), str);
    }
}
