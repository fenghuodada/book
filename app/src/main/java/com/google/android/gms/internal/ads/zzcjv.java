package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjv implements zzdrd {
    private final Long zza;
    private final String zzb;
    private final zzcir zzc;
    private final zzcjz zzd;
    private final zzcjv zze = this;

    public /* synthetic */ zzcjv(zzcir zzcirVar, zzcjz zzcjzVar, Long l, String str, zzcju zzcjuVar) {
        this.zzc = zzcirVar;
        this.zzd = zzcjzVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdrd
    public final zzdrn zza() {
        Context context;
        zzdrg zzc;
        long longValue = this.zza.longValue();
        zzcjz zzcjzVar = this.zzd;
        context = zzcjzVar.zza;
        zzc = zzdrh.zzc(zzcjzVar.zzb);
        return zzdro.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdrd
    public final zzdrr zzb() {
        Context context;
        zzdrg zzc;
        long longValue = this.zza.longValue();
        zzcjz zzcjzVar = this.zzd;
        context = zzcjzVar.zza;
        zzc = zzdrh.zzc(zzcjzVar.zzb);
        return zzdrs.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
