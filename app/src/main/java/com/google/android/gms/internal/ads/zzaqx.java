package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzaqx extends zzapa {
    public long zza;
    public long zzb;

    public zzaqx() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzaqx(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzapa.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
