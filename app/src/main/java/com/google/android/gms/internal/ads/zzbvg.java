package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbvg extends zzatp implements zzbvh {
    public zzbvg() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbvh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbvh ? (zzbvh) queryLocalInterface : new zzbvf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzl(asInterface);
                break;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzatq.zzc(parcel);
                zzk(asInterface2, readInt);
                break;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzi(asInterface3);
                break;
            case 4:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzj(asInterface4);
                break;
            case 5:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzo(asInterface5);
                break;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzf(asInterface6);
                break;
            case 7:
                zzatq.zzc(parcel);
                zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzbvi) zzatq.zza(parcel, zzbvi.CREATOR));
                break;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zze(asInterface7);
                break;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzatq.zzc(parcel);
                zzg(asInterface8, readInt2);
                break;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzh(asInterface9);
                break;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzn(asInterface10);
                break;
            case 12:
                Bundle bundle = (Bundle) zzatq.zza(parcel, Bundle.CREATOR);
                zzatq.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
