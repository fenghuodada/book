package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbvb extends zzatp implements zzbvc {
    public static zzbvc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbvc ? (zzbvc) queryLocalInterface : new zzbva(iBinder);
    }
}
