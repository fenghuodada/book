package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbdv {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbdt zza() {
        return (zzbdt) zzb.get();
    }

    public static zzbdu zzb() {
        return (zzbdu) zzc.get();
    }

    public static void zzc(zzbdt zzbdtVar) {
        zzb.set(zzbdtVar);
    }
}
