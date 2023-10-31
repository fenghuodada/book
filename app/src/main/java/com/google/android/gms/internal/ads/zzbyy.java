package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyy extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzc zza;

    public zzbyy(zzbzc zzbzcVar) {
        this.zza = zzbzcVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzbzz zzbzzVar;
        Object obj;
        zzbbs zzbbsVar;
        zzbzc zzbzcVar = this.zza;
        context = zzbzcVar.zze;
        zzbzzVar = zzbzcVar.zzf;
        zzbbq zzbbqVar = new zzbbq(context, zzbzzVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbbsVar = this.zza.zzh;
                zzbbt.zza(zzbbsVar, zzbbqVar);
            } catch (IllegalArgumentException e) {
                zzbzt.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
