package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdfz implements zzdhk {
    private com.google.android.gms.ads.internal.client.zzcs zzA;
    private final Context zza;
    private final zzdhn zzb;
    private final JSONObject zzc;
    private final zzdlz zzd;
    private final zzdhc zze;
    private final zzaqq zzf;
    private final zzcwa zzg;
    private final zzcvg zzh;
    private final zzdcu zzi;
    private final zzezf zzj;
    private final zzbzz zzk;
    private final zzfaa zzl;
    private final zzcnz zzm;
    private final zzdig zzn;
    private final Clock zzo;
    private final zzdcq zzp;
    private final zzfgj zzq;
    private final zzffq zzr;
    private boolean zzt;
    private boolean zzs = false;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdfz(Context context, zzdhn zzdhnVar, JSONObject jSONObject, zzdlz zzdlzVar, zzdhc zzdhcVar, zzaqq zzaqqVar, zzcwa zzcwaVar, zzcvg zzcvgVar, zzdcu zzdcuVar, zzezf zzezfVar, zzbzz zzbzzVar, zzfaa zzfaaVar, zzcnz zzcnzVar, zzdig zzdigVar, Clock clock, zzdcq zzdcqVar, zzfgj zzfgjVar, zzffq zzffqVar) {
        this.zza = context;
        this.zzb = zzdhnVar;
        this.zzc = jSONObject;
        this.zzd = zzdlzVar;
        this.zze = zzdhcVar;
        this.zzf = zzaqqVar;
        this.zzg = zzcwaVar;
        this.zzh = zzcvgVar;
        this.zzi = zzdcuVar;
        this.zzj = zzezfVar;
        this.zzk = zzbzzVar;
        this.zzl = zzfaaVar;
        this.zzm = zzcnzVar;
        this.zzn = zzdigVar;
        this.zzo = clock;
        this.zzp = zzdcqVar;
        this.zzq = zzfgjVar;
        this.zzr = zzffqVar;
    }

    @Nullable
    private final String zzD(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z) {
        zzdlz zzdlzVar;
        String str2;
        zzbii zzdfuVar;
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdg)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzq.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzq.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhX)).booleanValue()) {
                zzdlzVar = this.zzd;
                str2 = "/clickRecorded";
                zzdfuVar = new zzdfw(this, null);
            } else {
                zzdlzVar = this.zzd;
                str2 = "/logScionEvent";
                zzdfuVar = new zzdfu(this, null);
            }
            zzdlzVar.zzi(str2, zzdfuVar);
            this.zzd.zzi("/nativeImpression", new zzdfy(this, null));
            zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            zzbzt.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzB() {
        return zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzC(Bundle bundle) {
        if (zzE("impression_reporting")) {
            return zzG(null, null, null, null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false);
        }
        zzbzt.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    @Nullable
    public final JSONObject zze(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e) {
            zzbzt.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    @Nullable
    public final JSONObject zzf(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e) {
            zzbzt.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzA;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzu) {
                return;
            }
            if (zzcwVar == null) {
                zzdhc zzdhcVar = this.zze;
                if (zzdhcVar.zzk() != null) {
                    this.zzu = true;
                    this.zzq.zzc(zzdhcVar.zzk().zzf(), this.zzr);
                    zzg();
                    return;
                }
            }
            this.zzu = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzr);
            zzg();
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String zzD = zzD(view, map);
        zzn(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdn)).booleanValue() ? view2 : view, zzg, zzd, zzf, zze, zzD, com.google.android.gms.ads.internal.util.zzbx.zzc(zzD, this.zza, this.zzx, this.zzw), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzm(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzbzt.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zzbzt.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false, false);
        }
    }

    @VisibleForTesting
    public final void zzn(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzz()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbee zzbeeVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbeeVar != null && zzbeeVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzG().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzz()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzbzt.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeo)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzib)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzic)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzbzt.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzo(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzv) {
                zzbzt.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzbzt.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String zzD = zzD(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbx.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        zzbzt.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                zzbzt.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcaj.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        String zzh;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdg)).booleanValue()) {
            try {
                zzh = this.zzf.zzc().zzh(this.zza, view, null);
            } catch (Exception unused) {
                zzbzt.zzg("Exception getting data.");
            }
            zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(this.zza, this.zzj));
        }
        zzh = null;
        zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(this.zza, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzr() {
        zzG(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzs(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.zzw = com.google.android.gms.ads.internal.util.zzbx.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzt(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzbzt.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzE("touch_reporting")) {
            zzbzt.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbzt.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdig zzdigVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdigVar);
        view.setClickable(true);
        zzdigVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzv() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzA = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzx(zzbgk zzbgkVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbgkVar);
        } else {
            zzbzt.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzk.zzc);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzz(@Nullable View view, @Nullable Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }
}
