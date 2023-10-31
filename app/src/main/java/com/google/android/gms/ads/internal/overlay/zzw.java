package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzfmr;
import com.google.android.gms.internal.ads.zzfms;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnd;
import com.google.android.gms.internal.ads.zzfnf;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfnh;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfoc;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzw {
    private zzfng zzf;
    @Nullable
    private zzcfb zzc = null;
    private boolean zze = false;
    @Nullable
    private String zza = null;
    @Nullable
    private zzfmt zzd = null;
    @Nullable
    private String zzb = null;

    private final zzfni zzl() {
        zzfnh zzc = zzfni.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjN)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(@Nullable zzcfb zzcfbVar, Context context) {
        this.zzc = zzcfbVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfmt zzfmtVar;
        if (!this.zze || (zzfmtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfmtVar.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
    }

    public final void zzc() {
        zzfmt zzfmtVar;
        if (!this.zze || (zzfmtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfmr zzc = zzfms.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjN)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        zzfmtVar.zzb(zzc.zzc(), this.zzf);
    }

    @VisibleForTesting
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    @VisibleForTesting
    public final void zze(final String str, final Map map) {
        zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.zzh(str, map);
            }
        });
    }

    @VisibleForTesting
    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfmt zzfmtVar;
        if (!this.zze || (zzfmtVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfmtVar.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcfb zzcfbVar = this.zzc;
        if (zzcfbVar != null) {
            zzcfbVar.zzd(str, map);
        }
    }

    @VisibleForTesting
    public final void zzi(zzfnf zzfnfVar) {
        if (!TextUtils.isEmpty(zzfnfVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbbk.zzjN)).booleanValue()) {
                this.zza = zzfnfVar.zzb();
            }
        }
        switch (zzfnfVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfnfVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(@Nullable zzcfb zzcfbVar, @Nullable zzfnd zzfndVar) {
        if (zzcfbVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcfbVar;
        if (!this.zze && !zzk(zzcfbVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzjN)).booleanValue()) {
            this.zzb = zzfndVar.zzg();
        }
        zzm();
        zzfmt zzfmtVar = this.zzd;
        if (zzfmtVar != null) {
            zzfmtVar.zzd(zzfndVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (zzfoc.zza(context)) {
            try {
                this.zzd = zzfmu.zza(context);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if (this.zzd == null) {
                this.zze = false;
                return false;
            }
            zzm();
            this.zze = true;
            return true;
        }
        return false;
    }
}
