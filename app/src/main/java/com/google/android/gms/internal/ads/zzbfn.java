package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbfn extends zzatp implements zzbfo {
    public static zzbfo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof zzbfo ? (zzbfo) queryLocalInterface : new zzbfm(iBinder);
    }
}
