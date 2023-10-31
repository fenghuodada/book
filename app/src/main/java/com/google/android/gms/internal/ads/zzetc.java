package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzetc implements zzeqp {
    private final List zza;

    public zzetc(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
