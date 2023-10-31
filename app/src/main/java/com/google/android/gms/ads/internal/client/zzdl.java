package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdl extends zzato implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        Bundle bundle = (Bundle) zzatq.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        zzu zzuVar = (zzu) zzatq.zza(zzbg, zzu.CREATOR);
        zzbg.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList createTypedArrayList = zzbg.createTypedArrayList(zzu.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }
}
