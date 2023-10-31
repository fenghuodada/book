package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.google.android.exoplayer2.util.n */
/* loaded from: classes.dex */
public final class C7421n {
    @Pure
    /* renamed from: a */
    public static String m5057a(String str, @Nullable Throwable th) {
        boolean z;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                replace = "UnknownHostException (no network)";
            } else {
                replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            String valueOf = String.valueOf(str);
            String replace2 = replace.replace("\n", "\n  ");
            StringBuilder sb = new StringBuilder(C0552c.m12193a(replace2, valueOf.length() + 4));
            sb.append(valueOf);
            sb.append("\n  ");
            sb.append(replace2);
            sb.append('\n');
            return sb.toString();
        }
        return str;
    }

    @Pure
    /* renamed from: b */
    public static void m5056b(String str, String str2, @Nullable Throwable th) {
        Log.e(str, m5057a(str2, th));
    }

    @Pure
    /* renamed from: c */
    public static void m5055c(String str, String str2, @Nullable Exception exc) {
        Log.w(str, m5057a(str2, exc));
    }
}
