package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbiy implements zzbii {
    private final zzbix zza;

    public zzbiy(zzbix zzbixVar) {
        this.zza = zzbixVar;
    }

    public static void zzb(zzcfb zzcfbVar, zzbix zzbixVar) {
        zzcfbVar.zzad("/reward", new zzbiy(zzbixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else if ("video_complete".equals(str)) {
                this.zza.zzb();
                return;
            } else {
                return;
            }
        }
        zzbvi zzbviVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbviVar = new zzbvi(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            zzbzt.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbviVar);
    }
}
