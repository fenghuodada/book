package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbpu extends zzatp implements zzbpv {
    public zzbpu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbpv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbpv ? (zzbpv) queryLocalInterface : new zzbpt(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqj zzf;
        int i3;
        zzbpy zzbpyVar = null;
        zzbpg zzbpeVar = null;
        zzbpp zzbpnVar = null;
        zzbpj zzbphVar = null;
        zzbps zzbpqVar = null;
        zzbpp zzbpnVar2 = null;
        zzbps zzbpqVar2 = null;
        zzbpm zzbpkVar = null;
        zzbpj zzbphVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzf = zzf();
            } else if (i != 3) {
                if (i != 5) {
                    if (i == 10) {
                        IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    } else if (i != 11) {
                        switch (i) {
                            case 13:
                                String readString = parcel.readString();
                                String readString2 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbphVar2 = queryLocalInterface instanceof zzbpj ? (zzbpj) queryLocalInterface : new zzbph(readStrongBinder);
                                }
                                zzbpj zzbpjVar = zzbphVar2;
                                zzatq.zzc(parcel);
                                zzj(readString, readString2, zzlVar, asInterface, zzbpjVar, zzbod.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                break;
                            case 14:
                                String readString3 = parcel.readString();
                                String readString4 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                if (readStrongBinder2 != null) {
                                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    zzbpkVar = queryLocalInterface2 instanceof zzbpm ? (zzbpm) queryLocalInterface2 : new zzbpk(readStrongBinder2);
                                }
                                zzbpm zzbpmVar = zzbpkVar;
                                zzboe zzb = zzbod.zzb(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                zzl(readString3, readString4, zzlVar2, asInterface2, zzbpmVar, zzb);
                                break;
                            case 15:
                                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                i3 = zzs(asInterface3);
                                parcel2.writeNoException();
                                parcel2.writeInt(i3);
                                break;
                            case 16:
                                String readString5 = parcel.readString();
                                String readString6 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder3 = parcel.readStrongBinder();
                                if (readStrongBinder3 != null) {
                                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzbpqVar2 = queryLocalInterface3 instanceof zzbps ? (zzbps) queryLocalInterface3 : new zzbpq(readStrongBinder3);
                                }
                                zzbps zzbpsVar = zzbpqVar2;
                                zzboe zzb2 = zzbod.zzb(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                zzp(readString5, readString6, zzlVar3, asInterface4, zzbpsVar, zzb2);
                                break;
                            case 17:
                                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                i3 = zzt(asInterface5);
                                parcel2.writeNoException();
                                parcel2.writeInt(i3);
                                break;
                            case 18:
                                String readString7 = parcel.readString();
                                String readString8 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder4 = parcel.readStrongBinder();
                                if (readStrongBinder4 != null) {
                                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbpnVar2 = queryLocalInterface4 instanceof zzbpp ? (zzbpp) queryLocalInterface4 : new zzbpn(readStrongBinder4);
                                }
                                zzbpp zzbppVar = zzbpnVar2;
                                zzboe zzb3 = zzbod.zzb(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                zzm(readString7, readString8, zzlVar4, asInterface6, zzbppVar, zzb3);
                                break;
                            case 19:
                                String readString9 = parcel.readString();
                                zzatq.zzc(parcel);
                                zzq(readString9);
                                break;
                            case 20:
                                String readString10 = parcel.readString();
                                String readString11 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder5 = parcel.readStrongBinder();
                                if (readStrongBinder5 != null) {
                                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    zzbpqVar = queryLocalInterface5 instanceof zzbps ? (zzbps) queryLocalInterface5 : new zzbpq(readStrongBinder5);
                                }
                                zzbps zzbpsVar2 = zzbpqVar;
                                zzboe zzb4 = zzbod.zzb(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                zzo(readString10, readString11, zzlVar5, asInterface7, zzbpsVar2, zzb4);
                                break;
                            case 21:
                                String readString12 = parcel.readString();
                                String readString13 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    zzbphVar = queryLocalInterface6 instanceof zzbpj ? (zzbpj) queryLocalInterface6 : new zzbph(readStrongBinder6);
                                }
                                zzbpj zzbpjVar2 = zzbphVar;
                                zzatq.zzc(parcel);
                                zzk(readString12, readString13, zzlVar6, asInterface8, zzbpjVar2, zzbod.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR));
                                break;
                            case 22:
                                String readString14 = parcel.readString();
                                String readString15 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    zzbpnVar = queryLocalInterface7 instanceof zzbpp ? (zzbpp) queryLocalInterface7 : new zzbpn(readStrongBinder7);
                                }
                                zzbpp zzbppVar2 = zzbpnVar;
                                zzatq.zzc(parcel);
                                zzn(readString14, readString15, zzlVar7, asInterface9, zzbppVar2, zzbod.zzb(parcel.readStrongBinder()), (zzbee) zzatq.zza(parcel, zzbee.CREATOR));
                                break;
                            case 23:
                                String readString16 = parcel.readString();
                                String readString17 = parcel.readString();
                                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                IBinder readStrongBinder8 = parcel.readStrongBinder();
                                if (readStrongBinder8 != null) {
                                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    zzbpeVar = queryLocalInterface8 instanceof zzbpg ? (zzbpg) queryLocalInterface8 : new zzbpe(readStrongBinder8);
                                }
                                zzbpg zzbpgVar = zzbpeVar;
                                zzboe zzb5 = zzbod.zzb(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                zzi(readString16, readString17, zzlVar8, asInterface10, zzbpgVar, zzb5);
                                break;
                            case 24:
                                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                zzatq.zzc(parcel);
                                i3 = zzr(asInterface11);
                                parcel2.writeNoException();
                                parcel2.writeInt(i3);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                        Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                    }
                    zzatq.zzc(parcel);
                } else {
                    com.google.android.gms.ads.internal.client.zzdq zze = zze();
                    parcel2.writeNoException();
                    zzatq.zzf(parcel2, zze);
                }
                return true;
            } else {
                zzf = zzg();
            }
            parcel2.writeNoException();
            zzatq.zze(parcel2, zzf);
            return true;
        }
        IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        String readString18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzatq.zza(parcel, creator);
        Bundle bundle2 = (Bundle) zzatq.zza(parcel, creator);
        com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            zzbpyVar = queryLocalInterface9 instanceof zzbpy ? (zzbpy) queryLocalInterface9 : new zzbpw(readStrongBinder9);
        }
        zzbpy zzbpyVar2 = zzbpyVar;
        zzatq.zzc(parcel);
        zzh(asInterface12, readString18, bundle, bundle2, zzqVar, zzbpyVar2);
        parcel2.writeNoException();
        return true;
    }
}
