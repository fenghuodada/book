package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzebn;
import com.google.android.gms.internal.ads.zzebo;
import com.google.android.gms.internal.ads.zzebp;
import com.google.android.gms.internal.ads.zzfgo;
import com.google.android.gms.internal.ads.zzflv;
import java.util.Collections;

/* loaded from: classes.dex */
public class zzl extends zzbru implements zzad {
    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;
    @VisibleForTesting
    zzcfb zzd;
    @VisibleForTesting
    zzh zze;
    @VisibleForTesting
    zzr zzf;
    @VisibleForTesting
    FrameLayout zzh;
    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    @VisibleForTesting
    boolean zzg = false;
    @VisibleForTesting
    boolean zzj = false;
    @VisibleForTesting
    boolean zzk = false;
    @VisibleForTesting
    boolean zzm = false;
    @VisibleForTesting
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzH(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzbb)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        }
    }

    private static final void zzI(@Nullable zzfgo zzfgoVar, @Nullable View view) {
        if (zzfgoVar == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(zzfgoVar, view);
    }

    public final void zzA(boolean z) {
        zzg zzgVar;
        int i;
        if (z) {
            zzgVar = this.zzl;
            i = 0;
        } else {
            zzgVar = this.zzl;
            i = -16777216;
        }
        zzgVar.setBackgroundColor(i);
    }

    public final void zzB(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r30.zzb.getResources().getConfiguration().orientation == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r30.zzm = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r30.zzb.getResources().getConfiguration().orientation == 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzC(boolean r31) throws com.google.android.gms.ads.internal.overlay.zzf {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzC(boolean):void");
    }

    public final void zzD() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzflv zzflvVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzflvVar.removeCallbacks(runnable);
                zzflvVar.post(this.zzp);
            }
        }
    }

    public final void zzE() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcfb zzcfbVar = this.zzd;
        if (zzcfbVar != null) {
            zzcfbVar.zzW(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzax()) {
                    if (((Boolean) zzba.zzc().zzb(zzbbk.zzez)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzby();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    this.zzp = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().zzb(zzbbk.zzaU)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final boolean zzF() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzir)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaC = this.zzd.zzaC();
        if (!zzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    @VisibleForTesting
    public final void zzc() {
        zzcfb zzcfbVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcfb zzcfbVar2 = this.zzd;
        if (zzcfbVar2 != null) {
            this.zzl.removeView(zzcfbVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcfbVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzI(zzcfbVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzX();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzz(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzi() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzH((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzk(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzl() {
        zzcfb zzcfbVar = this.zzd;
        if (zzcfbVar != null) {
            try {
                this.zzl.removeView(zzcfbVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzE();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbk.zzeB)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzo(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            zzebo zzi = zzebp.zzi();
            zzi.zza(this.zzb);
            zzi.zzb(this);
            zzi.zzh(this.zzc.zzu);
            zzi.zzd(this.zzc.zzr);
            zzi.zzc(this.zzc.zzs);
            zzi.zzf(this.zzc.zzt);
            zzi.zze(this.zzc.zzq);
            zzi.zzg(this.zzc.zzv);
            zzebn.zzh(strArr, iArr, zzi.zzi());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzq() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbF();
        }
        zzH(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzeB)).booleanValue()) {
            return;
        }
        zzcfb zzcfbVar = this.zzd;
        if (zzcfbVar == null || zzcfbVar.zzaz()) {
            zzbzt.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzr(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzs() {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzeB)).booleanValue()) {
            zzcfb zzcfbVar = this.zzd;
            if (zzcfbVar == null || zzcfbVar.zzaz()) {
                zzbzt.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzt() {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzeB)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzu() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzv(boolean z) {
        int intValue = ((Integer) zzba.zzc().zzb(zzbbk.zzeD)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zzb(zzbbk.zzaX)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzx(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzw() {
        this.zzr = true;
    }

    public final void zzx(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zzb(zzbbk.zzaV)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zzb(zzbbk.zzaW)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbqy(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzy() {
        this.zzl.removeView(this.zzf);
        zzv(true);
    }

    public final void zzz(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbbk.zzfJ)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbbk.zzfK)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().zzb(zzbbk.zzfL)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().zzb(zzbbk.zzfM)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }
}
