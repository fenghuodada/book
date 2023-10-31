package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzddm extends zzdas {
    private boolean zzb;

    public zzddm(Set set) {
        super(set);
    }

    public final void zza() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzddi
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzddk
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzp(zzddj.zza);
            this.zzb = true;
        }
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzp(zzddj.zza);
        this.zzb = true;
    }
}
