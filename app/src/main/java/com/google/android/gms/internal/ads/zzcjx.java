package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjx implements zzdrk {
    private final zzcir zza;
    private Context zzb;
    private zzbjf zzc;

    public /* synthetic */ zzcjx(zzcir zzcirVar, zzcjw zzcjwVar) {
        this.zza = zzcirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrk
    public final /* synthetic */ zzdrk zza(zzbjf zzbjfVar) {
        zzbjfVar.getClass();
        this.zzc = zzbjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrk
    public final /* synthetic */ zzdrk zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrk
    public final zzdrl zzc() {
        zzgvw.zzc(this.zzb, Context.class);
        zzgvw.zzc(this.zzc, zzbjf.class);
        return new zzcjz(this.zza, this.zzb, this.zzc, null);
    }
}
