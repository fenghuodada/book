package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbom extends zzatp implements zzbon {
    public zzbom() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbon zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbon ? (zzbon) queryLocalInterface : new zzbol(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzs;
        IInterface zzl;
        int i3;
        float zzf;
        switch (i) {
            case 2:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                zzs = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 5:
                zzl = zzl();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzl);
                return true;
            case 6:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 7:
                zzs = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzs = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 10:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                zzl = zzj();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzl);
                return true;
            case 12:
                parcel2.writeNoException();
                zzl = null;
                zzatq.zzf(parcel2, zzl);
                return true;
            case 13:
                zzl = zzm();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzl);
                return true;
            case 14:
                zzl = zzn();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzl);
                return true;
            case 15:
                zzl = zzo();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzl);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzi);
                return true;
            case 17:
                i3 = zzB();
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                parcel2.writeInt(i3);
                return true;
            case 18:
                i3 = zzA();
                parcel2.writeNoException();
                int i42 = zzatq.zza;
                parcel2.writeInt(i3);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzw(asInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzy(asInterface2, asInterface3, asInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzz(asInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 25:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            default:
                return false;
        }
    }
}
