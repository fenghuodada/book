package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

/* loaded from: classes.dex */
public abstract class zzdp extends zzatp implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        float zzg;
        zzdt zzdrVar;
        int i3;
        boolean z;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzg2 = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzj(zzg2);
                parcel2.writeNoException();
                return true;
            case 4:
                z = zzq();
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 5:
                int zzh = zzh();
                parcel2.writeNoException();
                i3 = zzh;
                parcel2.writeInt(i3);
                return true;
            case 6:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                zzg = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdrVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzm(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzg = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 10:
                z = zzp();
                parcel2.writeNoException();
                int i42 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 11:
                zzdt zzi = zzi();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzi);
                return true;
            case 12:
                z = zzo();
                parcel2.writeNoException();
                int i422 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
