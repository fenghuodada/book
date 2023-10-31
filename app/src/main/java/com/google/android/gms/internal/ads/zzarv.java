package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzarv extends zzapa {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzarv() {
    }

    public zzarv(String str) {
        HashMap zza = zzapa.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
            this.zzd = (Long) zza.get(3);
            this.zze = (Long) zza.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        return hashMap;
    }
}
