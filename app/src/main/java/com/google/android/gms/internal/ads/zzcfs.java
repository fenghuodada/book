package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcfs implements zzbii {
    final /* synthetic */ zzcfu zza;

    public zzcfs(zzcfu zzcfuVar) {
        this.zza = zzcfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcfu zzcfuVar = this.zza;
                    i = zzcfuVar.zzG;
                    if (i != parseInt) {
                        zzcfuVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzbzt.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
