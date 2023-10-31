package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdyt extends zzbtv {
    private final Context zza;
    private final zzery zzb;
    private final zzerw zzc;
    private final zzdzb zzd;
    private final zzfwc zze;
    private final zzdyy zzf;
    private final zzbus zzg;

    public zzdyt(Context context, zzery zzeryVar, zzerw zzerwVar, zzdyy zzdyyVar, zzdzb zzdzbVar, zzfwc zzfwcVar, zzbus zzbusVar) {
        this.zza = context;
        this.zzb = zzeryVar;
        this.zzc = zzerwVar;
        this.zzf = zzdyyVar;
        this.zzd = zzdzbVar;
        this.zze = zzfwcVar;
        this.zzg = zzbusVar;
    }

    private final void zzc(zzfwb zzfwbVar, zzbtz zzbtzVar) {
        zzfvr.zzq(zzfvr.zzm(zzfvi.zzv(zzfwbVar), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfvr.zzh(zzfaz.zza((InputStream) obj));
            }
        }, zzcag.zza), new zzdys(this, zzbtzVar), zzcag.zzf);
    }

    public final zzfwb zzb(zzbto zzbtoVar, int i) {
        zzfwb zzh;
        String str = zzbtoVar.zza;
        int i2 = zzbtoVar.zzb;
        Bundle bundle = zzbtoVar.zzc;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        final zzdyv zzdyvVar = new zzdyv(str, i2, hashMap, zzbtoVar.zzd, "", zzbtoVar.zze);
        zzerw zzerwVar = this.zzc;
        zzerwVar.zza(new zzetd(zzbtoVar));
        zzerx zzb = zzerwVar.zzb();
        if (zzdyvVar.zzf) {
            String str3 = zzbtoVar.zza;
            String str4 = (String) zzbdk.zzc.zze();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str5 : zzfpm.zzc(zzfok.zzc(';')).zzd(str4)) {
                        if (host.endsWith(str5)) {
                            zzh = zzfvr.zzl(zzb.zza().zza(new JSONObject()), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdyr
                                @Override // com.google.android.gms.internal.ads.zzfon
                                public final Object apply(Object obj) {
                                    zzdyv zzdyvVar2 = zzdyv.this;
                                    zzdzb.zza(zzdyvVar2.zzc, (JSONObject) obj);
                                    return zzdyvVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzfvr.zzh(zzdyvVar);
        zzfed zzb2 = zzb.zzb();
        return zzfvr.zzm(zzb2.zzb(zzfdx.HTTP, zzh).zze(new zzdyx(this.zza, "", this.zzg, i)).zza(), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzdyw zzdywVar = (zzdyw) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzdywVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str6 : zzdywVar.zzb.keySet()) {
                        if (str6 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str7 : (List) zzdywVar.zzb.get(str6)) {
                                if (str7 != null) {
                                    jSONArray.put(str7);
                                }
                            }
                            jSONObject2.put(str6, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzdywVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzdywVar.zzd);
                    return zzfvr.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    zzbzt.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(zzbto zzbtoVar, zzbtz zzbtzVar) {
        zzc(zzb(zzbtoVar, Binder.getCallingUid()), zzbtzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzf(zzbtk zzbtkVar, zzbtz zzbtzVar) {
        int callingUid = Binder.getCallingUid();
        zzery zzeryVar = this.zzb;
        zzeryVar.zza(new zzern(zzbtkVar, callingUid));
        final zzerz zzb = zzeryVar.zzb();
        zzfed zzb2 = zzb.zzb();
        zzfdi zza = zzb2.zzb(zzfdx.GMS_SIGNALS, zzfvr.zzi()).zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyq
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Void r2 = (Void) obj;
                return zzerz.this.zza().zza(new JSONObject());
            }
        }).zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzdyp
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyo
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfvr.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbtzVar);
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            final zzdzb zzdzbVar = this.zzd;
            zzdzbVar.getClass();
            zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdym
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzb.this.zzb();
                }
            }, this.zze);
        }
    }
}
