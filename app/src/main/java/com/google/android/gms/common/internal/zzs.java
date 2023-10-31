package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzs extends GmsClientSupervisor {
    @GuardedBy("connectionStatus")
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzr zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    @Nullable
    private volatile Executor zzi;

    public zzs(Context context, Looper looper, @Nullable Executor executor) {
        zzr zzrVar = new zzr(this, null);
        this.zze = zzrVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzrVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzpVar = (zzp) this.zzb.get(zzoVar);
            if (zzpVar == null) {
                String zzoVar2 = zzoVar.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + zzoVar2);
            } else if (!zzpVar.zzh(serviceConnection)) {
                String zzoVar3 = zzoVar.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar3);
            } else {
                zzpVar.zzf(serviceConnection, str);
                if (zzpVar.zzi()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzpVar = (zzp) this.zzb.get(zzoVar);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzpVar == null) {
                zzpVar = new zzp(this, zzoVar);
                zzpVar.zzd(serviceConnection, serviceConnection, str);
                zzpVar.zze(str, executor);
                this.zzb.put(zzoVar, zzpVar);
            } else {
                this.zzd.removeMessages(0, zzoVar);
                if (zzpVar.zzh(serviceConnection)) {
                    String zzoVar2 = zzoVar.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar2);
                }
                zzpVar.zzd(serviceConnection, serviceConnection, str);
                int zza = zzpVar.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzpVar.zzb(), zzpVar.zzc());
                } else if (zza == 2) {
                    zzpVar.zze(str, executor);
                }
            }
            zzj = zzpVar.zzj();
        }
        return zzj;
    }

    public final void zzi(@Nullable Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    public final void zzj(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
