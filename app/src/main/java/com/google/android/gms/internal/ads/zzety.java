package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzety implements zzeqq {
    private final zzbzc zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfwc zze;
    private final String zzf;
    private final zzbyr zzg;

    public zzety(zzbzc zzbzcVar, boolean z, boolean z2, zzbyr zzbyrVar, zzfwc zzfwcVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzcVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzbyrVar;
        this.zze = zzfwcVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgT)).booleanValue() || !this.zzc) && this.zzb) {
            return zzfvr.zze(zzfvr.zzn(zzfvr.zzl(zzfvr.zzh(null), new zzfon() { // from class: com.google.android.gms.internal.ads.zzetw
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new zzetz(str);
                }
            }, this.zze), ((Long) zzbdr.zzd.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzetx
                @Override // com.google.android.gms.internal.ads.zzfon
                public final Object apply(Object obj) {
                    zzety.this.zzc((Exception) obj);
                    return null;
                }
            }, this.zze);
        }
        return zzfvr.zzh(null);
    }

    public final /* synthetic */ zzetz zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
