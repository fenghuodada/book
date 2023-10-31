package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdfn implements zzgvo {
    private final zzgwb zza;

    public zzdfn(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((zzdfk) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgvw.zzb(singleton);
        return singleton;
    }
}
