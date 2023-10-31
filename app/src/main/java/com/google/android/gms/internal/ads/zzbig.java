package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbig implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map.keySet().contains("start")) {
            zzcfbVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfbVar.zzas(false);
        }
    }
}
