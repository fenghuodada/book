package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzboj extends zzato {
    public zzboj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        Bundle bundle = (Bundle) zzatq.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzg() throws RemoteException {
        Parcel zzbg = zzbg(17, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbei zzh() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        zzbei zzj = zzbeh.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbeq zzi() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbeq zzg = zzbep.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return C6656q.m6130a(zzbg(18, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return C6656q.m6130a(zzbg(20, zza()));
    }

    public final IObjectWrapper zzl() throws RemoteException {
        return C6656q.m6130a(zzbg(21, zza()));
    }

    public final String zzm() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzr() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatq.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(11, zza);
    }

    public final void zzt() throws RemoteException {
        zzbh(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(12, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, iObjectWrapper2);
        zzatq.zzf(zza, iObjectWrapper3);
        zzbh(22, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(16, zza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel zzbg = zzbg(14, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzy() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
