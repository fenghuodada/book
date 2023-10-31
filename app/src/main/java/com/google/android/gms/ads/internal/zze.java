package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import com.google.android.gms.internal.ads.zzfwc;
import com.unity3d.ads.metadata.MediationMetaData;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzbzz zzbzzVar, String str, @Nullable Runnable runnable, zzfft zzfftVar) {
        zzb(context, zzbzzVar, true, null, str, null, runnable, zzfftVar);
    }

    @VisibleForTesting
    public final void zzb(Context context, zzbzz zzbzzVar, boolean z, @Nullable zzbyw zzbywVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfft zzfftVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzbzt.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbywVar != null) {
            if (zzt.zzB().currentTimeMillis() - zzbywVar.zza() <= ((Long) zzba.zzc().zzb(zzbbk.zzdN)).longValue() && zzbywVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzbzt.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzbzt.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            final zzfff zza = zzffe.zza(context, 4);
            zza.zzh();
            zzbmy zza2 = zzt.zzf().zza(this.zza, zzbzzVar, zzfftVar);
            zzbms zzbmsVar = zzbmv.zza;
            zzbmo zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbmsVar, zzbmsVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(AdColonyAdapterUtils.KEY_APP_ID, str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbbc zzbbcVar = zzbbk.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
                jSONObject.put("js", zzbzzVar.zza);
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put(MediationMetaData.KEY_VERSION, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfwb zzb = zza3.zzb(jSONObject);
                zzfuy zzfuyVar = new zzfuy() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        zzfft zzfftVar2 = zzfft.this;
                        zzfff zzfffVar = zza;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        zzfffVar.zzf(optBoolean);
                        zzfftVar2.zzb(zzfffVar.zzl());
                        return zzfvr.zzh(null);
                    }
                };
                zzfwc zzfwcVar = zzcag.zzf;
                zzfwb zzm = zzfvr.zzm(zzb, zzfuyVar, zzfwcVar);
                if (runnable != null) {
                    zzb.zzc(runnable, zzfwcVar);
                }
                zzcaj.zza(zzm, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                zzbzt.zzh("Error requesting application settings", e);
                zza.zzg(e);
                zza.zzf(false);
                zzfftVar.zzb(zza.zzl());
            }
        }
    }

    public final void zzc(Context context, zzbzz zzbzzVar, String str, zzbyw zzbywVar, zzfft zzfftVar) {
        zzb(context, zzbzzVar, false, zzbywVar, zzbywVar != null ? zzbywVar.zzb() : null, str, null, zzfftVar);
    }
}
