package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class zzer {
    private static final Object zza = new Object();
    @GuardedBy("lock")
    private static final zzeq zzb = zzeq.zza;

    @Pure
    public static void zza(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void zzb(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void zzc(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        zzb(str, zzg(str2, th));
    }

    @Pure
    public static void zzd(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void zze(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void zzf(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        zze(str, zzg(str2, th));
    }

    @Pure
    private static String zzg(String str, @Nullable Throwable th) {
        String replace;
        synchronized (zza) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        } else if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String replace2 = replace.replace("\n", "\n  ");
        return str + "\n  " + replace2 + "\n";
    }
}
