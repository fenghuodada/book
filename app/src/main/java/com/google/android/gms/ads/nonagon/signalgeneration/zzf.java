package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzfaa;
import com.google.firebase.ktx.BuildConfig;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(@Nullable String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    @Nullable
    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        return bundle == null ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    public static void zzc(final zzdqh zzdqhVar, @Nullable final zzdpx zzdpxVar, final String str, final Pair... pairArr) {
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzgL)).booleanValue()) {
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                @Override // java.lang.Runnable
                public final void run() {
                    zzf.zzd(zzdqh.this, zzdpxVar, str, pairArr);
                }
            });
        }
    }

    @VisibleForTesting
    public static void zzd(zzdqh zzdqhVar, @Nullable zzdpx zzdpxVar, String str, Pair... pairArr) {
        Map zzc = zzdpxVar == null ? zzdqhVar.zzc() : zzdpxVar.zza();
        zzf(zzc, "action", str);
        for (Pair pair : pairArr) {
            zzf(zzc, (String) pair.first, (String) pair.second);
        }
        zzdqhVar.zze(zzc);
    }

    public static int zze(zzfaa zzfaaVar) {
        if (zzfaaVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfaaVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzf(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
