package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfjv {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int zzb(android.content.Context r14, com.google.android.gms.internal.ads.zzfit r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjv.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfit):int");
    }

    private static final String zzc(Context context, zzfit zzfitVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfpn.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                zzfitVar.zzc(2024, 0L, e);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfit zzfitVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfpn.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfitVar.zzb(4007, sb.toString());
    }
}
