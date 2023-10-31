package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbfj extends zzatp implements zzbfk {
    public zzbfj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbfk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbfk ? (zzbfk) queryLocalInterface : new zzbfi(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzj;
        IInterface zzg;
        boolean z;
        int i3;
        boolean z2;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzatq.zzc(parcel);
                zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                zzg = zzg(readString2);
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                zzj = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzatq.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                zzg = zze();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzg = zzh();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                z2 = zzs(asInterface);
                parcel2.writeNoException();
                i3 = z2;
                parcel2.writeInt(i3);
                return true;
            case 11:
                parcel2.writeNoException();
                zzg = null;
                zzatq.zzf(parcel2, zzg);
                return true;
            case 12:
                z = zzq();
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 13:
                z = zzt();
                parcel2.writeNoException();
                int i42 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzp(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzg = zzf();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 17:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                z2 = zzr(asInterface3);
                parcel2.writeNoException();
                i3 = z2;
                parcel2.writeInt(i3);
                return true;
            default:
                return false;
        }
    }
}
