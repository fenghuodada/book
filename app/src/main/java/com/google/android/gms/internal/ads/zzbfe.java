package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbfe extends zzatp implements zzbff {
    public zzbfe() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzh;
        String zzk;
        switch (i) {
            case 2:
                zzh = zzh();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzh);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzh = zzf();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzh);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                zzk = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 10:
                zzk = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                zzh = zzd();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzh);
                return true;
            case 14:
                zzatq.zzc(parcel);
                zzq((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzatq.zzc(parcel);
                boolean zzs = zzs((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 16:
                zzatq.zzc(parcel);
                zzr((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzh = zze();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzh);
                return true;
            case 18:
                zzh = zzg();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzh);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
