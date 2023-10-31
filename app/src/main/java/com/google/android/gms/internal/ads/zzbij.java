package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzbij implements zzbii {
    private final zzbik zza;

    public zzbij(zzbik zzbikVar) {
        this.zza = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzbzt.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcfbVar.zzat(equals);
    }
}
