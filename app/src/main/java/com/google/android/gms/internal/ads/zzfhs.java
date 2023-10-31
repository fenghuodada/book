package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfhs extends zzfhp {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfhs(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfhp
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfhr(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfhp
    public final void zzf(zzfgs zzfgsVar, zzfgq zzfgqVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfgqVar.zzi();
        for (String str : zzi.keySet()) {
            zzfht.zze(jSONObject, str, (zzfgy) zzi.get(str));
        }
        zzg(zzfgsVar, zzfgqVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfhp
    public final void zzj() {
        WebView webView = new WebView(zzfhg.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfgy zzfgyVar = (zzfgy) this.zzc.get((String) it.next());
        throw null;
    }
}
