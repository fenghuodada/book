package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzeji implements zzcxt {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzewk.zza(this.zza, new zzewj() { // from class: com.google.android.gms.internal.ads.zzejh
            @Override // com.google.android.gms.internal.ads.zzewj
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
