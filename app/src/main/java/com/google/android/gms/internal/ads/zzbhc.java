package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzbhc implements zzbii {
    private final zzbhd zza;

    public zzbhc(zzbhd zzbhdVar) {
        this.zza = zzbhdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzbzt.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbz(str, (String) map.get("info"));
        }
    }
}
