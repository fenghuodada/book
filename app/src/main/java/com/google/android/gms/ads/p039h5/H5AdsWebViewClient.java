package com.google.android.gms.ads.p039h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjo;

@RequiresApi(api = 21)
/* renamed from: com.google.android.gms.ads.h5.H5AdsWebViewClient */
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends zzbjb {
    private final zzbjo zza;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.zza = new zzbjo(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    @NonNull
    public WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
