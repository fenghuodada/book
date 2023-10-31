package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzenw implements zzeqq {
    private final zzfwc zza;
    private final zzdsz zzb;

    public zzenw(zzfwc zzfwcVar, zzdsz zzdszVar) {
        this.zza = zzfwcVar;
        this.zzb = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenw.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenx zzc() throws Exception {
        return new zzenx(this.zzb.zzc(), this.zzb.zzp(), com.google.android.gms.ads.internal.zzt.zzs().zzl(), this.zzb.zzn());
    }
}
