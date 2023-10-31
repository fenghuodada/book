package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcnt implements zzbii {
    final /* synthetic */ zzcnu zza;

    public zzcnt(zzcnu zzcnuVar) {
        this.zza = zzcnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcnu.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcns
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnz zzcnzVar;
                    zzcnzVar = zzcnt.this.zza.zzd;
                    zzcnzVar.zzj();
                }
            });
        }
    }
}
