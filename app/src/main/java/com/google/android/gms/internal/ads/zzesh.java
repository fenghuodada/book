package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzesh implements zzeqp {
    @Nullable
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzesh(@Nullable String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
            zzf.put("pvid", this.zza);
            zzf.put("pvid_s", this.zzb);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
