package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfoz {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(C0235r.m12816a("negative size: ", i2));
            }
            zzb = zzfpo.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zzb = zzfpo.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzj(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpo.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzj(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzj(i2, i3, "end index") : zzfpo.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void zzh(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i, int i2, String str) {
        if (i < 0) {
            return zzfpo.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfpo.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C0235r.m12816a("negative size: ", i2));
    }
}
