package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbvq extends zzato implements zzbvs {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzf() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzg() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzk(zzbvm zzbvmVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbvmVar);
        zzbh(3, zza);
    }
}
