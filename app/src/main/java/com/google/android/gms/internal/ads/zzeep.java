package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeep implements zzeej {
    private final zzdfm zza;
    private final zzfwc zzb;
    private final zzdjq zzc;
    private final zzfaw zzd;
    private final zzdmf zze;

    public zzeep(zzdfm zzdfmVar, zzfwc zzfwcVar, zzdjq zzdjqVar, zzfaw zzfawVar, zzdmf zzdmfVar) {
        this.zza = zzdfmVar;
        this.zzb = zzfwcVar;
        this.zzc = zzdjqVar;
        this.zzd = zzfawVar;
        this.zze = zzdmfVar;
    }

    private final zzfwb zzg(final zzezr zzezrVar, final zzezf zzezfVar, final JSONObject jSONObject) {
        final zzfwb zza = this.zzd.zza();
        final zzfwb zza2 = this.zzc.zza(zzezrVar, zzezfVar, jSONObject);
        return zzfvr.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeep.this.zzc(zza2, zza, zzezrVar, zzezfVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        return zzfvr.zzm(zzfvr.zzm(this.zzd.zza(), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzeep.this.zze(zzezfVar, (zzdlz) obj);
            }
        }, this.zzb), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzeep.this.zzf(zzezrVar, zzezfVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        zzezk zzezkVar = zzezfVar.zzt;
        return (zzezkVar == null || zzezkVar.zzc == null) ? false : true;
    }

    public final /* synthetic */ zzdgx zzc(zzfwb zzfwbVar, zzfwb zzfwbVar2, zzezr zzezrVar, zzezf zzezfVar, JSONObject jSONObject) throws Exception {
        zzdhc zzdhcVar = (zzdhc) zzfwbVar.get();
        zzdlz zzdlzVar = (zzdlz) zzfwbVar2.get();
        zzdhd zzd = this.zza.zzd(new zzcru(zzezrVar, zzezfVar, null), new zzdho(zzdhcVar), new zzdgb(jSONObject, zzdlzVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdlzVar);
        zzd.zzg().zza(zzdhcVar.zzr());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    public final /* synthetic */ zzfwb zzd(zzdlz zzdlzVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfvr.zzh(zzdlzVar));
        if (jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            return zzfvr.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbmn("process json failed");
    }

    public final /* synthetic */ zzfwb zze(zzezf zzezfVar, final zzdlz zzdlzVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzia)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzezfVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfvr.zzm(zzdlzVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzeep.this.zzd(zzdlzVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfwb zzf(zzezr zzezrVar, zzezf zzezfVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfvr.zzg(new zzdtz(3));
        }
        int i = 0;
        if (zzezrVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzezrVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzezrVar.zza.zza.zzk);
            while (i < zzezrVar.zza.zza.zzk) {
                arrayList.add(i < length ? zzg(zzezrVar, zzezfVar, jSONArray.getJSONObject(i)) : zzfvr.zzg(new zzdtz(3)));
                i++;
            }
            return zzfvr.zzh(arrayList);
        }
        return zzfvr.zzl(zzg(zzezrVar, zzezfVar, jSONArray.getJSONObject(0)), new zzfon() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfvr.zzh((zzdgx) obj));
            }
        }, this.zzb);
    }
}
