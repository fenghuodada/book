package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfi extends zzato implements zzbfk {
    public zzbfi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final zzben zzf() throws RemoteException {
        zzben zzbelVar;
        Parcel zzbg = zzbg(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final zzbeq zzg(String str) throws RemoteException {
        zzbeq zzbeoVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
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

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final IObjectWrapper zzh() throws RemoteException {
        return C6656q.m6130a(zzbg(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final String zzi() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(1, zza);
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final List zzk() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList<String> createStringArrayList = zzbg.createStringArrayList();
        zzbg.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzm() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzo() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzq() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(10, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzt() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
