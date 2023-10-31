package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjh;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbrn;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyk;

/* loaded from: classes.dex */
public final class zzcc extends zzato implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbny zzbnyVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(3, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbny zzbnyVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(13, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbny zzbnyVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbny zzbnyVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(10, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(9, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(17, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeu zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, iObjectWrapper2);
        Parcel zzbg = zzbg(5, zza);
        zzbeu zzbx = zzbet.zzbx(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbx;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, iObjectWrapper2);
        zzatq.zzf(zza, iObjectWrapper3);
        Parcel zzbg = zzbg(11, zza);
        zzbfa zze = zzbez.zze(zzbg.readStrongBinder());
        zzbg.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbji zzk(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i, zzbjf zzbjfVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        zzatq.zzf(zza, zzbjfVar);
        Parcel zzbg = zzbg(16, zza);
        zzbji zzb = zzbjh.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbro zzl(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(15, zza);
        zzbro zzb = zzbrn.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(8, zza);
        zzbrv zzG = zzbru.zzG(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzn(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvp zzo(IObjectWrapper iObjectWrapper, String str, zzbny zzbnyVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(12, zza);
        zzbvp zzq = zzbvo.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzp(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(14, zza);
        zzbyk zzb = zzbyj.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }
}
