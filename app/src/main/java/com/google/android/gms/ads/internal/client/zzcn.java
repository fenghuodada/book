package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzcn extends zzatp implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzda zzcyVar;
        switch (i) {
            case 1:
                zzk();
                break;
            case 2:
                float readFloat = parcel.readFloat();
                zzatq.zzc(parcel);
                zzq(readFloat);
                break;
            case 3:
                String readString = parcel.readString();
                zzatq.zzc(parcel);
                zzr(readString);
                break;
            case 4:
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzp(zzg);
                break;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                zzn(asInterface, readString2);
                break;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzl(readString3, asInterface2);
                break;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                int i3 = zzatq.zza;
                parcel2.writeInt(zzv ? 1 : 0);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzatq.zzc(parcel);
                zzh(readString4);
                break;
            case 11:
                zzbny zzf2 = zzbnx.zzf(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzo(zzf2);
                break;
            case 12:
                zzbkl zzc = zzbkk.zzc(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzs(zzc);
                break;
            case 13:
                List zzg2 = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg2);
                return true;
            case 14:
                zzatq.zzc(parcel);
                zzu((zzff) zzatq.zza(parcel, zzff.CREATOR));
                break;
            case 15:
                zzi();
                break;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = queryLocalInterface instanceof zzda ? (zzda) queryLocalInterface : new zzcy(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzm(zzcyVar);
                break;
            case 17:
                boolean zzg3 = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzj(zzg3);
                break;
            case 18:
                String readString5 = parcel.readString();
                zzatq.zzc(parcel);
                zzt(readString5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
