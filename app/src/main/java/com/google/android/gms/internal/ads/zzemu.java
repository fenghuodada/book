package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzemu implements zzeqp {
    @Nullable
    private final JSONObject zza;
    @Nullable
    private final JSONObject zzb;

    public zzemu(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
