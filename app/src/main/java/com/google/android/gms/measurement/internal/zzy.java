package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzy {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    public zzy(String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static Boolean zzd(String str, int i, boolean z, String str2, List list, String str3, zzet zzetVar) {
        boolean startsWith;
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzetVar != null) {
                        zzetVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L37;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean zze(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzer r9, double r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzy.zze(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzer, double):java.lang.Boolean");
    }

    @VisibleForTesting
    public static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzey zzeyVar, zzet zzetVar) {
        List list;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        String zzd = (zzf || zzj == 2 || zzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List<String> zze = zzeyVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                for (String str2 : zze) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                zze = Collections.unmodifiableList(arrayList);
            }
            list = zze;
        }
        return zzd(str, zzj, zzf, zzd, list, zzj == 2 ? zzd : null, zzetVar);
    }

    public static Boolean zzg(double d, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(d), zzerVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(long j, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(j), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzlj.zzy(str)) {
            try {
                return zze(new BigDecimal(str), zzerVar, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @VisibleForTesting
    public static Boolean zzj(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
