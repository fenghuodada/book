package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() throws RemoteException {
        return C6656q.m6130a(zzB(1, zza()));
    }
}
