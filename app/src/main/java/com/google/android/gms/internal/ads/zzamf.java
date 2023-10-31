package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p060j$.util.DesugarTimeZone;

/* loaded from: classes.dex */
public final class zzamf {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzalu.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzalu.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    @Nullable
    public static zzakr zzb(zzale zzaleVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzaleVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long zza3 = str4 != null ? zza(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (z) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zza <= 0 || zza2 < zza) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zza2 - zza);
                j3 = j4;
            }
        }
        zzakr zzakrVar = new zzakr();
        zzakrVar.zza = zzaleVar.zzb;
        zzakrVar.zzb = str5;
        zzakrVar.zzf = j4;
        zzakrVar.zze = j3;
        zzakrVar.zzc = zza;
        zzakrVar.zzd = zza3;
        zzakrVar.zzg = map;
        zzakrVar.zzh = zzaleVar.zzd;
        return zzakrVar;
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
