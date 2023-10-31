package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbvn extends zzato implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzatq.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final zzbvm zzd() throws RemoteException {
        zzbvm zzbvkVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvkVar = queryLocalInterface instanceof zzbvm ? (zzbvm) queryLocalInterface : new zzbvk(readStrongBinder);
        }
        zzbg.recycle();
        return zzbvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, zzbvwVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, zzbvwVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzatq.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzddVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzdgVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzk(zzbvs zzbvsVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbvsVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzl(zzbwd zzbwdVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbwdVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzp(zzbvx zzbvxVar) throws RemoteException {
        throw null;
    }
}
