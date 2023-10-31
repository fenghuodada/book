package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfnj extends zzato implements zzfnl {
    public zzfnj(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final void zze(Bundle bundle, zzfnn zzfnnVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        zzatq.zzf(zza, zzfnnVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final void zzf(String str, Bundle bundle, zzfnn zzfnnVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatq.zzd(zza, bundle);
        zzatq.zzf(zza, zzfnnVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final void zzg(Bundle bundle, zzfnn zzfnnVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        zzatq.zzf(zza, zzfnnVar);
        zzbi(3, zza);
    }
}
