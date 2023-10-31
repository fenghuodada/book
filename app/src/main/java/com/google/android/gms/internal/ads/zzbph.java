package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbph extends zzato implements zzbpj {
    public zzbph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzh(zzboh zzbohVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbohVar);
        zzbh(4, zza);
    }
}
