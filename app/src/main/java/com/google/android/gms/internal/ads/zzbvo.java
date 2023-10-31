package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbvo extends zzatp implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbvp zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbvp ? (zzbvp) queryLocalInterface : new zzbvn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzd;
        zzbvw zzbvwVar = null;
        zzbvw zzbvwVar2 = null;
        zzbvx zzbvxVar = null;
        zzbvs zzbvsVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvwVar = queryLocalInterface instanceof zzbvw ? (zzbvw) queryLocalInterface : new zzbvu(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzf(zzlVar, zzbvwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbvsVar = queryLocalInterface2 instanceof zzbvs ? (zzbvs) queryLocalInterface2 : new zzbvq(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzk(zzbvsVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzatq.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbvxVar = queryLocalInterface3 instanceof zzbvx ? (zzbvx) queryLocalInterface3 : new zzbvx(readStrongBinder3);
                }
                zzatq.zzc(parcel);
                zzp(zzbvxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzatq.zzc(parcel);
                zzl((zzbwd) zzatq.zza(parcel, zzbwd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzd = zzd();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzd);
                return true;
            case 12:
                zzd = zzc();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzd);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbvwVar2 = queryLocalInterface4 instanceof zzbvw ? (zzbvw) queryLocalInterface4 : new zzbvu(readStrongBinder4);
                }
                zzatq.zzc(parcel);
                zzg(zzlVar2, zzbvwVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
