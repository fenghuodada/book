package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzduj implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzduj(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfdx zzfdxVar = zzfdx.WEBVIEW_COOKIE;
        zzfdu zzi = zzfdn.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaK));
            }
        }, zzfdxVar, (zzfed) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzduh zzduhVar = new zzfdg() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzfdq
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfvr.zzh("");
            }
        }).zza();
    }
}
