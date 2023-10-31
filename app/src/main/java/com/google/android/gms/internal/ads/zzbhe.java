package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbhe implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbzt.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzbzt.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcfbVar.zzm().zzc(str2, str3, parseLong);
                } catch (NumberFormatException e) {
                    zzbzt.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbzt.zzj("No value given for CSI experiment.");
            } else {
                zzcfbVar.zzm().zza().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbzt.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbzt.zzj("No name given for CSI extra.");
            } else {
                zzcfbVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
