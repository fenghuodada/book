package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzgu extends zzfx {
    public static final zzfpa zza = new zzfpa() { // from class: com.google.android.gms.internal.ads.zzgo
        @Override // com.google.android.gms.internal.ads.zzfpa
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzfof.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains("text") && !zza2.contains("text/vtt")) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzfx
    Map zze();
}
