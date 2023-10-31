package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcyb extends zzdas implements zzcyd {
    public zzcyb(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(final zzezr zzezrVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcya
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcyd) obj).zzb(zzezr.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(final zzbug zzbugVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcxz
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcyd) obj).zzbA(zzbug.this);
            }
        });
    }
}
