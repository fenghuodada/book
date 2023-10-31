package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgvs extends zzgvk {
    private static final zzgwb zza = zzgvp.zza(Collections.emptyMap());

    public /* synthetic */ zzgvs(Map map, zzgvq zzgvqVar) {
        super(map);
    }

    public static zzgvr zzc(int i) {
        return new zzgvr(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzgvl.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzgwb) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
