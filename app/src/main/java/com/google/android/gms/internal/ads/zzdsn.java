package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdsn implements zzcvl, zzcyd, zzcxa {
    private final zzdsz zza;
    private final String zzb;
    private final String zzc;
    private int zzd = 0;
    private zzdsm zze = zzdsm.AD_REQUESTED;
    private zzcvb zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private boolean zzk;

    public zzdsn(zzdsz zzdszVar, zzfaa zzfaaVar, String str) {
        this.zza = zzdszVar;
        this.zzc = str;
        this.zzb = zzfaaVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcvb zzcvbVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvbVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcvbVar.zzc());
        jSONObject.put("responseId", zzcvbVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziI)).booleanValue()) {
            String zzd = zzcvbVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzbzt.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzcvbVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziJ)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zzb().zzh(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zze = zzdsm.AD_LOAD_FAILED;
        this.zzg = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziN)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        if (!zzezrVar.zzb.zza.isEmpty()) {
            this.zzd = ((zzezf) zzezrVar.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzezrVar.zzb.zzb.zzk)) {
            this.zzh = zzezrVar.zzb.zzb.zzk;
        }
        if (TextUtils.isEmpty(zzezrVar.zzb.zzb.zzl)) {
            return;
        }
        this.zzi = zzezrVar.zzb.zzb.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziN)).booleanValue()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbD(zzcrf zzcrfVar) {
        this.zzf = zzcrfVar.zzl();
        this.zze = zzdsm.AD_LOADED;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziN)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzezf.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziN)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzj);
            if (this.zzj) {
                jSONObject2.put("shown", this.zzk);
            }
        }
        zzcvb zzcvbVar = this.zzf;
        if (zzcvbVar != null) {
            jSONObject = zzi(zzcvbVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcvb zzcvbVar2 = (zzcvb) iBinder;
                jSONObject3 = zzi(zzcvbVar2);
                if (zzcvbVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void zze() {
        this.zzj = true;
    }

    public final void zzf() {
        this.zzk = true;
    }

    public final boolean zzg() {
        return this.zze != zzdsm.AD_REQUESTED;
    }
}
