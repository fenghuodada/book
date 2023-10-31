package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbem extends zzatp implements zzben {
    public zzbem() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        float zze;
        IInterface zzi;
        zzbfy zzbfyVar;
        int i3;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzj(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                zzi = zzi();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzi);
                return true;
            case 5:
                zze = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 6:
                zze = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 7:
                zzi = zzh();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzi);
                return true;
            case 8:
                i3 = zzl();
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                parcel2.writeInt(i3);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbfyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbfyVar = queryLocalInterface instanceof zzbfy ? (zzbfy) queryLocalInterface : new zzbfy(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzm(zzbfyVar);
                parcel2.writeNoException();
                return true;
            case 10:
                i3 = zzk();
                parcel2.writeNoException();
                int i42 = zzatq.zza;
                parcel2.writeInt(i3);
                return true;
            default:
                return false;
        }
    }
}
