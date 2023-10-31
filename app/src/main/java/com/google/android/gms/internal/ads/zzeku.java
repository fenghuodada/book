package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeku implements zzeqq {
    private final zzfwb zza;
    private final Executor zzb;

    public zzeku(zzfwb zzfwbVar, Executor executor) {
        this.zza = zzfwbVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzm(this.zza, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                final String str = (String) obj;
                return zzfvr.zzh(new zzeqp() { // from class: com.google.android.gms.internal.ads.zzeks
                    @Override // com.google.android.gms.internal.ads.zzeqp
                    public final void zzh(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
