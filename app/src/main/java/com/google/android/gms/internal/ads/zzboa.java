package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzboa extends zzatp implements zzbob {
    public zzboa() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzn;
        Parcelable zze;
        zzboe zzboeVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface instanceof zzboe ? (zzboe) queryLocalInterface : new zzboc(readStrongBinder);
                }
                zzboe zzboeVar2 = zzboeVar;
                zzatq.zzc(parcel);
                zzu(asInterface, zzqVar, zzlVar, readString, zzboeVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                zzn = zzn();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface2 instanceof zzboe ? (zzboe) queryLocalInterface2 : new zzboc(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzx(asInterface2, zzlVar2, readString2, zzboeVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface3 instanceof zzboe ? (zzboe) queryLocalInterface3 : new zzboc(readStrongBinder3);
                }
                zzboe zzboeVar3 = zzboeVar;
                zzatq.zzc(parcel);
                zzv(asInterface3, zzqVar2, zzlVar3, readString3, readString4, zzboeVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface4 instanceof zzboe ? (zzboe) queryLocalInterface4 : new zzboc(readStrongBinder4);
                }
                zzboe zzboeVar4 = zzboeVar;
                zzatq.zzc(parcel);
                zzy(asInterface4, zzlVar4, readString5, readString6, zzboeVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString7 = parcel.readString();
                zzbvh zzb = zzbvg.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzatq.zzc(parcel);
                zzp(asInterface5, zzlVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzatq.zzc(parcel);
                zzs((com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i3 = zzatq.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface5 instanceof zzboe ? (zzboe) queryLocalInterface5 : new zzboc(readStrongBinder5);
                }
                zzboe zzboeVar5 = zzboeVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzatq.zzc(parcel);
                zzz(asInterface6, zzlVar6, readString10, readString11, zzboeVar5, (zzbee) zzatq.zza(parcel, zzbee.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                zzatq.zzf(parcel2, null);
                return true;
            case 17:
                zze = zze();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zze);
                return true;
            case 18:
                zze = zzf();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zze);
                return true;
            case 19:
                zze = zzg();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zze);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzatq.zzc(parcel);
                zzB((com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzD(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzatq.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvh zzb2 = zzbvg.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzatq.zzc(parcel);
                zzr(asInterface8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzn = zzi();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 25:
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzG(zzg);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzh();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 27:
                zzn = zzk();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface6 instanceof zzboe ? (zzboe) queryLocalInterface6 : new zzboc(readStrongBinder6);
                }
                zzatq.zzc(parcel);
                zzA(asInterface9, zzlVar7, readString14, zzboeVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzK(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbki zzb3 = zzbkh.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbko.CREATOR);
                zzatq.zzc(parcel);
                zzq(asInterface11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface7 instanceof zzboe ? (zzboe) queryLocalInterface7 : new zzboc(readStrongBinder7);
                }
                zzatq.zzc(parcel);
                zzC(asInterface12, zzlVar8, readString15, zzboeVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zze = zzl();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zze);
                return true;
            case 34:
                zze = zzm();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zze);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface8 instanceof zzboe ? (zzboe) queryLocalInterface8 : new zzboc(readStrongBinder8);
                }
                zzboe zzboeVar6 = zzboeVar;
                zzatq.zzc(parcel);
                zzw(asInterface13, zzqVar3, zzlVar9, readString16, readString17, zzboeVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzn = zzj();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzn);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzJ(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzboeVar = queryLocalInterface9 instanceof zzboe ? (zzboe) queryLocalInterface9 : new zzboc(readStrongBinder9);
                }
                zzatq.zzc(parcel);
                zzt(asInterface15, zzlVar10, readString18, zzboeVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzH(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
