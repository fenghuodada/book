package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* loaded from: classes.dex */
final class zzbos implements InitializationCompleteCallback {
    final /* synthetic */ zzbki zza;

    public zzbos(zzboy zzboyVar, zzbki zzbkiVar) {
        this.zza = zzbkiVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }
}
