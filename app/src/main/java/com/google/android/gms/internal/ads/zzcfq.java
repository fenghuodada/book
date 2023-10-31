package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcfq extends FrameLayout implements zzcfb {
    private final zzcfb zza;
    private final zzcbr zzb;
    private final AtomicBoolean zzc;

    public zzcfq(zzcfb zzcfbVar) {
        super(zzcfbVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfbVar;
        this.zzb = new zzcbr(zzcfbVar.zzE(), this, this);
        addView((View) zzcfbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void destroy() {
        final zzfgo zzQ = zzQ();
        if (zzQ == null) {
            this.zza.destroy();
            return;
        }
        zzflv zzflvVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzflvVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
            @Override // java.lang.Runnable
            public final void run() {
                zzfgo zzfgoVar = zzfgo.this;
                com.google.android.gms.ads.internal.zzt.zzA();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
                    zzfgoVar.zzc();
                }
            }
        });
        final zzcfb zzcfbVar = this.zza;
        zzcfbVar.getClass();
        zzflvVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
            @Override // java.lang.Runnable
            public final void run() {
                zzcfb.this.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeL)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final void zzC(zzcfx zzcfxVar) {
        this.zza.zzC(zzcfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzces
    public final zzezf zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgl
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgj
    public final zzaqq zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzavl zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    @Nullable
    public final zzbed zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzcgo zzN() {
        return ((zzcfu) this.zza).zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgi
    public final zzcgq zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcfy
    public final zzezi zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzfgo zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final zzfwb zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzT(zzezf zzezfVar, zzezi zzeziVar) {
        this.zza.zzT(zzezfVar, zzeziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzV() {
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzW(int i) {
        this.zza.zzW(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzY() {
        zzcfb zzcfbVar = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcfu zzcfuVar = (zzcfu) zzcfbVar;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(zzcfuVar.getContext())));
        zzcfuVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzZ(boolean z) {
        this.zza.zzZ(z);
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zza(String str) {
        ((zzcfu) this.zza).zzaO(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaD(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzebc zzebcVar, zzdqc zzdqcVar, zzfen zzfenVar, String str, String str2, int i) {
        this.zza.zzaE(zzbrVar, zzebcVar, zzdqcVar, zzfenVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zza.zzaF(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zza.zzaG(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaH(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzab(String str, String str2, @Nullable String str3) {
        this.zza.zzab(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzad(String str, zzbii zzbiiVar) {
        this.zza.zzad(str, zzbiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzu());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzaf(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzag(zzcgq zzcgqVar) {
        this.zza.zzag(zzcgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzah(zzavl zzavlVar) {
        this.zza.zzah(zzavlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzai(boolean z) {
        this.zza.zzai(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzam(zzbeb zzbebVar) {
        this.zza.zzam(zzbebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzao(@Nullable zzbed zzbedVar) {
        this.zza.zzao(zzbedVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzap(zzfgo zzfgoVar) {
        this.zza.zzap(zzfgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzaq(int i) {
        this.zza.zzaq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzar(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzat(boolean z) {
        this.zza.zzat(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzau(String str, zzbii zzbiiVar) {
        this.zza.zzau(str, zzbiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzay(boolean z, int i) {
        if (this.zzc.compareAndSet(false, true)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaI)).booleanValue()) {
                return false;
            }
            if (this.zza.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
            }
            this.zza.zzay(z, i);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.zza.zzbj();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final String zzbl() {
        return this.zza.zzbl();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        this.zza.zzc(zzatxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdB)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdB)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgc, com.google.android.gms.internal.ads.zzccc
    @Nullable
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final zzbbz zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfu) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final zzbca zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzcgk, com.google.android.gms.internal.ads.zzccc
    public final zzbzz zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final zzcbr zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final zzcdn zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final zzcfx zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzr() {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final void zzs() {
        zzcfb zzcfbVar = this.zza;
        if (zzcfbVar != null) {
            zzcfbVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfb, com.google.android.gms.internal.ads.zzccc
    public final void zzt(String str, zzcdn zzcdnVar) {
        this.zza.zzt(str, zzcdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
