package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzatp;

/* loaded from: classes.dex */
public abstract class zzbx extends zzatp implements zzby {
    public static zzby zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(iBinder);
    }
}
