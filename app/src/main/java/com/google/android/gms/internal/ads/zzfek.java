package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfek {
    private final Executor zza;
    private final zzbzy zzb;

    public zzfek(Executor executor, zzbzy zzbzyVar) {
        this.zza = executor;
        this.zzb = zzbzyVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // java.lang.Runnable
            public final void run() {
                zzfek.this.zza(str);
            }
        });
    }
}
