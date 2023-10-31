package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbhq implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbed zzK = zzcfbVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcfbVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfbVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
