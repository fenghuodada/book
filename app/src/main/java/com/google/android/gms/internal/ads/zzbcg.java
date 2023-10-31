package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbcg extends zzato implements zzbci {
    public zzbcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbci
    public final void zze(zzbcf zzbcfVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbcfVar);
        zzbh(1, zza);
    }
}
