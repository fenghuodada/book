package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class zzbsd extends zzatp implements zzbse {
    public static zzbse zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzbse ? (zzbse) queryLocalInterface : new zzbsc(iBinder);
    }
}
