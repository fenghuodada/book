package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzfqy extends zzfql {
    final /* synthetic */ zzfra zza;
    private final Object zzb;
    private int zzc;

    public zzfqy(zzfra zzfraVar, int i) {
        this.zza = zzfraVar;
        Object[] objArr = zzfraVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i];
        this.zzc = i;
    }

    private final void zza() {
        int zzq;
        int i = this.zzc;
        if (i != -1 && i < this.zza.size()) {
            Object obj = this.zzb;
            zzfra zzfraVar = this.zza;
            int i2 = this.zzc;
            Object[] objArr = zzfraVar.zzb;
            objArr.getClass();
            if (zzfou.zza(obj, objArr[i2])) {
                return;
            }
        }
        zzq = this.zza.zzq(this.zzb);
        this.zzc = zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzfql, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfql, java.util.Map.Entry
    public final Object getValue() {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfql, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
