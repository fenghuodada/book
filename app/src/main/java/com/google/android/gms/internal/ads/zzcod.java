package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcod implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzcod(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzz zza = ((zzchn) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzatu(UUID.randomUUID().toString(), zza, str, jSONObject, false, equals);
    }
}
