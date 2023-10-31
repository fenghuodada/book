package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzesx implements zzeqq {
    final zzfwc zza;
    final String zzb;
    final zzbyq zzc;

    public zzesx(zzbyq zzbyqVar, zzfwc zzfwcVar, String str) {
        this.zzc = zzbyqVar;
        this.zza = zzfwcVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        final zzfwb zzh = zzfvr.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfA)).booleanValue()) {
            zzh = zzfvr.zzh(null);
        }
        final zzfwb zzh2 = zzfvr.zzh(null);
        return zzfvr.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesy((String) zzfwb.this.get(), (String) zzh2.get());
            }
        }, zzcag.zza);
    }
}
