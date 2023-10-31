package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbte extends zzatp implements zzbtf {
    public zzbte() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
