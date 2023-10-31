package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkz;

/* loaded from: classes.dex */
public final class zzbo extends zzato implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzbg = zzbg(1, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        zzbg.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfo zzbfoVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfr zzbfrVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbfx zzbfxVar, zzbfu zzbfuVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatq.zzf(zza, zzbfxVar);
        zzatq.zzf(zza, zzbfuVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbkz zzbkzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgb zzbgbVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbgbVar);
        zzatq.zzd(zza, zzqVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbge zzbgeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbgeVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbhVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, adManagerAdViewOptions);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbkq zzbkqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbee zzbeeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbeeVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) throws RemoteException {
        throw null;
    }
}
