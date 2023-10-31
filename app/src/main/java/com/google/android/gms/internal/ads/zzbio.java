package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbio implements zzbii {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbqs zzc;
    private final zzbqz zzd;

    public zzbio(com.google.android.gms.ads.internal.zzb zzbVar, zzbqs zzbqsVar, zzbqz zzbqzVar) {
        this.zzb = zzbVar;
        this.zzc = zzbqsVar;
        this.zzd = zzbqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb(null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbqv(zzcfbVar, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbqq(zzcfbVar, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zzbzt.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcfbVar == null) {
            zzbzt.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzcfbVar.zzaq(i);
    }
}
