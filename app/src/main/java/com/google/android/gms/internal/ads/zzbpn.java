package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbpn extends zzato implements zzbpp {
    public zzbpn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final void zzg(zzbon zzbonVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbonVar);
        zzbh(1, zza);
    }
}
