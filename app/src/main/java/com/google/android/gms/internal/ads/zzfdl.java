package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfdl {
    final /* synthetic */ zzfdv zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfdl(zzfdv zzfdvVar, Object obj, List list, zzfdk zzfdkVar) {
        this.zza = zzfdvVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfdu zza(Callable callable) {
        zzfwc zzfwcVar;
        zzfvq zzb = zzfvr.zzb(this.zzc);
        zzfwb zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcag.zzf);
        zzfdv zzfdvVar = this.zza;
        Object obj = this.zzb;
        List list = this.zzc;
        zzfwcVar = zzfdvVar.zzb;
        return new zzfdu(zzfdvVar, obj, zza, list, zzb.zza(callable, zzfwcVar));
    }
}
