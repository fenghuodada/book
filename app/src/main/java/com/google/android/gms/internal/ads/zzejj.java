package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzejj implements com.google.android.gms.ads.internal.client.zza, zzdcw {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzbzt.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final synchronized void zzr() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                zzbzt.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcw
    public final synchronized void zzs() {
    }
}
