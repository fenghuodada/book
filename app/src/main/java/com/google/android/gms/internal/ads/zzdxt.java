package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class zzdxt implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcal zza = new zzcal();
    @GuardedBy("this")
    protected boolean zzb = false;
    @GuardedBy("this")
    protected boolean zzc = false;
    @GuardedBy("this")
    protected zzbtj zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        zzbzt.zze(format);
        this.zza.zze(new zzdwc(1, format));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzbzt.zze(format);
        this.zza.zze(new zzdwc(1, format));
    }

    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbtj(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    public final synchronized void zzc() {
        this.zzc = true;
        zzbtj zzbtjVar = this.zzd;
        if (zzbtjVar == null) {
            return;
        }
        if (zzbtjVar.isConnected() || this.zzd.isConnecting()) {
            this.zzd.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
