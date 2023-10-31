package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzekp implements zzeqq {
    private final zzfwc zza;
    private final zzfaa zzb;
    private final zzfam zzc;

    public zzekp(zzfwc zzfwcVar, zzfaa zzfaaVar, zzfam zzfamVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfaaVar;
        this.zzc = zzfamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekp.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzekq zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgU)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfam.zza();
        }
        return new zzekq(str);
    }
}
