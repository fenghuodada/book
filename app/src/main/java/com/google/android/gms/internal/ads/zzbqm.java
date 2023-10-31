package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class zzbqm implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbqn zzb;

    public zzbqm(zzbqn zzbqnVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbqnVar;
        this.zza = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzt.zzi();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.zza, true);
    }
}
