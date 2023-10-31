package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;

/* loaded from: classes.dex */
public final class zzcu extends zzato implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }
}
