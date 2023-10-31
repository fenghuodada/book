package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbkz;

/* loaded from: classes.dex */
public abstract class zzbp extends zzatp implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzl(zzbhVar);
                break;
            case 3:
                zzbfo zzb = zzbfn.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzf(zzb);
                break;
            case 4:
                zzbfr zzb2 = zzbfq.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzg(zzb2);
                break;
            case 5:
                String readString = parcel.readString();
                zzbfx zzb3 = zzbfw.zzb(parcel.readStrongBinder());
                zzbfu zzb4 = zzbft.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                break;
            case 6:
                zzatq.zzc(parcel);
                zzo((zzbee) zzatq.zza(parcel, zzbee.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzq(zzcfVar);
                break;
            case 8:
                zzatq.zzc(parcel);
                zzj(zzbga.zzb(parcel.readStrongBinder()), (zzq) zzatq.zza(parcel, zzq.CREATOR));
                break;
            case 9:
                zzatq.zzc(parcel);
                zzp((PublisherAdViewOptions) zzatq.zza(parcel, PublisherAdViewOptions.CREATOR));
                break;
            case 10:
                zzbge zzb5 = zzbgd.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzk(zzb5);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzatq.zzc(parcel);
                zzn((zzbkq) zzatq.zza(parcel, zzbkq.CREATOR));
                break;
            case 14:
                zzbkz zzb6 = zzbky.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzi(zzb6);
                break;
            case 15:
                zzatq.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzatq.zza(parcel, AdManagerAdViewOptions.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
