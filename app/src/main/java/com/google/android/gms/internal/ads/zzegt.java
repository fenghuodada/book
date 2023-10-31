package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzegt implements zzebx {
    private final zzehx zza;

    public zzegt(zzehx zzehxVar) {
        this.zza = zzehxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final zzeby zza(String str, JSONObject jSONObject) throws zzfaf {
        zzbpv zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzeby(zza, new zzedr(), str);
    }
}
