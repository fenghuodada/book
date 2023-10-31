package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzesg implements zzeqq {
    private final zzbzc zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfwc zzd;
    private final zzawa zze;

    public zzesg(String str, zzawa zzawaVar, zzbzc zzbzcVar, ScheduledExecutorService scheduledExecutorService, zzfwc zzfwcVar) {
        this.zzb = str;
        this.zze = zzawaVar;
        this.zza = zzbzcVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcu)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcz)).booleanValue()) {
                zzfwb zzm = zzfvr.zzm(zzfmd.zza(Tasks.forResult(null)), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzese
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfvr.zzh(new zzesh(null, -1)) : zzfvr.zzh(new zzesh(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbcs.zza.zze()).booleanValue()) {
                    zzm = zzfvr.zzn(zzm, ((Long) zzbcs.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfvr.zze(zzm, Exception.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzesf
                    @Override // com.google.android.gms.internal.ads.zzfon
                    public final Object apply(Object obj) {
                        return zzesg.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfvr.zzh(new zzesh(null, -1));
    }

    public final /* synthetic */ zzesh zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzesh(null, -1);
    }
}
