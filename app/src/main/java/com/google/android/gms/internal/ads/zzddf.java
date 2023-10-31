package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzddf extends zzdas implements zzbix {
    public zzddf(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(final zzbvi zzbviVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzddc
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzbix) obj).zza(zzbvi.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zzb() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzdde
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzbix) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final synchronized void zzc() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzddd
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzbix) obj).zzc();
            }
        });
    }
}
