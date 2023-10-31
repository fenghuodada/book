package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class zzbsg extends zzatp implements zzbsh {
    public static zzbsh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof zzbsh ? (zzbsh) queryLocalInterface : new zzbsf(iBinder);
    }
}
