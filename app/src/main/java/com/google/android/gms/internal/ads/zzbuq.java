package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbuq extends zzbur {
    private final Object zza = new Object();
    private final Context zzb;
    @Nullable
    private SharedPreferences zzc;
    private final zzbmo zzd;

    public zzbuq(Context context, zzbmo zzbmoVar) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbmoVar;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbzz.zza().zza);
            jSONObject.put("mf", zzbdd.zza.zze());
            jSONObject.put("cl", "533571732");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final zzfwb zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0L) < ((Long) zzbdd.zzb.zze()).longValue()) {
            return zzfvr.zzh(null);
        }
        return zzfvr.zzl(this.zzd.zzb(zzc(this.zzb)), new zzfon() { // from class: com.google.android.gms.internal.ads.zzbup
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzbuq.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcag.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        Context context = this.zzb;
        zzbbc zzbbcVar = zzbbk.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb();
        SharedPreferences.Editor edit = zzbbe.zza(context).edit();
        com.google.android.gms.ads.internal.client.zzba.zza();
        zzbcp zzbcpVar = zzbcu.zza;
        com.google.android.gms.ads.internal.client.zzba.zza().zze(edit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzba.zzb();
        edit.commit();
        this.zzc.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
