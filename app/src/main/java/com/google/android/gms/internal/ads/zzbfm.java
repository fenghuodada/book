package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbfm extends zzato implements zzbfo {
    public zzbfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfo
    public final void zze(zzbff zzbffVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbffVar);
        zzbh(1, zza);
    }
}
