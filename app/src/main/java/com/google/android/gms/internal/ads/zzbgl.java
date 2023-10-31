package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbgl extends zzato implements zzbgn {
    public zzbgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        zzbh(17, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzcsVar);
        zzbh(26, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzdgVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzF(zzbgk zzbgkVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbgkVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzG() throws RemoteException {
        Parcel zzbg = zzbg(30, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzatq.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbei zzi() throws RemoteException {
        zzbei zzbegVar;
        Parcel zzbg = zzbg(14, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbegVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbegVar = queryLocalInterface instanceof zzbei ? (zzbei) queryLocalInterface : new zzbeg(readStrongBinder);
        }
        zzbg.recycle();
        return zzbegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzben zzj() throws RemoteException {
        zzben zzbelVar;
        Parcel zzbg = zzbg(29, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbelVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbelVar = queryLocalInterface instanceof zzben ? (zzben) queryLocalInterface : new zzbel(readStrongBinder);
        }
        zzbg.recycle();
        return zzbelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbeq zzk() throws RemoteException {
        zzbeq zzbeoVar;
        Parcel zzbg = zzbg(5, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbeoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbeoVar = queryLocalInterface instanceof zzbeq ? (zzbeq) queryLocalInterface : new zzbeo(readStrongBinder);
        }
        zzbg.recycle();
        return zzbeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzl() throws RemoteException {
        return C6656q.m6130a(zzbg(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzm() throws RemoteException {
        return C6656q.m6130a(zzbg(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzu() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatq.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzatq.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzcwVar);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, bundle);
        zzbh(15, zza);
    }
}
