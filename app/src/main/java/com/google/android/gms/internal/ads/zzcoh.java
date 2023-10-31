package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcoh implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzcoh(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcnz zzcnzVar = (zzcnz) this.zza.zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        Set emptySet = ((JSONObject) this.zzc.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdco(zzcnzVar, zzfwcVar));
        zzgvw.zzb(emptySet);
        return emptySet;
    }
}
