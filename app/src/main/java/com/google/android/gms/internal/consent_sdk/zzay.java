package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import com.google.android.ump.InterfaceC7921a;
import com.google.android.ump.InterfaceC7926e;
import com.google.android.ump.InterfaceC7927f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@UiThread
/* loaded from: classes.dex */
public final class zzay implements InterfaceC7921a {
    private final Application zza;
    private final zzac zzb;
    private final zzbi zzc;
    private final zzam zzd;
    private final zzbc zze;
    private final zzcl<zzbg> zzf;
    private Dialog zzg;
    private zzbg zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference<zzax> zzj = new AtomicReference<>();
    private final AtomicReference<InterfaceC7921a.InterfaceC7922a> zzk = new AtomicReference<>();
    private final AtomicReference<zzaw> zzl = new AtomicReference<>();

    public zzay(Application application, zzac zzacVar, zzbi zzbiVar, zzam zzamVar, zzbc zzbcVar, zzcl<zzbg> zzclVar) {
        this.zza = application;
        this.zzb = zzacVar;
        this.zzc = zzbiVar;
        this.zzd = zzamVar;
        this.zze = zzbcVar;
        this.zzf = zzclVar;
    }

    private final void zzg() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaw andSet = this.zzl.getAndSet(null);
        if (andSet != null) {
            andSet.zza.zza.unregisterActivityLifecycleCallbacks(andSet);
        }
    }

    public final void show(Activity activity, InterfaceC7921a.InterfaceC7922a interfaceC7922a) {
        zzcd.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            new zzj(3, "ConsentForm#show can only be invoked once.").zza();
            interfaceC7922a.m4295a();
            return;
        }
        zzaw zzawVar = new zzaw(this, activity);
        this.zza.registerActivityLifecycleCallbacks(zzawVar);
        this.zzl.set(zzawVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new zzj(3, "Activity with null windows is passed in.").zza();
            interfaceC7922a.m4295a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.zzk.set(interfaceC7922a);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzb("UMP_messagePresented", "");
    }

    public final zzbg zza() {
        return this.zzh;
    }

    public final void zzb(InterfaceC7927f interfaceC7927f, InterfaceC7926e interfaceC7926e) {
        zzbg zzb = ((zzbh) this.zzf).zzb();
        this.zzh = zzb;
        zzb.setBackgroundColor(0);
        zzb.getSettings().setJavaScriptEnabled(true);
        zzb.setWebViewClient(new zzbf(zzb, null));
        this.zzj.set(new zzax(interfaceC7927f, interfaceC7926e, null));
        this.zzh.loadDataWithBaseURL(this.zze.zza(), this.zze.zzb(), "text/html", "UTF-8", null);
        zzcd.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                zzay.this.zzf(new zzj(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzc(int i) {
        zzg();
        InterfaceC7921a.InterfaceC7922a andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.zzd.zzf(3);
        andSet.m4295a();
    }

    public final void zzd(zzj zzjVar) {
        zzg();
        InterfaceC7921a.InterfaceC7922a andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        zzjVar.zza();
        andSet.m4295a();
    }

    public final void zze() {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadSuccess(this);
    }

    public final void zzf(zzj zzjVar) {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadFailure(zzjVar.zza());
    }
}
