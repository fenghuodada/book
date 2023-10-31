package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbna implements zzcan {
    final /* synthetic */ zzcal zza;
    final /* synthetic */ zzbme zzb;

    public zzbna(zzbnc zzbncVar, zzcal zzcalVar, zzbme zzbmeVar) {
        this.zza = zzcalVar;
        this.zzb = zzbmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zza() {
        this.zza.zze(new zzbmn("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
