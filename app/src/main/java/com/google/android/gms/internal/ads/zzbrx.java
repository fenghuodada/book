package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbrx extends zzatp implements zzbry {
    public static zzbry zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbry ? (zzbry) queryLocalInterface : new zzbrw(iBinder);
    }
}
