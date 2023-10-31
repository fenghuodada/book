package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdvd implements zzdwb {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdud zzb;
    private final zzfwc zzc;
    private final zzfaa zzd;
    private final ScheduledExecutorService zze;
    private final zzdzz zzf;
    private final zzffq zzg;
    private final Context zzh;

    public zzdvd(Context context, zzfaa zzfaaVar, zzdud zzdudVar, zzfwc zzfwcVar, ScheduledExecutorService scheduledExecutorService, zzdzz zzdzzVar, zzffq zzffqVar) {
        this.zzh = context;
        this.zzd = zzfaaVar;
        this.zzb = zzdudVar;
        this.zzc = zzfwcVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzzVar;
        this.zzg = zzffqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwb
    public final zzfwb zzb(zzbug zzbugVar) {
        zzfwb zzb = this.zzb.zzb(zzbugVar);
        zzfff zza2 = zzffe.zza(this.zzh, 11);
        zzffp.zzd(zzb, zza2);
        zzfwb zzm = zzfvr.zzm(zzb, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdva
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdvd.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfj)).booleanValue()) {
            zzm = zzfvr.zzf(zzfvr.zzn(zzm, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdvb
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzfvr.zzg(new zzdtz(5));
                }
            }, zzcag.zzf);
        }
        zzffp.zza(zzm, this.zzg, zza2);
        zzfvr.zzq(zzm, new zzdvc(this), zzcag.zzf);
        return zzm;
    }

    public final /* synthetic */ zzfwb zzc(InputStream inputStream) throws Exception {
        return zzfvr.zzh(new zzezr(new zzezo(this.zzd), zzezq.zza(new InputStreamReader(inputStream))));
    }
}
