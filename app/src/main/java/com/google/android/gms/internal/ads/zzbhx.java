package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbhx implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfof.zzc("true", str) && !zzfof.zzc("false", str)) {
                return;
            }
            zzfma.zzi(zzcfbVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
