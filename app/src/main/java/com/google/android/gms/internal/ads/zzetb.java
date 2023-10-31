package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzetb implements zzeqq {
    final zzfwc zza;
    final List zzb;
    final zzbav zzc;

    public zzetb(zzbav zzbavVar, zzfwc zzfwcVar, List list) {
        this.zzc = zzbavVar;
        this.zza = zzfwcVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetc(zzetb.this.zzb);
            }
        });
    }
}
