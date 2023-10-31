package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzemp implements zzeqq {
    private final zzfwc zza;

    public zzemp(zzfwc zzfwcVar) {
        this.zza = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzemq(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zza()).longValue());
            }
        });
    }
}
