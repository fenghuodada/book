package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzats extends zzatp implements zzatt {
    public static zzatt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzatt ? (zzatt) queryLocalInterface : new zzatr(iBinder);
    }
}
