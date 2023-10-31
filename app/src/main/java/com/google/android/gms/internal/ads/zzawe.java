package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzawe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzawf zza;

    public zzawe(zzawf zzawfVar) {
        this.zza = zzawfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        zzawi zzawiVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzawf zzawfVar = this.zza;
            zzawiVar = zzawfVar.zzd;
            if (zzawiVar != null) {
                zzawfVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
