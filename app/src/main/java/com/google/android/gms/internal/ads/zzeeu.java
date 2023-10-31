package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzeeu extends zzbpo {
    final /* synthetic */ zzeev zza;
    private final zzeby zzb;

    public /* synthetic */ zzeeu(zzeev zzeevVar, zzeby zzebyVar, zzeet zzeetVar) {
        this.zza = zzeevVar;
        this.zzb = zzebyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zze(String str) throws RemoteException {
        ((zzedr) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzedr) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zzg(zzbon zzbonVar) throws RemoteException {
        zzeev.zzc(this.zza, zzbonVar);
        ((zzedr) this.zzb.zzc).zzo();
    }
}
