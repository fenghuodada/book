package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.List;

/* loaded from: classes.dex */
final class zzfnv extends zzfnp {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfny zzb;

    public zzfnv(zzfny zzfnyVar, IBinder iBinder) {
        this.zzb = zzfnyVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zzfnk.zzb(this.zza);
        zzfnz.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
