package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeud implements zzeqp {
    private final Map zza;

    public zzeud(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(this.zza));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
