package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzawf {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzawb(this);
    private final Object zzc = new Object();
    @Nullable
    private zzawi zzd;
    @Nullable
    private Context zze;
    @Nullable
    private zzawl zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzawf zzawfVar) {
        synchronized (zzawfVar.zzc) {
            zzawi zzawiVar = zzawfVar.zzd;
            if (zzawiVar == null) {
                return;
            }
            if (zzawiVar.isConnected() || zzawfVar.zzd.isConnecting()) {
                zzawfVar.zzd.disconnect();
            }
            zzawfVar.zzd = null;
            zzawfVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzawi zzd = zzd(new zzawd(this), new zzawe(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzawj zzawjVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzawjVar);
                } catch (RemoteException e) {
                    zzbzt.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzawg zzb(zzawj zzawjVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzawg();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzawjVar);
                }
                return this.zzf.zzf(zzawjVar);
            } catch (RemoteException e) {
                zzbzt.zzh("Unable to call into cache service.", e);
                return new zzawg();
            }
        }
    }

    @VisibleForTesting
    public final synchronized zzawi zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzawi(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdU)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdT)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzawc(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdV)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcag.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdW)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
