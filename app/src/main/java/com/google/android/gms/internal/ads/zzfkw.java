package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzfkw extends zzato implements zzfky {
    public zzfkw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfky
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbh(5, zza);
    }
}
