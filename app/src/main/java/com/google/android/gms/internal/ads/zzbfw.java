package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbfw extends zzatp implements zzbfx {
    public zzbfw() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbfx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof zzbfx ? (zzbfx) queryLocalInterface : new zzbfv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfk zzbfiVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbfiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzbfiVar = queryLocalInterface instanceof zzbfk ? (zzbfk) queryLocalInterface : new zzbfi(readStrongBinder);
            }
            zzatq.zzc(parcel);
            zze(zzbfiVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
