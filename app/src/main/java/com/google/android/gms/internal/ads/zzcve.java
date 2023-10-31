package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcve implements zzgvo {
    private final zzcvd zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;

    public zzcve(zzcvd zzcvdVar, zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzcvdVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
        this.zzd = zzgwbVar3;
        this.zze = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    @Nullable
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzbzz zza = ((zzchn) this.zzc).zza();
        zzezf zza2 = ((zzcrv) this.zzd).zza();
        zzbwq zzbwqVar = new zzbwq();
        if (zza2.zzB != null) {
            zzezk zzezkVar = zza2.zzt;
            return new zzbwp(context, zza, zza2.zzB, zzezkVar == null ? null : zzezkVar.zzb, zzbwqVar);
        }
        return null;
    }
}
