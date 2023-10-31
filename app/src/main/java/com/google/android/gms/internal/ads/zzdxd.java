package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdxd {
    private final zzfwc zza;
    private final zzdwy zzb;
    private final zzfed zzc;

    public zzdxd(zzfwc zzfwcVar, zzdwy zzdwyVar, zzfed zzfedVar) {
        this.zza = zzfwcVar;
        this.zzb = zzdwyVar;
        this.zzc = zzfedVar;
    }

    public final zzfwb zza(final zzbug zzbugVar) {
        zzfdu zzb = this.zzc.zzb(zzfdx.GMS_SIGNALS, zzfvr.zzl(zzfvr.zzh(null), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzbug zzbugVar2 = zzbug.this;
                return new zzbtk(zzbugVar2.zzc, zzbugVar2.zzd, zzbugVar2.zzf, zzfpo.zzc(zzbugVar2.zza.getString("ms")), -1, zzbugVar2.zzh, zzbugVar2.zze, zzbugVar2.zzk, zzbugVar2.zzl);
            }
        }, this.zza));
        final zzdwy zzdwyVar = this.zzb;
        return zzfvr.zzl(zzb.zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdwy.this.zzb((zzbtk) obj);
            }
        }).zza(), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdxc
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbugVar.zza;
                if (bundle != null) {
                    try {
                        JSONObject zzh = com.google.android.gms.ads.internal.client.zzay.zzb().zzh(bundle);
                        try {
                            com.google.android.gms.ads.internal.client.zzay.zzb().zzk(jSONObject, zzh);
                            return jSONObject;
                        } catch (JSONException unused) {
                            return zzh;
                        }
                    } catch (JSONException unused2) {
                        return jSONObject;
                    }
                }
                return jSONObject;
            }
        }, this.zza);
    }
}
