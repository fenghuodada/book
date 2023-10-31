package com.google.android.gms.internal.ads;

import android.content.Context;
import com.adcolony.sdk.C2362x3;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcdb implements zzbii {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzbzm.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbzt.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder m9460b = C2362x3.m9460b("Parse pixels for ", str, ", got string ", str2, ", int ");
            m9460b.append(i);
            m9460b.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(m9460b.toString());
        }
        return i;
    }

    private static void zzc(zzcbq zzcbqVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbqVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbzt.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcbqVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbqVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbqVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbqVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:191|(1:(10:194|195|196|(1:198)(3:217|(1:219)|220)|200|201|202|203|204|(2:213|214)(2:208|(2:210|211)(1:212)))(1:221))(3:223|(1:225)|226)|222|195|196|(0)(0)|200|201|202|203|204|(1:206)|213|214) */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03e3, code lost:
        if (r3 == (-1)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x041f, code lost:
        r17 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdb.zza(java.lang.Object, java.util.Map):void");
    }
}
