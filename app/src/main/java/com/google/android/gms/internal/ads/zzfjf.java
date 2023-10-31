package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfjf implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final zzfka zza;
    private final zzfju zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    public zzfjf(@NonNull Context context, @NonNull Looper looper, @NonNull zzfju zzfjuVar) {
        this.zzb = zzfjuVar;
        this.zza = new zzfka(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            if (this.zza.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            this.zze = true;
            try {
                this.zza.zzp().zzg(new zzfjy(this.zzb.zzax()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                zzb();
                throw th;
            }
            zzb();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzd = true;
                this.zza.checkAvailabilityAndConnect();
            }
        }
    }
}
