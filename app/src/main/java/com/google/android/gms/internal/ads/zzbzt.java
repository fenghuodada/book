package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.ads.AdRequest;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public class zzbzt {
    protected static final zzfpm zza = zzfpm.zzb(4000);

    @VisibleForTesting
    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            return str + " @" + lineNumber;
        }
        return str;
    }

    public static void zze(String str) {
        if (zzm(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.d(AdRequest.LOGTAG, str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzg(String str) {
        if (zzm(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.e(AdRequest.LOGTAG, str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzi(String str) {
        if (zzm(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.i(AdRequest.LOGTAG, str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzj(String str) {
        if (zzm(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.w(AdRequest.LOGTAG, str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            String zzd = zzd(str);
            if (th != null) {
                zzk(zzd, th);
            } else {
                zzj(zzd);
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
