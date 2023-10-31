package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeno implements zzeqq {
    private final zzfwc zza;
    private final zzfaa zzb;

    public zzeno(zzfwc zzfwcVar, zzfaa zzfaaVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeno.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenp zzc() throws Exception {
        return new zzenp("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
