package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzemt implements zzeqq {
    private final zzfwc zza;
    private final zzdoc zzb;
    private final String zzc;
    private final zzfaa zzd;

    public zzemt(zzfwc zzfwcVar, zzdoc zzdocVar, zzfaa zzfaaVar, String str) {
        this.zza = zzfwcVar;
        this.zzb = zzdocVar;
        this.zzd = zzfaaVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzems
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemt.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzemu zzc() throws Exception {
        return new zzemu(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
