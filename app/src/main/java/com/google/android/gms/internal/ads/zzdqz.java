package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes.dex */
public final class zzdqz implements AppEventListener, zzcyd, com.google.android.gms.ads.internal.client.zza, zzcvi, zzcwc, zzcwd, zzcww, zzcvl, zzfee {
    private final List zza;
    private final zzdqn zzb;
    private long zzc;

    public zzdqz(zzdqn zzdqnVar, zzcgw zzcgwVar) {
        this.zzb = zzdqnVar;
        this.zza = Collections.singletonList(zzcgwVar);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zze(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zze(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zze(zzcvl.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zze(zzcyd.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbB(zzfdx zzfdxVar, String str) {
        zze(zzfdw.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbC(zzfdx zzfdxVar, String str, Throwable th) {
        zze(zzfdw.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbn(Context context) {
        zze(zzcwd.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbp(Context context) {
        zze(zzcwd.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbq(Context context) {
        zze(zzcwd.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
        zze(zzcvi.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzc(zzfdx zzfdxVar, String str) {
        zze(zzfdw.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzd(zzfdx zzfdxVar, String str) {
        zze(zzfdw.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        zze(zzcvi.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        zze(zzcwc.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
        zze(zzcvi.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zze(zzcww.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        zze(zzcvi.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    @ParametersAreNonnullByDefault
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
        zze(zzcvi.class, "onRewarded", zzbuwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
        zze(zzcvi.class, "onRewardedVideoCompleted", new Object[0]);
    }
}
