package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcmt implements zzcmm {
    private final zzdsz zza;

    public zzcmt(zzdsz zzdszVar) {
        this.zza = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmm
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziH)).booleanValue()) {
                this.zza.zzl(jSONObject);
            }
        }
    }
}
