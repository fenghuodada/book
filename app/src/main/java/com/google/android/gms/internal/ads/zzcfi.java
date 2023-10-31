package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import libv2ray.V2rayConfig;

@VisibleForTesting
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzcfi extends WebViewClient implements zzcgo {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    @Nullable
    protected zzbwu zza;
    private final zzcfb zzc;
    @Nullable
    private final zzawx zzd;
    private final HashMap zze;
    private final Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcgm zzi;
    private zzcgn zzj;
    private zzbhb zzk;
    private zzbhd zzl;
    private zzdcw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzz zzs;
    @Nullable
    private zzbqx zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbqs zzv;
    @Nullable
    private zzfgj zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcfi(zzcfb zzcfbVar, @Nullable zzawx zzawxVar, boolean z) {
        zzbqx zzbqxVar = new zzbqx(zzcfbVar, zzcfbVar.zzE(), new zzbau(zzcfbVar.getContext()));
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzd = zzawxVar;
        this.zzc = zzcfbVar;
        this.zzp = z;
        this.zzt = zzbqxVar;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfp)).split(",")));
    }

    @Nullable
    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaG)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                zzbzs zzbzsVar = new zzbzs(null);
                zzbzsVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzbzsVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    zzbzt.zzj("Protocol is null");
                    return zzN();
                } else if (!protocol.equals(V2rayConfig.HTTP) && !protocol.equals("https")) {
                    zzbzt.zzj("Unsupported scheme: " + protocol);
                    return zzN();
                } else {
                    zzbzt.zze("Redirecting to " + headerField);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith("charset")) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbii) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbwu zzbwuVar, final int i) {
        if (!zzbwuVar.zzi() || i <= 0) {
            return;
        }
        zzbwuVar.zzg(view);
        if (zzbwuVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfe
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zzo(view, zzbwuVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzS(boolean z, zzcfb zzcfbVar) {
        return (!z || zzcfbVar.zzO().zzi() || zzcfbVar.zzS().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzx = true;
            zzcgn zzcgnVar = this.zzj;
            if (zzcgnVar != null) {
                zzcgnVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcfb zzcfbVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcfbVar.zzay(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if (V2rayConfig.HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbwu zzbwuVar = this.zza;
                        if (zzbwuVar != null) {
                            zzbwuVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdcw zzdcwVar = this.zzm;
                    if (zzdcwVar != null) {
                        zzdcwVar.zzr();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzbzt.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzaqq zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcfb zzcfbVar = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcfbVar, zzcfbVar.zzi());
                    }
                } catch (zzaqr unused) {
                    zzbzt.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzu.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzA(zzcgm zzcgmVar) {
        this.zzi = zzcgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzB(int i, int i2) {
        zzbqs zzbqsVar = this.zzv;
        if (zzbqsVar != null) {
            zzbqsVar.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzG(zzcgn zzcgnVar) {
        this.zzj = zzcgnVar;
    }

    public final void zzH(String str, zzbii zzbiiVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbiiVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbii> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbii zzbiiVar : list) {
                if (predicate.apply(zzbiiVar)) {
                    arrayList.add(zzbiiVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzM(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbhb zzbhbVar, @Nullable com.google.android.gms.ads.internal.overlay.zzo zzoVar, @Nullable zzbhd zzbhdVar, @Nullable com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, @Nullable zzbik zzbikVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbqz zzbqzVar, @Nullable zzbwu zzbwuVar, @Nullable final zzebc zzebcVar, @Nullable final zzfgj zzfgjVar, @Nullable zzdqc zzdqcVar, @Nullable zzfen zzfenVar, @Nullable zzbja zzbjaVar, @Nullable final zzdcw zzdcwVar, @Nullable zzbiz zzbizVar, @Nullable zzbit zzbitVar) {
        zzbii zzbiiVar;
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbwuVar, null) : zzbVar;
        this.zzv = new zzbqs(this.zzc, zzbqzVar);
        this.zza = zzbwuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaO)).booleanValue()) {
            zzz("/adMetadata", new zzbha(zzbhbVar));
        }
        if (zzbhdVar != null) {
            zzz("/appEvent", new zzbhc(zzbhdVar));
        }
        zzz("/backButton", zzbih.zzj);
        zzz("/refresh", zzbih.zzk);
        zzz("/canOpenApp", zzbih.zzb);
        zzz("/canOpenURLs", zzbih.zza);
        zzz("/canOpenIntents", zzbih.zzc);
        zzz("/close", zzbih.zzd);
        zzz("/customClose", zzbih.zze);
        zzz("/instrument", zzbih.zzn);
        zzz("/delayPageLoaded", zzbih.zzp);
        zzz("/delayPageClosed", zzbih.zzq);
        zzz("/getLocationInfo", zzbih.zzr);
        zzz("/log", zzbih.zzg);
        zzz("/mraid", new zzbio(zzbVar2, this.zzv, zzbqzVar));
        zzbqx zzbqxVar = this.zzt;
        if (zzbqxVar != null) {
            zzz("/mraidLoaded", zzbqxVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbis(zzbVar2, this.zzv, zzebcVar, zzdqcVar, zzfenVar));
        zzz("/precache", new zzcdo());
        zzz("/touch", zzbih.zzi);
        zzz("/video", zzbih.zzl);
        zzz("/videoMeta", zzbih.zzm);
        if (zzebcVar == null || zzfgjVar == null) {
            zzz("/click", new zzbhj(zzdcwVar));
            zzbiiVar = zzbih.zzf;
        } else {
            zzz("/click", new zzbii() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzbii
                public final void zza(Object obj, Map map) {
                    zzdcw zzdcwVar2 = zzdcw.this;
                    zzfgj zzfgjVar2 = zzfgjVar;
                    zzebc zzebcVar2 = zzebcVar;
                    zzcfb zzcfbVar = (zzcfb) obj;
                    zzbih.zzc(map, zzdcwVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbzt.zzj("URL missing from click GMSG.");
                    } else {
                        zzfvr.zzq(zzbih.zza(zzcfbVar, str), new zzfai(zzcfbVar, zzfgjVar2, zzebcVar2), zzcag.zza);
                    }
                }
            });
            zzbiiVar = new zzbii() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzbii
                public final void zza(Object obj, Map map) {
                    zzfgj zzfgjVar2 = zzfgj.this;
                    zzebc zzebcVar2 = zzebcVar;
                    zzces zzcesVar = (zzces) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbzt.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcesVar.zzD().zzaj) {
                        zzebcVar2.zzd(new zzebe(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcfy) zzcesVar).zzP().zzb, str, 2));
                    } else {
                        zzfgjVar2.zzc(str, null);
                    }
                }
            };
        }
        zzz("/httpTrack", zzbiiVar);
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbin(this.zzc.getContext()));
        }
        if (zzbikVar != null) {
            zzz("/setInterstitialProperties", new zzbij(zzbikVar));
        }
        if (zzbjaVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbjaVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziK)).booleanValue() && zzbizVar != null) {
            zzz("/shareSheet", zzbizVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziN)).booleanValue() && zzbitVar != null) {
            zzz("/inspectorOutOfContextTest", zzbitVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjO)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbih.zzu);
            zzz("/presentPlayStoreOverlay", zzbih.zzv);
            zzz("/expandPlayStoreOverlay", zzbih.zzw);
            zzz("/collapsePlayStoreOverlay", zzbih.zzx);
            zzz("/closePlayStoreOverlay", zzbih.zzy);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcR)).booleanValue()) {
                zzz("/setPAIDPersonalizationEnabled", zzbih.zzA);
                zzz("/resetPAID", zzbih.zzz);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbhbVar;
        this.zzl = zzbhdVar;
        this.zzs = zzzVar;
        this.zzu = zzbVar3;
        this.zzm = zzdcwVar;
        this.zzn = z;
        this.zzw = zzfgjVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Nullable
    public final WebResourceResponse zzc(String str, Map map) {
        zzawg zzb2;
        try {
            if (((Boolean) zzbdf.zza.zze()).booleanValue() && this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.zzw.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String zzc = zzbya.zzc(str, this.zzc.getContext(), this.zzA);
            if (zzc.equals(str)) {
                zzawj zza = zzawj.zza(Uri.parse(str));
                if (zza == null || (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) == null || !zzb2.zze()) {
                    if (zzbzs.zzk() && ((Boolean) zzbcz.zzb.zze()).booleanValue()) {
                        return zzO(str, map);
                    }
                    return null;
                }
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            return zzO(zzc, map);
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue() && this.zzc.zzm() != null) {
                zzbbu.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgm zzcgmVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcgmVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            zzbwuVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbqs zzbqsVar = this.zzv;
            if (zzbqsVar != null) {
                zzbqsVar.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    public final void zzi(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzj(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgx)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final void run() {
                    String str = substring;
                    int i = zzcfi.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfo)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfq)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfvr.zzq(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcfg(this, list, path, uri), zzcag.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzs.zzL(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzk() {
        zzawx zzawxVar = this.zzd;
        if (zzawxVar != null) {
            zzawxVar.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzm() {
        this.zzz--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzy();
        }
    }

    public final /* synthetic */ void zzo(View view, zzbwu zzbwuVar, int i) {
        zzR(view, zzbwuVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzp(int i, int i2, boolean z) {
        zzbqx zzbqxVar = this.zzt;
        if (zzbqxVar != null) {
            zzbqxVar.zzb(i, i2);
        }
        zzbqs zzbqsVar = this.zzv;
        if (zzbqsVar != null) {
            zzbqsVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgo
    public final void zzq() {
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            WebView zzG = this.zzc.zzG();
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11730b(zzG)) {
                zzR(zzG, zzbwuVar, 10);
                return;
            }
            zzQ();
            zzcff zzcffVar = new zzcff(this, zzbwuVar);
            this.zzC = zzcffVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcffVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzdcw zzdcwVar = this.zzm;
        if (zzdcwVar != null) {
            zzdcwVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
        zzdcw zzdcwVar = this.zzm;
        if (zzdcwVar != null) {
            zzdcwVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z2 = true;
        if (!zzS && z) {
            z2 = false;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zzS ? null : this.zzg, zzaA ? null : this.zzh, this.zzs, this.zzc.zzn(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzu(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2, int i) {
        zzcfb zzcfbVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcfbVar, zzcfbVar.zzn(), zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2, 14));
    }

    public final void zzv(boolean z, int i, boolean z2) {
        boolean zzS = zzS(this.zzc.zzaA(), this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzS ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcfb zzcfbVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcfbVar, z, i, zzcfbVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbqs zzbqsVar = this.zzv;
        boolean zze = zzbqsVar != null ? zzbqsVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze);
        zzbwu zzbwuVar = this.zza;
        if (zzbwuVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbwuVar.zzh(str);
        }
    }

    public final void zzx(boolean z, int i, String str, boolean z2) {
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzS ? null : this.zzg;
        zzcfh zzcfhVar = zzaA ? null : new zzcfh(this.zzc, this.zzh);
        zzbhb zzbhbVar = this.zzk;
        zzbhd zzbhdVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcfb zzcfbVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfhVar, zzbhbVar, zzbhdVar, zzzVar, zzcfbVar, z, i, str, zzcfbVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        boolean zzaA = this.zzc.zzaA();
        boolean zzS = zzS(zzaA, this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzS ? null : this.zzg;
        zzcfh zzcfhVar = zzaA ? null : new zzcfh(this.zzc, this.zzh);
        zzbhb zzbhbVar = this.zzk;
        zzbhd zzbhdVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcfb zzcfbVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfhVar, zzbhbVar, zzbhdVar, zzzVar, zzcfbVar, z, i, str, str2, zzcfbVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzz(String str, zzbii zzbiiVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbiiVar);
        }
    }
}
