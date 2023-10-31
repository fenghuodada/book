package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbod extends zzatp implements zzboe {
    public zzbod() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzboe zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzboe ? (zzboe) queryLocalInterface : new zzboc(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzatq.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzboi) {
                        zzboi zzboiVar = (zzboi) queryLocalInterface;
                    }
                }
                zzatq.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbfj.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzatq.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzatq.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzatq.zzc(parcel);
                zzs((zzbvi) zzatq.zza(parcel, zzbvi.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbvm zzb = zzbvl.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzatq.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzatq.zza(parcel, Bundle.CREATOR);
                zzatq.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzatq.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzatq.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzatq.zzc(parcel);
                zzh((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 24:
                zzatq.zzc(parcel);
                zzk((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
