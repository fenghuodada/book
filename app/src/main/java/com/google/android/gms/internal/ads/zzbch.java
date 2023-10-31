package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbch extends zzatp implements zzbci {
    public static zzbci zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof zzbci ? (zzbci) queryLocalInterface : new zzbcg(iBinder);
    }
}
