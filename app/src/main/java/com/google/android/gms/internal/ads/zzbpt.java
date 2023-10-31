package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbpt extends zzato implements zzbpv {
    public zzbpt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbqj zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbqj zzbqjVar = (zzbqj) zzatq.zza(zzbg, zzbqj.CREATOR);
        zzbg.recycle();
        return zzbqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbqj zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbqj zzbqjVar = (zzbqj) zzatq.zza(zzbg, zzbqj.CREATOR);
        zzbg.recycle();
        return zzbqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbpy zzbpyVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatq.zzd(zza, bundle);
        zzatq.zzd(zza, bundle2);
        zzatq.zzd(zza, zzqVar);
        zzatq.zzf(zza, zzbpyVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpg zzbpgVar, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpgVar);
        zzatq.zzf(zza, zzboeVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpj zzbpjVar, zzboe zzboeVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpjVar);
        zzatq.zzf(zza, zzboeVar);
        zzatq.zzd(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpj zzbpjVar, zzboe zzboeVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpjVar);
        zzatq.zzf(zza, zzboeVar);
        zzatq.zzd(zza, zzqVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpm zzbpmVar, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpmVar);
        zzatq.zzf(zza, zzboeVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpp zzbppVar, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbppVar);
        zzatq.zzf(zza, zzboeVar);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpp zzbppVar, zzboe zzboeVar, zzbee zzbeeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbppVar);
        zzatq.zzf(zza, zzboeVar);
        zzatq.zzd(zza, zzbeeVar);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbps zzbpsVar, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpsVar);
        zzatq.zzf(zza, zzboeVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbps zzbpsVar, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzd(zza, zzlVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbpsVar);
        zzatq.zzf(zza, zzboeVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
