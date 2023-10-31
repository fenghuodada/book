package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcdo implements zzbii {
    @Nullable
    private static final Integer zzb(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                zzbzt.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdn zzcdnVar;
        zzcdf zza;
        zzccc zzcccVar = (zzccc) obj;
        if (zzbzt.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbzt.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdg zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzcccVar)) {
                return;
            }
            zzbzt.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzccb zzccbVar = new zzccb((String) map.get("flags"));
        boolean z = zzccbVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbzt.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzcdf zzcdfVar = (zzcdf) it.next();
                    if (zzcdfVar.zza == zzcccVar && str.equals(zzcdfVar.zze())) {
                        zza = zzcdfVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzcccVar);
            }
            if (zza != null) {
                zzbzt.zzj("Precache task is already running.");
                return;
            } else if (zzcccVar.zzj() == null) {
                zzbzt.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzcccVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzcccVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcccVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzccz zzcczVar = zzcccVar.zzj().zzb;
                if (intValue > 0) {
                    int zzu = zzcbt.zzu();
                    zzcdnVar = zzu < zzccbVar.zzh ? new zzcdw(zzcccVar, zzccbVar) : zzu < zzccbVar.zzb ? new zzcdt(zzcccVar, zzccbVar) : new zzcdr(zzcccVar);
                } else {
                    zzcdnVar = new zzcdq(zzcccVar);
                }
                new zzcdf(zzcccVar, zzcdnVar, str, strArr).zzb();
            }
        } else {
            zzcdf zza2 = zzy.zza(zzcccVar);
            if (zza2 == null) {
                zzbzt.zzj("Precache must specify a source.");
                return;
            }
            zzcdnVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcdnVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcdnVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcdnVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcdnVar.zzq(zzb8.intValue());
        }
    }
}
