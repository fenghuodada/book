package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbhs implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzcfb zzcfbVar = (zzcfb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            zzfnc zzj = zzfnd.zzj();
            zzj.zzb((String) map.get("appId"));
            zzj.zzh(zzcfbVar.getWidth());
            zzj.zzg(zzcfbVar.zzF().getWindowToken());
            zzj.zzd((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            zzj.zze(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                zzj.zza((String) map.get("enifd"));
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzj().zzj(zzcfbVar, zzj.zzi());
                return;
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
    }
}
