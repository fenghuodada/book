package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;

/* loaded from: classes.dex */
public abstract class zzcd extends zzatp implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzd;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatq.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbny zzf = zzbnx.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                break;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzatq.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbny zzf2 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                break;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbny zzf3 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzb(asInterface3, readString3, zzf3, readInt3);
                break;
            case 4:
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                zzatq.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd = zzi(asInterface4, asInterface5);
                break;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbny zzf4 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzn(asInterface6, zzf4, readInt4);
                break;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd = zzm(asInterface7);
                break;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzg(asInterface8, readInt5);
                break;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzatq.zza(parcel, zzq.CREATOR), readString4, readInt6);
                break;
            case 11:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd = zzj(asInterface9, asInterface10, asInterface11);
                break;
            case 12:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbny zzf5 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzo(asInterface12, readString5, zzf5, readInt7);
                break;
            case 13:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzatq.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbny zzf6 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzc(asInterface13, zzqVar3, readString6, zzf6, readInt8);
                break;
            case 14:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbny zzf7 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzp(asInterface14, zzf7, readInt9);
                break;
            case 15:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbny zzf8 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzl(asInterface15, zzf8, readInt10);
                break;
            case 16:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbny zzf9 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjf zzc = zzbje.zzc(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd = zzk(asInterface16, zzf9, readInt11, zzc);
                break;
            case 17:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbny zzf10 = zzbnx.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzatq.zzc(parcel);
                zzd = zzh(asInterface17, zzf10, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzatq.zzf(parcel2, zzd);
        return true;
    }
}
