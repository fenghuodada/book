package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzewz implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzewz(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzeww zzb() {
        Context context = (Context) this.zza.zzb();
        zzfbi zzfbiVar = (zzfbi) this.zzb.zzb();
        zzfca zzfcaVar = (zzfca) this.zzc.zzb();
        zzbyw zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgc)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzge)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgb)).booleanValue() || z) {
                zzfbz zza = zzfcaVar.zza(zzfbq.Rewarded, context, zzfbiVar, new zzewa(new zzevx()));
                zzewm zzewmVar = new zzewm(new zzewl());
                zzfbm zzfbmVar = zza.zza;
                zzfwc zzfwcVar = zzcag.zza;
                return new zzewc(zzewmVar, new zzewi(zzfbmVar, zzfwcVar), zza.zzb, zza.zza.zza().zzf, zzfwcVar);
            }
        }
        return new zzewl();
    }
}
