package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbof extends zzato implements zzboh {
    public zzbof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final IObjectWrapper zze() throws RemoteException {
        return C6656q.m6130a(zzbg(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final boolean zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        boolean zzg = zzatq.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
