package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzfja implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    protected final zzfka zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfja(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfka zzfkaVar = new zzfka(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfkaVar;
        this.zzd = new LinkedBlockingQueue();
        zzfkaVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzaol zza() {
        zzano zza = zzaol.zza();
        zza.zzD(32768L);
        return (zzaol) zza.zzal();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfkf zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new zzfkb(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaol zzb(int i) {
        zzaol zzaolVar;
        try {
            zzaolVar = (zzaol) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaolVar = null;
        }
        return zzaolVar == null ? zza() : zzaolVar;
    }

    public final void zzc() {
        zzfka zzfkaVar = this.zza;
        if (zzfkaVar != null) {
            if (zzfkaVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfkf zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
