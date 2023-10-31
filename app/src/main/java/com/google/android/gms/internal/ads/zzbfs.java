package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbfs extends zzato implements zzbfu {
    public zzbfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zze(zzbfk zzbfkVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbfkVar);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
