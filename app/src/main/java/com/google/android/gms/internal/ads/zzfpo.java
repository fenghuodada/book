package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import androidx.core.provider.C0761g;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzfpo {
    @CheckForNull
    public static String zza(@CheckForNull String str) {
        if (zzfoy.zza(str)) {
            return null;
        }
        return str;
    }

    public static String zzb(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m11824a;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m11824a = "null";
            } else {
                try {
                    m11824a = obj.toString();
                } catch (Exception e) {
                    String m12391a = C0485b.m12391a(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m12391a), (Throwable) e);
                    m11824a = C0761g.m11824a("<", m12391a, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m11824a;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzc(@CheckForNull String str) {
        int i = zzfoy.zza;
        return str == null ? "" : str;
    }

    public static boolean zzd(@CheckForNull String str) {
        return zzfoy.zza(str);
    }
}
