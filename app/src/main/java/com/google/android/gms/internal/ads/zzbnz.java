package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbnz extends zzato implements zzbob {
    public zzbnz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzboeVar);
        zzbh(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzboeVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzatq.zza;
        zza.writeInt(z ? 1 : 0);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzboj zzO() throws RemoteException {
        zzboj zzbojVar;
        Parcel zzbg = zzbg(15, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbojVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbojVar = queryLocalInterface instanceof zzboj ? (zzboj) queryLocalInterface : new zzboj(readStrongBinder);
        }
        zzbg.recycle();
        return zzbojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzbok zzP() throws RemoteException {
        zzbok zzbokVar;
        Parcel zzbg = zzbg(16, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbokVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbokVar = queryLocalInterface instanceof zzbok ? (zzbok) queryLocalInterface : new zzbok(readStrongBinder);
        }
        zzbg.recycle();
        return zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzbfk zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzboh zzj() throws RemoteException {
        zzboh zzbofVar;
        Parcel zzbg = zzbg(36, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbofVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbofVar = queryLocalInterface instanceof zzboh ? (zzboh) queryLocalInterface : new zzbof(readStrongBinder);
        }
        zzbg.recycle();
        return zzbofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzbon zzk() throws RemoteException {
        zzbon zzbolVar;
        Parcel zzbg = zzbg(27, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbolVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbolVar = queryLocalInterface instanceof zzbon ? (zzbon) queryLocalInterface : new zzbol(readStrongBinder);
        }
        zzbg.recycle();
        return zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzbqj zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbqj zzbqjVar = (zzbqj) zzatq.zza(zzbg, zzbqj.CREATOR);
        zzbg.recycle();
        return zzbqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final zzbqj zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbqj zzbqjVar = (zzbqj) zzatq.zza(zzbg, zzbqj.CREATOR);
        zzbg.recycle();
        return zzbqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final IObjectWrapper zzn() throws RemoteException {
        return C6656q.m6130a(zzbg(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvh zzbvhVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(null);
        zzatq.zzf(zza, zzbvhVar);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzq(IObjectWrapper iObjectWrapper, zzbki zzbkiVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbkiVar);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbvhVar);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzboeVar);
        zzbh(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzf(zza, zzboeVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzf(zza, zzboeVar);
        zzbh(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzboe zzboeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzf(zza, zzboeVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbob
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzboe zzboeVar, zzbee zzbeeVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatq.zzf(zza, zzboeVar);
        zzatq.zzd(zza, zzbeeVar);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
