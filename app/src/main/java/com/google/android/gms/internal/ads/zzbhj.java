package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbhj implements zzbii {
    public final /* synthetic */ zzdcw zza;

    public /* synthetic */ zzbhj(zzdcw zzdcwVar) {
        this.zza = zzdcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbih.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzbzt.zzj("URL missing from click GMSG.");
        } else {
            zzfvr.zzq(zzbih.zza(zzcfbVar, str), new zzbhy(zzcfbVar), zzcag.zza);
        }
    }
}
