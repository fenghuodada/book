package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbhp implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbed zzK = zzcfbVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcfbVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcfbVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
