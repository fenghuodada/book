package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbja implements zzbii {
    private final zzdsz zza;

    public zzbja(zzdsz zzdszVar) {
        Preconditions.checkNotNull(zzdszVar, "The Inspector Manager must not be null");
        this.zza = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
