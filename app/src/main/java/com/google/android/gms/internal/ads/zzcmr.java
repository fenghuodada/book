package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcmr implements zzcml {
    private final zzdsz zza;

    public zzcmr(zzdsz zzdszVar) {
        this.zza = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcml
    public final void zza(Map map) {
        char c;
        zzdsz zzdszVar;
        zzdsv zzdsvVar;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            zzdszVar = this.zza;
            zzdsvVar = zzdsv.SHAKE;
        } else if (c != 1) {
            zzdszVar = this.zza;
            zzdsvVar = zzdsv.NONE;
        } else {
            zzdszVar = this.zza;
            zzdsvVar = zzdsv.FLICK;
        }
        zzdszVar.zzk(zzdsvVar);
    }
}
