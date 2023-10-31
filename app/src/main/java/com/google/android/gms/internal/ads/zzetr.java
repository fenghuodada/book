package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zzetr implements zzeqq {
    public static final /* synthetic */ zzetr zza = new zzetr();

    private /* synthetic */ zzetr() {
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzh(new zzeqp() { // from class: com.google.android.gms.internal.ads.zzets
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
