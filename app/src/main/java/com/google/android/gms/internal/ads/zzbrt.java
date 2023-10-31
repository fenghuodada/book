package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbrt extends zzato implements zzbrv {
    public zzbrt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final boolean zzF() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zzatq.zzd(zza, intent);
        zzbh(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() throws RemoteException {
        zzbh(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzk(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzn() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzo(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzp() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzq() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        Parcel zzbg = zzbg(6, zza);
        if (zzbg.readInt() != 0) {
            bundle.readFromParcel(zzbg);
        }
        zzbg.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzs() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzt() throws RemoteException {
        zzbh(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzu() throws RemoteException {
        zzbh(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzw() throws RemoteException {
        zzbh(9, zza());
    }
}
