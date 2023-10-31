package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfny implements ServiceConnection {
    final /* synthetic */ zzfnz zza;

    public /* synthetic */ zzfny(zzfnz zzfnzVar, zzfnx zzfnxVar) {
        this.zza = zzfnzVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfnz.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfnv(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfnz.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfnw(this));
    }
}
