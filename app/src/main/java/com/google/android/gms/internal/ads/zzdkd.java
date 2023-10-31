package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdkd {
    private final Context zza;
    private final zzdjm zzb;
    private final zzaqq zzc;
    private final zzbzz zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzawx zzf;
    private final Executor zzg;
    private final zzbee zzh;
    private final zzdkv zzi;
    private final zzdnk zzj;
    private final ScheduledExecutorService zzk;
    private final zzdmf zzl;
    private final zzdqc zzm;
    private final zzfen zzn;
    private final zzfgj zzo;
    private final zzebc zzp;

    public zzdkd(Context context, zzdjm zzdjmVar, zzaqq zzaqqVar, zzbzz zzbzzVar, com.google.android.gms.ads.internal.zza zzaVar, zzawx zzawxVar, Executor executor, zzfaa zzfaaVar, zzdkv zzdkvVar, zzdnk zzdnkVar, ScheduledExecutorService scheduledExecutorService, zzdqc zzdqcVar, zzfen zzfenVar, zzfgj zzfgjVar, zzebc zzebcVar, zzdmf zzdmfVar) {
        this.zza = context;
        this.zzb = zzdjmVar;
        this.zzc = zzaqqVar;
        this.zzd = zzbzzVar;
        this.zze = zzaVar;
        this.zzf = zzawxVar;
        this.zzg = executor;
        this.zzh = zzfaaVar.zzi;
        this.zzi = zzdkvVar;
        this.zzj = zzdnkVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdqcVar;
        this.zzn = zzfenVar;
        this.zzo = zzfgjVar;
        this.zzp = zzebcVar;
        this.zzl = zzdmfVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfrr.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfrr.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfrr.zzj(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }

    private static zzfwb zzl(zzfwb zzfwbVar, Object obj) {
        return zzfvr.zzf(zzfwbVar, Exception.class, new zzfuy(null) { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzfvr.zzh(null);
            }
        }, zzcag.zzf);
    }

    private static zzfwb zzm(boolean z, final zzfwb zzfwbVar, Object obj) {
        return z ? zzfvr.zzm(zzfwbVar, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj2) {
                return obj2 != null ? zzfwb.this : zzfvr.zzg(new zzefn(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcag.zzf) : zzl(zzfwbVar, null);
    }

    private final zzfwb zzn(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfvr.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfvr.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfvr.zzh(new zzbec(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfvr.zzl(this.zzb.zzb(optString, optDouble, optBoolean), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                String str = optString;
                return new zzbec(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final zzfwb zzo(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfvr.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfvr.zzl(zzfvr.zzd(arrayList), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbec zzbecVar : (List) obj) {
                    if (zzbecVar != null) {
                        arrayList2.add(zzbecVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final zzfwb zzp(JSONObject jSONObject, zzezf zzezfVar, zzezi zzeziVar) {
        final zzfwb zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzezfVar, zzeziVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfvr.zzm(zzb, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzfwb zzfwbVar = zzfwb.this;
                zzcfb zzcfbVar = (zzcfb) obj;
                if (zzcfbVar == null || zzcfbVar.zzq() == null) {
                    throw new zzefn(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfwbVar;
            }
        }, zzcag.zzf);
    }

    @Nullable
    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzel zzr(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    public final /* synthetic */ zzbdz zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, AppIntroBaseFragmentKt.ARG_BG_COLOR);
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbdz(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ zzfwb zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzezf zzezfVar, zzezi zzeziVar, String str, String str2, Object obj) throws Exception {
        zzcfb zza = this.zzj.zza(zzqVar, zzezfVar, zzeziVar);
        final zzcak zza2 = zzcak.zza(zza);
        zzdmc zzb = this.zzl.zzb();
        zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdw)).booleanValue()) {
            zza.zzad("/getNativeAdViewSignals", zzbih.zzs);
        }
        zza.zzad("/getNativeClickMeta", zzbih.zzt);
        zza.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzcak zzcakVar = zzcak.this;
                if (z) {
                    zzcakVar.zzb();
                } else {
                    zzcakVar.zze(new zzefn(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfwb zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcfb zza = zzcfn.zza(this.zza, zzcgq.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzcak zza2 = zzcak.zza(zza);
        zza.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzcak.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeN)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final zzfwb zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfvr.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfvr.zzl(zzo(optJSONArray, false, true), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return zzdkd.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfwb zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfwb zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbee zzbeeVar = this.zzh;
        return zzo(optJSONArray, zzbeeVar.zzb, zzbeeVar.zzd);
    }

    public final zzfwb zzg(JSONObject jSONObject, String str, final zzezf zzezfVar, final zzezi zzeziVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjd)).booleanValue()) {
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return zzfvr.zzh(null);
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzfvr.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzfvr.zzh(null);
            }
            final zzfwb zzm = zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdjv
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzdkd.this.zzb(zzk, zzezfVar, zzeziVar, optString, optString2, obj);
                }
            }, zzcag.zze);
            return zzfvr.zzm(zzm, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdjw
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    zzfwb zzfwbVar = zzfwb.this;
                    if (((zzcfb) obj) != null) {
                        return zzfwbVar;
                    }
                    throw new zzefn(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcag.zzf);
        }
        return zzfvr.zzh(null);
    }

    public final zzfwb zzh(JSONObject jSONObject, zzezf zzezfVar, zzezi zzeziVar) {
        zzfwb zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("vast_xml");
                boolean z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjc)).booleanValue() && optJSONObject.has("html")) {
                    z = true;
                }
                if (TextUtils.isEmpty(optString)) {
                    if (!z) {
                        zzbzt.zzj("Required field 'vast_xml' or 'html' is missing");
                    }
                } else if (!z) {
                    zza = this.zzi.zza(optJSONObject);
                    return zzl(zzfvr.zzn(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdx)).intValue(), TimeUnit.SECONDS, this.zzk), null);
                }
                zza = zzp(optJSONObject, zzezfVar, zzeziVar);
                return zzl(zzfvr.zzn(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdx)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            return zzfvr.zzh(null);
        }
        return zzp(zzg, zzezfVar, zzeziVar);
    }
}
