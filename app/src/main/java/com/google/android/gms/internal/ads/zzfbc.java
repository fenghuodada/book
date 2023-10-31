package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes.dex */
public final class zzfbc implements zzgvo {
    private final zzfbb zza;

    public zzfbc(zzfbb zzfbbVar) {
        this.zza = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgvw.zzb(defaultClock);
        return defaultClock;
    }
}
