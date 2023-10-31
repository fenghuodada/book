package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbgf extends zzato implements zzbgh {
    public zzbgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final boolean zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(2, zza);
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
