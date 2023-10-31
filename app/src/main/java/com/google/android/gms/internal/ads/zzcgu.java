package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzcgu extends zzatp implements zzcgv {
    public static zzcgv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzcgv ? (zzcgv) queryLocalInterface : new zzcgt(iBinder);
    }
}
