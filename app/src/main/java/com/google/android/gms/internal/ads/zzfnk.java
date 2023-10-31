package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzfnk extends zzatp implements zzfnl {
    public static zzfnl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfnl ? (zzfnl) queryLocalInterface : new zzfnj(iBinder);
    }
}
