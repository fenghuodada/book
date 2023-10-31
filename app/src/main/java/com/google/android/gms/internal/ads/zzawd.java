package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzawd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzawf zza;

    public zzawd(zzawf zzawfVar) {
        this.zza = zzawfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        Object obj2;
        zzawi zzawiVar;
        zzawi zzawiVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzawf zzawfVar = this.zza;
                zzawiVar = zzawfVar.zzd;
                if (zzawiVar != null) {
                    zzawiVar2 = zzawfVar.zzd;
                    zzawfVar.zzf = zzawiVar2.zzq();
                }
            } catch (DeadObjectException e) {
                zzbzt.zzh("Unable to obtain a cache service instance.", e);
                zzawf.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
