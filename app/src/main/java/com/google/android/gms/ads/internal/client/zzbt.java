package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvc;

/* loaded from: classes.dex */
public abstract class zzbt extends zzatp implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzn;
        Parcelable zzg;
        String zzs;
        int i3;
        boolean z;
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i) {
            case 1:
                zzn = zzn();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                z = zzZ();
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 4:
                zzatq.zzc(parcel);
                boolean zzaa = zzaa((zzl) zzatq.zza(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                i3 = zzaa;
                parcel2.writeInt(i3);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcbVar = queryLocalInterface2 instanceof zzcb ? (zzcb) queryLocalInterface2 : new zzbz(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzg = zzg();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzg);
                return true;
            case 13:
                zzatq.zzc(parcel);
                zzF((zzq) zzatq.zza(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbse zzb = zzbsd.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbsh zzb2 = zzbsg.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzatq.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbci zzb3 = zzbch.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof zzbe ? (zzbe) queryLocalInterface3 : new zzbc(readStrongBinder3);
                }
                zzatq.zzc(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface4 instanceof zzcf ? (zzcf) queryLocalInterface4 : new zzcf(readStrongBinder4);
                }
                zzatq.zzc(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                z = zzY();
                parcel2.writeNoException();
                int i42 = zzatq.zza;
                i3 = z;
                parcel2.writeInt(i3);
                return true;
            case 24:
                zzbvc zzb4 = zzbvb.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzl();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 29:
                zzatq.zzc(parcel);
                zzU((zzfl) zzatq.zza(parcel, zzfl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzatq.zzc(parcel);
                zzK((zzdu) zzatq.zza(parcel, zzdu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 32:
                zzn = zzj();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 33:
                zzn = zzi();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 34:
                boolean zzg3 = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof zzby ? (zzby) queryLocalInterface5 : new zzbw(readStrongBinder5);
                }
                zzatq.zzc(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                zzg = zzd();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzg);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzatq.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzatq.zzc(parcel);
                zzI((zzw) zzatq.zza(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzavu zze = zzavt.zze(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzn = zzk();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdgVar = queryLocalInterface6 instanceof zzdg ? (zzdg) queryLocalInterface6 : new zzde(readStrongBinder6);
                }
                zzatq.zzc(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) zzatq.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof zzbk ? (zzbk) queryLocalInterface7 : new zzbi(readStrongBinder7);
                }
                zzatq.zzc(parcel);
                zzy(zzlVar, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzciVar = queryLocalInterface8 instanceof zzci ? (zzci) queryLocalInterface8 : new zzcg(readStrongBinder8);
                }
                zzatq.zzc(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
