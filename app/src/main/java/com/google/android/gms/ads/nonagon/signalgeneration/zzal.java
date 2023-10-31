package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzduz;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzgvo;
import com.google.android.gms.internal.ads.zzgvw;
import com.google.android.gms.internal.ads.zzgwb;

/* loaded from: classes.dex */
public final class zzal implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzal(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzak zzb() {
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzak(zzfwcVar, ((zzduz) this.zzb).zzb());
    }
}
