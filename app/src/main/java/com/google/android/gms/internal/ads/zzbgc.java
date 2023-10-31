package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgc extends zzato implements zzbge {
    public zzbgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zze(zzbgn zzbgnVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbgnVar);
        zzbh(1, zza);
    }
}
