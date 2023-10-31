package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcnr implements zzbii {
    final /* synthetic */ zzcnu zza;

    public zzcnr(zzcnu zzcnuVar) {
        this.zza = zzcnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcnu.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnz zzcnzVar;
                    zzcnzVar = zzcnr.this.zza.zzd;
                    zzcnzVar.zzg();
                }
            });
        }
    }
}
