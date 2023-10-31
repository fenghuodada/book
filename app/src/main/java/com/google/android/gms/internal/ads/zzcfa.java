package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.C0539e;
import com.adcolony.sdk.C2362x3;

/* loaded from: classes.dex */
public final class zzcfa extends WebChromeClient {
    private final zzcfb zza;

    public zzcfa(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    private static final Context zzb(WebView webView) {
        if (webView instanceof zzcfb) {
            zzcfb zzcfbVar = (zzcfb) webView;
            Activity zzi = zzcfbVar.zzi();
            return zzi != null ? zzi : zzcfbVar.getContext();
        }
        return webView.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzcfb) {
            com.google.android.gms.ads.internal.overlay.zzl zzL = ((zzcfb) webView).zzL();
            if (zzL != null) {
                zzL.zzb();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzbzt.zzj(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String m12264b = C0539e.m12264b(C2362x3.m9460b("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (m12264b.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcez.zza[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i == 5) {
                    zzbzt.zze(m12264b);
                } else {
                    zzbzt.zzi(m12264b);
                }
            } else {
                zzbzt.zzj(m12264b);
            }
        } else {
            zzbzt.zzg(m12264b);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzbzt.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zza.zzL();
        if (zzL == null) {
            zzbzt.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzL.zzB(view, customViewCallback);
        zzL.zzz(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcfb zzcfbVar;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcfbVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            zzbzt.zzk("Fail to display Dialog.", e);
        }
        if (zzcfbVar != null && zzcfbVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(context);
        zzG.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = zzG.setView(linearLayout).setPositiveButton(17039370, new zzcey(jsPromptResult, editText)).setNegativeButton(17039360, new zzcex(jsPromptResult)).setOnCancelListener(new zzcew(jsPromptResult)).create();
        } else {
            create = zzG.setMessage(str3).setPositiveButton(17039370, new zzcev(jsResult)).setNegativeButton(17039360, new zzceu(jsResult)).setOnCancelListener(new zzcet(jsResult)).create();
        }
        create.show();
        return true;
    }
}
