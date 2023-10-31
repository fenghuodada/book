package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdwy {
    private final zzfwc zza;
    private final zzfwc zzb;
    private final zzdxq zzc;

    public zzdwy(zzfwc zzfwcVar, zzfwc zzfwcVar2, zzdxq zzdxqVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar2;
        this.zzc = zzdxqVar;
    }

    public final /* synthetic */ zzfwb zza(zzbtk zzbtkVar) throws Exception {
        return this.zzc.zza(zzbtkVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjR)).longValue());
    }

    public final zzfwb zzb(final zzbtk zzbtkVar) {
        String str = zzbtkVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfvr.zzm(zzfvr.zzf(zzfvi.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfvr.zzg(new zzdwc(1, "Ads signal service force local")) : zzfvr.zzf(zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzdwy.this.zza(zzbtkVar);
            }
        }, this.zza), ExecutionException.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return zzfvr.zzg(th);
            }
        }, this.zzb)), zzdwc.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdww
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzdwc zzdwcVar = (zzdwc) obj;
                return zzfvr.zzh(null);
            }
        }, this.zzb), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwx
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzJ(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return zzfvr.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
