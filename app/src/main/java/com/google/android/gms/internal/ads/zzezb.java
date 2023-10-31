package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes.dex */
final class zzezb implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzezc zzb;

    public zzezb(zzezc zzezcVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zzb = zzezcVar;
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdmo zzdmoVar;
        zzdmoVar = this.zzb.zzd;
        if (zzdmoVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzbzt.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
