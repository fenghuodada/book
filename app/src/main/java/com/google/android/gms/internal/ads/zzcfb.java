package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface zzcfb extends com.google.android.gms.ads.internal.client.zza, zzdcw, zzces, zzblb, zzcfy, zzcgc, zzblo, zzaty, zzcgg, com.google.android.gms.ads.internal.zzl, zzcgj, zzcgk, zzccc, zzcgl {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzccc
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzccc
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzccc
    void zzC(zzcfx zzcfxVar);

    @Override // com.google.android.gms.internal.ads.zzces
    zzezf zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgl
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgj
    zzaqq zzI();

    zzavl zzJ();

    zzbed zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcgo zzN();

    @Override // com.google.android.gms.internal.ads.zzcgi
    zzcgq zzO();

    @Override // com.google.android.gms.internal.ads.zzcfy
    zzezi zzP();

    zzfgo zzQ();

    zzfwb zzR();

    String zzS();

    void zzT(zzezf zzezfVar, zzezi zzeziVar);

    void zzU();

    void zzV();

    void zzW(int i);

    void zzX();

    void zzY();

    void zzZ(boolean z);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbii zzbiiVar);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzag(zzcgq zzcgqVar);

    void zzah(zzavl zzavlVar);

    void zzai(boolean z);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z);

    void zzam(zzbeb zzbebVar);

    void zzan(boolean z);

    void zzao(zzbed zzbedVar);

    void zzap(zzfgo zzfgoVar);

    void zzaq(int i);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzas(boolean z);

    void zzat(boolean z);

    void zzau(String str, zzbii zzbiiVar);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z, int i);

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzccc
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzccc
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzccc
    zzbca zzm();

    @Override // com.google.android.gms.internal.ads.zzcgk, com.google.android.gms.internal.ads.zzccc
    zzbzz zzn();

    @Override // com.google.android.gms.internal.ads.zzccc
    zzcfx zzq();

    @Override // com.google.android.gms.internal.ads.zzccc
    void zzt(String str, zzcdn zzcdnVar);
}
