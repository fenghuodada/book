package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbzc zza;

    public zzbyz(zzbzc zzbzcVar) {
        this.zza = zzbzcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzn;
        atomicBoolean.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zzn;
        atomicBoolean.set(false);
    }
}
