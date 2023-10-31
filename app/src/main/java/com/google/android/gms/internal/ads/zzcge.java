package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class zzcge extends zzcfi {
    public zzcge(zzcfb zzcfbVar, zzawx zzawxVar, boolean z) {
        super(zzcfbVar, zzawxVar, z);
    }

    @Nullable
    public final WebResourceResponse zzN(WebView webView, String str, @Nullable Map map) {
        if (!(webView instanceof zzcfb)) {
            zzbzt.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfb zzcfbVar = (zzcfb) webView;
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            zzbwuVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcfbVar.zzN() != null) {
            zzcfbVar.zzN().zzE();
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzcfbVar.zzO().zzi() ? zzbbk.zzP : zzcfbVar.zzaA() ? zzbbk.zzO : zzbbk.zzN);
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzt(zzcfbVar.getContext(), zzcfbVar.zzn().zza, str2);
    }
}
