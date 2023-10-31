package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C2362x3;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzflv;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class zzcfu extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfb {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbed zzC;
    private zzbeb zzD;
    private zzavl zzE;
    private int zzF;
    private int zzG;
    private zzbbz zzH;
    private final zzbbz zzI;
    private zzbbz zzJ;
    private final zzbca zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzci zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzawx zzV;
    private final zzcgp zzb;
    private final zzaqq zzc;
    private final zzbcm zzd;
    private final zzbzz zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzezf zzj;
    private zzezi zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfi zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzfgo zzp;
    private zzcgq zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcfx zzz;

    @VisibleForTesting
    public zzcfu(zzcgp zzcgpVar, zzcgq zzcgqVar, String str, boolean z, boolean z2, zzaqq zzaqqVar, zzbcm zzbcmVar, zzbzz zzbzzVar, zzbcc zzbccVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzawx zzawxVar, zzezf zzezfVar, zzezi zzeziVar) {
        super(zzcgpVar);
        zzezi zzeziVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcgpVar;
        this.zzq = zzcgqVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzaqqVar;
        this.zzd = zzbcmVar;
        this.zze = zzbzzVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = zzq;
        this.zzi = zzq.density;
        this.zzV = zzawxVar;
        this.zzj = zzezfVar;
        this.zzk = zzeziVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzci(zzcgpVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzbzt.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjU)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcgpVar, zzbzzVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzflv zzflvVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaH)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcgb(this, new zzcga(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbca zzbcaVar = new zzbca(new zzbcc(true, "make_wv", this.zzr));
        this.zzK = zzbcaVar;
        zzbcaVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue() && (zzeziVar2 = this.zzk) != null && zzeziVar2.zzb != null) {
            zzbcaVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbcaVar.zza();
        zzbbz zzf = zzbcc.zzf();
        this.zzI = zzf;
        zzbcaVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcgpVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzezf zzezfVar = this.zzj;
        if (zzezfVar != null && zzezfVar.zzan) {
            zzbzt.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzbzt.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzbzt.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzbzt.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbbu.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            for (zzcdn zzcdnVar : map.values()) {
                zzcdnVar.release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbca zzbcaVar = this.zzK;
        if (zzbcaVar == null) {
            return;
        }
        zzbcc zza2 = zzbcaVar.zza();
        zzbbs zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbb() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjq)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
        com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
        zzaX("about:blank");
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbzt.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null && zzcfiVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfi zzcfiVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcfiVar = this.zzn) != null && zzcfiVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzP(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzbzt.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL == null || !zzaR) {
            return;
        }
        zzL.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7 A[Catch: all -> 0x01dd, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x000f, B:11:0x0015, B:13:0x0019, B:16:0x0023, B:18:0x002b, B:21:0x0030, B:23:0x0038, B:25:0x004a, B:28:0x004f, B:30:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:48:0x008c, B:42:0x007d, B:45:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:62:0x00dc, B:61:0x00d8, B:65:0x00e1, B:67:0x00e9, B:70:0x00f4, B:79:0x0118, B:81:0x011f, B:86:0x0127, B:88:0x0139, B:90:0x0147, B:94:0x0154, B:97:0x0159, B:99:0x019f, B:100:0x01a3, B:102:0x01aa, B:107:0x01b7, B:109:0x01bd, B:110:0x01c0, B:112:0x01c4, B:113:0x01cd, B:116:0x01d8), top: B:122:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfu.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzbzt.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzbzt.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzaqq zzaqqVar = this.zzc;
            if (zzaqqVar != null) {
                zzaqqVar.zzd(motionEvent);
            }
            zzbcm zzbcmVar = this.zzd;
            if (zzbcmVar != null) {
                zzbcmVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbed zzbedVar = this.zzC;
                if (zzbedVar != null) {
                    zzbedVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfi) {
            this.zzn = (zzcfi) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzbzt.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzC(zzcfx zzcfxVar) {
        if (this.zzz != null) {
            zzbzt.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcfxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzces
    public final zzezf zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgl
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgj
    public final zzaqq zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzavl zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzbed zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final /* synthetic */ zzcgo zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgi
    public final synchronized zzcgq zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcfy
    public final zzezi zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized zzfgo zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzfwb zzR() {
        zzbcm zzbcmVar = this.zzd;
        return zzbcmVar == null ? zzfvr.zzh(null) : zzbcmVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzT(zzezf zzezfVar, zzezi zzeziVar) {
        this.zzj = zzezfVar;
        this.zzk = zzeziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcft(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzW(int i) {
        if (i == 0) {
            zzbbu.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzX() {
        if (this.zzH == null) {
            zzbbu.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbbz zzf = zzbcc.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2, int i) {
        this.zzn.zzu(zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zzn.zzx(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzy(z, i, str, str2, z2);
    }

    public final zzcfi zzaJ() {
        return this.zzn;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaK() {
        return this.zzw;
    }

    public final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaO(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaP("javascript:".concat(str));
            return;
        }
        if (zzaK() == null) {
            zzbb();
        }
        if (zzaK().booleanValue()) {
            zzaN(str, null);
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    public final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @VisibleForTesting
    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzn.zzK() || this.zzn.zzL()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzh;
            int zzv = zzbzm.zzv(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzv2 = zzbzm.zzv(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzv;
                i2 = zzv2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zza2);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzv3 = zzbzm.zzv(this.zzh, zzM[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i2 = zzbzm.zzv(this.zzh, zzM[1]);
                i = zzv3;
            }
            int i3 = this.zzQ;
            if (i3 == zzv && this.zzP == zzv2 && this.zzR == i && this.zzS == i2) {
                return false;
            }
            if (i3 != zzv || this.zzP != zzv2) {
                z = true;
            }
            this.zzQ = zzv;
            this.zzP = zzv2;
            this.zzR = i;
            this.zzS = i2;
            new zzbqy(this, "").zzi(zzv, zzv2, i, i2, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (zzaz()) {
            zzbzt.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzQ);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_VERSION, str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            zzbzt.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcgh.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbbz zzf = zzbcc.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzad(String str, zzbii zzbiiVar) {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzz(str, zzbiiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzag(zzcgq zzcgqVar) {
        this.zzq = zzcgqVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzah(zzavl zzavlVar) {
        this.zzE = zzavlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzx(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzam(zzbeb zzbebVar) {
        this.zzD = zzbebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzan(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzR)).booleanValue() || !this.zzq.zzi()) {
                new zzbqy(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzao(zzbed zzbedVar) {
        this.zzC = zzbedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzap(zzfgo zzfgoVar) {
        this.zzp = zzfgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized void zzat(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzau(String str, zzbii zzbiiVar) {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzH(str, zzbiiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzav(String str, Predicate predicate) {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // com.google.android.gms.internal.ads.zzaww
            public final void zza(zzaym zzaymVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcfu.zza;
                zzbar zza2 = zzbas.zza();
                if (zza2.zzc() != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i2);
                zzaymVar.zzj((zzbas) zza2.zzal());
            }
        });
        this.zzV.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized String zzbl() {
        zzezi zzeziVar = this.zzk;
        if (zzeziVar != null) {
            return zzeziVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        boolean z;
        synchronized (this) {
            z = zzatxVar.zzj;
            this.zzA = z;
        }
        zzaV(z);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzbzt.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder m9460b = C2362x3.m9460b("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzbzt.zze("Dispatching AFMA event: ".concat(m9460b.toString()));
        zzaO(m9460b.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzccc
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final zzbbz zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final zzbca zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgk, com.google.android.gms.internal.ads.zzccc
    public final zzbzz zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final zzcbr zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized zzcdn zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcdn) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final synchronized zzcfx zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
        zzcfi zzcfiVar = this.zzn;
        if (zzcfiVar != null) {
            zzcfiVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzt(String str, zzcdn zzcdnVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzv(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final synchronized void zzw() {
        zzbeb zzbebVar = this.zzD;
        if (zzbebVar != null) {
            final zzdla zzdlaVar = (zzdla) zzbebVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdky
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdla.this.zzd();
                    } catch (RemoteException e) {
                        zzbzt.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
