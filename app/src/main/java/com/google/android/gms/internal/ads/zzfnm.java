package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzfnm extends zzatp implements zzfnn {
    public zzfnm() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzatq.zzc(parcel);
            zzb((Bundle) zzatq.zza(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
