package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbgx extends zzbga {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbgx(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
        try {
            if (zzbuVar.zzj() instanceof zzaum) {
                zzaum zzaumVar = (zzaum) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(zzaumVar != null ? zzaumVar.zzb() : null);
            }
        } catch (RemoteException e2) {
            zzbzt.zzh("", e2);
        }
        zzbzm.zza.post(new zzbgw(this, adManagerAdView, zzbuVar));
    }
}
