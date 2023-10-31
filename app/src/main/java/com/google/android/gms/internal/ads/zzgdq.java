package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgdq {
    private static final zzgdq zza = new zzgdq();
    private static final zzgdp zzb = new zzgdp(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgdq zza() {
        return zza;
    }

    public final zzggz zzb() {
        zzggz zzggzVar = (zzggz) this.zzc.get();
        return zzggzVar == null ? zzb : zzggzVar;
    }
}
