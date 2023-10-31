package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzeef extends zzbpl {
    private final zzeby zza;

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zze(String str) throws RemoteException {
        ((zzedr) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzedr) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzg() throws RemoteException {
        ((zzedr) this.zza.zzc).zzo();
    }
}
