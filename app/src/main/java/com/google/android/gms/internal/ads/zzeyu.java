package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes.dex */
final class zzeyu implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzeyw zzb;

    public zzeyu(zzeyw zzeywVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzeywVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdmo zzdmoVar;
        zzdmoVar = this.zzb.zzi;
        if (zzdmoVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                zzbzt.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
