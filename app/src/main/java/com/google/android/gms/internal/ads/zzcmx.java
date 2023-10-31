package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcmx implements zzcml {
    private final zzeze zza;

    public zzcmx(zzeze zzezeVar) {
        this.zza = zzezeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
