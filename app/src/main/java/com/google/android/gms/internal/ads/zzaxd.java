package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzaxd {
    @VisibleForTesting
    zzatt zza;
    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzaxd() {
        this.zzc = zzbzi.zzb;
    }

    public zzaxd(final Context context) {
        ExecutorService executorService = zzbzi.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawy
            @Override // java.lang.Runnable
            public final void run() {
                zzaxd zzaxdVar = zzaxd.this;
                Context context2 = context;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeE)).booleanValue()) {
                    try {
                        zzaxdVar.zza = (zzatt) zzbzx.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzbzv() { // from class: com.google.android.gms.internal.ads.zzawz
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzbzv
                            public final Object zza(Object obj) {
                                return zzats.zzb(obj);
                            }
                        });
                        zzaxdVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzaxdVar.zzb = true;
                    } catch (RemoteException | zzbzw | NullPointerException unused) {
                        zzbzt.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
