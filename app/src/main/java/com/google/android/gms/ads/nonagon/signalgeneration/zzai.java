package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfed;
import com.google.android.gms.internal.ads.zzgvo;
import com.google.android.gms.internal.ads.zzgwb;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzai implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzai(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfed) this.zza.zzb()).zzb(zzfdx.GENERATE_SIGNALS, ((zzcun) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS).zza();
    }
}
