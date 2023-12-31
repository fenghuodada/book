package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbjk extends zzatp implements zzbjl {
    public static zzbjl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return queryLocalInterface instanceof zzbjl ? (zzbjl) queryLocalInterface : new zzbjj(iBinder);
    }
}
