package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class zzgvj {
    final LinkedHashMap zza;

    public zzgvj(int i) {
        this.zza = zzgvl.zzb(i);
    }

    public final zzgvj zza(Object obj, zzgwb zzgwbVar) {
        LinkedHashMap linkedHashMap = this.zza;
        zzgvw.zza(obj, "key");
        zzgvw.zza(zzgwbVar, "provider");
        linkedHashMap.put(obj, zzgwbVar);
        return this;
    }
}
