package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzelv implements zzeqq {
    @VisibleForTesting
    final zzbzc zza;
    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfwc zzd;
    private final Context zze;

    public zzelv(Context context, zzbzc zzbzcVar, ScheduledExecutorService scheduledExecutorService, zzfwc zzfwcVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcy)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzcVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcu)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcz)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcv)).booleanValue()) {
                    Task<AppSetIdInfo> zza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcy)).booleanValue() ? zzfbd.zza(this.zze) : this.zzb.getAppSetIdInfo();
                    if (zza == null) {
                        return zzfvr.zzh(new zzelw(null, -1));
                    }
                    zzfwb zzm = zzfvr.zzm(zzfmd.zza(zza), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzelt
                        @Override // com.google.android.gms.internal.ads.zzfuy
                        public final zzfwb zza(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return appSetIdInfo == null ? zzfvr.zzh(new zzelw(null, -1)) : zzfvr.zzh(new zzelw(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                        }
                    }, zzcag.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcw)).booleanValue()) {
                        zzm = zzfvr.zzn(zzm, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcx)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                    }
                    return zzfvr.zze(zzm, Exception.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzelu
                        @Override // com.google.android.gms.internal.ads.zzfon
                        public final Object apply(Object obj) {
                            zzelv.this.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                            return new zzelw(null, -1);
                        }
                    }, this.zzd);
                }
                return zzfvr.zzl(zzfmd.zza(this.zzb.getAppSetIdInfo()), new zzfon() { // from class: com.google.android.gms.internal.ads.zzels
                    @Override // com.google.android.gms.internal.ads.zzfon
                    public final Object apply(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return new zzelw(appSetIdInfo.getId(), appSetIdInfo.getScope());
                    }
                }, zzcag.zzf);
            }
        }
        return zzfvr.zzh(new zzelw(null, -1));
    }
}
