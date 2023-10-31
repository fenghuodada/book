package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaqq zzc;
    private final int zzd;
    private final zzdqh zze;
    private final boolean zzf;
    private final zzfwc zzg = zzcag.zze;
    private final zzfgj zzh;

    public TaggingLibraryJsInterface(WebView webView, zzaqq zzaqqVar, zzdqh zzdqhVar, zzfgj zzfgjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaqqVar;
        this.zze = zzdqhVar;
        zzbbk.zza(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbbk.zziS)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbbk.zziT)).booleanValue();
        this.zzh = zzfgjVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            zzbzt.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            zzbzt.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcag.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbzt.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzar zzarVar = new zzar(this, uuid);
        if (((Boolean) zzba.zzc().zzb(zzbbk.zziV)).booleanValue()) {
            this.zzg.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzb(bundle, zzarVar);
                }
            });
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzarVar);
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            zzbzt.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzbzt.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcag.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbzt.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zziX)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzc(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            i4 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            if (i4 != 0) {
                int i7 = 1;
                if (i4 != 1) {
                    i7 = 2;
                    if (i4 != 2) {
                        i7 = 3;
                        i6 = i4 != 3 ? -1 : 0;
                    }
                }
                i5 = i7;
                this.zzc.zzd(MotionEvent.obtain(0L, i3, i5, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.zzc.zzd(MotionEvent.obtain(0L, i3, i5, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e2) {
            e = e2;
            zzbzt.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e3) {
            e = e3;
            zzbzt.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i5 = i6;
    }

    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb != null ? zzb.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzc(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzc.zza(parse, this.zza, this.zzb, null);
        } catch (zzaqr e) {
            zzbzt.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(parse.toString(), null);
    }
}
