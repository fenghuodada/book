package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;

/* loaded from: classes.dex */
public final class zzcj extends zzato implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbny getAdapterCreator() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbny zzf = zzbnx.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzatq.zza(zzbg, zzen.CREATOR);
        zzbg.recycle();
        return zzenVar;
    }
}
