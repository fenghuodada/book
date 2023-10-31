package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbky extends zzatp implements zzbkz {
    public static zzbkz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbkz ? (zzbkz) queryLocalInterface : new zzbkx(iBinder);
    }
}
