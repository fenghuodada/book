package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbeg extends zzato implements zzbei {
    public zzbeg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final String zzg() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final List zzh() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatq.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }
}
