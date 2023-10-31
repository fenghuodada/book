package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnv implements zzbmr {
    private final Context zza;
    private final zzatu zzb;
    private final PowerManager zzc;

    public zzcnv(Context context, zzatu zzatuVar) {
        this.zza = context;
        this.zzb = zzatuVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    /* renamed from: zza */
    public final JSONObject zzb(zzcny zzcnyVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzatx zzatxVar = zzcnyVar.zzf;
        if (zzatxVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() == null) {
            throw new JSONException("Active view Info cannot be null.");
        } else {
            boolean z = zzatxVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcnyVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnyVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzft)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzatxVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzatxVar.zzc.top).put("bottom", zzatxVar.zzc.bottom).put("left", zzatxVar.zzc.left).put("right", zzatxVar.zzc.right)).put("adBox", new JSONObject().put("top", zzatxVar.zzd.top).put("bottom", zzatxVar.zzd.bottom).put("left", zzatxVar.zzd.left).put("right", zzatxVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzatxVar.zze.top).put("bottom", zzatxVar.zze.bottom).put("left", zzatxVar.zze.left).put("right", zzatxVar.zze.right)).put("globalVisibleBoxVisible", zzatxVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzatxVar.zzg.top).put("bottom", zzatxVar.zzg.bottom).put("left", zzatxVar.zzg.left).put("right", zzatxVar.zzg.right)).put("localVisibleBoxVisible", zzatxVar.zzh).put("hitBox", new JSONObject().put("top", zzatxVar.zzi.top).put("bottom", zzatxVar.zzi.bottom).put("left", zzatxVar.zzi.left).put("right", zzatxVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnyVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbl)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzatxVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnyVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
