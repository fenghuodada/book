package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaqt extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaqu zza;

    public zzaqt(zzaqu zzaquVar) {
        this.zza = zzaquVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaqu.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzaqu.class) {
            this.zza.zza = null;
        }
    }
}
