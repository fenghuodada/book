package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbfv extends zzato implements zzbfx {
    public zzbfv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zze(zzbfk zzbfkVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbfkVar);
        zzbh(1, zza);
    }
}
