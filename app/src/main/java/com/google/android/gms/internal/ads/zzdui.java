package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzdui implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdui(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaqq zzaqqVar = (zzaqq) this.zza.zzb();
        final Context zza = ((zzchc) this.zzb).zza();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        zzfwb zzb = zzfwcVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaqq zzaqqVar2 = zzaqq.this;
                return zzaqqVar2.zzc().zzg(zza);
            }
        });
        zzgvw.zzb(zzb);
        return zzb;
    }
}
