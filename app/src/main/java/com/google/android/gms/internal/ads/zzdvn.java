package com.google.android.gms.internal.ads;

import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes.dex */
public abstract class zzdvn implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcal zza = new zzcal();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbug zze;
    @GuardedBy("lock")
    @VisibleForTesting(otherwise = 3)
    protected zzbtg zzf;

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbzt.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzdwc(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbzt.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
