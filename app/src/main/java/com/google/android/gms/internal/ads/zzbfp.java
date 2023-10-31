package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbfp extends zzato implements zzbfr {
    public zzbfp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zze(zzbfh zzbfhVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbfhVar);
        zzbh(1, zza);
    }
}
