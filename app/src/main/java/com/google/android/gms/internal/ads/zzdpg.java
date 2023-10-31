package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdpg implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;

    public zzdpg(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzchc) this.zzb).zza();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        Map zzb = ((zzgvs) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeE)).booleanValue()) {
            zzawx zzawxVar = new zzawx(new zzaxd(zza));
            zzawxVar.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzdph
                @Override // com.google.android.gms.internal.ads.zzaww
                public final void zza(zzaym zzaymVar) {
                    zzaymVar.zzh(str);
                }
            });
            emptySet = Collections.singleton(new zzdco(new zzdpj(zzawxVar, zzb), zzfwcVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgvw.zzb(emptySet);
        return emptySet;
    }
}
