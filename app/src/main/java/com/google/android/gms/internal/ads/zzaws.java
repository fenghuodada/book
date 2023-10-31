package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaws implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcal zza;
    final /* synthetic */ zzawt zzb;

    public zzaws(zzawt zzawtVar, zzcal zzcalVar) {
        this.zzb = zzawtVar;
        this.zza = zzcalVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
