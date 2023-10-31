package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes.dex */
final class zzbgw implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbgx zzc;

    public zzbgw(zzbgx zzbgxVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zzc = zzbgxVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            zzbzt.zzj("Could not bind.");
            return;
        }
        onAdManagerAdViewLoadedListener = this.zzc.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
    }
}
