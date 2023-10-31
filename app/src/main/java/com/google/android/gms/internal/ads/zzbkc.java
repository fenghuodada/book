package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbkc implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcal zza;

    public zzbkc(zzbkd zzbkdVar, zzcal zzcalVar) {
        this.zza = zzcalVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
