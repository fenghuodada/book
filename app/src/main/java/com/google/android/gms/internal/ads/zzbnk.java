package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbnk implements zzfuy {
    private final zzbmq zza;
    private final zzbmr zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfwb zzd;

    public zzbnk(zzfwb zzfwbVar, String str, zzbmr zzbmrVar, zzbmq zzbmqVar) {
        this.zzd = zzfwbVar;
        this.zzb = zzbmrVar;
        this.zza = zzbmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final zzfwb zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfwb zzb(final Object obj) {
        return zzfvr.zzm(this.zzd, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzbni
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj2) {
                return zzbnk.this.zzc(obj, (zzbml) obj2);
            }
        }, zzcag.zzf);
    }

    public final /* synthetic */ zzfwb zzc(Object obj, zzbml zzbmlVar) throws Exception {
        zzcal zzcalVar = new zzcal();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbih.zzo.zzc(uuid, new zzbnj(this, zzcalVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbmlVar.zzl(this.zzc, jSONObject);
        return zzcalVar;
    }
}
