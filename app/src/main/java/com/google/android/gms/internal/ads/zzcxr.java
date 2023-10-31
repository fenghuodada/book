package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcxr extends zzdas implements zzcwc, zzcxh {
    private final zzezf zzb;
    private final AtomicBoolean zzc;

    public zzcxr(Set set, zzezf zzezfVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzezfVar;
    }

    private final void zzb() {
        com.google.android.gms.ads.internal.client.zzs zzsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhp)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzsVar = this.zzb.zzaf) != null && zzsVar.zza == 3) {
            zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcxq
                @Override // com.google.android.gms.internal.ads.zzdar
                public final void zza(Object obj) {
                    zzcxr.this.zza((zzcxt) obj);
                }
            });
        }
    }

    public final /* synthetic */ void zza(zzcxt zzcxtVar) throws Exception {
        zzcxtVar.zzh(this.zzb.zzaf);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
