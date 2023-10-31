package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcmp implements zzcml {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcmp(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
