package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdgi implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzdgi(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzz zza = ((zzchn) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatu(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
