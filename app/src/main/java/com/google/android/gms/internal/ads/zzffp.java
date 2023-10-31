package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzffp {
    public static void zza(zzfwb zzfwbVar, zzffq zzffqVar, zzfff zzfffVar) {
        zzg(zzfwbVar, zzffqVar, zzfffVar, false);
    }

    public static void zzb(zzfwb zzfwbVar, zzffq zzffqVar, zzfff zzfffVar) {
        zzg(zzfwbVar, zzffqVar, zzfffVar, true);
    }

    public static void zzc(zzfwb zzfwbVar, zzffq zzffqVar, zzfff zzfffVar) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            zzfvr.zzq(zzfvi.zzv(zzfwbVar), new zzffo(zzffqVar, zzfffVar), zzcag.zzf);
        }
    }

    public static void zzd(zzfwb zzfwbVar, zzfff zzfffVar) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            zzfvr.zzq(zzfvi.zzv(zzfwbVar), new zzffm(zzfffVar), zzcag.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzil), str);
    }

    public static int zzf(zzfaa zzfaaVar) {
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfaaVar) - 1;
        return (zze == 0 || zze == 1) ? 7 : 23;
    }

    private static void zzg(zzfwb zzfwbVar, zzffq zzffqVar, zzfff zzfffVar, boolean z) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            zzfvr.zzq(zzfvi.zzv(zzfwbVar), new zzffn(zzffqVar, zzfffVar, z), zzcag.zzf);
        }
    }
}
