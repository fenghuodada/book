package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfgq {
    private final zzfgx zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    @Nullable
    private final String zzf;
    private final zzfgr zzg;

    private zzfgq(zzfgx zzfgxVar, WebView webView, String str, List list, @Nullable String str2, String str3, zzfgr zzfgrVar) {
        this.zza = zzfgxVar;
        this.zzb = webView;
        this.zzg = zzfgrVar;
        this.zzf = str2;
    }

    public static zzfgq zzb(zzfgx zzfgxVar, WebView webView, @Nullable String str, String str2) {
        return new zzfgq(zzfgxVar, webView, null, null, str, "", zzfgr.HTML);
    }

    public static zzfgq zzc(zzfgx zzfgxVar, WebView webView, @Nullable String str, String str2) {
        return new zzfgq(zzfgxVar, webView, null, null, str, "", zzfgr.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfgr zzd() {
        return this.zzg;
    }

    public final zzfgx zze() {
        return this.zza;
    }

    @Nullable
    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
