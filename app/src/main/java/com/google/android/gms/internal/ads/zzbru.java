package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbru extends zzatp implements zzbrv {
    public zzbru() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbrv zzG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbrv ? (zzbrv) queryLocalInterface : new zzbrt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzatq.zzc(parcel);
                zzk((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                zzs();
                break;
            case 4:
                zzq();
                break;
            case 5:
                zzn();
                break;
            case 6:
                Bundle bundle = (Bundle) zzatq.zza(parcel, Bundle.CREATOR);
                zzatq.zzc(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                zzatq.zze(parcel2, bundle);
                return true;
            case 7:
                zzt();
                break;
            case 8:
                zzl();
                break;
            case 9:
                zzw();
                break;
            case 10:
                zzh();
                break;
            case 11:
                boolean zzF = zzF();
                parcel2.writeNoException();
                int i3 = zzatq.zza;
                parcel2.writeInt(zzF ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) zzatq.zza(parcel, Intent.CREATOR);
                zzatq.zzc(parcel);
                break;
            case 13:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzj(asInterface);
                break;
            case 14:
                zzu();
                break;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzatq.zzc(parcel);
                zzo(readInt, createStringArray, createIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
