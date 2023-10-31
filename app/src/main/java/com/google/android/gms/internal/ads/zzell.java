package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzell implements zzeqq {
    private final zzfwc zza;
    private final zzfaa zzb;
    private final zzbzz zzc;
    private final zzbzg zzd;

    public zzell(zzfwc zzfwcVar, zzfaa zzfaaVar, zzbzz zzbzzVar, zzbzg zzbzgVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfaaVar;
        this.zzc = zzbzzVar;
        this.zzd = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzell.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzelm zzc() throws Exception {
        return new zzelm(this.zzb.zzj, this.zzc, this.zzd.zzk());
    }
}
