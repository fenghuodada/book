package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdmc extends zzdlm implements zzdcw {
    private zzdcw zza;

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhb zzbhbVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhd zzbhdVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, zzdcw zzdcwVar) {
        super.zzh(zzaVar, zzbhbVar, zzoVar, zzbhdVar, zzzVar);
        this.zza = zzdcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final synchronized void zzr() {
        zzdcw zzdcwVar = this.zza;
        if (zzdcwVar != null) {
            zzdcwVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final synchronized void zzs() {
        zzdcw zzdcwVar = this.zza;
        if (zzdcwVar != null) {
            zzdcwVar.zzs();
        }
    }
}
