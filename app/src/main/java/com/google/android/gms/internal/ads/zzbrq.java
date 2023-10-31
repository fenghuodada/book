package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbrq extends zzatp implements zzbrr {
    public static zzbrr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof zzbrr ? (zzbrr) queryLocalInterface : new zzbrp(iBinder);
    }
}
