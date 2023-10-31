package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzavs extends zzato implements zzavu {
    public zzavs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzd(zzavr zzavrVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzavrVar);
        zzbh(1, zza);
    }
}
