package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeoe implements zzeqq {
    private final zzfwc zza;
    private final zzeze zzb;

    public zzeoe(zzfwc zzfwcVar, zzeze zzezeVar) {
        this.zza = zzfwcVar;
        this.zzb = zzezeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeod
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoe.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeof zzc() throws Exception {
        return new zzeof(this.zzb);
    }
}
