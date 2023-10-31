package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnd implements zzcml {
    private final zzdsz zza;

    public zzcnd(zzdsz zzdszVar) {
        this.zza = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzm(str.equals("true"));
    }
}
