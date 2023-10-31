package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzcxw implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcxx zzcxxVar = (zzcxx) this.zza.get();
        if (zzcxxVar != null) {
            zzcxxVar.zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcxu
                @Override // com.google.android.gms.internal.ads.zzdar
                public final void zza(Object obj) {
                    ((zzcxy) obj).zza();
                }
            });
        }
    }
}
