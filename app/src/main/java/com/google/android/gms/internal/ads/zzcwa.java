package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcwa extends zzdas {
    private boolean zzb;

    public zzcwa(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcwc) obj).zzl();
            }
        });
        this.zzb = true;
    }
}
