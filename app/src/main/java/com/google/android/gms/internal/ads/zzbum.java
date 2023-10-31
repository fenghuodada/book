package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbum implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuo zzb;

    public zzbum(zzbuo zzbuoVar, Context context) {
        this.zzb = zzbuoVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbul zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbun zzbunVar = (zzbun) weakHashMap.get(this.zza);
        if (zzbunVar != null) {
            if (((Long) zzbct.zza.zze()).longValue() + zzbunVar.zza >= com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
                zza = new zzbuk(this.zza, zzbunVar.zzb).zza();
                zzbuo zzbuoVar = this.zzb;
                weakHashMap2 = zzbuoVar.zza;
                weakHashMap2.put(this.zza, new zzbun(zzbuoVar, zza));
                return zza;
            }
        }
        zza = new zzbuk(this.zza).zza();
        zzbuo zzbuoVar2 = this.zzb;
        weakHashMap2 = zzbuoVar2.zza;
        weakHashMap2.put(this.zza, new zzbun(zzbuoVar2, zza));
        return zza;
    }
}
