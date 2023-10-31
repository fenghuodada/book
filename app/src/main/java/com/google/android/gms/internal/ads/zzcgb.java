package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class zzcgb {
    private final zzcgc zza;
    private final zzcga zzb;

    public zzcgb(zzcgc zzcgcVar, zzcga zzcgaVar) {
        this.zzb = zzcgaVar;
        this.zza = zzcgcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzcgj] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r0 = this.zza;
            zzaqq zzI = r0.zzI();
            if (zzI == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                zzaqm zzc = zzI.zzc();
                if (zzc == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (r0.getContext() != null) {
                    Context context = this.zza.getContext();
                    zzcgc zzcgcVar = this.zza;
                    return zzc.zzf(context, str, (View) zzcgcVar, zzcgcVar.zzi());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str2);
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzcgj] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r0 = this.zza;
        zzaqq zzI = r0.zzI();
        if (zzI == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            zzaqm zzc = zzI.zzc();
            if (zzc == null) {
                str = "Signals object is empty, ignoring.";
            } else if (r0.getContext() != null) {
                Context context = this.zza.getContext();
                zzcgc zzcgcVar = this.zza;
                return zzc.zzh(context, (View) zzcgcVar, zzcgcVar.zzi());
            } else {
                str = "Context is null, ignoring.";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbzt.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgb.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        zzcga zzcgaVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzcfi zzaJ = ((zzcfu) zzcgaVar.zza).zzaJ();
        if (zzaJ == null) {
            zzbzt.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
