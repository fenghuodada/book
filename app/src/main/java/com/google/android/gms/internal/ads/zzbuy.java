package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbuy extends zzatp implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int i3;
        if (i == 1) {
            zzatq.zzc(parcel);
            zzg((zzbvd) zzatq.zza(parcel, zzbvd.CREATOR));
        } else if (i != 2) {
            zzbvc zzbvcVar = null;
            zzbux zzbuxVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbvcVar = queryLocalInterface instanceof zzbvc ? (zzbvc) queryLocalInterface : new zzbva(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzo(zzbvcVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        i3 = zzs();
                        parcel2.writeNoException();
                        int i4 = zzatq.zza;
                        parcel2.writeInt(i3);
                        break;
                    case 6:
                        zzh();
                        break;
                    case 7:
                        zzj();
                        break;
                    case 8:
                        zze();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatq.zzc(parcel);
                        zzi(asInterface);
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatq.zzc(parcel);
                        zzk(asInterface2);
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatq.zzc(parcel);
                        zzf(asInterface3);
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzatq.zzc(parcel);
                        zzp(readString);
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zzb = com.google.android.gms.ads.internal.client.zzbx.zzb(parcel.readStrongBinder());
                        zzatq.zzc(parcel);
                        zzl(zzb);
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        zzatq.zze(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbuxVar = queryLocalInterface2 instanceof zzbux ? (zzbux) queryLocalInterface2 : new zzbux(readStrongBinder2);
                        }
                        zzatq.zzc(parcel);
                        zzu(zzbuxVar);
                        break;
                    case 17:
                        parcel.readString();
                        zzatq.zzc(parcel);
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatq.zzc(parcel);
                        zzr(asInterface4);
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzatq.zzc(parcel);
                        zzm(readString2);
                        break;
                    case 20:
                        i3 = zzt();
                        parcel2.writeNoException();
                        int i42 = zzatq.zza;
                        parcel2.writeInt(i3);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                        parcel2.writeNoException();
                        zzatq.zzf(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzn(zzg);
            }
        } else {
            zzq();
        }
        parcel2.writeNoException();
        return true;
    }
}
