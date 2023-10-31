package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbpe extends zzato implements zzbpg {
    public zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final void zzg() throws RemoteException {
        zzbh(2, zza());
    }
}
