package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzdrn implements zzdrb {
    private final long zza;
    private final zzejn zzb;

    public zzdrn(long j, Context context, zzdrg zzdrgVar, zzcgw zzcgwVar, String str) {
        this.zza = j;
        zzexk zzt = zzcgwVar.zzt();
        zzt.zzc(context);
        zzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzt.zzb(str);
        zzejn zza = zzt.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdrm(this, zzdrgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
