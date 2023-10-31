package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenk implements zzeqq {
    private final zzfwc zza;

    public zzenk(zzfwc zzfwcVar) {
        this.zza = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzenl(com.google.android.gms.ads.internal.zzt.zzs().zzb(), com.google.android.gms.ads.internal.zzt.zzs().zzm());
            }
        });
    }
}
