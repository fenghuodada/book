package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbfg extends zzatp implements zzbfh {
    public zzbfg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzg;
        String zzk;
        switch (i) {
            case 2:
                zzg = zzg();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzg = zze();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                zzk = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzg = zzc();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 12:
                zzatq.zzc(parcel);
                zzo((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzatq.zzc(parcel);
                boolean zzq = zzq((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                zzatq.zzc(parcel);
                zzp((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzg = zzd();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 16:
                zzg = zzf();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzg);
                return true;
            case 17:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
