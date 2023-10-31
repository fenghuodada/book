package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzcgr extends zzatp implements zzcgs {
    public zzcgr() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzf;
        switch (i) {
            case 1:
                zzatq.zzc(parcel);
                zzp((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzatq.zzc(parcel);
                Bundle zzd = zzd((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzd);
                return true;
            case 3:
                zzatq.zzc(parcel);
                zzo(parcel.readString(), parcel.readString(), (Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzt(readString, readString2, asInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                Map zzk = zzk(readString3, readString4, zzg);
                parcel2.writeNoException();
                parcel2.writeMap(zzk);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzatq.zzc(parcel);
                int zzb = zzb(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                zzatq.zzc(parcel);
                zzq((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzatq.zzc(parcel);
                zzm(parcel.readString(), parcel.readString(), (Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzatq.zzc(parcel);
                List zzj = zzj(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(zzj);
                return true;
            case 10:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                zzf = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzatq.zzc(parcel);
                zzl(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzatq.zzc(parcel);
                zzn(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzatq.zzc(parcel);
                zzs(asInterface2, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 17:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 18:
                zzf = zze();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 19:
                zzatq.zzc(parcel);
                zzr((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
