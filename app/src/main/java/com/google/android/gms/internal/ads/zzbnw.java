package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbnw extends zzato implements zzbny {
    public zzbnw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbob zzb(String str) throws RemoteException {
        zzbob zzbnzVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbnzVar = queryLocalInterface instanceof zzbob ? (zzbob) queryLocalInterface : new zzbnz(readStrongBinder);
        }
        zzbg.recycle();
        return zzbnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final zzbpv zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(3, zza);
        zzbpv zzb = zzbpu.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(4, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final boolean zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
