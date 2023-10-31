package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.tracing.b */
/* loaded from: classes.dex */
public final class C1719b {

    /* renamed from: a */
    public static long f4177a;

    /* renamed from: b */
    public static Method f4178b;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m10011a() {
        boolean isEnabled;
        try {
            if (f4178b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f4178b == null) {
                f4177a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4178b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4178b.invoke(null, Long.valueOf(f4177a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }
}
