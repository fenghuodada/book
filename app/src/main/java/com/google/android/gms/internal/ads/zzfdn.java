package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfdn {
    public static final zzfdu zza(Callable callable, Object obj, zzfdv zzfdvVar) {
        zzfwc zzfwcVar;
        zzfwcVar = zzfdvVar.zzb;
        return zzb(callable, zzfwcVar, obj, zzfdvVar);
    }

    public static final zzfdu zzb(Callable callable, zzfwc zzfwcVar, Object obj, zzfdv zzfdvVar) {
        zzfwb zzfwbVar;
        zzfwbVar = zzfdv.zza;
        return new zzfdu(zzfdvVar, obj, zzfwbVar, Collections.emptyList(), zzfwcVar.zzb(callable));
    }

    public static final zzfdu zzc(zzfwb zzfwbVar, Object obj, zzfdv zzfdvVar) {
        zzfwb zzfwbVar2;
        zzfwbVar2 = zzfdv.zza;
        return new zzfdu(zzfdvVar, obj, zzfwbVar2, Collections.emptyList(), zzfwbVar);
    }

    public static final zzfdu zzd(final zzfdh zzfdhVar, zzfwc zzfwcVar, Object obj, zzfdv zzfdvVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfdh.this.zza();
                return null;
            }
        }, zzfwcVar, obj, zzfdvVar);
    }
}
