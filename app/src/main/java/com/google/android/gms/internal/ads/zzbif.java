package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbif implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map.keySet().contains("start")) {
            zzcfbVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcfbVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcfbVar.zzN().zzk();
        }
    }
}
