package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbie implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfbVar.zzbj();
        } else if ("resume".equals(str)) {
            zzcfbVar.zzbk();
        }
    }
}
