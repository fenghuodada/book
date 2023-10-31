package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbym extends zzatp implements zzbyn {
    public static zzbyn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof zzbyn ? (zzbyn) queryLocalInterface : new zzbyl(iBinder);
    }
}
