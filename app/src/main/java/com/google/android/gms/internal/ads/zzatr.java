package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzatr extends zzato implements zzatt {
    public zzatr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbh(5, zza);
    }
}
