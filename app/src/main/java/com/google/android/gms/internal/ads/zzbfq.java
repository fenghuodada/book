package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbfq extends zzatp implements zzbfr {
    public static zzbfr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof zzbfr ? (zzbfr) queryLocalInterface : new zzbfp(iBinder);
    }
}
